package Repositories;

import Models.User;

import java.util.HashMap;

public class UserRepository {
    HashMap<String, User> userMap;
    public UserRepository()
    {
        userMap = new HashMap<>();
    }

    public HashMap<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(HashMap<String, User> userMap) {
        this.userMap = userMap;
    }
    public void save(User user)
    {
        userMap.put(user.getUserName(), user);
    }
    public User findByUserName(String userName)
    {
        return userMap.get(userName);
    }
}
