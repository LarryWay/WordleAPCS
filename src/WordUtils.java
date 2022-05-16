import java.util.Locale;

public class WordUtils {

    String keyWord;

    WordUtils(String key){
        this.keyWord = key;
    }

    public char[] compare(String word){
        char[] returnArray = new char[5];

        for(int x = 0 ; x < 5 ; x++){
            System.out.println("Comparing " + keyWord.charAt(x) + " with " + word.charAt(x));
            if(keyWord.charAt(x) == word.charAt(x)){
                returnArray[x] = 'g';
            }else if (keyWord.indexOf(word.charAt(x)) != -1){
                returnArray[x] = 'y';
            }else{
                returnArray[x] = 'n';
            }
        }

        for(int x = 0 ; x < 5 ; x++){
            System.out.print(returnArray[x] + " ");
        }
        System.out.println();

        return returnArray;
    }

}
