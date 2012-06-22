package newair.org;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;

/**
 * Created with IntelliJ IDEA.
 * User: amila
 * Date: 6/12/12
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
public interface JaggeryTokenTypes {



    IElementType KEY_CHARACTERS = new JaggeryElementType("KEY_CHARACTERS");
    IElementType VALUE_CHARACTERS = new JaggeryElementType("VALUE_CHARACTERS");

    IElementType  WHITE_SPACE = TokenType.WHITE_SPACE ;




              TokenSet WHITE_SPACES=  TokenSet.create(WHITE_SPACE);













}
