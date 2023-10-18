package Services;

import Dtos.upComingDtos;
import Models.Remainder;
import Models.SetTime;
import Models.User;
import Repositories.RemainderRepository;
import Strategies.UpcomingStrategy;
import Strategies.upComingImpStrategy;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class RemainderService {
    RemainderRepository remainderRepository;

    public RemainderRepository getRemainderRepository() {
        return remainderRepository;
    }

    public void setRemainderRepository(RemainderRepository remainderRepository) {
        this.remainderRepository = remainderRepository;
    }

    public RemainderService(RemainderRepository remainderRepository) {
        this.remainderRepository = remainderRepository;
    }

    public void addReaminder(User user)
    {
        Remainder remainder = new Remainder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title");
        String title = sc.nextLine();
        remainder.setTitle(title);
        System.out.println("Enter description");
        String description = sc.nextLine();
        remainder.setDescription(description);
        System.out.println("Enter hour");
        int hour = sc.nextInt();
        System.out.println("Enter minutes");
        int min = sc.nextInt();
        SetTime setTime = new SetTime(hour,min);
        remainder.setSetTime(setTime);
        remainderRepository.save(remainder);
        if(user.getReminderList().size()==0)
        {
            user.getReminderList().add(remainder);
        }
        else
        {
            user.getReminderList().add(remainder);
        }
    }
    public List<upComingDtos> upComingTodos(User user, SetTime setTime)
    {
        System.out.println("UpComing Todos");
        UpcomingStrategy upcomingStrategy = new upComingImpStrategy();
        List<upComingDtos> upComingDtos = upcomingStrategy.upComingToDos(user.getReminderList(),setTime);
        return upComingDtos;
    }
}
