//import java.util.Scanner;
class HelloWorld { 
	public static void main(String args[]) 
	{ 
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String userName = scanner.nextLine();
        	System.out.println("Your name is: " + userName);
		*/
		System.out.println("Hello, I'm Pm Gohil.");
	
		int size = 5; // Adjust the size as needed
	        // Print the top half of the smiley face
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size - i; j++) {
	                System.out.print("  "); // Print spaces for the eyes
	            }
	            for (int k = 0; k < 2 * i + 1; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	
	        // Print the bottom half of the smiley face
	        for (int i = size - 1; i >= 0; i--) {
	            for (int j = 0; j < size - i; j++) {
	                System.out.print("  "); // Print spaces for the eyes
	            }
	            for (int k = 0; k < 2 * i + 1; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
		System.out.println("Above task performed by Jenkins linked with GitHub Repository.");
	} 
}
