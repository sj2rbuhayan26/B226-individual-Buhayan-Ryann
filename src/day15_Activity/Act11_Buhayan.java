package day15_Activity;

public class Act11_Buhayan {

    public static void main(String[] args) {

        System.out.println("LOTTO");

        int[] lotto = new int[6];

        // Outer loop: Generate 6 unique lotto numbers
        for (int i = 0; i < 6; i++) {

            lotto[i] = (int) (Math.random() * 58) + 1;

            // Inner loop: Check if the generated number is a duplicate
            for (int j = 0; j < i; j++) {

                if (lotto[i] == lotto[j]) {
                    // If duplicate, generate a new number
                    lotto[i] = (int) (Math.random() * 58) + 1;

                    // Start checking again from the beginning
                    j = -1;
                }
            }
        }

        // Display the lotto numbers
        for (int i = 0; i < 6; i++) {
            System.out.println("Lotto Number Winner [" + (i + 1) + "]: " + lotto[i]);
        }
    }
}