package Codsoft;
import javax.swing.*;

public class task_1 {
    public static void main(String[] args) {
        int computerInput = (int)(Math.random()*100);
        int userInput = 0;
        int count=1;
        int attempts = 5;
        	do{
                String enter = JOptionPane.showInputDialog("Guess number between 1 and 100\nOnly "+attempts+" chances to play");
                userInput = Integer.parseInt(enter);
                JOptionPane.showMessageDialog(null, "Result is : "+ check(userInput, computerInput, count));
                count++;
                attempts--;
            }while(attempts>0);     	
        	JOptionPane.showMessageDialog(null,"GAME OVER\nrun out of chances\nPlay again\ncomputer number is :"+computerInput);
        }
        
public static String check(int userAnswer, int computerNumber, int count){
        if (userAnswer <=0 || userAnswer >100) {
            return "Out of bound guess";
        }
        else if (userAnswer == computerNumber ){
            return "Cogratulations on correct guess\nScore is : " + count;
        }
        else if (userAnswer > computerNumber) {
            return "Guess is too high, try again\nScore is : " + count;
        }
        else{
            return "Your guess is too low, try again\nScore is : " + count;
        }
    }
}
