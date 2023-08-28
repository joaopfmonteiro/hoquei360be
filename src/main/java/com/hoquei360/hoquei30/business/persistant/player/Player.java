package com.hoquei360.hoquei30.business.persistant.player;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hoquei360.hoquei30.business.persistant.team.Team;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@Builder
@Entity
@Table

public class Player {


    public Player(long id, @NonNull String name, @NonNull String lastName, @NonNull LocalDate birthDate, @NonNull PositionRole position, @NonNull PreferredHand preferredHand, Team currentTeam, String injuryHistory) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.position = position;
        this.preferredHand = preferredHand;
        this.currentTeam = currentTeam;
        this.injuryHistory = injuryHistory;
    }

    @Id
    @GeneratedValue
    long id;
    @NonNull
    String name;
    @NonNull
    String lastName;
    @NonNull
    LocalDate birthDate;
    @NonNull
    PositionRole position;
    @NonNull
    PreferredHand preferredHand;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "team_id")
    @JsonBackReference
    Team currentTeam;
    String injuryHistory;
}

