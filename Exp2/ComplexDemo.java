package Exp2;

class Complex {
    double realPart ;
    double imaginaryPart;

    public Complex(){
        realPart = 0;
        imaginaryPart = 0;
    }

    public Complex(double temprealPart, double tempimaginaryPart){
        realPart = temprealPart;
        imaginaryPart = tempimaginaryPart;
    }

    public void setrealPart(double temprealPart){
        realPart = temprealPart;
    }

    public void setimaginaryPart(double tempimaginaryPart){
        imaginaryPart = tempimaginaryPart;
    }

    public double getrealPart(){
        return realPart;
    }

    public double getimaginaryPart(){
        return imaginaryPart;
    }

    public Complex add(Complex c1 , Complex c2){
        Complex c3 = new Complex();
        c3.realPart = c1.realPart + c2.realPart;
        c3.imaginaryPart = c1.imaginaryPart + c2.imaginaryPart;
        System.out.println("add is " + c3.realPart + " i " + c3.imaginaryPart);
        return c3;
    }

    public Complex sub(Complex c1 , Complex c2){
        Complex c4 = new Complex();
        c4.realPart = c1.realPart + c2.realPart;
        c4.imaginaryPart = c1.imaginaryPart + c2.imaginaryPart;
        System.out.println("sub is " + c4.realPart + " i " + c4.imaginaryPart);
        return c4;
    }


}

public class ComplexDemo{

    public static void main(String[] args) {

        Complex c1 = new Complex();
        c1.setimaginaryPart(5);
        Complex c2 = new Complex(2,3);
        System.out.println(c1.getimaginaryPart());
        System.out.println(c2.getrealPart());

        c1.add(c1, c2);


    }
}
