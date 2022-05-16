import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Locale;

public class UserText {

    JTextField textField;
    JPanel panel;
    JLabel warningLabel;
    GUI gui;

    public UserText(JFrame frame, GUI gui){
        textFieldSetup();
        warningLabelSetup();
        panelSetup();
        frame.getContentPane().add(panel);
        this.gui = gui;
    }

    private void textFieldSetup(){
        textField = new JTextField();
        textField.setVisible(true);
        textField.setBounds(CONSTANTS.TEXTFIELD_XPOS, CONSTANTS.TEXTFIELD_YPOS, CONSTANTS.TEXTFIELD_WIDTH, CONSTANTS.TEXTFIELD_HEIGHT);
        textField.setFont(new Font("Monospaced", Font.PLAIN, 20));
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(textField.getText().length() >= 5 && e.getKeyChar() != 10){
                    textField.setText(textField.getText().substring(0, 4));
                }

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == 10 && textField.getText().length() == 5){
                    gui.update(textField.getText().toLowerCase(Locale.ROOT));
                    textField.setText("");
                }


            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    private void warningLabelSetup(){
        warningLabel = new JLabel();
        warningLabel.setText("DO NOT EXCEED 5 LETTERS");
        warningLabel.setBounds(CONSTANTS.WARNING_XPOS, CONSTANTS.WARNING_YPOS, CONSTANTS.TEXTPANEL_WIDTH, 20);
    }

    private void panelSetup(){
        panel = new JPanel();
        panel.setVisible(true);
        panel.setLayout(null);
        panel.setBackground(Color.GREEN);
        panel.add(textField);
        panel.add(warningLabel);
        panel.setBounds(CONSTANTS.TEXTPANEL_XPOS, CONSTANTS.TEXTPANEL_YPOS, CONSTANTS.TEXTPANEL_WIDTH, CONSTANTS.TEXTPANEL_HEIGHT);
    }

}
