package com.hoquei360.hoquei30.controllers;

import com.hoquei360.hoquei30.business.persistant.team.Team;
import com.hoquei360.hoquei30.business.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/team" , produces = MediaType.APPLICATION_JSON_VALUE)
public class TeamController {

    @Autowired
    private TeamService service;

    @GetMapping()
    public ResponseEntity<List<Team>> findTeams(){
        List<Team> teams = service.getAll();
        ResponseEntity<List<Team>> result;

        if(teams.isEmpty()){
            result = new ResponseEntity<>(teams, HttpStatus.NOT_FOUND);
        }else {
            result = new ResponseEntity<>(teams, HttpStatus.OK);
        }
        return result;
    }

    @GetMapping("/id")
    public Team findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping()
    public Team creatTeam(@RequestBody Team team){
        return service.creatTeam(team);
    }

    @PutMapping()
    public void update(@RequestBody Team team){
        service.update(team);
    }
}
