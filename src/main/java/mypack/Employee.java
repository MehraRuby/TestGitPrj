package mypack;

import java.util.ArrayList;
import java.util.List;

public class Employee 
{
	private int empid;
	private String empname;
	private int sal;
	
	public Employee(int id,String nm, int sa)	
	{
		empid = id;
		empname=nm;
		sal=sa;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public boolean equals(Object obj)
	{
		Employee e = (Employee)obj;
		
		boolean status=false;
		
		if(this.empid == e.empid && this.sal == e.sal && this.empname.equalsIgnoreCase(e.empname))
		{
			status = true;
		}
		
	return status;			
	}
	
	public int hashCode()
	{
		return this.empid;
	}
	
	public static List<Employee> records()
	{
		List<Employee> L = new ArrayList<Employee>();
		L.add(new Employee(1,"aa1",120));
		L.add(new Employee(2,"aa2",126));
		L.add(new Employee(3,"aa3",128));
		L.add(new Employee(4,"aa4",125));
		
		return L;
		
		
	}
	

}
