import java.util.Scanner;
interface area {
public double circle(double r);
public double rectangle(double x, double y);
public double square(double a);
}
class Calculate implements area{
public double circle(double r){
return(3.14*r*r);
}

public double rectangle(double x,double y){
return(x*y);
}
public double square(double a){
return(a*a);
}
}
class p7{

interface area {
public double circle(double r);
public double rectangle(double x, double y);
public double square(double a);
}
class Calculate implements area{
public double circle(double r){
return(3.14*r*r);
}
public double rectangle(double x,double y){
return(x*y);
}
public double square(double a){
return(a*a);
}
}
class p7{
public static void main(String arg[]){
Calculate c = new Calculate();
double r,x,y,a;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the radius of circle");
r=sc.nextDouble();
System.out.println("Enter the length and breadth of rectangle :");
x=sc.nextDouble();
y=sc.nextDouble();
System.out.println("Enter the side of square");
a=sc.nextDouble();
System.out.println("Area of circle is : "+c.circle(r));
System.out.println("Area of Rectangle is : "+c.rectangle(x,y));
System.out.println("Area of square is : "+c.square(a));
}
}
}
