package Exp2;

public class Student {
    
    String Name ;

    public Student(){
        Name = "unknown";

    }

    public Student(String N) {
        Name = N;
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("TKKKKKKKKKK");
        //s1.Name = "tanishka" ;
        System.out.println("student name is : " + s1.Name);
        System.out.println("student name is : " + s2.Name);
    }
}


