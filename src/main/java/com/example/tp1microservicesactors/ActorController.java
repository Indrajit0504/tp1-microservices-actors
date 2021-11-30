package com.example.tp1microservicesactors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ActorController {

    @GetMapping(value = "/actors")
    public static List<Actor> getActors() {
        List<Actor> actors = ActorServices.findAll();
        return actors;
    }
    @GetMapping(value = "/actors/{id}")
    public Actor getActorById(@PathVariable Long id){
        var searchActor = ActorServices.findById(id);
        return searchActor;
    }
}
