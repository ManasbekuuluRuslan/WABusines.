package Classes;

import enums.Image;
import enums.Status;

import java.util.List;

public class Profile {
   private int id;
   private String userName;
   private int phoneNumber;
   private String password;
   private Image images;
   private Status statuses;
   private String messages;

    public Profile(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Image getImages() {
        return images;
    }

    public void setImages(Image images) {
        this.images = images;
    }

    public Status getStatuses() {
        return statuses;
    }

    public void setStatuses(Status statuses) {
        this.statuses = statuses;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return " ---   Profile ---" + "\n"+
                "id = " + id + "\n"+
                "userName = " + userName + "\n" +
                "phoneNumber = " + phoneNumber +"\n"+
                "password = " + password + "\n" +
                "images = " + images + "\n" +
                "statuses = " + statuses + "\n"+
                "messages = " + messages + "\n";
    }

    public Profile getList(List<Profile> profiles) {
        return (Profile) profiles;
    }
}
