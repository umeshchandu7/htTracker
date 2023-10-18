package Strategies;

import Models.Activity;
import Models.Jogging;
import Models.Running;
import Models.Walking;

public class ActivityStrategyFactory {
    public static Activity addActivity(int i)
    {
       if(i==1)
       {
           return new Running();
       }
       else if(i==2)
       {
           return new Walking();
       }
      else if(i==3)
       {
           return new Jogging();
       }
      else
       {
           return null;
       }
    }
}
