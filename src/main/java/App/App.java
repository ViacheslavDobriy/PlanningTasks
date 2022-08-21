package App;
public class App {
    public static void main(String[] args) {
        TaskService tasksTable = new TaskService();
        System.out.println(tasksTable.addTask());
        System.out.println(tasksTable.addTask());
        System.out.println(tasksTable.addTask());
        tasksTable.showAllTasks();
        ExportToCSVFile fileTasks = new ExportToCSVFile();
        fileTasks.addTask();
    }
}
