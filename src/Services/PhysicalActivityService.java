package Services;

import Dtos.ActivityDtos;
import Exceptions.physicalActivityNotSet;
import Models.*;
import Repositories.PhysicalActivityRepository;
import Strategies.ActivityStrategyFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhysicalActivityService {
    PhysicalActivityRepository physicalActivityRepository;
    public void designPhyscicalActivityforDay(User user)
    {

        Scanner sc = new Scanner(System.in);
        displayTasktoSet();
        System.out.println("Enter how many task to be Set for today");
        int count = sc.nextInt();
        PhyscialActivity physicalActivity = new PhyscialActivity();
        for(int i=0;i<count;i++)
        {
            System.out.println("Enter the id of the Activity");
              int j = sc.nextInt();
              Activity activity = ActivityStrategyFactory.addActivity(j);
              activity.setTarget();
              physicalActivity.getActivity().add(activity);
        }
        user.setPhyscialActivity(physicalActivity);
    }
    public void displayTasktoSet()
    {
        List<ActivityDtos> activityDtos = new ArrayList<>();
        Activity activity = new Running();
        activity.setId(1);
         ActivityDtos activityDtos1 = new ActivityDtos(activity.getId(),activity.getName());
         activityDtos.add(activityDtos1);
        Activity activity1 = new Walking();
        activity.setId(2);
        ActivityDtos activityDtos2 = new ActivityDtos(activity1.getId(),activity1.getName());
        activityDtos.add(activityDtos2);
        Activity activity2 = new Jogging();
        activity.setId(3);
        ActivityDtos activityDtos3 = new ActivityDtos(activity2.getId(),activity2.getName());
        activityDtos.add(activityDtos3);
        for(int i=0;i<activityDtos.size();i++)
        {
            System.out.println(activityDtos.get(i));
        }
    }
    public void howyouWorkoutforDay(User user)
    {
        PhyscialActivity physcialActivity = user.getPhyscialActivity();
        if(physcialActivity==null)
        {
            throw new physicalActivityNotSet("physcial Activity nt set fot the user");
        }
        for(int i=0;i<physcialActivity.getActivity().size();i++)
        {
            physcialActivity.getActivity().get(i).targetYouMake(user);
        }
    }

}
