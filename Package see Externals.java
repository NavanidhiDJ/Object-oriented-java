package SEE;

import CIE.Student;
import CIE.Internals;
import java.util.*;

public class Externals extends Internals{
    protected int smarks[] = new int[5];
    protected int finalmarks[] = new int[5];
  
    public Externals(){
	super();
    }
    public void inputseemarks(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter thjne marks obtqained in see:");
	for (int i=0;i<5;i++){
	    smarks[i]=sc.nextInt();
	}
    }
    public void calculatefinal(){
	System.out.println("calculationg final marks....");
	for (int i=0;i<5;i++){ 
	    finalmarks[i]=smarks[i] + marks[i];
	}
    }
    public void displayfinal(){
	displaystuddetails();
	displaycie();
	System.out.println("Final marks:");
	for (int i=0;i<5;i++){
	    System.out.println("Final marks of "+(i+1)+"subject is "+finalmarks[i]);
	}
    }
}
