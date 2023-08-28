package com.hoquei360.hoquei30.business.services;

import com.hoquei360.hoquei30.business.persistant.repositories.TeamRepository;
import com.hoquei360.hoquei30.business.persistant.team.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamRepository repository;

    public List<Team> getAll(){
        return repository.findAll();
    }

    public Team findById(long id){
        return repository.getReferenceById(id);
    }

    public Team creatTeam(Team team){
        return repository.save(team);
    }

    public void update(Team team){
        repository.save(team);
    }
}
