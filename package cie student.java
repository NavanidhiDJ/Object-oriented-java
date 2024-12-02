package CIE;

import java.util.*;

public class Student{
    protected String name=new String();
    protected String usn=new String();
    protected int sem;

    public void inputstuddetail(){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your name:");
        name=sc.nextLine();
        System.out.println("enter your usn:");
        usn=sc.nextLine();
	System.out.println("enter your sem:");
        sem=sc.nextInt();
    }
    public void displaystuddetails(){
	System.out.println("......Student..details......");
	System.out.println("name:"+name);
	System.out.println("usn:"+usn);
	System.out.println("sem:"+sem);
    }
}
