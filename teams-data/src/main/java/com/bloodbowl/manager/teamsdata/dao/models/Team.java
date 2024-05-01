package com.bloodbowl.manager.teamsdata.dao.models;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.util.UUID;

@Data
@ToString
public class Team {

    @Id
    private UUID id;

    @Column("team_name")
    private String teamName;

}
