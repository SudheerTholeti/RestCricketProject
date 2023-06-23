package com.skytech.restcricket.controller;

import com.skytech.restcricket.model.Player;
import com.skytech.restcricket.restServices.implementation.RestPlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class RestPlayerController {
    @Autowired
    private RestPlayerServiceImpl restPlayerService;

    @GetMapping("/restPlayer")
    public List<Player> getPlayers(Model model){
        List<Player> list=restPlayerService.getAll();

        return list;
    }

    @GetMapping("/restPlayer/{id}")
    public Player getPlayerById(@PathVariable int id){
        return restPlayerService.getById(id);
    }
    @GetMapping("/restPlayers/{id}")
    public ModelAndView getPlayerById1(@PathVariable int id, ModelAndView modelAndView){
        Player player =restPlayerService.getById(id);
        modelAndView.addObject("player",player);
        modelAndView.setViewName("playerById");
        return modelAndView;
    }

    @GetMapping("/restPlayer/delete/{id}")
    public int deletePlayer(@PathVariable int id){
        return restPlayerService.deletePlayer(id);
    }

    @PostMapping("/restPlayer/create")
    public int createPlayer(){
        Player player=new Player();
        player.setName("Sudheer");
        player.setAge(23);
        player.setRole("All Rounder");
        player.setNoOfMatches(100);

        return restPlayerService.createPlayer(player);
    }


}
