package newair.org;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: amila
 * Date: 6/18/12
 * Time: 3:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class JaggeryFileTypeFactory extends FileTypeFactory {


    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {

        fileTypeConsumer.consume(JaggeryFileType.FILE_TYPE, JaggeryFileType.DEFAULT_EXTENSION);


    }
}
