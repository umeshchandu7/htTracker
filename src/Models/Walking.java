package Models;

import java.util.Scanner;

public class Walking extends Activity{
    public Walking() {
        this.id = idCounter;
        idCounter++;
        this.name ="walking";
    }

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
        System.out.println("set hours for walking");
        this.hours = sc.nextInt();
        System.out.println("set minutes for walking");
        this.minutes = sc.nextInt();
    }
}
