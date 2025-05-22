
abstract class Shape{
    String color;

    Shape(String color){
        this.color=color;
    }
    abstract double getArea();

    public void display(){
        System.out.println("the color of "+color+ "shape");
    }
}
    class Circle extends Shape{
        double radius;
        Circle(String color,double radius){
            super(color);
            this.radius=radius;
        }
        @Override
        double getArea() {
            return Math.PI*radius*radius;            
        }
    }
        class Rectangle extends Shape{
            int length,width;
            Rectangle(String color,int length,int width){
                super(color);
                this.length=length;
                this.width=width;
            }
            @Override
            double getArea() {
                return length*width;            
            }
    }
public class AbstractClassDemo_1 {
    public static void main(String[] args) {
        Circle circle=new Circle("Blue",12.00);
        System.out.println("Area of Circle is: "+circle.getArea());
        Rectangle rectangle=new Rectangle("Red",12,12);
        System.out.println("Area of Circle is: "+rectangle.getArea());
        
    }
  }
