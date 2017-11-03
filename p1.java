import java.util.Scanner;
public class p1 
{
public void largestNumber()
{
int i,max,n;
System.out.println("Enter The Number of elements in the array :");
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
int arr[] = new int[n];
System.out.println("Enter Elements of array : ");
for(i=0;i<n;i++){
arr[i]=sc.nextInt();
}
max=arr[0];
for(i=0;i<n;i++){
for(int j=i;j<n;j++){
if(max<arr[i]){
max=arr[i];
}
if(arr[i]>arr[j]){
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("The Largest Elemnts in the Aray are :" + max);
System.out.println("The second Largest No. " +arr[n-2]);
System.out.println("The Smallest no.is : "+arr[0]);
}
public static void main(String args[]){
p1 p = new p1();
p.largestNumber();
}
}
