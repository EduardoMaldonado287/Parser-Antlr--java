package matrixL;

import java.util.LinkedList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.RecognitionException;

public class MyTranslateListener extends MATBaseListener {

    private final LinkedList<Variable> variableList = new LinkedList();
    private final LinkedList<Variable> int_variables_list = new LinkedList();
    private final LinkedList<Variable> matrix_variables_list = new LinkedList();
    private final LinkedList<Variable> declared_variables_list = new LinkedList();
    private final LinkedList<String> numberList = new LinkedList();
    private final LinkedList<Matrix> matrixList = new LinkedList();
    private final LinkedList<Matrix> declaredMatrixList = new LinkedList();
    private int counter = 0;
    private String textToJavaFile = "";
    private final LinkedList<String> errorMessageList = new LinkedList();
    private String errorMessage;
    private String current_dataType_declaration;
    
    public MyTranslateListener() {
    }

    @Override
    public void enterProgramDeclaration(MATParser.ProgramDeclarationContext ctx) {
        // Configuraciones iniciales de la traduccion a java
        textToJavaFile += "import java.io.FileWriter;";
        textToJavaFile += "\nimport java.io.IOException;";
        textToJavaFile += "\nimport java.util.*;";
        textToJavaFile += "\npublic class myMatrixL_Java{";
        textToJavaFile += "\n" + mainSettings(); // hasta abajo del archivo, configura las funciones para usar matrices
        textToJavaFile += "\npublic static void main(String []args) throws IOException\n{";
    }

    @Override
    public void exitProgramDeclaration(MATParser.ProgramDeclarationContext ctx) throws RecognitionException {
        /*
            En la línea 1457 termina el codigo predefinido de java (mainSettings)

            El programa esta diseñado para que todas las declaraciones de variables enteras
            se trasladen al inicio del codigo traducido (despues del main, archivo java)
         */

        String programInstructions = this.textToJavaFile.substring(1457);
        this.textToJavaFile = this.textToJavaFile.substring(0, 1457);

        // se adjuntan estas dos lineas de codigo para crear un archivo de texto 
        //en el cual se almacena el resultado del archivo traducido a java
        textToJavaFile += "    String route = System.getProperty(" + '\u0022' + "user.home" + '\u0022' + ");";
        textToJavaFile += "\n    FileWriter results_matL = new FileWriter(route +"
                + '\u0022' + "/results_matL.txt" + '\u0022' + ");";

        // Se agregan las variables tipo entero al inicio del codigo traducido a java
        if (!int_variables_list.isEmpty()) {
            textToJavaFile += ("\n    int ");
            for (int i = 0; i < int_variables_list.size(); i++) {
                if (i + 1 == int_variables_list.size()) {
                    textToJavaFile += (int_variables_list.get(i).variableName + "=0;");
                } else {
                    textToJavaFile += (int_variables_list.get(i).variableName + "=0,");
                }
            }
        }

        /*
            el apartado de instrucciones se removio temporalmente para 
            agregar la declaracion de variables y dos lineas para manipular 
            el arhivo de resultados
        */
        
        textToJavaFile += "\n" + programInstructions;
        textToJavaFile += "\n    results_matL.close();";
        textToJavaFile += "\n\n}\n}";
    }

    @Override
    public void enterDeclaration_list(MATParser.Declaration_listContext ctx) {
        /*
            "variableList" contiene los "token_id" leídos, esta lista debe
            reiniciarse debido a que la gramática permite tener múltiples 
            declaraciones de este tipo, y es necesario que no se tomen en cuenta
            las variables declaradas en otra "declaration list"
        */
        
        variableList.clear();
    }

    @Override
    public void exitDeclaration(MATParser.DeclarationContext ctx) throws RecognitionException {

        /*
            Evita errores de compilacion de este archivo, sin variables
            este codigo marca error al hacer un "variableList.get()", por no 
            tener elementos
        */
        if (variableList.isEmpty()) {
            return;
        }

        /*
            Este segmento verifica si la variable ya ha sido definida (Ej: "int a;")
            y genera un erro de ser el caso
        */
        boolean isVarRepited = false;
        for (int i = 0; i < variableList.size(); i++) {
            for (int j = 0; j < declared_variables_list.size(); j++) {
                if (declared_variables_list.get(j).variableName.equals(variableList.get(i).variableName)) {
                    isVarRepited = true;

                    try {
                        errorMessage += variableList.get(i).get_token_location()
                                + " variable '" + variableList.get(i).variableName + "' is already defined";
                        errorMessageList.add(errorMessage);
                        throw new SemanticException(errorMessage);
                    } catch (SemanticException ex) {
                        Logger.getLogger(MyTranslateListener.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            /*
                En el caso de ser una variable que no ha sido definida
                se agrega a la lista de variables correspondiente
            */
            if (!isVarRepited) {
                if ("int".equals(current_dataType_declaration)) {
                    variableList.get(i).variableType = "int";
                    int_variables_list.addLast(variableList.get(i));
                } else {
                    variableList.get(i).variableType = "matrix";
                    matrix_variables_list.addLast(variableList.get(i));
                }
                declared_variables_list.addLast(variableList.get(i));
            }
            isVarRepited = false;
        }
    }

    @Override
    public void exitPrint(MATParser.PrintContext ctx) {
        if (variableList.isEmpty()) {
            return;
        }
        
        /*
            Esta seccion de codigo se encarga de traducir el codigo a java
            La función "getVarType" genera un error en el caso de no encontrar
            declarada la variable a imprimir
        */
        if ("int".equals(getVarType(variableList.getLast()))) {
            textToJavaFile += "\n    results_matL.write(String.valueOf("
                    + variableList.getLast().variableName + ")" + "+" + '\u0022' + "\\n" + '\u0022' + ");";
        } else {
            textToJavaFile += "\n    print_matrix(" + variableList.getLast().variableName + ", " + "results_matL" + ");";
        }
    }

    @Override
    public void enterVar_operations(MATParser.Var_operationsContext ctx) {
        /*
            Se reinicna las listas para evitar confictos al momento de 
            ejecutarse otra operacion (enterVar_operations)
        */
        variableList.clear();
        numberList.clear();
        counter++;
    }

    @Override
    public void exitVar_operations(MATParser.Var_operationsContext ctx) {
        String operationType = "";

        if (variableList.isEmpty()) {
            return;
        } else {
            operationType = getVarType(variableList.get(0));
        }
        
        /*
            Se verifica que todas las variables sean del mismo tipo y esten 
            declaradas para poder realizar la operacion
        */
        for (int i = 1; i < variableList.size(); i++) {
            if (!operationType.equals(getVarType(variableList.get(i)))
                    || ("matrix".equals(operationType) && !numberList.isEmpty())) {
                try {
                    errorMessage = "\n" + variableList.get(i).get_token_location()
                            + " variable '" + variableList.get(i).variableName
                            + "', operation must on variables of the same type ";
                    errorMessageList.add(errorMessage);
                    throw new SemanticException(errorMessage);
                } catch (SemanticException ex) {
                    Logger.getLogger(MyTranslateListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                return;
            }
        }

        // Se genera la traducción a java
        if ("int".equals(operationType)) {
            textToJavaFile += ("\n    " + ctx.getText());
        } else {
            // Se almacenan las dimensiones de las matrices en la lista 
            // matrixSizeList
            LinkedList<Integer> matrixSizeList = new LinkedList();

            for (int i = 1; i < variableList.size(); i++) {
                for (int j = 0; j < matrixList.size(); j++) {
                    if (variableList.get(i).variableName.equals(matrixList.get(j).matrixName)) {
                        matrixSizeList.add(matrixList.get(j).row_amount);
                        matrixSizeList.add(matrixList.get(j).col_amount);
                    }
                }
            }

//            if ((variableList.size()-1)*2 != matrixSizeList.size())
//            {
//                try {
//                    throw new SemanticException("line " + variableList.getLast().line + " - cannot do operations with empty matrix object");
//                } catch (SemanticException ex) {
//                    Logger.getLogger(MyTranslateListener.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            if (matrixSizeList.size() == 2)
//            {
//                
//            }

            // Verificar que las matrices sean del mismo tamaño
            if (matrixSizeList.size() > 2) {
                for (int i = 0; i < matrixSizeList.size(); i = i + 2) {
                    int j = i / 2;
                    if (!Objects.equals(matrixSizeList.get(j), matrixSizeList.get(j + 2))) {
                        try {
                            errorMessage = "line " + variableList.getLast().line
                                    + " - matrix objects must have the same dimensions to do operations";
                            errorMessageList.add(errorMessage);
                            throw new SemanticException(errorMessage);
                        } catch (SemanticException ex) {
                            Logger.getLogger(MyTranslateListener.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        return;
                    }
                }
            }

            /*
                Esta seccion analiza una variable tiene que ser declarada con 
                dimensiones diferentes, en dado caso se crea una variable 
                temporal con las nuevas dimensiones y se asigna a la variable
                deseada
            */
            boolean isMatrixDeclared = false;
            // check if declaredMatrixList.contains(variableList.get(0);
            for (int i = 0; i < declaredMatrixList.size(); i++) {
                if (declaredMatrixList.get(i).matrixName.equals(variableList.get(0).variableName)) {
                    isMatrixDeclared = true;
                }
                if (declaredMatrixList.get(i).row_amount != matrixSizeList.get(0)
                        || declaredMatrixList.get(i).col_amount != matrixSizeList.get(1)) {
                    declaredMatrixList.get(i).row_amount = matrixSizeList.get(0);
                    declaredMatrixList.get(i).col_amount = matrixSizeList.get(1);
                    textToJavaFile += ("\n    " + "int temporalMatrix" + counter + "[][] = new int ["
                            + matrixSizeList.get(0) + "]" + "[" + matrixSizeList.get(1) + "];");
                    textToJavaFile += ("\n    " + declaredMatrixList.get(i).matrixName + " = "
                            + "temporalMatrix" + counter + ";");
                }
            }

            // Se asignan las dimensiones de la variable tipo matriz que se 
            // que esta próxima a hacer una operación
            if (!variableList.isEmpty() && !matrixSizeList.isEmpty()) {
                if (!isMatrixDeclared) {
                    textToJavaFile += ("\n    " + "int " + variableList.get(0).variableName + "[][] = new int"
                            + "[" + matrixSizeList.get(0) + "][" + matrixSizeList.get(1) + "];");
                    declaredMatrixList.add(new Matrix(variableList.get(0).variableName, matrixSizeList.get(0), matrixSizeList.get(1)));
                    matrixList.add(declaredMatrixList.getLast());
                }

                /*
                    Se traducen a java las operaciones con matrices, para esto
                    se mandan a llamar funciones que están predifinidas en el 
                    archivo java (archivo destino para la traducción)
                */
                textToJavaFile += ("\n    " + variableList.get(0).variableName + " = ");

                if (ctx.getText().contains("+") && !ctx.getText().contains("^")) {
                    textToJavaFile += ("matrix_sum(" + variableList.getLast().variableName
                            + ", " + variableList.get(variableList.size() - 2).variableName
                            + ", " + matrixSizeList.get(0) + ", " + matrixSizeList.get(1) + ");");
                    
                } else if (ctx.getText().contains("-") && !ctx.getText().contains("^")) {
                    textToJavaFile += ("matrix_substraction(" + variableList.getLast().variableName
                            + ", " + variableList.get(variableList.size() - 2).variableName
                            + ", " + matrixSizeList.get(0) + ", " + matrixSizeList.get(1) + ");");
                    
                } else if (ctx.getText().contains("*") && !ctx.getText().contains("^")) {
                    textToJavaFile += ("matrix_product(" + variableList.getLast().variableName
                            + ", " + variableList.get(variableList.size() - 2).variableName
                            + ", " + matrixSizeList.get(0) + ", " + matrixSizeList.get(1) + ");");
                    
                } else if (ctx.getText().contains("^") && ctx.getText().contains("+")) {
                    textToJavaFile += ("matrix_sum(" + "matrix_transpos(" + variableList.get(variableList.size() - 2).variableName
                            + ", " + matrixSizeList.get(0) + ", " + matrixSizeList.get(1) + "), " + variableList.getLast().variableName
                            + ", " + matrixSizeList.get(0) + ", " + matrixSizeList.get(1) + ");");
                 
                } else if (ctx.getText().contains("^") && ctx.getText().contains("-")) {
                    textToJavaFile += ("matrix_substraction(" + "matrix_transpos(" + variableList.get(variableList.size() - 2).variableName
                            + ", " + matrixSizeList.get(0) + ", " + matrixSizeList.get(1) + "), " + variableList.getLast().variableName
                            + ", " + matrixSizeList.get(0) + ", " + matrixSizeList.get(1) + ");");
                    
                } else if (ctx.getText().contains("^") && ctx.getText().contains("*")) {
                    textToJavaFile += ("matrix_product(" + "matrix_transpos(" + variableList.get(variableList.size() - 2).variableName
                            + ", " + matrixSizeList.get(0) + ", " + matrixSizeList.get(1) + "), " + variableList.getLast().variableName
                            + ", " + matrixSizeList.get(0) + ", " + matrixSizeList.get(1) + ");");
                } 
                else {
                    textToJavaFile += (" " + variableList.getLast().variableName + ";");
                }
            }
        }
    }

    @Override
    public void enterMatrix_constructor(MATParser.Matrix_constructorContext ctx) {
        variableList.clear();
    }

    
    @Override
    public void exitMatrix_constructor(MATParser.Matrix_constructorContext ctx) {
        /*
            Se decidio crear un segmento especialmente dedicado a la construcción
            de matrices (Ej: a = [1,2,3;4,5,6;7,8,9]
        */
        
        if (variableList.isEmpty()) {
            return;
        }
        
        /*
            Esta sección verifica que la matriz a construir este declarada y sea
            de tipo "matrix", además hace las respectivas traducciones al 
            lenguaje java
        */
        if (isVarAlreadyDefined(variableList.getLast())) {
            for (int i = 0; i < matrix_variables_list.size(); i++) {
                if (matrix_variables_list.get(i).variableName.equals(variableList.getLast().variableName)) {
                    String matrixDecString = ctx.getText();
                    int row_amount = (int) ctx.getText().chars().filter(ch -> ch == ';').count();
                    float col_amount = (float) (ctx.getText().chars().filter(ch -> ch == ',').count() + row_amount) / row_amount;

                    // VERIFICO QUE LA CANTIDAD DE COLUMNAS SEA CONSTANTE
                    if (col_amount % 1 != 0) {
                        try {
                            errorMessage = "line " + variableList.getLast().line + " - matrix columns amount has to be constant";
                            errorMessageList.add(errorMessage);
                            throw new SemanticException(errorMessage);
                        } catch (SemanticException ex) {
                            Logger.getLogger(MyTranslateListener.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        return;
                    }

                    matrixList.add(new Matrix(variableList.getLast().variableName, row_amount, (int) col_amount));
                    matrixDecString = matrixDecString.replace(";", "},{");
                    matrixDecString = matrixDecString.replace("[", "{{");
                    matrixDecString = matrixDecString.replace("]", "}}");
                    int assignIndex = matrixDecString.indexOf("=");
                    matrixDecString = matrixDecString.substring(assignIndex + 1, matrixDecString.length() - 3);
                    matrixDecString = "int " + variableList.getLast().variableName + "[][] = " + matrixDecString + ";";
                    textToJavaFile += ("\n    " + matrixDecString);
                    return;
                }
            }
            try {
                errorMessage = variableList.getLast().get_token_location() + " variable '"
                        + variableList.getLast().variableName + "' is type int, not type matrix";
                errorMessageList.add(errorMessage);
                throw new SemanticException(errorMessage);
            } catch (SemanticException ex) {
                Logger.getLogger(MyTranslateListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /*
        La variable "current_dataType_declaration" se utiliza para 
        separar las variables entre enteros y de tipo matriz
    */
    @Override
    public void enterTk_type_int(MATParser.Tk_type_intContext ctx) {
        current_dataType_declaration = ctx.getText();
    }

    @Override
    public void enterTk_type_matrix(MATParser.Tk_type_matrixContext ctx) {
        current_dataType_declaration = ctx.getText();
    }

    @Override
    public void enterTk_id(MATParser.Tk_idContext ctx) {
        // Se obtienen las coordenadas del token
        String token_info = ctx.start.toString();
        token_info = token_info.replace(":", ",");
        token_info = token_info.replace("]", ",");
        String[] splited_token_info = token_info.split(",");

        String token_col_start = splited_token_info[splited_token_info.length - 1];
        String token_line = splited_token_info[splited_token_info.length - 2];

        // Se añade el token_id a una lista de variables, las listas son de tipo
        // "Variable" y tienen de parametros el nombre, su tipo, y su posicion
        variableList.addLast(new Variable(ctx.Identifier().getText(), token_line, token_col_start));
    }

    @Override
    public void enterTk_number(MATParser.Tk_numberContext ctx) {
        numberList.add(ctx.getText());
    }

    /*
        Función que se crea para saber si una variable esta definida, si la 
        variable no esta definida retorna false y manda un mensaje de error
    */
    public boolean isVarAlreadyDefined(Variable varToVerify) {
        for (int i = 0; i < declared_variables_list.size(); i++) {
            if (declared_variables_list.get(i).variableName.equals(varToVerify.variableName)) {
                return true;
            }
        }

        try {
            errorMessage = varToVerify.get_token_location() + " variable '"
                    + varToVerify.variableName + "' is not defined";
            errorMessageList.add(errorMessage);
            throw new SemanticException(errorMessage);
        } catch (SemanticException ex) {
            Logger.getLogger(MyTranslateListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Función que se llama desde el main para obtener la string que contiene
    // la traduccion del texto iniclal al lenguaje java
    public String getTextToJavaFile() {
        return this.textToJavaFile;
    }

    // Los errores semánticos se almacenan en una String y con esta función
    // se pueden obtener
    public String getErrorMessages() {
        String errorString = "";
        for (String error : this.errorMessageList) {
            errorString += error + "\n";
        }
        return errorString;
    }

    // Retorna el tipo de variable, si la variable no esta declarada manda un 
    // SemanticException
    public String getVarType(Variable varToVerify) {
        for (int i = 0; i < declared_variables_list.size(); i++) {
            if (varToVerify.variableName.equals(declared_variables_list.get(i).variableName)) {
                return declared_variables_list.get(i).variableType;
            }
        }

        try {
            errorMessage = varToVerify.get_token_location() + " variable '"
                    + varToVerify.variableName + "' is not defined";
            errorMessageList.add(errorMessage);
            throw new SemanticException(errorMessage);
        } catch (SemanticException ex) {
            Logger.getLogger(MyTranslateListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "None";
    }

    /*
        Este es el codigo inicial que va a tener el archivo java (donde se 
        traduce el archivo.matL), en este se crean las funciones necesarias para
        poder hacer operaciones con matrices
    */
    public String mainSettings() {
        return """
        static int[][] matrix_sum(int matrixA[][], int matrixB[][], int rows, int cols)
        {

            int mat[][] = new int[rows][cols];    

            for(int i = 0;i<rows;i++){
                for(int j = 0;j<cols;j++){
                    mat[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
            return mat;
        }

        static int[][] matrix_substraction(int matrixA[][], int matrixB[][], int rows, int cols)
        {

            int mat[][] = new int[rows][cols];    

            for(int i = 0;i<rows;i++){
                for(int j = 0;j<cols;j++){
                    mat[i][j] = matrixA[i][j] - matrixB[i][j];
                }
            }
            return mat;
        }

        static int[][] matrix_product(int matrixA[][], int matrixB[][], int rows, int cols)
        {

            int mat[][] = new int[rows][cols];    

            for(int i = 0;i<rows;i++){
                for(int j = 0;j<cols;j++){
                    mat[i][j] = matrixA[i][j] * matrixB[i][j];
                }
            }
            return mat;
        }

        static int[][] matrix_transpos(int matrixA[][], int rows, int cols)
        {

            int mat[][] = new int[rows][cols];    

            for(int i = 0;i<rows;i++){
                for(int j = 0;j<cols;j++){
                    mat[j][i] = matrixA[i][j];
                }
            }
            return mat;
        }

        public static void print_matrix(int mat[][], FileWriter file) throws IOException 
        {
            for (int[] row : mat)
            {
                file.write(Arrays.toString(row));
                file.write("\\n");
            }   
        }
        """;
    }
}
