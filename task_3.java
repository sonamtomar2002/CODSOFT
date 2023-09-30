package Codsoft;
import javax.swing.*;

public class task_3 {
	public static void main(String[] args) {
		int input;
		double amount_withdraw,amount_deposit;
		JOptionPane.showMessageDialog(null,"WELCOME TO ATM MACHINE");
	    String enter1 = JOptionPane.showInputDialog("Enter 1 to withdraw amount\n2 to deposit amount\n3 to check balance");
	    input = Integer.parseInt(enter1);
	    	if(input==1) {
		    	String enter2 = JOptionPane.showInputDialog("Enter the amount to withdraw");
		        amount_withdraw = Double.parseDouble(enter2);
		        JOptionPane.showMessageDialog(null , ""+atm.withdraw(amount_withdraw));
		    }else if (input==2) {
		        String enter3 = JOptionPane.showInputDialog("Enter the amount to deposit");
		        amount_deposit = Double.parseDouble(enter3);
		        JOptionPane.showMessageDialog(null ,""+atm.deposit(amount_deposit));
		        
		    }else if(input==3) {    	
		    	JOptionPane.showMessageDialog(null , "Balance is : "+atm.check_balance());
		    }		
}
static class atm{
	static double total=1000.0;
	static double balance = total;
	public static double check_balance() {
		return balance;
	}	
	public static String withdraw(double amt) {
		if(amt<balance) {
			balance = total-amt;
			return "Amount successfully deducted\nCurrent balance is "+ balance;
		}else {
			return "Less balance to deduct amount";
		}
	}	
	public static String deposit(double amt) {
		balance = balance + amt;
		return "Added succesfully\nCurrent balance is "+ balance;
	}
}	
}


	

