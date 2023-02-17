package com.masai;

public class Student {

	private int StdentId;
	private String StuentName;
	private int marks;
	public Student(int stdentId, String stuentName, int marks) {
		super();
		StdentId = stdentId;
		StuentName = stuentName;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStdentId() {
		return StdentId;
	}
	public void setStdentId(int stdentId) {
		StdentId = stdentId;
	}
	public String getStuentName() {
		return StuentName;
	}
	public void setStuentName(String stuentName) {
		StuentName = stuentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [StdentId=" + StdentId + ", StuentName=" + StuentName + ", marks=" + marks + "]";
	}
	
}
