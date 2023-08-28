package com.hoquei360.hoquei30.controllers;


import com.hoquei360.hoquei30.business.persistant.player.Player;
import com.hoquei360.hoquei30.business.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping(value = "/api/player", produces = MediaType.APPLICATION_JSON_VALUE)
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping()
    public ResponseEntity<List<Player>> findAllPlayers(){
        List<Player> players = playerService.findAll();
        ResponseEntity<List<Player>> result ;

        if (players.isEmpty()){
            result =  new ResponseEntity<>(players, HttpStatus.NOT_FOUND);
        }else{
            result = new ResponseEntity<>(players, HttpStatus.OK);
        }
        return result ;
    }


    @GetMapping("/id")
    public Player findById(@PathVariable long id){
        return playerService.findPlayerById(id);
    }

    @PostMapping()
    public ResponseEntity<Player> createPlayer(@RequestBody Player player){
        return ResponseEntity.ok(playerService.createPlayer(player));
    }

    @PutMapping()
    public void update(@RequestBody Player player){
        playerService.updatePlayer(player);
    }
}
