import java.util.Scanner;

class Two extends Thread{
  public void run(){
  int x=2;
  for(int i=0;i<=10;i++)
  System.out.println(x*i);
}
}


class Ten extends Thread{
  public void run(){
  int x=10;
  for(int i=0;i<=10;i++)
  System.out.println(x*i);
}
}


class DEF{
  public static void main(String args[]){
       
  Two t1=new Two();
  Ten t2=new Ten();
  
  t1.start();
  t2.start();
}
}