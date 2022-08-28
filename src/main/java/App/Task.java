package App;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Описываю объект задача
 */
public class Task {
    private static int id = 0;
    private String task;
    private Authors author;
    private Priority priority;
    private GregorianCalendar date;

    public Task(String task, Authors author) {
        id++;
        this.task = task;
        this.author = author;
        this.date = new GregorianCalendar();
    }

    public String getDate() {
        DateFormat df = new SimpleDateFormat("dd MMM yyyy");
        return df.format(date.getTime());
    }

    public String getTime() {
        DateFormat df = new SimpleDateFormat("hh:mm:ss");
        return df.format(date.getTime());
    }

    public static int getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public Authors getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", author=" + author +
                '}';
    }

    public void setPriority() {
        System.out.println("Insert priority of task");
        System.out.println("1 - low priority");
        System.out.println("2 - medium priority");
        System.out.println("3 - high priority");
        Scanner choice = new Scanner(System.in);
        switch (choice.nextInt()) {
            case 1 -> this.priority = Priority.EASY;
            case 2 -> this.priority = Priority.MEDIUM;
            case 3 -> this.priority = Priority.EMERGENCY;
        }
    }
}
