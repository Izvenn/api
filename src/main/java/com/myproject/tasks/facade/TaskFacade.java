package com.myproject.tasks.facade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.myproject.tasks.dto.TasksDTO;

@Service
public class TaskFacade {
    private static final Map<Long, TasksDTO> tasks = new HashMap<>();

    public TasksDTO create(TasksDTO tasksDTO) {

        Long nextId = tasks.keySet().size() + 1L;
        tasksDTO.setId(nextId);
        tasks.put(nextId, tasksDTO);
        return tasksDTO;

    }

    public TasksDTO update(TasksDTO tasksDTO, Long taskId) {

        tasks.put(taskId, tasksDTO);
        return tasksDTO;

    }

    public TasksDTO getById(Long tarefaId) {
        return tasks.get(tarefaId);
    }

    public List<TasksDTO> getAll() {
        return new ArrayList<>(tasks.values());
    }

public String delete(Long taskId) {
    tasks.remove(taskId);
    return "Deleted";
}


}
