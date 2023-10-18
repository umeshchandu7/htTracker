package Repositories;

import Models.Remainder;

import java.util.HashMap;

public class RemainderRepository {
    HashMap<Integer, Remainder> hashRemainder;

    public RemainderRepository() {
        this.hashRemainder = new HashMap<>();
    }




    public void save(Remainder remainder)
    {
        hashRemainder.put(remainder.getId(), remainder);
    }

    public HashMap<Integer, Remainder> getHashRemainder() {
        return hashRemainder;
    }

    public void setHashRemainder(HashMap<Integer, Remainder> hashRemainder) {
        this.hashRemainder = hashRemainder;
    }

    public Remainder findById(int id)
    {
        return hashRemainder.get(id);
    }
}
