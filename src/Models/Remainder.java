package Models;

public class Remainder {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SetTime getSetTime() {
        return setTime;
    }

    public void setSetTime(SetTime setTime) {
        this.setTime = setTime;
    }

    static int idCounter =1;
    int id;
    String title;
    String description;
    SetTime setTime;
    public Remainder()
    {
        id = idCounter;
        idCounter++;
    }

}
