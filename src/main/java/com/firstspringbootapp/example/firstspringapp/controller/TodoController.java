package com.firstspringbootapp.example.firstspringapp.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.firstspringbootapp.example.firstspringapp.service.TodoService;
import com.firstspringbootapp.example.firstspringapp.entity.todo;

@Controller
@SessionAttributes("name")
public class TodoController {

    private TodoService todoService;
    
    ////#region
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    ////#endregion

    @RequestMapping("list-todos")
    public String listTodos(ModelMap model) {
        List<todo> lstTodos=todoService.findByUserName("user1");
        model.addAttribute("todos", lstTodos);
        return "listtodos";
    }
    
    @RequestMapping(value="addtodos", method=RequestMethod.GET)
    public String addTodo() {
        return "todo";
    }

    @RequestMapping(value="addtodos", method=RequestMethod.POST)
    public String requestMethodName(@RequestParam String description) {
        todoService.addTodo("abc", description, LocalDate.now().plusYears(4),false);
        return "redirect:list-todos";
        //return new RedirectView("list-todos");
    }
    
    
}
