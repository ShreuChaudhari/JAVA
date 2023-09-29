import java.util.Scanner;

class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c;
        System.out.println("Enter Numerator and Denominator");

        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            c = a / b;
        }

        catch(ArithmeticException ae){
            c = a;
        }

        finally{
            System.out.println("Exception taken care!");
        }

        System.out.println("c = "+c);
        System.out.println("Thanks!");
    }
}