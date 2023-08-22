package co.edu.uptc.model;

import java.util.LinkedList;

public class User {
	String name;
	LinkedList<Task> tasks;

	public User(String name) {
		this.name = name;
		tasks = new LinkedList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LinkedList<Task> getTasks() {
		return tasks;
	}

	public void setTasks(LinkedList<Task> tasks) {
		this.tasks = tasks;
	}
	
}
