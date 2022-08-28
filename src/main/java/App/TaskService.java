package App;

import java.util.List;

/**
 * Имплементируем методы из интерфейса
 */
public class TaskService implements WorkWithDataBase{
    @Override
    public int addTask() {
        List<Task> tasksTable = TasksData.getAllTasks();
        tasksTable.add(new Task("Buy_bread", Authors.DVO));
        System.out.println("Task added");
        return Task.getId();
    }

    @Override
    public void showAllTasks() {
        List<Task> tasksTable = TasksData.getAllTasks();
        for (Task task: tasksTable) {
            System.out.printf("id = %d, task = %s, author = %s\n", Task.getId(), task.getTask(), task.getAuthor());
        }
    }

    @Override
    public void removeTask(int id) {

    }

    @Override
    public void showTask(int id) {

    }
}
