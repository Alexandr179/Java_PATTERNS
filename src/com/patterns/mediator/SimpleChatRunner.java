package com.patterns.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimpeUser(chat, "User_1");
        User user2 = new SimpeUser(chat, "User_2");
        User user3 = new SimpeUser(chat, "User_3");
        User user4 = new SimpeUser(chat, "User_4");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);
        chat.addUserToChat(user3);
        chat.addUserToChat(user4);

        user3.sendMessage("\"Hello, I am User_3\"");
        admin.sendMessage("Roger that. I am admin");
    }
}
