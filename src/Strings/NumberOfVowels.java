package Strings;

public class NumberOfVowels {
    public static void main(String[] args) {
        String str = "ankitriya";
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if('a'== ch || 'e' == ch || 'i' == ch || 'o' == ch || 'u' == ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
