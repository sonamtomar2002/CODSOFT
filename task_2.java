package Codsoft;
import javax.swing.*;

public class task_2 {
   public static void main(String[] args) {
	   
	double java,dbms,maths,iot,inp;
	String enter1 = JOptionPane.showInputDialog("Enter the marks of Java");
    java = Double.parseDouble(enter1);
    
    String enter2 = JOptionPane.showInputDialog("Enter the marks of DBMS");
    dbms = Double.parseDouble(enter2);
    
    String enter3 = JOptionPane.showInputDialog("Enter the marks of Maths");
    maths = Double.parseDouble(enter3);
    
    String enter4 = JOptionPane.showInputDialog("Enter the marks of IOT");
    iot = Double.parseDouble(enter4);
   
    String enter5 = JOptionPane.showInputDialog("Enter 1 for total\n2 for percentage\n3 for grade");
    inp = Double.parseDouble(enter5);
    if(inp==1) {
    	JOptionPane.showMessageDialog(null, "Total is : "+ total_meth(java,dbms,maths,iot));
    }else if(inp==2) {
    	JOptionPane.showMessageDialog(null,"Percentage is : "+perc_meth(java,dbms,maths,iot));
    }else if(inp==3){
    	JOptionPane.showMessageDialog(null,"Grade is : "+grade_meth(java,dbms,maths,iot));
    }else {
    	JOptionPane.showMessageDialog(null,"invalid input");
    }
}
   
public static double total_meth(double sub1,double sub2,double sub3,double sub4) {
	double total;
	total = sub1+sub2+sub3+sub4;
	return total;
}
public static double perc_meth(double sub1,double sub2,double sub3,double sub4) {
	double percentage;
	percentage = ((sub1+sub2+sub3+sub4)/400.0)*100.0;
	return percentage;
}
public static char grade_meth(double sub1,double sub2,double sub3,double sub4) {
	char grade;
	if((((sub1+sub2+sub3+sub4)/400.0)*100.0)>=90) {
		grade = 'A';
	}else if(90>((((sub1+sub2+sub3+sub4)/400.0)*100.0))&&((((sub1+sub2+sub3+sub4)/400.0)*100.0))>=70) {
		grade = 'B';
	}
	else if(70> ((((sub1+sub2+sub3+sub4)/400.0)*100.0))&& ((((sub1+sub2+sub3+sub4)/400.0)*100.0))>=55){
		grade = 'C';
	}else {
		grade = 'D';
	}
	return grade;
}
}

