package Dtos;

import Models.SetTime;

public class upComingDtos {
    String title ;
    int timeLeft;
    SetTime setTime;

    public upComingDtos(String title, int timeLeft, SetTime setTime) {
        this.title = title;
        this.timeLeft = timeLeft;
        this.setTime = setTime;
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", timeLeft=" + (timeLeft)%24+"hours" +(timeLeft)%60+"minutes"+
                ", startsAt=" + setTime.getHour()+":"+setTime.getMin() +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(int timeLeft) {
        this.timeLeft = timeLeft;
    }

    public SetTime getSetTime() {
        return setTime;
    }

    public void setSetTime(SetTime setTime) {
        this.setTime = setTime;
    }
}
