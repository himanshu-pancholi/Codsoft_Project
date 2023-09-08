import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        int min = 1;
        int max = 100;
        int rand_num=(int)Math.floor(Math.random()*(max-min+1)+min);
        int user_guess=0;
        int attempt=0;
        int round=1;
        int actual_attempt=0;
        int c=1;

        while(attempt==0 && c==1) {
            while (rand_num != user_guess && attempt != 5) {
                System.out.println("Enter the number between 1 to 100: ");
                Scanner scanner = new Scanner(System.in);
                user_guess = scanner.nextInt();
                if (user_guess < 1 || user_guess > 100) {
                    System.out.println("Invalid Number");
                } else if (user_guess == rand_num) {
                    System.out.println("Guess is Correct");
                    attempt++;
                } else if (user_guess < rand_num) {
                    System.out.println("Guess is too Low");
                    attempt++;
                } else {
                    System.out.println("Guess is too High");
                    attempt++;
                }
            }if(attempt==5 && user_guess!=rand_num){
                System.out.println("If you want to Play Again Press 1 or Press 0");
                Scanner sc=new Scanner(System.in);
                c=sc.nextInt();
                actual_attempt+=attempt;
                attempt=0;
                round++;
            }
        }

        System.out.println("User's Score according to total round played: " +round+" rounds");
    }
}