package CIE;

import java.util.*;

public class Internals extends Student{
    protected int marks[]=new int[5];
    Scanner sc=new Scanner(System.in);
    public void inputinternalmarks(){
	System.out.println("enter the internal marks of 5 subjects :");
	for (int i=0;i<5;i++){
	    marks[i]=sc.nextInt();
	}
    }
    public void displaycie(){
	System.out.println("the cie marks of the student is :....");
	for (int i=0;i<5;i++){
	    System.out.println("marks of subject "+(i+1)+"="+marks[i]);
	}
    }
}
