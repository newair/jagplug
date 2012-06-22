package newair.org;

import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: amila
 * Date: 6/19/12
 * Time: 10:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class HighlighterFactory extends SyntaxHighlighterFactory {

    @NotNull
    @Override
    public SyntaxHighlighter getSyntaxHighlighter(Project project, VirtualFile virtualFile) {
      return   new SyntaxHighlightHandler();  //To change body of implemented methods use File | Settings | File Templates.
    }



}
