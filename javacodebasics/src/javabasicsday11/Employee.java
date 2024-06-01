package javabasicsday11;

public class Employee {

	 private String deptName;
	 private double basesalaray;
	 
	 public Employee () {}

	 public Employee(String name, long contactNo, String string, String deptName,double basesalary)
	 {
		 super();
		 this.deptName = deptName;
		 this.basesalaray = basesalary;
		 
     }

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public double getBasesalaray() {
		return basesalaray;
	}

	public void setBasesalaray(double basesalaray) {
		this.basesalaray = basesalaray;
	}

	@Override
	public String toString() {
		return "Employee [deptName=" + deptName + ", basesalaray=" + basesalaray + "]";
	}
	 
	 
}
