import java.util.Scanner;

public class userguess {

    public int[] guess() {
        int[] list = new int[4];
        try (Scanner obj = new Scanner(System.in)) {
            while (true) {
                boolean test = true;
                System.out.print("Enter your guess : ");
                int x = obj.nextInt();
                obj.nextLine();String temp = x + "";
                if (temp.length() > 4) {
                    test = true;
                } else {
                    for (int i = 0; i < 4; i++) {
                        int y = x % 10;
                        x = x / 10;
                        list[3 - i] = y;
                    }

                    for (int i = 0; i < 4; i++) {
                        if (list[i] == 0) {
                            test = true;
                            break;
                        }
                        for (int j = i + 1; j < 4; j++) {
                            if (list[i] == list[j]) {
                                test = true;
                                break;
                            } else {
                                test = false;
                            }
                        }
                        if (test)
                            break;
                    }
                }
                if (!test)
                    break;
                else
                    System.out.println("Your guess is invalid!!!");
            }
        }
        int r = list[0];
        for (int i = 1; i < 4; i++) {
            r = r * 10 + list[i];
        }
        return list;
    }

    // public static void main(String[] args) {
    // userguess obj = new userguess();
    // int [] res = obj.guess();
    // int x = res[0];
    // for (int i = 1; i < 4; i++) {
    // x = x*10 + res[i];
    // }
    // System.out.println(x);
    // }
}