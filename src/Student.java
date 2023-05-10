public class Student {
    private int rollno;
    private String name;
    private static String college = "@abc xyz";

    //constructor to initialize the variable
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODE GYM";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
