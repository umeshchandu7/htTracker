package Models;

import java.util.ArrayList;
import java.util.List;

public class User {
    static int idCounter =1;
    int id;
    String name ;
    String userName;
    String email;
    String phoneNumber;
    List<Remainder> reminderList;

    public PhyscialActivity getPhyscialActivity() {
        return physcialActivity;
    }

    public void setPhyscialActivity(PhyscialActivity physcialActivity) {
        this.physcialActivity = physcialActivity;
    }

    PhyscialActivity physcialActivity;

    public List<Remainder> getReminderList() {
        return reminderList;
    }

    public void setReminderList(List<Remainder> reminderList) {
        this.reminderList = reminderList;
    }

    public User()
    {
        this.id = idCounter;
        User.idCounter++;
        this.setReminderList(new ArrayList<>());

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
