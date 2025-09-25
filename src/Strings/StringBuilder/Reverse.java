package Strings.StringBuilder;

public class Reverse {
    public static void main(String[] args) {
        String s = "Ankit";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        int i=0, j = sb.length()-1;
        while(i<=j){
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.deleteCharAt(1);
        System.out.println(sb);

        sb.insert(1,"n");
        System.out.println(sb);
    }
}
