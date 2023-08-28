package com.hoquei360.hoquei30.business.services;

import com.hoquei360.hoquei30.business.persistant.player.Player;
import com.hoquei360.hoquei30.business.persistant.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    public Player findPlayerById(long id) {
        return playerRepository.getReferenceById(id);
    }

    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    public void updatePlayer(Player player) {
        playerRepository.save(player);
    }

    public void deletePlayer(Long id){
        playerRepository.deleteById(id);
    }
}
