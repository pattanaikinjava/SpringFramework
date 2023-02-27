package in.example.constructor;

public class EmployeeName
{
	private String employeeName;

	public EmployeeName(String employeeName) {
		super();
		this.employeeName = employeeName;
	}
	
	public void getEmpNm() {
		System.out.println(this.employeeName);
	}

}
