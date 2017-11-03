class MyThread extends Thread{
public void run(){
int i;
for(i=0;i<=5;i++){
System.out.println("@");
try{
sleep(100);
}catch(Exception e){
e.printStackTrace();
}
}
}
}
class myThread1 extends Thread{
public void run(){
int j;
for(j=1;j<=5;j++){
System.out.println("*");
try{
sleep(100);
}catch(Exception e){
e.printStackTrace();
}
}
}
}
public class p6 {
public static void main(String args[]){
MyThread mt = new MyThread();
myThread1 mt1 = new myThread1();
mt.start();
mt1.start();
}
}
