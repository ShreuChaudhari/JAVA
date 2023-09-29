import java.util.*;

class Array{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int A[] = new int[5];
		int sum = 0, b, i, j;

		System.out.println("Enter 5 integer values: ");
		for(i = 0; i < 5; i++){
			A[i] = sc.nextInt();
			sum = sum + A[i];
		}

		System.out.println("Sum: "+sum);

	
		for(i=0; i<5; i++){
			for(j=0; j<i; j++){
				if(A[i]>A[j]){
					b=A[i];
					A[i]=A[j];
					A[j]=b;
				}
			}
		}

		System.out.println("\nSorted Array: \n");
		for(i=0; i<5; i++){
			System.out.print(A[i]+"\t");	
		}
	}
}
