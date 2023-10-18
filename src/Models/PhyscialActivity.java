package Models;

import java.util.ArrayList;
import java.util.List;

public class PhyscialActivity {
    static int idCounter = 1;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    List<Activity> activity;

    public List<Activity> getActivity() {
        return activity;
    }

    public void setActivity(List<Activity> activity) {
        this.activity = activity;
    }
    public PhyscialActivity()
    {
        this.setActivity(new ArrayList<Activity>());
    }
}
