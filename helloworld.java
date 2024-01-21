class HelloWorld { 
	public static void main(String args[]) 
	{ 
		System.out.println("Hello, I'm Pm Gohil.");
		int size = 7; // Adjust the size as needed
		drawSmileyFace(size);
		System.out.println("Above task performed by Jenkins linked with GitHub Repository.");
	} 
	// Function to draw a smiley face
    private static void drawSmileyFace(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Check if the current position is within the circle
                if (isInsideCircle(size, i, j)) {
                    System.out.print(":)"); // You can use any character or string for the smiley
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    // Function to check if a point is inside the circle
    private static boolean isInsideCircle(int size, int x, int y) {
        // Calculate the distance from the center
        double distance = Math.sqrt(Math.pow(x - size / 2.0, 2) + Math.pow(y - size / 2.0, 2));

        // Check if the distance is less than or equal to the radius
        return distance <= size / 2.0;
    }
}
