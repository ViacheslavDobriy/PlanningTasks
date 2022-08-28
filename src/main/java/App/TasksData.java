package App;

import java.util.ArrayList;
import java.util.List;

/**
 * Здесь будут храниться все задачи в коллекции
 */
public class TasksData {
    private static final List<Task> allTasks = new ArrayList<>();
    private TasksData() {

    }
    public static List<Task> getAllTasks(){
        return allTasks;
    }
}
