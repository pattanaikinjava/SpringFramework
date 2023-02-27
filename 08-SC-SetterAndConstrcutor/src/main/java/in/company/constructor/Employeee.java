package in.company.constructor;

import in.company.setter.CompanyName;

public class Employeee
{
	private String empName;
	
	public Employeee(String empName, CompanyName compName) {
		super();
		this.empName = empName;
		this.compName = compName;
	}
	
	private CompanyName compName;
		
	public String getEmployeeNm() {
		return this.empName;
	}
	
	public CompanyName getCompNm() {
		return compName;
	}
}
