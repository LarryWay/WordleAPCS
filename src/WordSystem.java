import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class WordSystem {
    private static final File wordFile = new File("src/WordList.txt");
    private static Scanner scan;
    private static int numOfWords = 0;

    public WordSystem()  {
        try{
            scan = new Scanner(wordFile);
        }catch (Exception e){
            e.printStackTrace();
        }

        numOfWords = countWords();
    }


    public String getRandomWord(){
        Random ran = new Random();
        int val = ran.nextInt(numOfWords - 1);
        return getWord(val).toLowerCase(Locale.ROOT);

    }

    private int countWords(){
        int temp = 0;
        while(scan.hasNextLine()) {
            scan.nextLine();
            temp++;
        }
        scan.reset();
        return temp;
    }


    private String getWord(int val){
        String temp;
        try{scan = new Scanner(wordFile);} catch(Exception e){e.printStackTrace();}
        for(int x = 0 ; x < val ; x++){
            scan.nextLine();
        }
        temp = scan.nextLine();
        scan.reset();
        return temp;
    }

    public static boolean hasWord(String word){
        int cnt = 0;
        try{scan = new Scanner(wordFile);} catch(Exception e){e.printStackTrace();}
        while(scan.nextLine().compareTo(word) != 0){
            cnt++;
        }
        return cnt < numOfWords;
    }

}
