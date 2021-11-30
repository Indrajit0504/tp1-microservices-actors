package com.example.tp1microservicesactors;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActorServices {
    private static List<Actor> all_actors = new ArrayList<>();
    static {
        all_actors.add(new Actor(1,"Vijay", "Joseph", 47));
        all_actors.add(new Actor(2, "Rajinikanth", "Sivaji Rao", 70));
        all_actors.add(new Actor(3, "Sivarthikeyan", "Doss", 36));
        all_actors.add(new Actor(4, "Angelina", "Jolie", 46));
        all_actors.add(new Actor(5, "Will", "Smith", 53));
    }

    public static List<Actor> findAll(){
        return all_actors;
    }

    public static Actor findById(long id) {
        var actor = all_actors.stream().filter(m -> m.getId()==id).findFirst().orElse(null);
        return actor;
    }
}