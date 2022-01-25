package mini;

public class Manage {
	static Adjust[] employeelist=new Adjust[50];
	static int count=0;
	static  double total=0;
	static String string;
	
	public static void Addemployee(Adjust adj)
	{
		employeelist[count]= adj;
		
		count++;
	}
	public static void Display()
	{
		for(int i=0;i<count;i++)
		{
		   System.out.println(employeelist[i].emp_id+ "  " +employeelist[i].emp_name);	
		}
	}
	public static int Find_id(int F_id)
	{
		for(int i=0;i<count;i++)
		{
			if(employeelist[i].emp_id==F_id)
			{
				return i;
			}
		}
		return -1;
	}
	public static String Find_name(String F_name)
	{
		for(int i=0;i<count;i++)
		{
			if(employeelist[i].emp_name.compareTo(F_name)==0)
			{
				System.out.println("The Requested name is Found");
				return "true" ;
			}
		}
		return "false";	
	 
	}
	
	public static void Delete_name(String D_name)
	{
		
		//StringBuffer[] sb=new StringBuffer[count];
	
	/*	for(int i=0;i<count;i++)
		{
		  string=employeelist[i].emp_name;
		  sb[i].append(string);
		}*/
		System.out.println("Remaining employees");
		for(int i=0;i<count;i++)
		{
			if(employeelist[i].emp_name.compareTo(D_name)==0)
			{
				//sb[i].delete(0,employeelist[i].emp_name.length());
				System.out.println("Emp name is deleted ");
			
			}else {
				System.out.println("       "+employeelist[i].emp_name);
			}
		}
		
	}
	
	public static void Delete_id(int position)
	{
		 System.out.println("Remaining  :-"); 
		for(int i=0;i<count;i++)
		{
			
			if(employeelist[i].emp_id==employeelist[position].emp_id)
			{
				System.out.println("Requested id is deleted || early position = " +i);
				continue;
			}else
			{
				
				System.out.println( "            "+ employeelist[i].emp_id);	
			}
	}
}
	
	public static void Find2_name(String F2_name)
	{
		
		for(int i=0;i<count;i++)
		{
			if(employeelist[i].emp_name.compareTo(F2_name)==0)
			{
				
			   System.out.println( F2_name +"is found");
			   break;
			}
		}
	 System.out.println( F2_name +" is not found" );
	}
	
	public static double TotalSalary()
	{
		for(int i=0;i<count;i++)
		{
			total+=employeelist[i].salary;
		}
		return total;
	}
	
}
