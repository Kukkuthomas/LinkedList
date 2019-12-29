package linkedlist;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListBooking 
{
	String name;
	String address;
	String contactNo;
	String mailId;
	String proofType;
	String proofId;
	static LinkedList<LinkedListBooking> list1=new LinkedList<LinkedListBooking>();//create object for linked list
	//constructor
	public LinkedListBooking(String name,String address,String contactNo,String mailId,String proofType,String proofId)
	{
		this.name=name;
		this.address=address;
		this.contactNo=contactNo;
		this.mailId=mailId;
		this.proofType=proofType;
		this.proofId=proofId;
	}
	public static void main(String[] args)
	{		
		String str;
		//Enter customer details
		do
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your Name");
			String name=s.next();
			System.out.println("Enter your Address");
			String address=s.next();
			System.out.println("Enter your ContactNumber");
			String contactNo=s.next();
			System.out.println("Enter your E-Mail Id");
			String mailId=s.next();
			System.out.println("Enter your ProofType");
			String proofType=s.next();
			System.out.println("Enter your ProofId");
			String proofId=s.next();
			LinkedListBooking obj=new LinkedListBooking(name,address,contactNo,mailId,proofType,proofId);
			list1.add(obj);
			System.out.println("Do you want to continue (Y/N)");
			str=s.next();
		}
		while(str.equals("Y"));
		//customer details keep in linked list
		for(int i=0;i<list1.size();i++)
		{
			System.out.println("Customer Id\tCustomer Name\tAddress\t\tContactNo\tMailId\tProofType\tProofId");
			System.out.println("===============================================================================================\n");
			System.out.print(i+"\t\t");
		    System.out.print(list1.get(i).name+"\t\t");
		    System.out.print(list1.get(i).address+"\t");
		    System.out.print(list1.get(i).contactNo+"\t");
		    System.out.print(list1.get(i).mailId+"\t");
		    System.out.print(list1.get(i).proofType+"\t");
		    System.out.print(list1.get(i).proofId+"\t");
		}
	}
}
