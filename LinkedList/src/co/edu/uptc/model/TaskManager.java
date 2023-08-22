package co.edu.uptc.model;

import java.util.Date;
import java.util.LinkedList;

public class TaskManager {
	LinkedList<User> users;

	public TaskManager() {
		users = new LinkedList<>();
	}

	public void addUser(User user) {
		users.add(user);
	}

	public void addTask(String description, Date dueDate, String assignedUser) {
		for (User user : users) {
			if (user.name.equals(assignedUser)) {
				user.tasks.add(new Task(description, dueDate, assignedUser));
				break;
			}
		}
	}

	public LinkedList<Task> getTasksForUser(String userName) {
		for (User user : users) {
			if (user.name.equals(userName)) {
				return user.tasks;
			}
		}
		return new LinkedList<>();
	}
}
