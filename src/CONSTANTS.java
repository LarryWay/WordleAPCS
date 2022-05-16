public class CONSTANTS {
    // Constants for words
    public static int NUM_OF_ATTEMPTS = 6;
    public static int NUM_OF_LETTERS = 5;



    // Constants for GUI
    public static int LETTER_BOX_PADDING = 10;
    public static int ATTEMPT_ROW_PADDING = 15;
    public static int LETTER_BOX_SIZE = 60;

    public static int LEFT_WINDOW_PADDING = 150;
    public static int RIGHT_WINDOW_PADDING = 150;
    public static int TOP_WINDOW_PADDING = 200;
    public static int BOTTOM_WINDOW_PADDING = 100;
    public static int WINDOW_WIDTH = ((NUM_OF_LETTERS - 1) * LETTER_BOX_PADDING) + (NUM_OF_LETTERS * LETTER_BOX_SIZE)+ LEFT_WINDOW_PADDING + RIGHT_WINDOW_PADDING;
    public static int WINDOW_HEIGHT = ((NUM_OF_ATTEMPTS - 1) * ATTEMPT_ROW_PADDING) + (NUM_OF_ATTEMPTS * LETTER_BOX_SIZE) + TOP_WINDOW_PADDING + BOTTOM_WINDOW_PADDING;
    public static int HORIZONTAL_BOX_SPACING(int y){
        return (LETTER_BOX_PADDING * y) + (LETTER_BOX_SIZE * y);
    }
    public static int VERTICAL_BOX_SPACING(int x){
        return(ATTEMPT_ROW_PADDING * x) + (LETTER_BOX_SIZE * x);
    }




    //Constants for User Text
    public static int TEXTPANEL_WIDTH = LEFT_WINDOW_PADDING * 2 - 50;
    public static int TEXTPANEL_HEIGHT = TOP_WINDOW_PADDING - 50;
    public static int TEXTPANEL_XPOS = (WINDOW_WIDTH / 2) - (TEXTPANEL_WIDTH / 2);
    public static int TEXTPANEL_YPOS = TEXTPANEL_HEIGHT - (TEXTPANEL_HEIGHT - 30);

    public static int TEXTFIELD_WIDTH = 100;
    public static int TEXTFIELD_HEIGHT = 20;
    public static int TEXTFIELD_XPOS = (TEXTPANEL_WIDTH / 2) - (TEXTFIELD_WIDTH / 2);
    public static int TEXTFIELD_YPOS = 100;

    public static int WARNING_XPOS = 0;
    public static int WARNING_YPOS = 0;

}
