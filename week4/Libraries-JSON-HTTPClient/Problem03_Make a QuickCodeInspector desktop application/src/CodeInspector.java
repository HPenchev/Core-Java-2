import java.io.*;
import java.util.*;
import java.util.logging.*;

import javax.swing.*;

import syntaxhighlight.SyntaxHighlighter;
import syntaxhighlighter.brush.*;
import syntaxhighlighter.SyntaxHighlighterParser;
import syntaxhighlighter.theme.ThemeRDark;

public class CodeInspector {

    public static void main(String[] args) {
        System.out.println(args[0]);
//        final File FILE = new File("WebsiteHeader.html");
        final File FILE = new File(args[0]);
        SwingUtilities.invokeLater(new Runnable() {            
            
            @Override
            public void run() {
              SyntaxHighlighterParser parser = new SyntaxHighlighterParser(new BrushXml());
              parser.setHtmlScript(true);
              parser.setHTMLScriptBrushes(Arrays.asList(new BrushCss(), new BrushJScript(), new BrushPhp()));

              SyntaxHighlighter highlighter = new SyntaxHighlighter(parser, new ThemeRDark());
              try {
                highlighter.setContent(FILE);
              } catch (IOException ex) {
                Logger.getLogger(CodeInspector.class.getName()).log(Level.SEVERE, null, ex);
              }

              JFrame frame = new JFrame();
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.setContentPane(highlighter);
              frame.setLocationByPlatform(true);
              frame.pack();
              frame.setVisible(true);
            }
          });
    }
}
