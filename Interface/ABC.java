import java.util.Scanner;

class Std{
	int RN;
	String Name;
	int Total;
	
	
	void read(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the roll number and name & total: ");
		Name = sc.nextLine();
    RN = sc.nextInt();
    Total= sc.nextInt();
                
         }
 
       void disp(){
		System.out.println("RN: "+RN+"\tName: "+Name+"\tTotal:" +Total);
        }
      }

 interface sports
   {
       final int grace = 10;
       void dispGrace();
   }

     
class Marksheet extends Std implements sports
  {
   float per;
   public void dispGrace()
    {
    System.out.println("Grace: "+grace);
    }


    void calculate()
   {
   Total = Total + grace;
   per = Total / 5;
   }

  void dispMarksheet()
  {
   disp();
   dispGrace();
   calculate();
   System.out.println("Per: "+per);
  }
}


class ABC{
  public static void main(String args[]){
   
    Marksheet m1 = new Marksheet();
    m1.read();
    m1.dispMarksheet();
   
 }
}