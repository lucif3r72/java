import java.util.Scanner;
public class p8 {
public static void main(String args[]){
int num = 0, sum = 0;
while(num!=-99){
sum=sum+num;
System.out.println("Enter the no. ");
Scanner sc = new Scanner(System.in);
num=sc.nextInt();
}
System.out.println("The Sum of no.is"+sum);
}
}
