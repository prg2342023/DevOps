class HelloWorld { 
	public static void main(String args[]) 
	{ 
		System.out.println("Hello, I'm Pm Gohil.");
		 int size = 7; // Adjust the size as needed
		
		        // Outer loop for rows
		        for (int i = 0; i < size; i++) {
		            // Inner loop for columns
		            for (int j = 0; j < size; j++) {
		                // Calculate the distance from the center
		                double distance = Math.sqrt(Math.pow(i - size / 2.0, 2) + Math.pow(j - size / 2.0, 2));
		
		                // Check if the current position is within the circle (smiley face)
		                if (distance < size / 2.0) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.println(); // Move to the next line after each row
		        }
		/*
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
	        }*/
		System.out.println("Above task performed by Jenkins linked with GitHub Repository.");
	} 
}
