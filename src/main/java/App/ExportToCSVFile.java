package App;

import java.io.*;
import java.util.List;

/**
 * Работаю с файлом CSV
 */
public class ExportToCSVFile implements WorkWithDataBase{
    @Override
    public int addTask() {
        List<Task> tasksTable = TasksData.getAllTasks();
        try (PrintWriter writer = new PrintWriter(new File("tasks.csv"))) {

            writer.printf("%d, %s, %s", Task.getId(), tasksTable.get(0).getTask(), tasksTable.get(0).getAuthor());

            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return Task.getId();
    }

    @Override
    public void showAllTasks() {

    }

    @Override
    public void removeTask(int id) {

    }

    @Override
    public void showTask(int id) {

    }
}
