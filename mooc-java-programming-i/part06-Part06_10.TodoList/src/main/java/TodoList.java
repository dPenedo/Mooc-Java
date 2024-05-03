import java.util.ArrayList;

/**
 * TodoList
 */
public class TodoList {
    private ArrayList<String> todoList;

    public TodoList(){
        this.todoList = new ArrayList<>();
    }
    public void add(String task){
        todoList.add(task);
    }
    public void print(){
        int index = 1;
        for (String string : todoList) {
            System.out.println(index + ": " + string);
            index++;
        }
    }
    public void remove(int number){
        todoList.remove(number -1);
    }

}
