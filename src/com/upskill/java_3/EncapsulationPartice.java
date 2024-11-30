package com.upskill.java_3;

public class EncapsulationPartice {

	private String student;
	private int studentId ;
	
	
	public void setStudent(String student) {
		this.student = student;
	}
	
	public String getStudent() {
		return student;
	}
	
	public void setstudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public int getstudentId() {
		return studentId;
	}
	
	
	
	public static void main(String[] args) {

		EncapsulationPartice EP = new EncapsulationPartice();
		EP.setStudent("raton");
		System.out.println(EP.getStudent()) ;
		EP.setstudentId(101);
		System.out.println(EP.getstudentId());

	}

}
