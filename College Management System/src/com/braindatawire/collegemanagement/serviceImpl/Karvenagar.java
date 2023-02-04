package com.braindatawire.collegemanagement.serviceImpl;
import java.util.*;


import com.braindatawire.collegemanagement.model.Batch;
import com.braindatawire.collegemanagement.model.Course;
import com.braindatawire.collegemanagement.model.Faculty;
import com.braindatawire.collegemanagement.model.Student;
import com.braindatawire.collegemanagement.service.Cjc;


public class Karvenagar implements Cjc
{	
	//private static final String Iterator = null;
	List<Course> clist=new ArrayList<>();
	List<Faculty> flist=new ArrayList<>();
	List<Batch> blist=new ArrayList<>();
	List<Student> slist=new ArrayList<>();
													//implements all methods here
	Scanner sc = new Scanner(System.in);
	public void addCourse()
	{												//set course data using scanner here and add into list here
													//NOTE: Don't use loop here to add data at a time only one data wants to add
		Course c=new Course();
		
		System.out.println("Course Id");
		int cid=sc.nextInt();
		c.setCid(cid);
				
		System.out.println("Course name");
		String cname=sc.next();
		c.setCname(cname);
			
		clist.add(c);
		
		System.out.println("========================");
		System.out.println("Course Added Sucessfully");
		System.out.println("========================");
	}
	public void viewCourse()
	{
													//get course data using iterator here
		Iterator<Course> itr=clist.iterator();
		while(itr.hasNext())//--> true
		{
		Course c=itr.next();
		
		System.out.println(c.getCid());
		System.out.println(c.getCname());
		}
	}
	public void addFaculty()
	{												//set faculty data using scanner here and add into list here
													//NOTE: Don't use loop here to add data at a time only one data   	wants to add
		// sc = new Scanner(System.in);
		Faculty f=new Faculty();
		
		System.out.println("Add faculty details here");
		System.out.println("------------------------");
		
		System.out.println("Faculty Id");
		int fid=sc.nextInt();
		f.setFid(fid);
		
		System.out.println("Faculty name");
		String fname=sc.next();
		f.setFname(fname);
		
		Iterator<Course> c2=clist.iterator();
		while(c2.hasNext())
		{
			Course z=c2.next();
			f.setCourse(z);
		}
			flist.add(f);
	}
	public void viewFaculty()
	{
		int count = 0;									//get faculty data using iterator here
		if (count!=0)
		{
			int fcount = 0;
			if (fcount!=0)
			{
				
		System.out.println("Folowing are the faculty Details");
		System.out.println("--------------------------------");
		Iterator<Faculty> f1=flist.iterator();
		while(f1.hasNext())//--> true
		{
		Faculty z=f1.next();
		
		System.out.println("Faculty Id:" +z.getFid());
		System.out.println("Faculty Name :" +z.getFname());
		System.out.println("Faculty Course Id:" +z.getCourse().getCid());
		System.out.println("Faculty Course Name:" +z.getCourse().getCname());
		}
	}
			else
			{
				System.out.println("Add Course First..");
			}
		}
		else 
		{
			System.out.println("Add Faculty");
		}
	}
		
	public void addBatch()
	{
												//set batch data using scanner here and add into list here
												//NOTE: Don't use loop here to add data at a time only one data   		wants to add
		Batch b=new Batch();
		
		System.out.println("Add Batch Details Here ");
		System.out.println("-----------------------");
		
		System.out.println("Batch Id");
		int bid=sc.nextInt();
		b.setBid(bid);
						
		System.out.println("Batch name");
		String bname=sc.next();
		b.setBname(bname);
		
		Iterator<Faculty> f1=flist.iterator();
		while(f1.hasNext())
		{
			Faculty x=f1.next();
			b.setFaculty(x);
		}
			blist.add(b);
	}
	public void viewBatch()
	{ 																	//get batch data using iterartor here
		int count = 0;									//get faculty data using iterator here
		if (count!=0)
		{
			int bcount = 0;
			if (bcount!=0)
			{
				int bcount1 = 0;
				if (bcount1!=0)
				{
		System.out.println("Follwing are the Batch Details");
		System.out.println("------------------------------");
		Iterator<Batch> b1=blist.iterator();
		while(b1.hasNext())//--> true
		{
		Batch x=b1.next();
		
		System.out.println("Batch Id:" +x.getBid());
		System.out.println("Batch Name :"+x.getBname());
		System.out.println("Batch Faculty Id:"+x.getFaculty().getFid()); 
		System.out.println("Batch Faculty Name:"+x.getFaculty().getFname());
		System.out.println("Batch Course Id:"+x.getFaculty().getCourse().getCid());
		System.out.println("Batch Course name:"+x.getFaculty().getCourse().getCname());
		}
	}
			else
			{
				System.out.println("Add Faculty First..");
			}
		}
		else 
		{
			System.out.println("Add Batch");
		}
		
		{
			System.out.println("Add Batch");
		}
	}
}
	public void addStudent()
	{
													//set student data using scanner here and add into list here
													//NOTE: Don't use loop here to add data at a time only one data wants to add
		System.out.println("Add Student details here");
		System.out.println("------------------------");
		
		Student s=new Student();
		
		System.out.println("Enter Student Id");
		int sid=sc.nextInt();
		s.setSid(sid);
		
		System.out.println("Enter Student name");
		String sname=sc.next();
		s.setSname(sname);
		
		Iterator<Batch>b2=blist.iterator();
		while(b2.hasNext())
		{
			Batch y=b2.next();
			s.setBatch(y);
		}
			slist.add(s);
	}
	public void viewStudent()
	{																			//get student data using iterator here
		System.out.println("Following are the Student Details");
		System.out.println("---------------------------------");
		Iterator<Student> s1=slist.iterator();
		while(s1.hasNext())//--> true
		{
			Student y=s1.next();
		
		System.out.println("Student Id:" +y.getSid());
		System.out.println("Student Name :"+y.getSname());
		System.out.println("Student Batch  Id:"+y.getBatch().getBid()); 
		System.out.println("Student Name:"+y.getBatch().getBname());
		System.out.println("Student Course id : "+y.getBatch().getFaculty().getCourse().getCid());
		System.out.println("Stduent course name :"+y.getBatch().getFaculty().getCourse().getCname());
		System.out.println("Student Faculty Id:"+y.getBatch().getFaculty().getFid());
		System.out.println("Student Faculty Name:"+y.getBatch().getFaculty().getFname());
		}
		
														
	}

	

}
