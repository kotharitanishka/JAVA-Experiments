// Write a constructor in the Car class given below that initializes the brand class field
// with the string “Ford”. Call the getBrand () method in the main method of the Sample
// class and store the value of the brand in a variable, and print the value.

package Java_QuestionBank;

// public class Car {

//     String brand;

//     Car(String s) {
//         this.brand = s;
//     }

//     public void getbrand() {
//         System.out.println("brand name is : " + brand);
//     }

//     public static void main(String[] args) {
//         Car c = new Car("ford");
//         c.getbrand();
//     }

// }

public class Car{

    String name ;

    public Car(){
        name = "ford";
    }

    public String getbrand(){
        return name;
    }

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("brand name is : " + c.getbrand());
    }
}
