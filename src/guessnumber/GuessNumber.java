package guessnumber;
import javax.swing.*;
public class GuessNumber {
    public static void main(String[] args) {

        int number = (int) (Math.random()*100+1);
        int userGuess = 0;
        System.out.println("Corect guess: "+number);
        int counter =1;

        while(userGuess != number)
        {
            String response = JOptionPane.showInputDialog("Choose a number from 1 to 100 :)", 11);
            userGuess = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null,""+determineGuess(userGuess,number,counter));
            counter ++;
        }
    }
    public static String determineGuess(int userGuess,int number, int counter)
    {
        if(userGuess<=0 || userGuess>=100)
        {return "Your number isn't valid ";}
        else if(userGuess == number)
        {return "Correct answer!\n Score: "+counter;}
        else if(userGuess>number)
        {return "Maybe a bit lower :)\n Try again: "+counter;}
        else if(userGuess<number)
        {return "Maybe a bit higher :)\n Try again: "+counter;}
        else {return "Your number isn't correct\n Try again: "+counter;}
    }
}