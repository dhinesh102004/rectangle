// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(7,8);
        Rectangle rectangle2=new Rectangle(4,3);

        System.out.println("Area of Rectangle1 :"+rectangle1.RectangleArea());
        System.out.println("Circumference of Rectangle1 :" +rectangle1.RectangleCircumference());
        System.out.println("Area of Rectangle2 :" +rectangle2.RectangleArea());
        System.out.println("Circumference of Rectangle2 :" +rectangle2.RectangleCircumference());

    }
}
class Rectangle{
    double Length,Breadth;
    public Rectangle(double Length,double Breadth){
        this.Length=Length;
        this.Breadth=Breadth;
    }
    double RectangleArea(){
        return Length*Breadth;
    }

    double RectangleCircumference(){
        return 2*(Length+Breadth);
    }
}