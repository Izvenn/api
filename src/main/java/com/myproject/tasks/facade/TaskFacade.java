package com.myproject.tasks.facade;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.myproject.tasks.dto.TasksDTO;


@Service
public class TaskFacade {
    private static final  Map<Long, TasksDTO> tasks = new HashMap<>();

    
}
