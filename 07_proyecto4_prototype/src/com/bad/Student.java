package com.bad;

public class Student {
	private String name; 
	private String course; 
	private String schedule;
	public Student(String name, String course, String schedule) {
		super();
		this.name = name;
		this.course = course;
		this.schedule = schedule;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	} 
	
	public void showInfo() { 
		System.out.println("Estudiante: " + name); 
		System.out.println("Curso: " + course); 
		System.out.println("Horario: " + schedule); 
	}
}
