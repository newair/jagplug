package newair.org;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Attr;

import javax.swing.*;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: amila
 * Date: 6/15/12
 * Time: 11:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class colourSettings implements ColorSettingsPage {


    private static final AttributesDescriptor[] ATTRS ;

   static {

       ATTRS = new AttributesDescriptor[SyntaxHighlightHandler.DISPLAY_NAMES.size()];
       TextAttributesKey[] keys = SyntaxHighlightHandler.DISPLAY_NAMES.keySet().toArray(new TextAttributesKey[0]);
       for (int i = 0; i < keys.length; i++) {
           TextAttributesKey key = keys[i];
           String name = SyntaxHighlightHandler.DISPLAY_NAMES.get(key).getFirst();
           ATTRS[i] = new AttributesDescriptor(name, key);

       }

   }



    @Override
    public Icon getIcon() {
        return IconLoader.getIcon("monitor.png");  //To change body of implemented methods use File | Settings | File Templates.
    }



    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new SyntaxHighlightHandler();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "my demo text";  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return ATTRS;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "COLOUR SETTINGS";  //To change body of implemented methods use File | Settings | File Templates.
    }
}
