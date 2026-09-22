package com.devtalles.project.task.view;

import com.devtalles.project.task.controller.TaskController;
import com.devtalles.project.task.exceptions.TaskException;
import com.devtalles.project.task.exceptions.TaskValidationException;
import com.devtalles.project.task.model.Task;

import java.util.Scanner;

public class TaskView {
    private final TaskController taskController;
    private final Scanner scanner;
    public TaskView(TaskController taskController) {
        this.taskController = taskController;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() throws TaskException {
        while (true) {
            System.out.println("\n Task Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Update Task");
            System.out.println("4. View Tasks");
            System.out.println("5. Update status of Task");
            System.out.println("6. View all Completed Tasks");
            System.out.println("7. View all Pending Tasks");
            System.out.println("8. Exit");
            System.out.println("Please choose an option");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addTaskView();
                    break;
                case "2":
                    removeTaskView();
                    break;
                case "3":
                    updateTaskView();
                    break;
                case "4":
                    showTaskView();
                    break;
                case "5":
                    updateTaskCompletedView();
                    break;
                case "6":
                    showCompletedTasksView();
                    break;
                case "7":
                    showPendingTasksView();
                    break;
                case "8":
                    System.out.println("Leaving the system");
                    return;
                default:
                    System.out.println("Invalid choice");
            }

        }
    }

    public void addTaskView() {
        try {
            Task task = getTaskInput();
            taskController.addTask(task.getId(), task.getTitle(), task.getDescription(), task.getCompleted());
            System.out.println("Task has been added successfully.");
        } catch (TaskValidationException | TaskException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void removeTaskView() {

        try {
            System.out.println("Enter task ID to delete: ");
            String id = scanner.nextLine();
            this.taskController.removeTask(id);
            System.out.println("Task has been removed successfully.");
        } catch (TaskValidationException | TaskException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public void showTaskView() {
        try {
            System.out.println("\nList of Tasks");
            this.taskController.showTasks();
        } catch (TaskValidationException | TaskException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void updateTaskView() {
        try {
            Task task = getTaskInput();
            taskController.updateTask(task.getId(), task.getTitle(), task.getDescription(), task.getCompleted());
            System.out.println("Task has been updated successfully.");
        } catch (TaskValidationException | TaskException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void updateTaskCompletedView() {
        try {
            System.out.println("Enter task ID: ");
            String id = scanner.nextLine();
            Boolean completed = null;
            while (completed == null) {
                System.out.println("¿is it completed? (true/false): ");
                String input = scanner.nextLine().trim().toLowerCase();
                if (input.equals("true")) {
                    completed = true;
                }  else if (input.equals("false")) {
                    completed = false;
                } else  {
                    System.out.println("Invalid input. Try again.");
                }
            }
            taskController.updateTaskCompleted(id, completed);
            System.out.println("Task has been updated successfully.");
        } catch (TaskValidationException | TaskException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void showCompletedTasksView() throws TaskException {
        try {
            System.out.println("Completed Tasks");
            taskController.showsCompletedTasks();
        } catch (TaskException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void showPendingTasksView() throws TaskException {
        try {
            System.out.println("Pending Tasks");
            taskController.showsPendingTasks();
        } catch (TaskException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private Task getTaskInput() throws TaskValidationException {
        String id = readRequired("Enter task ID: ");
        String title = readRequired("Enter task title: ");
        String description = readRequired("Enter task description: ");
        boolean completed = readBoolean("Enter status of the task (true/false): ");
        return new Task(id, title, description, completed);
    }

    private String readRequired(String message) {
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("This field is required.");
        }
    }

    private boolean readBoolean(String message) {
        while(true) {
            System.out.println(message);
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("true")) {
                return true;
            }
            if (input.equalsIgnoreCase("false")) {
                return false;
            }
            System.out.println("Please enter true or false.");
        }
    }
}
