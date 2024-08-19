import java.util.*;
import java.io.*;
public class Convertor{  
   public static void main(String args[]) {
	double[][] arr = {
				{1, 83.21, 60.68, 105.78, 0.57},
				{0.012, 1, 0.73, 1.27, 0.0068},
				{0.016, 1.36, 1, 1072, 0.0092},
				{0.0094, 0.79, 0.58, 1, 0.0053},
				{1.78, 148.58, 108.61, 187.24, 1}
			}; 

   	Scanner n = new Scanner(System.in);
	Scanner n1 = new Scanner(System.in);

	System.out.println("==============================================================================");
	System.out.println("Country " + "\t||\t" + "Currency Code");
	System.out.println("-------------------------------------");
	System.out.println("India " + "\t\t||\t" + "INR");
	System.out.println("-------------------------------------");
	System.out.println("America " + "\t||\t" + "USD");
	System.out.println("-------------------------------------");
	System.out.println("Canada " + "\t\t||\t" + "CAD");
	System.out.println("-------------------------------------");
	System.out.println("United Kingdom " + "\t||\t" + "GBP");
	System.out.println("-------------------------------------");
	System.out.println("Japan " + "\t\t||\t" + "JPY");
	System.out.println("==============================================================================\n");
		
	System.out.print("Please Enter the Country Code (of which you want to convert) : ");
	String from = n.nextLine();
	System.out.println();

	System.out.print("Please Enter the ammount : ");
	double amm = n.nextDouble();
	System.out.println();
	
	System.out.print("Please Enter the Country Code (in which you want to convert) : ");
	String to = n1.nextLine();
	System.out.println();
	
	System.out.println("----------------------------");
	if(from.equals("INR")){
		if(to.equals("INR")){
			System.out.println(amm + " INR = " + (amm*arr[0][0]) + " INR");
		}
		else if(to.equals("USD")){
			System.out.println(amm + " INR = " + (amm*arr[1][0]) + " USD");
		}
		else if(to.equals("CAD")){
			System.out.println(amm + " INR = " + (amm*arr[2][0]) + " CAD");
		}
		else if(to.equals("GBP")){
			System.out.println(amm + " INR = " + (amm*arr[3][0]) + " GBP");
		}
		else if(to.equals("JPY")){
			System.out.println(amm + " INR = " + (amm*arr[4][0]) + " JPY");
		}
		else {
			System.out.println("Please enter valid Country code in which you want to convert!!");
		}
	}

	else if(from.equals("USD")){
		if(to.equals("INR")){
			System.out.println(amm + " USD = " + (amm*arr[0][1]) + " INR");
		}
		else if(to.equals("USD")){
			System.out.println(amm + " USD = " + (amm*arr[1][1]) + " USD");
		}
		else if(to.equals("CAD")){
			System.out.println(amm + " USD = " + (amm*arr[2][1]) + " CAD");
		}
		else if(to.equals("GBP")){
			System.out.println(amm + " USD = " + (amm*arr[3][1]) + " GBP");
		}
		else if(to.equals("JPY")){
			System.out.println(amm + " USD = " + (amm*arr[4][1]) + " JPY");
		}
		else {
			System.out.println("Please enter valid Country code in which you want to convert!!");
		}
	}

	else if(from.equals("CAD")){
			if(to.equals("INR")){
				System.out.println(amm + " CAD = " + (amm*arr[0][2]) + " INR");
			}
			else if(to.equals("USD")){
				System.out.println(amm + " CAD = " + (amm*arr[1][2]) + " USD");
			}
			else if(to.equals("CAD")){
				System.out.println(amm + " CAD = " + (amm*arr[2][2]) + " CAD");
			}
			else if(to.equals("GBP")){
				System.out.println(amm + " CAD = " + (amm*arr[3][2]) + " GBP");
			}
			else if(to.equals("JPY")){
				System.out.println(amm + " CAD = " + (amm*arr[4][2]) + " JPY");
			}
			else {
				System.out.println("Please enter valid Country code in which you want to convert!!");
			}
	}
	
	else if(from.equals("GBP")){
		if(to.equals("INR")){
			System.out.println(amm + " GBP = " + (amm*arr[0][3]) + " INR");
		}
		else if(to.equals("USD")){
			System.out.println(amm + " GBP = " + (amm*arr[1][3]) + " USD");
		}
		else if(to.equals("CAD")){
			System.out.println(amm + " GBP = " + (amm*arr[2][3]) + " CAD");
		}
		else if(to.equals("GBP")){
			System.out.println(amm + " GBP = " + (amm*arr[3][3]) + " GBP");
		}
		else if(to.equals("JPY")){
			System.out.println(amm + " GBP = " + (amm*arr[4][3]) + " JPY");
		}
		else {
			System.out.println("Please enter valid Country code in which you want to convert!!");
		}
	}
	
	else if(from.equals("JPY")){
		if(to.equals("INR")){
			System.out.println(amm + " JPY = " + (amm*arr[0][4]) + " INR");
		}
		else if(to.equals("USD")){
			System.out.println(amm + " JPY = " + (amm*arr[1][4]) + " USD");
		}
		else if(to.equals("CAD")){
			System.out.println(amm + " JPY = " + (amm*arr[2][4]) + " CAD");
		}
		else if(to.equals("GBP")){
			System.out.println(amm + " JPY = " + (amm*arr[3][4]) + " GBP");
		}
		else if(to.equals("JPY")){
			System.out.println(amm + " JPY = " + (amm*arr[4][4]) + " JPY");
		}
		else {
			System.out.println("Please enter valid Country code in which you want to convert!!");
		}
	}
	
	else{
		System.out.println("Please Enter Valid Country Code!!");
	}
	System.out.println("----------------------------");

   }  
}