import java.util.ArrayList;

/**
 * MessagingService
 */
public class MessagingService {

    ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            messages.add(message);
        }
    }
    public ArrayList<Message> getMessages(){
        return messages;
    }

}
