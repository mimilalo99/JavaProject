

package JavaLearningPackage;
 // import JavaLearningPackage.Constructor_class;

//-- Date : 17-01-2016 
//============================================//
// Importing below java library for GUI purpose 

// import java.awt.FlowLayout;  
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JOptionPane;

//============================================//
// import java.util.Scanner;
//import java.util.*;
//import java.lang.*;
public class DiscountRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TO ACCESS VARIABLE OF ANOTHER CLASS CALLED "CONSTRUCTOR_CLASS "  ===>> WE NEED TO CREATE OBJECT OF THAT CLASS 
		// THEN WE CAN ACCESS THE OBJECT OF THAT CLASS 
		
		//	 int j = 0 ;
		//	 Scanner obj_j = new Scanner(System.in);
		//	 j=obj_j.nextInt();
		 
		 Constructor_class discount_Rate = new Constructor_class();   // Creating object for class called " Constructor_Class "
        
		 // TO CALL A METHOD FROM ANOTHER CLASS 
		 // WE CAN ACCESS BY USING CREATED OBEJCT OF THAT CLASS 
		 // AFTER THAT "CLASS_NAME.METHOD_NAME(OBJECT_OF_CLASS.parameter_name)
		 
		
		 // Now we are using Method of that class 
		 // In order to access class method we need to create a object for that particular class 

		 
		double answer = Constructor_class.calculate_discount_rate(discount_Rate.i);  
		double interest_rate = Constructor_class.calculate_discount_rate(discount_Rate.i,discount_Rate.j,discount_Rate.k);
         
        JOptionPane.showMessageDialog(null,"The Discount rate is : "+answer, "Ujay u r awesome ",JOptionPane.PLAIN_MESSAGE); 
        JOptionPane.showMessageDialog(null,"this is interest rate calculated "+interest_rate);
        discount_Rate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        discount_Rate.setSize(275,180);
        discount_Rate.setVisible(true);
       //   System.out.println("THE VALUE OF DISCOUNT RATE IS :"+ answer*100 + "%");
        
	}
   
	
	
}
