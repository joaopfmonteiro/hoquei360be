package com.hoquei360.hoquei30.business.persistant.repositories;

import com.hoquei360.hoquei30.business.persistant.player.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
