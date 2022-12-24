package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String symbols, String word) {
        if(symbols.equals("")) {
            return false;
        }

        char[] letters = word.toLowerCase().toCharArray();

        List<Character> list = new ArrayList<>();
        for(int i = 0; i < symbols.length(); i++){
            list.add(symbols.charAt(i));
        }

        for (var letter: letters) {
            if (list.contains(letter)) {
                int index = list.indexOf(letter);
                list.remove(index);
            } else {
                return false;
            }
        }

        return true;
    }
}
//END
