public class CowsAndBulls {
    public static void main(String[] args) {
        System.out.println("--------------------------------Rules------------------------------------");
        System.out.println("Welcome to the Cows and Bulls Game!");
        System.out.println("1. The computer will choose a random 4-digit number with no repeating digits and no zeroes.");
        System.out.println("2. Your task is to guess the number.");
        System.out.println("3. After each guess, you will receive feedback in the form of 'cows' and 'bulls'.");
        System.out.println("4. A 'cow' means you have guessed a correct digit in the wrong position.");
        System.out.println("5. A 'bull' means you have guessed a correct digit in the correct position.");
        System.out.println("6. The game continues until you guess the number or decide to quit.");
        System.out.println("7. Good luck and have fun playing!");
        System.out.println("--------------------------------------------------------------------------\n\n");
        Randomguess obj = new Randomguess();
        int[] ans = obj.number();
        while (true) {
            int bulls = 0;
            int cows = 0;
            userguess obj1 = new userguess();
            int[] guess = obj1.guess();
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
            if (bulls==4){
                System.out.println("Your guess is correct!!!");
                break;
            }
            System.out.println("Cows = "+cows + "\nBulls ="+ bulls);

        }
    }

}
