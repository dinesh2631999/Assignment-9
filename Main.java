package mini;

import java.util.Scanner;


public class Main {
	
	  int e_id;
	  String e_name;
	  
	  public  Main(String e_name,int e_id)
	  {
		  this.e_name=e_name;
		  this.e_id= e_id;
	  }
	  
	  
	  
	  public  String tostring()
	  {
		  return "Employee[ Emp_Name = " + e_name +": Emp_id = " + e_id +" ]";
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner scanner =new Scanner(System.in);
		do
		{
	   System.out.println("Enter the respective key to perform the following operation");
	   System.out.println("1 Add employee");
	   System.out.println("2 Display the Employee");
	   System.out.println("3 Delete the employee based on empid");
	   System.out.println("4 Delete the employee based on empname");
	   System.out.println("5 find the employee based on empId");
	   System.out.println("6 find the employee based on empname");
	   System.out.println("7 Calculate the total employee salary");
	   int option=scanner.nextInt();
	   int posi;
	  
	   
	   switch(option)
	   {
	   case 1 :     Adjust emp=new Adjust();
		   			System.out.println("Enter the Employee name ,id, desig  : ");
		      		String emp_n=scanner.next();
		      		int emp_i=scanner.nextInt();
		      		String emp_desig=scanner.next();
		      		emp.setEmp_id(emp_i);
		      		emp.setEmp_name(emp_n);
		      		emp.setDesig(emp_desig);
		      		Manage.Addemployee(emp);
		   			
	   break;
	   case 2 :    Manage.Display();
	   break;
	   
	   case 3 :    System.out.println("Enter the employee id you want to delete");
	    		   int Del_id=scanner.nextInt();
	    		   int pos=Manage.Find_id(Del_id);
	    		   if(pos>=0)
	    		   {
	    		   System.out.println("found the employee and the position = "+pos);
	    		   Manage.Delete_id(pos);
	    		   }else
	    		   {
	    			   System.out.println("Not Found ,Invalid id");
	    		   }
	    		   
	   break;
	    		   
	   case 4 :    System.out.println("Enter the employee name you want to delete");
	               String Del_name=scanner.next();
	               String value=Manage.Find_name(Del_name);
	               if(value=="true")
	               {
	               System.out.println(" ");
	    		   Manage.Delete_name(Del_name);
	               }else if(value=="false")
	               {
	            	   System.out.println("Not Found ,Invalid name");
	               }
	   break;
	   case 5 :    System.out.println("Enter the employee id you want to search");
		   		   int fd_id=scanner.nextInt();
		   		   int n=Manage.Find_id(fd_id);
		   		   if(n>=0)
		   		   {
		   			   System.out.println("Requsted id is  found");
		   		   }else
		   		   {
		   			 System.out.println("Requsted id is Not found");
		   		   }
	   break;
	   
	   case 6 :    System.out.println("Enter the employee name you want to search");
       			   String fd_name=scanner.next();
       			   String store=Manage.Find_name(fd_name);
       			   if(store=="false")
       			   {
       				System.out.println("Not Found ,Invalid name");
       			   }
	   break;
	   case 7 :    System.out.println("Total employee salary = "+Manage.TotalSalary());
	   break;
	   default :     System.out.println("Enter the valid option");
		   
	}
	   System.out.println("enter y to continue");
	   ch=scanner.next().charAt(0);
		}while(ch=='y');
		
	}
}
