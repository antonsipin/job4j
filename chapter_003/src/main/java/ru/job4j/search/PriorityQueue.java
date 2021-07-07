package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int taskPosition = 0;
        if (tasks.size() == 0) {
            this.tasks.add(taskPosition, task);
        } else {
            for (Task element : tasks) {
                if (task.getPriority() < element.getPriority()) {
                    this.tasks.add(taskPosition, task);
                    break;
                } else {
                    taskPosition++;
                }
            }
        }
    }

    public Task take() {
        return tasks.poll();
    }
}