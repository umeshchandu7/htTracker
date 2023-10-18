package Repositories;

import Models.PhyscialActivity;

import java.util.HashMap;

public class PhysicalActivityRepository {
    HashMap<Integer, PhyscialActivity> PhysMap;
    public PhysicalActivityRepository() {
        this.PhysMap = new HashMap<>();
    }

    public HashMap<Integer, PhyscialActivity> getPhysMap() {
        return PhysMap;
    }

    public void setPhysMap(HashMap<Integer, PhyscialActivity> physMap) {
        PhysMap = physMap;
    }

   public void save(PhyscialActivity physcialActivity)
   {
       PhysMap.put(physcialActivity.getId(),physcialActivity);
   }
   public PhyscialActivity findById(int id)
   {
       return PhysMap.get(id);
   }

}
