import java.util.HashSet;
import java.util.Scanner;

class user{

    public void inp(String len){


        if(len.length()!=4) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("enter num with len of 4");
            len = myObj.nextLine();
        }


            HashSet<Character> set = new HashSet<>();

            for (char digit : len.toCharArray()){
                if(!set.add(digit)){
                    Scanner myObj = new Scanner(System.in);
                    System.out.println("enter unique");
                    len = myObj.nextLine();
                }




            }
        System.out.println(len);



    }
}

public class userguess {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter num");
        String z = user.nextLine();

        user u = new user();
        u.inp(z);

    }
}
