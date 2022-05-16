import javax.swing.*;
import java.awt.*;

public class UserText {

    JTextField textField;
    JPanel panel;
    JLabel warningLabel;

    public UserText(JFrame frame){
        textFieldSetup();
        warningLabelSetup();
        panelSetup();
        frame.getContentPane().add(panel);
    }

    private void textFieldSetup(){
        textField = new JTextField();
        textField.setVisible(true);
        textField.setBounds(CONSTANTS.TEXTFIELD_XPOS, CONSTANTS.TEXTFIELD_YPOS, CONSTANTS.TEXTFIELD_WIDTH, CONSTANTS.TEXTFIELD_HEIGHT);

    }

    private void warningLabelSetup(){
        warningLabel = new JLabel();
        warningLabel.setText("DO NOT EXCEED 5 LETTERS");
    }

    private void panelSetup(){
        panel = new JPanel();
        panel.setVisible(true);
        panel.setBackground(Color.GREEN);
        //panel.add(textField);
        //panel.add(warningLabel);
        //panel.setBounds(CONSTANTS.TEXTPANEL_XPOS, CONSTANTS.TEXTPANEL_YPOS, CONSTANTS.TEXTPANEL_WIDTH, CONSTANTS.TEXTPANEL_HEIGHT);
        panel.setBounds(100,100,100,100);
    }

}
