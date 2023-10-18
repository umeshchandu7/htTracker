package Models;

import java.util.Scanner;

public class Jogging extends Activity {
    @Override
    public void targetYouMake(User user) {
        Scanner sc = new Scanner(System.in);
        System.out.println(user.getName()+" many hours you make workout for"+this.getName()+" ");
        int h = sc.nextInt();
        System.out.println(user.getName()+" many minutes you make workout");
        int m = sc.nextInt();
        int time = h*60 + m;
        int time1 = this.hours*60+this.minutes;
        int res = time1-time;
        if(res>0)
        {
            System.out.println("well done"+user.getName()+" workout adequate time "+res+" minutes");
        }
        else if(res<0)
        {
            System.out.println(user.getName()+" lag workout time by "+res+" minutes");
        }
        else
        {
            System.out.println(user.getName()+" reached the target");
        }
    }

    @Override
    public void setTarget() {
        Scanner sc = new Scanner(System.in);
        System.out.println("set hours for Jogging");
        this.hours = sc.nextInt();
        System.out.println("set minutes for Jogging");
        this.minutes = sc.nextInt();
    }

    public Jogging() {
        this.id = idCounter;
        idCounter++;
        this.name ="Jogging";
    }
}
