package com.firstspringbootapp.example.firstspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;
import com.firstspringbootapp.example.firstspringapp.service.TodoService;
import com.firstspringbootapp.example.firstspringapp.entity.todo;

@Controller
@SessionAttributes("name")
public class TodoController {

    private TodoService todoService;
    
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("list-todos")
    public String listTodos(ModelMap model) {
        List<todo> lstTodos=todoService.findByUserName("user1");
        model.addAttribute("todos", lstTodos);
        return "listtodos";
    }
    
}
