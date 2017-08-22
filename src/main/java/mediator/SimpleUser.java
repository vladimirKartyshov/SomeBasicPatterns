package mediator;

public class SimpleUser implements User{
    Chat chat;

    public SimpleUser(Chat chat) {
        this.chat = chat;
    }

    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    public void getMessage(String message) {
        System.out.println(" Пользователь получает сообщение" + message + "'" );
    }
}
