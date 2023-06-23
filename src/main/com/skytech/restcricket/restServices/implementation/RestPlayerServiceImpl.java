package com.skytech.restcricket.restServices.implementation;

import com.skytech.restcricket.model.Player;
import com.skytech.restcricket.restServices.RestPlayerService;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class RestPlayerServiceImpl implements RestPlayerService {

    private RestTemplate restTemplate;


    @Override
    public List<Player> getAll() {
        List<Player> list= restTemplate.getForObject(url,List.class);
        return list;
    }
    @Override
    public Player getById(int id) {
        return   restTemplate.getForObject(url+"/"+id,Player.class);
    }

    @Override
    public int deletePlayer(int id) {
        return restTemplate.getForObject(url+"/delete/"+id,Integer.class);
    }

    @Override
    public int createPlayer(Player player) {
        return restTemplate.postForObject(url+"/create",player,Integer.class);
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

}
