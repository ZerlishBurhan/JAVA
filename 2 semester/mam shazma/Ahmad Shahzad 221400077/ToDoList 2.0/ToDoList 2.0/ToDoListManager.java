import java.util.Scanner;
import java.util.ArrayList;

interface TaskManager {
    void addTask(Task task);

    void completeTask(int index);

    void removeTask(int index);

    void displayDetails();
}

class User {
    private String userName;
    private ArrayList<ToDoList> toDoLists;

    public User() {
        toDoLists = new ArrayList<>();
    }

    public User(String userName) {
        this.userName = userName;
        toDoLists = new ArrayList<>();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void createToDoList() {
        ToDoList toDoList = new ToDoList();
        toDoLists.add(toDoList);
    }

    public ToDoList getToDoList(int index) {
        if (index >= 0 && index < toDoLists.size()) {
            return toDoLists.get(index);
        } else {
            return null;
        }
    }

    public int getToDoListCount() {
        return toDoLists.size();
    }

    public String toString() {
        return "User Name: " + userName;
    }
}

abstract class Task {
    private String title;
    private String discription;
    private String date;
    private boolean isCompleted;

    public Task() {
    }

    public Task(String title, String discription, String date, boolean isCompleted) {
        this.title = title;
        this.discription = discription;
        this.date = date;
        this.isCompleted = isCompleted;
    }

// ==============================Setters====================================================
    public void setTitle(String title){
        this.title = title;
    }
    public void setDiscription(String discription){
        this.discription = discription;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void setIsCompleted(boolean isCompleted){
        this.isCompleted = isCompleted;
    }
// ==============================Getters====================================================    
    public String getTitle(){
        return title;
    }
    public String getDiscription(){
        return discription;
    }
    public String getDate(){
        return date;
    }
    public boolean getIsCompleted(){
        return isCompleted;
    }

    public void markTaskAsCompleted() {
        setIsCompleted(true);
    }

    public abstract void displayDetails();
    
    public String toString(){
        return "Title: " + getTitle() + "\nDescription: " + getDiscription() +
                "\nDate: " + getDate() + "\nTask is Completed(true/false): " + getIsCompleted();
    }
}


class RegularTask extends Task {
    public RegularTask() {
    }

    public RegularTask(String title, String description, String date, boolean isCompleted) {
        super(title, description, date, isCompleted);
    }

    public void displayDetails() {
        System.out.println("Title: " + getTitle() + "\nDescription: " + getDiscription() +
                "\nDate: " + getDate() + "\nTask is Completed(true/false): " + getIsCompleted());
    }
}

class ScheduledTask extends Task {
    private String startTime;
    private String endTime;

    public ScheduledTask() {
    }

    public ScheduledTask(String title, String description, String date, boolean isCompleted,
                                                            String startTime, String endTime) {
        super(title, description, date, isCompleted);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void setStartTime(String startTime){
        this.startTime = startTime;
    }
    public void setEndTime(String endTime){
        this.endTime = endTime;
    }

    public String getStartTime(){
        return startTime;
    }
    public String getEndTime(){
        return endTime;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + getTitle() + "\nDescription: " + getDiscription() +
                "\nDate: " + getDate() + "\nTask is Completed(true/false): " + getIsCompleted());    
        System.out.println("Start Time: " + getStartTime());
        System.out.println("End Time: " + getEndTime());
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nStart Time: " + getStartTime() +
                "\nEnd Time: " + getEndTime();
    }
}

 class ToDoList implements TaskManager{

    private ArrayList<Task> tasks;

    public ToDoList(){
        tasks = new ArrayList<>();
    }

    public void addTask(Task t){
        tasks.add(t);
    }
    
    public void completeTask(int index){
        tasks.get(index).markTaskAsCompleted();
    }

    public void removeTask(int index){
        tasks.remove(index);
    }

    public int getTaskCount() {
        return tasks.size();
    }
    
    public void displayDetails(){
     
        for(Task task: tasks){

        if (task instanceof ScheduledTask){
            System.out.println("\n====This Task is a Scheduled Task====");
        }
        else if (task instanceof RegularTask){
            System.out.println("\n====This Task is a Regular Task====");
        }
        else{
            System.out.println("invalid");
        }
            System.out.println(task);
        
        }
    }
}//toDoList-Class


class ToDoListManager {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("===========Welcome you want to manage ToDoLists==============");
        System.out.print("Enter the User name: ");
        String userName = keyboard.nextLine();

        User user = new User(userName);

        while (true) {
            System.out.println("\n=================Choose any Command from the following=================");
            System.out.println("1. Create a new ToDoList(you can add MULTIPLE)");
            System.out.println("2. Select/modify/display a ToDoList");
            System.out.println("3. Exit");
            System.out.print("Enter Any Number(1-3) to proceed: ");
            int choice = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println();

            switch (choice) {
                case 1:
                    user.createToDoList();
                    System.out.println("New ToDoList has been Created Successfully(Select/addTask in it with another Command[2]).");
                    break;

                case 2:
                    if (user.getToDoListCount() > 0) {

                        System.out.println("Select a ToDoList which you wanna Select/modify: ");
                        for (int i = 0; i < user.getToDoListCount(); i++) {
                            System.out.println((i + 1) + ". ToDoList");
                        }
                        System.out.print("Enter the number of the ToDoList: ");
                        int listChoice = keyboard.nextInt();
                        keyboard.nextLine();

                        if (listChoice >= 1 && listChoice <= user.getToDoListCount()) {
                            ToDoList selectedList = user.getToDoList(listChoice - 1);
                            manageToDoList(keyboard, selectedList);
                        } else {
                            System.out.println("Invalid choice. Please enter a valid number.");
                        }

                    } else {
                        System.out.print("No ToDoLists available. Create a ToDoList first.\n");
                    }
                    break;

                case 3:
                    System.out.print("Exiting ToDoList Manager. Have a great day!\n");
                    System.exit(0);
                    break;

                default:
                    System.out.print("Invalid Choice. Please Enter a valid option(1-3).\n");
                    break;
            }
        }
    }

    public static void manageToDoList(Scanner keyboard, ToDoList toDoList) {
        while (true) {
            System.out.println("=================Choose any Command for ToDoList=================");
            System.out.println("1. Add a new Task");
            System.out.println("2. Remove a Task");
            System.out.println("3. Mark a Task As Completed");
            System.out.println("4. Display Tasks");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter Any Number(1-5) to proceed: ");
            int choice = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println();

            switch (choice) {
                case 1:

                    System.out.println("Choose task type:");
                    System.out.println("1. Regular Task");
                    System.out.println("2. Scheduled Task");
                    System.out.print("Enter the task type (1 or 2): ");
                    int taskType = keyboard.nextInt();
                    keyboard.nextLine();

                if(taskType < 1 || taskType > 2){
                    System.out.println("\nInvalid task type. Please enter 1 (Regular) or 2 (Scheduled).\n");
                    continue;
                }
                    System.out.print("\nEnter the Title of Task: ");
                    String title = keyboard.next();
                    keyboard.nextLine();

                    System.out.print("Enter the Description of Task: ");
                    String description = keyboard.next();
                    keyboard.nextLine();

                    System.out.print("Enter the Date of Task: ");
                    String date = keyboard.next();

                    Task task;

                if (taskType == 1) {
                    task = new RegularTask(title, description, date, false);
                    //POLYMORPHISM
                    toDoList.addTask(task);
                    System.out.println("\nTask Added Successfully.\n");
                    
                } else if (taskType == 2) {
                    System.out.print("Enter the Start Time of Task: ");
                    String startTime = keyboard.next();
                    System.out.print("Enter the End Time of Task: ");
                    String endTime = keyboard.next();
                    task = new ScheduledTask(title, description, date, false, startTime, endTime);
                    //POLYMORPHISM
                    toDoList.addTask(task);
                    System.out.println("\nTask Added Successfully.\n");
                } 
                    break;

                case 2:
                    System.out.print("Enter the index of the task you want to remove: ");
                    int index = keyboard.nextInt();

                    if (index >= 0 && index < toDoList.getTaskCount()) {
                        toDoList.removeTask(index);
                        System.out.println("\nTask Removed.\n");
                    } else {
                        System.out.println("\nInvalid index. Please enter a valid index.\n");
                    }
                    break;

                case 3:
                    System.out.print("Enter index of the task you want to MarkAsCompleted: ");
                    index = keyboard.nextInt();

                    if (index >= 0 && index < toDoList.getTaskCount()) {
                        toDoList.completeTask(index);
                        System.out.println("\nTask marked as completed.\n");
                    } else {
                        System.out.println("\nInvalid index. Please enter a valid index.\n");
                    }
                    break;

                case 4:
                    if (toDoList.getTaskCount() > 0) {
                        System.out.println("\n====== ToDo List ======");
                        toDoList.displayDetails();
                        System.out.println();
                    } else {
                        System.out.println("\nNo tasks to display. Your ToDo list is empty.\n");
                    }
                    break;

                case 5:
                    return; // Return to the main menu

                default:
                    System.out.println("\nInvalid Choice. Please Enter a valid option(1-5).\n");
                    break;
            }
        }
    }
}
