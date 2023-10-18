package Services;

import Models.User;
import Repositories.UserRepository;

import java.util.Scanner;

public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User SignIn()
    {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.println("Enter USERNAME");
        String userName = sc.nextLine();
        user.setUserName(userName);
        System.out.println("ENTER  NAME");
        String name = sc.nextLine();
        user.setName(name);
        System.out.println("Enter EMAIL OF THE USER");
        String email = sc.nextLine();
        user.setName(email);
        System.out.println("Enter phonenumber OF THE USER");
        String pn = sc.nextLine();
        user.setName(pn);
        this.userRepository.save(user);
        return user;
    }
    public User logIn(String userName, String password)
    {
        User user = userRepository.getUserMap().get(userName);
        if(user.getEmail().equals(password))
        {
            System.out.println("LOGIN SUCCESSFULL");
            return user;
        }
        return null;
    }
}
