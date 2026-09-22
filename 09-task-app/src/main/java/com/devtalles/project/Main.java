package com.devtalles.project;

import com.devtalles.project.task.controller.TaskController;
import com.devtalles.project.task.model.TaskRepository;
import com.devtalles.project.task.view.TaskView;

public class Main {
    public static void main(String[] args) {
        TaskRepository taskRepository = new TaskRepository();
        TaskController taskController = new TaskController(taskRepository);
        TaskView view = new TaskView(taskController);
        view.showMenu();
    }
}