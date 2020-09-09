package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int tasksPosition = 0;
        int defaultPriority = task.getPriority();
        for (Task element : tasks) {
            if (element.getPriority() < defaultPriority) {
                task = element;
            }
        }
        this.tasks.add(tasksPosition, task);
    }

    public Task take() {
        return tasks.poll();
    }
}