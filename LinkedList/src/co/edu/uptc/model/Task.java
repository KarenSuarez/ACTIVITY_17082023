package co.edu.uptc.model;

import java.util.Date;

public class Task {

	String description;
	Date dueDate;
	String assignedUser;

	public Task(String description, Date dueDate, String assignedUser) {
		this.description = description;
		this.dueDate = dueDate;
		this.assignedUser = assignedUser;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getAssignedUser() {
		return assignedUser;
	}

	public void setAssignedUser(String assignedUser) {
		this.assignedUser = assignedUser;
	}

	
}
