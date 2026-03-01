import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         int t = 0;
         int e = 0;
         char c;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to Number Guessing Game!" + "\n"
                + "I'm thinking of a number between 1 and 100.\n" +
                "You have to guess the correct number.\n");

        Scanner s = new Scanner(System.in);

        do{
        System.out.println("Please select the mode:\n" +
                "1. Easy (10 chances)\n" +
                "2. Medium (5 chances)\n" +
                "3. Hard (3 chances)\n");

        ;

        System.out.print("Please enter your choice: ");
        int choice = s.nextInt();

        int number = (int)(Math.random() * 100) + 1;

            if(choice == 1){
            System.out.println("Great! You have selected Easy mode.\n"
                    + "Let's start the game!\n");
             for(int i = 1; i <= 10; i++){
                 System.out.print("Enter your guess: ");
                 int guess = s.nextInt();
                 if(guess < number ){
                     System.out.println("Incorrect! The number is greater than " + guess + "\n");
                 }else if(guess > number){
                     System.out.println("Incorrect! The number is less than " + guess + "\n");
                 }else if(guess == number){
                     System.out.println("Congratulation!.You guessed the correct number in " + i + " attempts.\n");
                      t++;

                 }
             }
        }else if(choice == 2){
            System.out.println("Great! You have selected Medium mode.\n"
            + "Let's start the game!\n");

            for(int i = 1; i <= 5; i++){
                System.out.print("Enter your guess: ");
                int guess = s.nextInt();
                if(guess < number ){
                    System.out.println("Incorrect! The number is greater than " + guess + "\n");
                }else if(guess > number){
                    System.out.println("Incorrect! The number is less than " + guess + "\n");
                }else if(guess == number){
                    System.out.println("Congratulation!.You guessed the correct number in " + i + " attempts.\n");
                    t++;

                }
            }
        }else{
            System.out.println("Great! You have selected Hard mode.\n"
            + "Let's start the game!\n");

            for(int i = 1; i <= 3; i++){
                System.out.print("Enter your guess: ");
                int guess = s.nextInt();
                if(guess < number ){
                    System.out.println("Incorrect! The number is greater than " + guess + "\n");
                }else if(guess > number){
                    System.out.println("Incorrect! The number is less than " + guess + "\n");
                }else if(guess == number){
                    System.out.println("Congratulation!.You guessed the correct number in " + i + " attempts.\n");
                    t++;

                }
            }
        }
        System.out.print("Try Another Round Again?(y/n): " );
         c = s.next().charAt(0);

    } while (c == 'y' || c == 'Y');

        System.out.println("\n" + "You got " +t+ " times correct in guessing game."  );






        s.close();

    }
}