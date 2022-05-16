import java.util.Locale;
import java.util.ArrayList;

public class WordUtils {

    String keyWord;

    WordUtils(String key){
        this.keyWord = key;
    }

    public char[] compare(String word){
        char[] returnArray = new char[5];
        ArrayList<Character> list = getList(word);

        for(int x = 0 ; x < 5 ; x++){
            if(keyWord.charAt(x) == word.charAt(x)){
                returnArray[x] = 'g';
                list.remove(list.indexOf(word.charAt(x)));
            }
        }

        for(int x = 0 ; x < 5 ; x++){
            if (list.contains(word.charAt(x))){
                list.remove(list.indexOf(word.charAt(x)));
                //System.out.println(list.indexOf(word.charAt(x)));
                returnArray[x] = 'y';
            }else if(returnArray[x] == 0){
                //System.out.println(list.indexOf(word.charAt(x)));
                returnArray[x] = 'n';
            }
        }
        System.out.println();

        return returnArray;
    }

    private ArrayList<Character> getList(String word){
        ArrayList<Character> returnList = new ArrayList<>(5);
        for(int x = 0 ; x < word.length() ; x++){
            returnList.add(keyWord.charAt(x));
        }

        return returnList;
    }
}




