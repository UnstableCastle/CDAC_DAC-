package A5;

import java.util.Scanner;

public class Check_Vovels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            String currentLetter = String.valueOf(str.charAt(i)).toLowerCase();

            if (currentLetter.contains("a") ||
                currentLetter.contains("e") ||
                currentLetter.contains("i") ||
                currentLetter.contains("o") ||
                currentLetter.contains("u")) {

                count++;
            }
        }

        System.out.println("Number of vowels = " + count);

        sc.close();
    }
}
