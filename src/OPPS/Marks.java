package OPPS;

public class Marks {
    public static class StudentData{
        int rno;
        int[] marks;
        StudentData(int s){
            marks = new int[s];
        }
    }
    public static void main(String[] args){
        StudentData s1 = new StudentData(5);
        StudentData s2 = new StudentData(2);

    }
}
