package matrixL;

/**
 *
 * @author eduar
 */

class Variable {
    public String variableName;
    public String line;
    public String colStart;
    public String variableType;
    
    Variable(String new_variableName, String new_line, String new_colStart)
    {
        this.variableName = new_variableName;
        this.line = new_line;
        this.colStart = new_colStart;
    }
    
    public String get_token_location()
    {
        return "line " + line + ":" + colStart;
    }
}
