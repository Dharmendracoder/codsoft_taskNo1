import java.util.Scanner;

class Random{
    public int genrate(int max,int min){
        return (int) (Math.random()*(max - min + 1) + min);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int totalAttempts = 0;
        int win = 0;

        while (true) {
            int max = 100;
            int min = 0;
           int rdno =  rd.genrate(max, min);
            int attempts = 3;

            while (true) {
                System.out.println("Guess a number between "+max+" and "+min);
                int guessno = sc.nextInt();
                attempts--;
                 System.out.println("Attempt remaining:" +attempts);
            if(attempts==0){
                    System.out.println("No more attempt remaining");
                    System.out.println("The correct number is:"+rdno);
                    break;
                }
                else  if (guessno > rdno) {
                    System.out.println("Its Larger.Enter smaller number:");
                } 
                else if (guessno< rdno){
                    System.out.println("Its Smaller.Enter larger number:");
                }else{
                    System.out.println("Correct Guess");
                    win++;
                    break;
                }
            }
             double winrate = (double) win / totalAttempts*100;
            System.out.printf("Your winrate is %.2f%%\n",winrate);

            System.out.println("Do you want to play again (yes/no)");
            String playAgain = sc.next();
            if(!playAgain.equalsIgnoreCase("yes")){
                sc.close();
                System.exit(0);
            }
            sc.nextLine();
        }
    }
}
