package Strategies;

import Dtos.upComingDtos;
import Models.Remainder;
import Models.SetTime;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class upComingImpStrategy implements UpcomingStrategy{
    @Override
    public List<upComingDtos> upComingToDos(List<Remainder> remainders, SetTime setTime) {
        PriorityQueue<Remainder> list = new PriorityQueue<>((a, b)-> {
            return  (a.getSetTime().getHour()*60+a.getSetTime().getMin())-(b.getSetTime().getHour()*60+b.getSetTime().getMin());
        });
        int time = (setTime.getHour()*60)+(setTime.getMin());
        for(int i=0;i<remainders.size();i++)
        {
            list.add(remainders.get(i));
        }
        List<upComingDtos> upComingDto = new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            Remainder remainder = list.poll();
            int time1 = remainder.getSetTime().getHour()*60+remainder.getSetTime().getMin();
            if(time1-time>=0)
            {
                upComingDtos upComingDtos1 = new upComingDtos(remainder.getTitle(),time1-time,remainder.getSetTime());
                upComingDto.add(upComingDtos1);
            }
        }
        return upComingDto;
    }
}
