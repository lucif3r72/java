import java.util.Scanner;
public class p10 {
public static void main(String args[]){
int i,upper=0,lower=0,integer=0,symbol=0;
char ch;
System.out.println("Enter The String To Calculate no.of UPPERCASE,LOWERCASE,INTEGERS and SYMBOL");
Scanner sc = new Scanner(System.in);
String str = sc.next();
int l=str.length();
for(i=0;i<l;i++){
ch = str.charAt(i);
if(ch>='A' && ch<='Z')
upper++;
if(ch>='a' && ch<='z')
lower++;
if(ch>='0' && ch<='9')
integer++;
}
System.out.println("\n No. of Upper Case letter in String : "+upper);
System.out.println("\n No. of lower Case letter in String : "+lower);
System.out.println("\n No. of integers in a String : "+integer);
System.out.println("\n No. of special symbol in a String : "+(l-
(upper+lower+integer)));
}
}
