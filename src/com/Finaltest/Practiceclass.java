package com.Finaltest;


public class Practiceclass {
		
	private int roll_no;
	private String name;
	private int age;
	
	
	
	public static void main(String[] args) {
		Practiceclass data = new Practiceclass();
		data.setAge(26);
		data.setName("Jitendra");
		data.setrollno(36);
		data.setAge(36);
		
		System.out.println("Roll_No is"+ data.getrollno());
	}
	
	public int getrollno() {
		return roll_no;
	}
		
	public void setrollno(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}
	
	
	

