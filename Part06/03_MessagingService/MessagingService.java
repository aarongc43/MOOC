import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> messages;
    
    public MessagingService(String message) {
        this.message = new ArrayList<>();
    }

    public void add(Message message){
        if (message.getContent().length() <= 280) {
            messages.add(message);
        }
    }

    public ArrayList<Message> getMessage() {
       return messages; 
    }
}
