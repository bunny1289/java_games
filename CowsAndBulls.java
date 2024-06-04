import java.util.Scanner;

public class CowsAndBulls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------Rules------------------------------------");
        System.out.println("Welcome to the Cows and Bulls Game!");
        System.out.println("1. The computer will choose a random 4-digit number with no repeating digits and no zeroes.");
        System.out.println("2. Your task is to guess the number.");
        System.out.println("3. After each guess, you will receive feedback in the form of 'cows' and 'bulls'.");
        System.out.println("4. A 'cow' means you have guessed a correct digit in the wrong position.");
        System.out.println("5. A 'bull' means you have guessed a correct digit in the correct position.");
        System.out.println("6. The game continues until you guess the number or decide to quit.");
        System.out.println("7. Good luck and have fun playing!");
        System.out.println("--------------------------------------------------------------------------\n");
        Randomguess obj = new Randomguess();
        int[] ans = obj.number();
        int c=0;
        while (true) {
            int bulls = 0;
            int cows = 0;
            UserGuess obj1 = new UserGuess();
            int[] guess = obj1.guess(sc);
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (guess[i] == ans[j]) {
                        if (i == j) {
                            bulls++;
                        } else {
                            cows++;
                        }
                    }
                }

            }
            c++;
            if (bulls==4){
                System.out.println("----------------------------------------");
                System.out.println("Your guessed the number in "+c+" chances!!!");
                System.out.println("----------------------------------------");
                break;
            }
            System.out.println("---------");
            System.out.println("Cows = "+cows + "\nBulls ="+ bulls);
            System.out.println("---------");


        }
        sc.close();
    }

}
