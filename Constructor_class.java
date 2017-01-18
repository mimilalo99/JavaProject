

package JavaLearningPackage;

// import java.util.*;
import java.awt.FlowLayout;
import java.math.*;
  
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;
//import java.lang.*;


public class Constructor_class extends JFrame {
	
	      // creating object of this class 
	 	private JLabel n;  												 // where n is number of periods in months/year/days
	    static double d  ;  											 // where i -rate_of_interest and d = discount rate 
		double i, j ,k;
		 static double FV;
	    
	// if we don't create constructor in class -- then default constructor will be created 
	// creating constructor which has same name as class 
	// constructor doesn't have return type 
	// to initialize value of object ..
	   
	Constructor_class(){
		  
		  super("The title Bar");								// Inheriting parent class 
		  setLayout(new FlowLayout());						    // This is method of import java.awt.FlowLayout; 
		  n = new JLabel("This is number of months :");
		  n.setToolTipText("This is gonna show up on hover");
		  System.out.println("this is default constructor");
		  add(n);
		  
	    // add();
		// using java library called JOptionPane which is useful to prompt message box for user input 		  
		  
		  String  Promt_Message_box = JOptionPane.showInputDialog("enter value of Interest rate" );
		
		 i = Double.parseDouble(Promt_Message_box);
		  
			// same as above but it will be prompted in console instead of Separate message box ;		
			/*		  
		   Scanner ROI = new Scanner(System.in);
		   System.out.println("Interest rate input : "); 
		   i = ROI.nextDouble(); 
		   */
		 
		 String comment_box = JOptionPane.showInputDialog("Number of Months/Years ");
		 j = Double.parseDouble(comment_box);
		 
		 String pv  = JOptionPane.showInputDialog("Initial Ivestment ");
		 k = Double.parseDouble(pv);
	}
      
	
	 public static double calculate_discount_rate(double i)
	 {
		 
	     return d = i/(1+i); 
	     
	     
		 
	 }
	 
	 
// Method for calculating value of simeple interest rate 
	 public static double calculate_discount_rate(double i,double j,double k)    /// Initializing Parameter for this method 
	 {
		
	     return FV = k  * Math.pow((1+i), j);                              
	     
	     
		 
	 }
}
