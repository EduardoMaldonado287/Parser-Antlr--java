package matrixL;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.Utils;

import java.util.ArrayList;
import java.util.List;
/**
 * Se utilizó esta clase y la clase "Syntax Error" para poder interactuar con 
 * los errores sintácticos y poder usarlos en la interfaz gráfica.
 * 
 * @author eduar
 */


public class SyntaxErrorListener extends BaseErrorListener{
    private final List<SyntaxError> syntaxErrors = new ArrayList<>();

    SyntaxErrorListener()
    {
    }

    List<SyntaxError> getSyntaxErrors()
    {
        return syntaxErrors;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e)
    {
        syntaxErrors.add(new SyntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e));
    }

    @Override
    public String toString()
    {
        return Utils.join(syntaxErrors.iterator(), "\n");
    }
    
    public String getErrors()
    {
        String errorString = "";
        for (int i = 0; i < syntaxErrors.size(); i++)
        {
            errorString += syntaxErrors.get(i).getErrorInfo() + "\n";
        }
        return errorString;
    }
    
    
    
}
