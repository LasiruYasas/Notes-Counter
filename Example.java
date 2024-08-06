import java.util.*;
class Example{
	public static void main(String args[]){
     	   Scanner input = new Scanner(System.in);

     	   	System.out.print("Enter Your First Name : ");
        	String fName = input.nextLine();

        	System.out.print("Enter Your Last Name : ");
        	String lName = input.nextLine();

        	System.out.print("Enter Your Home Number : ");
        	String hNumber = input.nextLine();

        	System.out.print("Enter Your Street Name : ");
        	String sName = input.nextLine();

        	System.out.print("Enter Your City : ");
        	String city = input.nextLine();

        	System.out.println();

        	System.out.println("Your Full Name : "+ fName +" "+ lName);
        	System.out.println("Your Home Address : "+ "No:" +hNumber +", "+ sName+ " Rd, "+ city+"." );

        /*Enter Your First Name : Kamal
        Enter Your Last Name : Perera
        Enter Your Home Number : 10/A
        Enter Your Street Name : Samagi
        Enter Your City : Galle

        Your Full Name : Kamal Perera
        Your Home Address : No:10/A, Samagi Rd, Galle.*/

    }
}