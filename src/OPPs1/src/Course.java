import java.util.FormatterClosedException;

public class Course {

    String name;
    int duration;

    Course(String name, int duration){
        System.out.println(name);
        this.name = name; // instance = local
        this.duration = duration;
    }
    public static void main (String[] args) {
         //System.out.println("before object create");
         // default constructor will we create
            Course c = new Course("Java",4);
//        c.name="java full stack";
//        System.out.println("after object create");
//            // default constructor will we create
            Course c2 = new Course("Devops",5);
//            c2.name = "we are learning Devops";
//            c.learn(c2);

        //para constructor will create
            Course c3 = new Course("DSA",3);

            System.out.println(c.name);
            System.out.println(c.duration);
            System.out.println(c2.name);
            System.out.println(c2.duration);
            System.out.println(c3.name);
            System.out.println(c3.duration);
    }
/*
    void learn(Course c){
        System.out.println("we are learning "+c.name);
    }
*/

}
