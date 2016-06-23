import java.util.Scanner;

public class GrandCircusPreWork{
	
	public static void main(String[] args) {
		
         Scanner scanner = new Scanner(System.in);
//*I had to import a java scanner util in line 7 to make this work.*//
//*I also had accidentally left a } that is supposed to 
//* close out the bottom of the code at the end of the line 12, This
//* caused me problems getting the output stream to function correctly.         
         System.out.print("Please enter a number containing no characters and not ending in zero to reverse:"); 
         
         int original = scanner.nextInt();
         int remainder; 
         int reverse = 0;
        //* I had forgotten the semicolon ending line 16
         while(original !=0) {
        	 
        remainder = original % 10;	 
        reverse = reverse * 10 + remainder;
        original = original / 10;		
         }
	    System.out.println ("reverse of number is :" + reverse);
	//* After running multiple numbers I found that zero does not reverse if it
	//* is the first or last number in the sequence. Why is that?
	}
}





