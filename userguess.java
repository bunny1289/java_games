import java.util.Scanner;

public class UserGuess {

    public int[] guess(Scanner sc){
        int[] num = new int[4];
        System.out.print("Enter your guess :");
        // Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        if(temp.length() > 4){
            System.out.println("*****Invalid Input!!!*****");
            return guess(sc);
        } else{
            int n = Integer.parseInt(temp);
            for(int i=0;i<4;i++){
                num[3-i] = n%10;
                n=n/10;
            }
            for(int i=0;i<4;i++){
                if(num[i] == 0){
                    System.out.println("---------------------------");
                    System.out.println("*****Invalid Input!!!*****");
                    System.out.println("---------------------------");
                    return guess(sc);
                }
                for(int j=i+1;j<4;j++){
                    if(num[i] == num[j]){
                        System.out.println("---------------------------");
                        System.out.println("*****Invalid Input!!!*****");
                        System.out.println("---------------------------");
                        return guess(sc);
                    }
                }
            }
        }
        return num;
    }
}