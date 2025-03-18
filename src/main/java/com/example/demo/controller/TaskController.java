package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String viewTasks(Model model){
        model.addAttribute("task", taskService.getAllTasks());
        return "index";
    }

    @GetMapping("/add")
    public String showAddForm(Model model){
        model.addAttribute("task", new Task());
        return "add-task";
    }

    @PostMapping("/save")
    public String saveTask(@ModelAttribute Task task){
        taskService.saveTask(task);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
        return "redirect:/";
    }
}
