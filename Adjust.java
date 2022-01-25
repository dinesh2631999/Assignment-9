package mini;



public class Adjust {
	public int emp_id;
	public String emp_name;
	public String desig;
	public double salary=4000.50d;
	
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
}
	
	/*Scanner scanner =new Scanner(System.in);


	   System.out.println("enter the employ strength in integer");
	   int num=scanner.nextInt();
	   Adjust[] employees=new Adjust[num];


public  void Add_data()
{       
for(int i=0;i<employees.length;i++)
	{
	System.out.println("Enter the Employee name ,id  : ");
	String emp_n=scanner.next();
	int emp_i=scanner.nextInt();
	employees[i]=new Main(emp_n,emp_i);
	}
}*/
	
	


