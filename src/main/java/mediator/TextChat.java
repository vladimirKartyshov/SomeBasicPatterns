package mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat{// короткая реализация без проверки типов
                                      //отличие от шаблона observer смотреть в шаблоне observer
    User admin;
    List<User> users = new ArrayList<User>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUser(User u) {
        users.add(u);
    }

    public void sendMessage(String message, User user) {
      for(User u : users){
          u.getMessage(message);
      }
      admin.getMessage(message);
        }
        }


