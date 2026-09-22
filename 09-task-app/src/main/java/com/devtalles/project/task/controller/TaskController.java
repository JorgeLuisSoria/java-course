package com.devtalles.project.task.controller;

import com.devtalles.project.task.exceptions.TaskException;
import com.devtalles.project.task.exceptions.TaskValidationException;
import com.devtalles.project.task.model.Task;
import com.devtalles.project.task.model.TaskRepository;

import java.util.List;

public class TaskController {
    private final TaskRepository taskRepository;
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void addTask(String id, String title, String description, Boolean completed) throws TaskValidationException, TaskException {
        validateTaskData(id, title, description, completed);
        Task task = new Task(id, title, description, completed);
        taskRepository.save(task);
        System.out.println("Task added");
    }
    public void removeTask(String id) throws TaskValidationException, TaskException {
        if (id == null || id.trim().isEmpty()) {
            throw new TaskValidationException("Task id cannot be empty");
        }
        this.taskRepository.remove(id);
    }
    public void showTasks() throws TaskValidationException, TaskException {
        List<Task> tasks = this.taskRepository.findAll();
        if (tasks.isEmpty()) {
            throw new TaskValidationException("Task list is empty");
        }
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void updateTask(String id, String title, String description, Boolean completed) throws TaskValidationException, TaskException {
        validateTaskData(id, title, description, completed);
        Task taskToUpdate = new Task(id, title, description, completed);
        this.taskRepository.updateTask(taskToUpdate);
    }

    private void validateTaskData(String id, String title, String description, Boolean completed) throws TaskValidationException {
        if (id == null || id.trim().isEmpty()) {
            throw new TaskValidationException("Task id cannot be empty");
        }
        if (title == null || title.trim().isEmpty()) {
            throw new TaskValidationException("Task title cannot be empty");
        }
        if (description == null || description.trim().isEmpty()) {
            throw new TaskValidationException("Task description cannot be empty");
        }
        if (completed == null) {
            throw new TaskValidationException("Task completed cannot be null");
        }
    }

}
