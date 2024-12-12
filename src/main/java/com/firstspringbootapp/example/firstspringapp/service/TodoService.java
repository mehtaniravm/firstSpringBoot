package com.firstspringbootapp.example.firstspringapp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.firstspringbootapp.example.firstspringapp.entity.todo;

@Service
public class TodoService {
    private static List<todo> todos=new ArrayList<todo>();
    static{
        todos.add(new todo(1, "user1", "Devops", LocalDate.now().plusYears(1), false));
        todos.add(new todo(2, "user2", "GCP", LocalDate.now().plusYears(2), false));
        todos.add(new todo(3, "user3", "Full stack", LocalDate.now().plusYears(3), false));
    }

    public List<todo> findByUserName(String username){
        return todos;
    }
}
