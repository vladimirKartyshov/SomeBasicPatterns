package mediator;

public class Admin implements User{

    Chat chat;

    public Admin(Chat chat) {
        this.chat = chat;
    }
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    public void getMessage(String message) {
        System.out.println("Администратор получает сообщение" + message + "'" );
    }
}
