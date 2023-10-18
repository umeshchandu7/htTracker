package Controller;

import Dtos.upComingDtos;
import Models.SetTime;
import Models.User;
import Repositories.PhysicalActivityRepository;
import Repositories.RemainderRepository;
import Repositories.UserRepository;
import Services.PhysicalActivityService;
import Services.RemainderService;
import Services.UserService;

import java.util.List;

public class htController {
   PhysicalActivityService physicalActivityService;
   UserService userService;
   RemainderService remainderService;
   public htController(PhysicalActivityRepository physicalActivityRepository, RemainderRepository remainderRepository, UserRepository userRepository)
   {
       this.physicalActivityService = new PhysicalActivityService();
       this.remainderService = new RemainderService(remainderRepository);
       this.userService = new UserService(userRepository);
   }
   public User logIn(String userName, String password)
   {
       return userService.logIn(userName,password);
   }
   public User signUp()
   {
       return userService.SignIn();
   }
   public void addRemainder(User user)
   {
       remainderService.addReaminder(user);
   }
   public List<upComingDtos> displayUpcomingTodos(User user, SetTime setTime)
   {
       return remainderService.upComingTodos(user,setTime);
   }
    public void designingOwnPhyisclActivityForADay(User user)
    {
       physicalActivityService.designPhyscicalActivityforDay(user);
    }
    public void howYouWorkourForaDay(User user)
    {
        physicalActivityService.howyouWorkoutforDay(user);
    }
}
