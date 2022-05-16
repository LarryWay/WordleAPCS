import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;


public class GUI {

    JFrame frame = new JFrame();
    UserText text;
    int bufferChar;

    JPanel panelMat[][] = new JPanel[CONSTANTS.NUM_OF_ATTEMPTS][CONSTANTS.NUM_OF_LETTERS];

    public GUI(){
        frameSetup();
        panelSetup();
    }

    private void panelSetup(){
        for(int x = 0; x < CONSTANTS.NUM_OF_ATTEMPTS ; x++){
            for(int y = 0 ; y < CONSTANTS.NUM_OF_LETTERS ; y++){
                panelMat[x][y] = createPanel();
                frame.getContentPane().add(panelMat[x][y]);
                panelMat[x][y].setBounds((CONSTANTS.LEFT_WINDOW_PADDING + CONSTANTS.HORIZONTAL_BOX_SPACING(y)),
                        CONSTANTS.TOP_WINDOW_PADDING + CONSTANTS.VERTICAL_BOX_SPACING(x),
                        CONSTANTS.LETTER_BOX_SIZE, CONSTANTS.LETTER_BOX_SIZE);

            }
        }


    }

    private void frameSetup(){
        text = new UserText(frame);
        frame.setVisible(true);
        frame.setSize(CONSTANTS.WINDOW_WIDTH,CONSTANTS.WINDOW_HEIGHT);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JLabel createLabel(){
        JLabel label = new JLabel();
        label.setFont(new Font("Serif", Font.PLAIN, 40));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        return label;
    }

    private JPanel createPanel(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
        panel.add(createLabel());
        return panel;
    }

    public void update(char c){
        System.out.println("Something's happeneing");
        ((JLabel)panelMat[0][0].getComponent(0)).setText(c + "");
    }

}
