package com.hoquei360.hoquei30.business.persistant.team;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hoquei360.hoquei30.business.persistant.player.Player;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Team {

    @Id
    @GeneratedValue
    long id;

    String name;

    String nation;

    String division;

    int goalsScored;

    int goalsConceded;

    @OneToMany( mappedBy = "currentTeam", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Player> player;
}
