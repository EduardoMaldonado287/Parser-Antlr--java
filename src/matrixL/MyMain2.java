package matrixL;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class MyMain2
{
    public static void main(String[] args)throws FileNotFoundException, IOException
    {
        String route = System.getProperty("user.home");

        System.out.println("Los archivos generados se ubicaran en la siguiente ruta: " + 
                "\n" + route + "\n");
        
        File tempFile = new File(route + "/matrixL_File.matL");        
        // Verifica que el archivo "matrix_File" exista, y si no lo crea
        if (!tempFile.exists())
        {
            FileWriter matL_file = new FileWriter(route + "/matrixL_File.matL");
            matL_file.close();
        }
        
        File myFile = new File (System.getProperty("user.home"), "matrixL_File.matL");
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(myFile);

        // Se lee el archivo con extension matL (opcional, puede ser txt)
        while (scanner.hasNext() )
        {
            stringBuilder = stringBuilder.append(scanner.nextLine() ).append( "\n" );
        }

        scanner.close();

        String javaClassContent = stringBuilder.toString();

        System.out.println("Original Program");
        System.out.println();
        System.out.println(javaClassContent);
        System.out.println();
        
        try
        {
            // Archivo en el que se traduce del lenguaje matL a java
            FileWriter javaFile = new FileWriter(route + "/myMatrixL_Java.java");       
            // Arhivo en el que se almacenan los errores
            FileWriter errorFile = new FileWriter(route + "/myMatrixL_errors.txt");
            
            // se crea el lexer y se le añade el texto obtenido del arhicov matrixL_file
            MATLexer lexer = new MATLexer(CharStreams.fromString(javaClassContent) );
            CommonTokenStream tokens = new CommonTokenStream (lexer );
            // Se añaden los tokens al parser
            MATParser parser = new MATParser (tokens);
            
            // Se agrega un errorListener para el manejo de errores
            SyntaxErrorListener errorListener = new SyntaxErrorListener();
            parser.addErrorListener(errorListener);
            
            // Inicia el parser;
            ParseTree tree = parser.programDeclaration();
            ParseTreeWalker walker = new ParseTreeWalker();
            
            // Creación del listener para análisis semántico y traducción a java
            MyTranslateListener myListener = new MyTranslateListener();
            walker.walk (myListener, tree);

            // Se crea el código de java desde una string generada por el listener
            javaFile.write(myListener.getTextToJavaFile());
            javaFile.close();
            
            // Se agregan los errores sintácticos y semánticos al arhivo txt
            errorFile.write(errorListener.getErrors());
            errorFile.write(myListener.getErrorMessages());
            errorFile.close();

        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        /*
            Se compila el archivo java que es la traduccion del lenguaje matL
            Este archivo java a su vez genera un archivo txt que tiene los 
            resultados del programa (cuando se escribe "write" en el archivo matL)
        */
        String command1 = "javac " + route + "\\myMatrixL_Java.java";
        String command2 = "java " +route + "\\myMatrixL_Java.java";
        Process pro = Runtime.getRuntime().exec(command1);
        pro = Runtime.getRuntime().exec(command2);
    }
}