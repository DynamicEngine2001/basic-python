
import java.util.Scanner;
public abstract class GeometricObject {
        private String color = "white";
        private boolean filled;


        

        
        protected GeometricObject(String color, boolean filled) {
                
                this.color = color;
                this.filled = filled;
        }

        
        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        
        public boolean isFilled() {
                return filled;
        }

        
        public void setFilled(boolean filled) {
                this.filled = filled;
        }

        
void display() 
{
                System.out.println( "\ncolor: " + color + " and filled: " + filled);
        }


        
        public abstract double getArea();
     public abstract double getPerimeter();
}

class Triangle extends GeometricObject
{
double side1;
double side2;
double side3;

Triangle()
{
side1 = 1.0;
side2 = 1.0;
side3 = 1.0;
}
Triangle(double side1,double side2,double side3)
{
this.side1=side1;
this.side2=side2;
this.side3=side3;
}

Triangle(double side1,double s2,double side3,String color,boolean filled)
{
this(side1,side2,side3);//constructor chaining
setColor(color);
setFilled(filled);
}

public void getArea() //overriding abstract method
{
                double s = (side1 + side2 + side3) / 2;
                double a= Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
System.out.println("Area="+a);
        }

        
        public void getPerimeter()//overriding abstract method
 {
                double p= side1 + side2 + side3;
              System.out.println("Perimeter="+p);
        }


        public void display()
 {
                System.out.println( "Triangle: side1 = " + side1 + " side2 = " + side2 +" side3 = " + side3);
                super.display();        
}
}

class PracticeProgram5
{
public static void main(String...s)
{

Scanner in=new Scanner(System.in);
System.out.println("Enter the three sides of triangle");

double side1=input.nextDouble();
double side2=input.nextDouble();
double side3=input.nextDouble();

System.out.println("Enter the color");
String color=input.nextLine();

System.out.println("is triangle filled or not");
boolean filled=input.nextBoolean();

Triangle t=new Triangle(side1,side2,side3,color,filled);
t.display();
}

}
