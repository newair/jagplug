package newair.org;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: amila
 * Date: 6/7/12
 * Time: 12:05 PM
 * To change this template use File | Settings | File Templates.
 */



public class JaggeryFileType extends LanguageFileType {

  //  public  static final String DEFAULT = "jag";
    public static final Icon FILE_ICON = IconLoader.getIcon("monitor.png");

    public static final LanguageFileType FILE_TYPE = new JaggeryFileType();
    @NonNls
    public static final String DEFAULT_EXTENSION = "jag";




    protected JaggeryFileType() {
        super(JaggeryLanguage.INSTANCE);
    }



    @NotNull
    @Override
    public String getName() {
        return "jaggery";  //To change body of implemented methods use File | Settings | File Templates.
    }


    @NotNull
    @Override
    public String getDescription() {
        return "jaggery";  //To change body of implemented methods use File | Settings | File Templates.
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Icon getIcon() {

     return FILE_ICON;


    }


    
}
