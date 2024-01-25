//Ganesh Print
public class demo {

    public static void main(String[] args) {
        // Print Ganesha Crown
        for (int i = 1; i < 5; i++) {
            for (int j = i; j < 9; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print Ganesha Ear and Mouth
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 4; j++) {
                System.out.print("#");
            }
            for (int j = 1; j < 8; j++) {
                if (j == 1) {
                    System.out.print(" @");
                } else if (j == 7) {
                    System.out.print("@ ");
                } else {
                    System.out.print("@");
                }
            }
            for (int j = i; j < 4; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        // Print Ganesha Trunk
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 4; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

        // Print Ganesha Next Trunk
        for (int i = 0; i < 3; i++) {
            for (int j = i + 8; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 3; k++) {
                System.out.print("@");
            }
            System.out.println();
        }

        // Print Ganesha Next Trunk
        for (int i = 0; i < 2; i++) {
            for (int j = i + 11; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2; k++) {
                System.out.print("@");
            }
            System.out.println();
        }

        // Print Ganesha Last Single Trunk
        for (int j = 0; j < 14; j++) {
            System.out.print(" ");
        }
        System.out.println("@");
    }
}
