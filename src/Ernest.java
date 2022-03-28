
import javax.swing.*;
public class Ernest {

    public static class Guessinggame{


        public static void main(String[] args) {
            int computerNumber = (int) (Math.random() * 100 + 1);
            int userAnswer = 0;
            System.out.println("The correct guess would be " + computerNumber);
            int count = 1;

            while (userAnswer != computerNumber) {
                                String response = JOptionPane.showInputDialog(null,
                                        "Enter a guess between 1 and 100", "Guessing Game", 3);
                                userAnswer = Integer.parseInt(response);

                JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, computerNumber, count));


                                count++;

            }



        }
   public static String determineGuess(int userAnswer,int computerNumber, int count) {
     if (userAnswer <=0 || userAnswer >100){

         return "your guess is invalid";
     }
     else if (userAnswer == computerNumber )
       {
           return "correct!\nTotal Guesses:" + count;
       }
       else if (userAnswer > computerNumber){

         return "your guess is too high try again.\nTry Number:" + count;
       }
       else if (userAnswer < computerNumber){

       return"your guess is too low, try again.\nTry Number:"
               + count;

       }
       else {
           return "Your Guess is incorrect\nTry Number: " + count;
       }

   }




    }
}

