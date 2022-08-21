package App;

import java.io.IOException;

/**
 * Здесь описываются все методы по работе с данными
 */
public interface WorkWithDataBase {
    public int addTask() throws IOException;
    public void showAllTasks();
    public void removeTask(int id);
    public void showTask(int id);
}
