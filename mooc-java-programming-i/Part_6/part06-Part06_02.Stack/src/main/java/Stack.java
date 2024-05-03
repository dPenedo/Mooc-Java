import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stringsStack;

    public Stack() {
        this.stringsStack = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (stringsStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public void add(String value){
        stringsStack.add(value);
    }

    public ArrayList<String> values(){
        return stringsStack;
    }

    public String take(){


        return stringsStack.remove(stringsStack.size() - 1);
    }
}
