import java.util.Scanner;

public class Input{
	public static void main (String [] args ){
	
	Scanner input =new Scanner (System.in);

	Scanner sc =new Scanner (System.in);

	
	System.out.print("enter byte : ");
	byte b = input.nextByte();

	System.out.print("enter int : ");
	int i= input.nextInt();

	System.out.print("enter float : ");
	float f=input.nextFloat();

	System.out.print("enter short : ");
	short s=input.nextShort();

	// STRING WITHOUT SPACES USING NEXT
	System.out.print("enter string : ");
	String str1= input.next();
	System.out.print("Without spaces :  " +str1+"\n");

	// STRING WITH SPACES USING NEXTLINE
	System.out.print("enter string : ");
	String str2= sc.nextLine();
	System.out.print("With spaces : "+ str2);

	System.out.print("enter character : ");
	char ch = sc.next().charAt(0);
	System.out.print("enter character : ");
	
	}
}
