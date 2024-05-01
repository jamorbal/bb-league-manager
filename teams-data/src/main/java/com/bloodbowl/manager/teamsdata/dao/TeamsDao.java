package com.bloodbowl.manager.teamsdata.dao;

import com.bloodbowl.manager.teamsdata.dao.models.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TeamsDao extends CrudRepository<Team, UUID> {

}
