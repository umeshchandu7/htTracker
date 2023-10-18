package Strategies;

import Dtos.upComingDtos;
import Models.Remainder;
import Models.SetTime;

import java.util.List;

public interface UpcomingStrategy {
    public List<upComingDtos> upComingToDos(List<Remainder> remainders , SetTime setTime);
}
