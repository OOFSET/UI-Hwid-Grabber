import com.sun.deploy.panel.JSmartTextArea;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.swing.*;
import javax.swing.text.JTextComponent;

public enum Main {
    INSTANCE;

   public Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();


    public JFrame frame = new JFrame("HWID Getter");
        public JPanel panel = new JPanel();
public JSmartTextArea text = new JSmartTextArea();



    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        StringSelection selector = new StringSelection(HWIDGrabber.getHWID());

          INSTANCE.clipboard.setContents(selector, null);


            INSTANCE.frame.setVisible(true);
            INSTANCE.frame.setSize(720, 480);
            INSTANCE.frame.setLocationRelativeTo(null);

            INSTANCE.panel.setVisible(true);
            INSTANCE.panel.setBackground(Color.BLACK);

            INSTANCE.text.setSize(1,1);
            INSTANCE.text.setText("HWID:" + HWIDGrabber.getHWID());

        INSTANCE.frame.add(INSTANCE.panel);
        INSTANCE.frame.add(INSTANCE.text);


    }

}
