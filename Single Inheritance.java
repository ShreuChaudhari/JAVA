import java.util.Scanner;

class Std{
	int RN;
	String Name;
	int Total;
	float Per;
	
	void readD(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the roll number and name: ");
		RN = sc.nextInt();
		Name = sc.nextLine();
		}
        void dispD(){
               System.out.println("RN: "+RN+"\tName: "+Name);
}
}
class dept extends Std{
          String Branch;

         void readS(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Branch: ");
                Branch = sc.nextLine();
                }

        void dispS(){
               System.out.println("\tBranch: "+Branch);
                }
}

class Demo{
   public static void main(String args[]){
                dept d1 = new dept();
		
		d1.readD();
		d1.readS();
		d1.dispD();
		d1.dispS();
	}
       }

         