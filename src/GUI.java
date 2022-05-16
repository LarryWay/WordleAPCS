import javax.swing.*;
import java.awt.Font;
import java.awt.Color;


public class GUI {

    WordSystem wordsys = new WordSystem();
    JFrame frame = new JFrame();
    UserText text;
    int rowNum = 0;
    WordUtils key = new WordUtils(wordsys.getRandomWord());

    String inputWord;

    JPanel panelMat[][] = new JPanel[CONSTANTS.NUM_OF_ATTEMPTS][CONSTANTS.NUM_OF_LETTERS];

    public GUI(){
        System.out.println(key.keyWord);
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
        frame.setVisible(true);
        frame.setSize(CONSTANTS.WINDOW_WIDTH,CONSTANTS.WINDOW_HEIGHT);
        frame.setLayout(null);
        text = new UserText(frame, this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JLabel createLabel(){
        JLabel label = new JLabel();
        label.setVisible(true);
        label.setFont(new Font("Monospaced", Font.PLAIN, 40));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(-20,-20,100,100);
        label.setText("");
        return label;
    }

    private JPanel createPanel(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
        panel.add(createLabel());
        return panel;
    }



    public void update(String word){
        inputWord = word;
        char[] temp = key.compare(word);
        for(int x = 0 ; x < 5 ; x++){
            ((JLabel)panelMat[rowNum][x].getComponent(0)).setText(word.charAt(x) + "");
            if(temp[x] == 'g'){
                panelMat[rowNum][x].setBackground(Color.GREEN);
            }else if (temp[x] == 'y'){
                panelMat[rowNum][x].setBackground(Color.YELLOW);
            }
        }
        rowNum++;
    }

    public String getInputWord(){
        return inputWord;
    }

}
