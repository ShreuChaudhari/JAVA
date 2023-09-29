import java.util.Scanner;

abstract class shape{
   abstract void draw();
}

class rectangle extends shape{
    void draw(){
    System.out.println("Drawing rectangle");
   }
}

class circle extends shape{
    void draw(){
    System.out.println("Drawing circle");
   }
}

class abstraction{
	public static void main(String args[]){
    shape s1= new circle();
    shape s2= new rectangle();
    s1.draw();
    s2.draw();
}
}