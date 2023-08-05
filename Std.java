import java.util.Scanner;

class Std{
	int RN;
	String Name;
	int M[];
	int Total;
	float Per;
	
	void read(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the roll number and name: ");
		RN = sc.nextInt();
		Name = sc.nextLine();
		M = new int[5];
		 	
		System.out.println("Enter marks: ");
		for(int i = 0; i<5; i++){
			M[i] = sc.nextInt();
			Total = Total + M[i];
		}
		
		Per = (float)Total/5;
	}

	void disp(){
		System.out.println("RN: "+RN+"\tName: "+Name);
		
		for(int i = 0; i<5; i++){
			System.out.print(M[i]+"  ");
		}
		System.out.println("\nTotal: "+Total+"\tPercentage: "+Per);

		
	}
}

class Stud{
	public static void main(String args[]){
		Std s1 = new Std();
		Std s2 = new Std();
		
		s1.read();
		s1.disp();
		s2.read();
		s2.disp();
	}
}
