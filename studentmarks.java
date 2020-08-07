package weeklytask;
//my first upload
import java.util.Scanner;

class student{
	String name;
	String id;
	int marks;

public student(){
	this(" "," ",0);
}
public student(String name1,String id1,int marks1) {
	name=name1;
	id=id1;
	marks=marks1;
	}
}


public class studentmarks {
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		System.out.println("enter no of students");
		int n=input.nextInt();
		System.out.println("enter name,id,marks");
		student stud=new student();
		student max=new student();
		student min=new student(" "," ",100);
		for(int i=0;i<n;i++)
		{
			stud.name=input.next();
			stud.id=input.next();
			stud.marks=input.nextInt();
			if(max.marks<stud.marks)
				//max.marks=0 in the biginning
			{
				max.name=stud.name;
				max.id=stud.id;
				max.marks=stud.marks;
			}
			if(min.marks>stud.marks)
				//min.marks=100 in the beginning
			{
				min.name=stud.name;
				min.id=stud.id;
				min.marks=stud.marks;
			}
		}
		System.out.println("the student with max score:"+max.name+" "+max.id+" "+max.marks);
		System.out.println("the student with min score:"+min.name+" "+min.id+" "+min.marks);
	}

}
