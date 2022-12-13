//WAP to implement three classes namely Student, Test and Result. 
//Student class has member as rollno, Test class has members as sem1_marks and sem2_marks 
//and Result class has member as total. Create an interface named sports that has a member score (). 
//Derive Test class from Student and Result class has multiple inheritances from Test and Sports. 
//Total is formula based on sem1_marks, sem2_mark and score.

package Java_QuestionBank;

import java.util.Scanner;

class Student{
    public int roll_no;
}

class Test extends Student{
    public int sem1_marks;
    public int sem2_mark;
}

interface Sports{
    int Score();
}

class Result extends Test implements Sports{
    public int total;

    public int Score(){
        total = sem1_marks + sem2_mark;
        return total;
    }

    void display(){
        Score();
        System.out.println("the roll no is " + roll_no);
        System.out.println("sem 1 marks is " + sem1_marks);
        System.out.println("sem 2 marks is " + sem2_mark);
        System.out.println("the total marks is " + total);
    }
}

public class Q13 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        Result res = new Result();
        System.out.println("enter roll number  : ");
        res.roll_no = r.nextInt();
        System.out.println("enter sem 1 marks  : ");
        res.sem1_marks = r.nextInt();
        System.out.println("enter sem 2 marks  : ");
        res.sem2_mark = r.nextInt();
        res.display();
        r.close();

    }
}

  
