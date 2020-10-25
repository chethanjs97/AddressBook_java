package com.addressbook;


import java.util.Scanner;
import java.util.regex.*;
//import java.util.Scanner;
import java.io.*;

//import java.io.FileWriter;
//import java.io.BufferedWriter;
//import java.io.File;
import java.io.IOException;
public class AddressBook {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		System.out.println("*****WELCOME TO ADDRESS BOOK***");
		while (true)
		{
			String firstname=null,lastname=null,mobnumber="null",address="null",state="null" ,pincode="null";
			int choice;
			String firstname1="^[?=[A-Z]]{1}[A-Za-z]{3,}";
			String lastname1="^[A-Za-z]{3,}";
			String mobnumber1="^[0-9]{10}";
			String pincode1="^[0-9]{6}";
			String address1="^[A-Za-z]{3,}";
			Scanner sc= new Scanner(System.in);
			
			System.out.println("\n enter the choice 1.add\n 2.search\n 3.delete\n 4.edit\n 5.exit\n");
			choice=sc.nextInt();
			if(choice==1) {
		
				
			System.out.println("\n first name should have atleast capital letter and atleast 3 character\n");
			firstname=sc.next();
			Pattern pat1=Pattern.compile(firstname1);
			Matcher match1=pat1.matcher(firstname);
			if(match1.matches())
				System.out.printf("\nvalidated\n" +firstname);
			else
				System.out.printf("\nnot validated\n" +firstname);
			System.out.println("\nLast name should have atleast 3 charcter\n");
			lastname=sc.next();
			Pattern pat2=Pattern.compile(lastname1);
			Matcher match2=pat2.matcher(lastname);
			if(match2.matches())
				System.out.printf("\nvalidated\n" +lastname);
			else
				System.out.printf("\nnot validated\n" +lastname);
			System.out.println("\nnenter the address \n");
			address=sc.next();
			Pattern patt3=Pattern.compile(address1);
			Matcher matchh3=patt3.matcher(address);
			if(matchh3.matches())
				System.out.printf("\nvalidated\n" +address);
			else
				System.out.printf("\nnot validated\n" +address);
			
			
			System.out.println("\nEnter your pincode \n");
			Pattern pat3=Pattern.compile(pincode1);
			Matcher match3=pat3.matcher(pincode);
			if(match3.matches())
				System.out.printf("\nvalidated\n" +pincode);
			else
				System.out.printf("\nnot validated\n" +pincode);
			System.out.println("\nEnter your mobilenumber \n");
			mobnumber=sc.next();
			Pattern pat4=Pattern.compile(mobnumber1);
			Matcher match4=pat4.matcher(mobnumber);
			if(match4.matches())
				System.out.printf("\nvalidated\n" +mobnumber);
			else
				System.out.printf("\nnot validated\n" +mobnumber);
			
			
				
			
		
	
	File f1=new File("C:\\Users\\chethan j s\\eclipse-workspace\\AddressBook\\src\\com\\addressbook"+firstname+".txt");
	f1.createNewFile();
	FileWriter fw=new FileWriter(f1,true);
	BufferedWriter bw=new BufferedWriter(fw);
	
	bw.write("\nfirst name is\n " +firstname+ "\nlastname is\n " +lastname+ "\naddress is\n "+address+"\npincode is \n"+pincode+"\nmobilr no is \n"+mobnumber);
	bw.close();
	}
			if(choice==2) 
			{System.out.println("enter the name you want to search. note:please provide the first the name");
			String search=sc.next();
			File f2=new File("C:\\Users\\chethan j s\\eclipse-workspace\\AddressBook\\src\\com\\addressbook"+search+".txt");
			boolean bool=f2.exists();
			if (bool == true) {
				FileReader fr=new FileReader(f2);
				BufferedReader br =new BufferedReader(fr);
				String s1;
				while((s1=br.readLine())!=null) {
					System.out.println(s1);
				}
				br.close();
			}
			
			else System.out.println("name you want to search do not exists");
				
			}
			if (choice==3) {
				System.out.println("enter the name you want to delet. note:it should be the first name");
				String del=sc.next();
				File f4=new File("C:\\Users\\chethan j s\\eclipse-workspace\\AddressBook\\src\\com\\addressbook"+del+".txt");
				boolean delete=f4.exists();
				if(delete==true) {
					f4.delete();
					System.out.println("the file is deleted sucessfully");
				}
				else System.out.println("name of the file with "+del+"is not found please provide perfect name");
			}
			
	

			if (choice == 4) {
				System.out.println("enter the name you want to edit");
				String edit=sc.next();
				File f3=new File("C:\\Users\\chethan j s\\eclipse-workspace\\AddressBook\\src\\com\\addressbook"+edit+".txt");
				boolean e=f3.exists();
				if (e==true) {

					
						System.out.println("enter the first name");
						firstname=sc.next();
						Pattern e1=Pattern.compile(firstname1);
						Matcher ma1=e1.matcher(firstname);
						if(ma1.matches()) {
							System.out.println("valid is "+firstname);
						     }
						else
							System.out.println("invalid is "+firstname);
						
					
						System.out.println("enter the last name");
						lastname=sc.next();
						Pattern e2=Pattern.compile(lastname1);
						Matcher ma2=e2.matcher(lastname);
						if(ma2.matches()) {
							System.out.println("valid is "+lastname);
						     }
						else
							System.out.println("invalid is "+lastname);
						
					
						System.out.println("enter the address name");
						address=sc.next();
						Pattern e22=Pattern.compile(address1);
						Matcher ma22=e22.matcher(address);
						if(ma22.matches())
							System.out.println("valis is "+address);
						     
						else
							System.out.println("invalid is "+address);
						
					
					 
						System.out.println("enter the  mobile");
						mobnumber=sc.next();
						Pattern e5=Pattern.compile(mobnumber1);
						Matcher ma5=e5.matcher(mobnumber);
						if (ma5.matches()) {
							System.out.println("valid"+mobnumber);
							}
						else
							System.out.println("invalid"+mobnumber);
					
					
					 
						System.out.println("enter the  pincode");
						pincode=sc.next();
						Pattern e7=Pattern.compile(pincode1);
						Matcher ma7=e7.matcher(pincode);
						if (ma7.matches()) {
							System.out.println("valid"+pincode);
							}
						else
							System.out.println("invalid"+pincode);
					
					FileWriter fw1=new FileWriter("C:\\Users\\chethan j s\\eclipse-workspace\\AddressBook\\src\\com\\addressbook"+firstname+".txt");
					BufferedWriter bw=new BufferedWriter(fw1);
					bw.write("first name is"+firstname+"\nlastname is "+lastname+"\naddress is"+address+"\nstate is "+state+"\npincode is"+pincode+"\nmobilr no is"+mobnumber);
					bw.close();	
				}
				else 
					System.out.println("name you want to edit is not available;please provide the first name of the user");
				
			}
			if (choice==5)
			{
				break;
			}
			}
	}
}