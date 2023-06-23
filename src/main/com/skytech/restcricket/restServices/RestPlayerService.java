package com.skytech.restcricket.restServices;

import com.skytech.restcricket.model.Player;

import java.util.List;

public interface RestPlayerService {

   public static final String url="http://localhost:8080/SpringCricketProject_war_exploded/player";

    public List<Player> getAll();

    public Player getById(int id);

    public int deletePlayer(int id);

    public int createPlayer(Player player);

}
