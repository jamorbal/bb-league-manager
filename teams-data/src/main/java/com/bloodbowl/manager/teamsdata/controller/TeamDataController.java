package com.bloodbowl.manager.teamsdata.controller;

import com.bloodbowl.manager.teamsdata.dao.TeamsDao;
import com.bloodbowl.manager.teamsdata.dao.models.Team;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.StreamSupport;

@RestController
public class TeamDataController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TeamDataController.class);

    @Autowired
    private TeamsDao teamsDao;

    @GetMapping("/team")
    public List<Team> getAllTeams() {
        LOGGER.info("Get all teams invoke");
        return StreamSupport.stream(this.teamsDao.findAll().spliterator(), false).toList();
    }

}
