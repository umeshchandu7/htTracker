import Controller.htController;
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

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        RemainderRepository remainderRepository = new RemainderRepository();
        PhysicalActivityRepository physicalActivityRepository = new PhysicalActivityRepository();
        htController htController = new htController(physicalActivityRepository,remainderRepository,userRepository);

    }
}