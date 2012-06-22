package newair.org;

import com.intellij.openapi.fileTypes.StdFileTypes;
import com.intellij.psi.tree.IElementType;

/**
 * Created with IntelliJ IDEA.
 * User: amila
 * Date: 6/12/12
 * Time: 2:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class JaggeryElementType extends IElementType {

    public JaggeryElementType(@org.jetbrains.annotations.NotNull @org.jetbrains.annotations.NonNls String debugName) {
        super(debugName,StdFileTypes.JSPX.getLanguage() );// Check again
    }
}
