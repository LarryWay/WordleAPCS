import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;


public class GUI {

    JFrame frame = new JFrame();
    TextListener textListener = new TextListener(this);
    ActionMap actionMap = frame.getRootPane().getActionMap();  // PROBLEM -- NOT SURE IF ACTUALLY GETTING MAPPING
    InputMap inputMap = frame.getRootPane().getInputMap(JComponent.WHEN_FOCUSED);
    int bufferChar;

    JPanel panelMat[][] = new JPanel[CONSTANTS.NUM_OF_ATTEMPTS][CONSTANTS.NUM_OF_LETTERS];

    public GUI(){
        frameSetup();
        panelSetup();
        createMappings();
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
        frame.setVisible(true);
        frame.setSize(CONSTANTS.WINDOW_WIDTH,CONSTANTS.WINDOW_HEIGHT);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(textListener);
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


    private void createMappings(){
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "onEnter");
        actionMap.put("onEnter", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bruh"); // ISN"T WORKING
            }
        });
    }


    public void buffer(int c){
        this.bufferChar = c;
    }

    public void update(char c){
        System.out.println("Something's happeneing");
        ((JLabel)panelMat[0][0].getComponent(0)).setText(c + "");
    }

}
