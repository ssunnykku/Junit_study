package study.woowaprecorse6;

import java.text.MessageFormat;

public class StringClass {

    public String[] makeArray(String numbers){
        return numbers.split(",");
    }

    public String deleteParenthesis(String numbers) {
        return numbers.substring(1,numbers.length()-1);
    }

    public String getWordFromIndex(int index,String words){
        String ErrorMsg = MessageFormat.format("Index: {0}, Size: {1}", index, words.length());
        if(index<0 || index>words.length()-1) {
            throw new StringIndexOutOfBoundsException(ErrorMsg);
        }
        String word = words.charAt(index) + "";
        return word;
    }
}
