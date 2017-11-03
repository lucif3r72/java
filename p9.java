import java.util.Scanner;
public class p9 {
public static void main(String args[]){
System.out.println("\n Enter the number to Calculate factorial.");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
System.out.println("\n Enter the numbert to calculate fibonacci series.");
int num1 = sc.nextInt();
int fact = factorial(num);
int fib=num1;
System.out.println("\n The factorial of Number is "+fact);
for(int i=0;i<num1;i++){
fib= fibonacci(i);
System.out.println("\n The fiboncci Series is "+fib);
}
}
static int factorial(int num){
if(num==1)
return 1;
else
return(num*factorial(num-1));
}
static int fibonacci(int num1){
if(num1==0)
return 0;
else
if(num1==1)
return 1;
else
return (fibonacci(num1-1)+fibonacci(num1-2));
}
}
