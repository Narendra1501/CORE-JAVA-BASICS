package javabasicsday7;

public class student
{
	private int sid;
	private String sname;
	private final long aadhar;
	public student(int sid, String sname, long aadhar) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", aadhar=" + aadhar + "]";
	}
	
}

