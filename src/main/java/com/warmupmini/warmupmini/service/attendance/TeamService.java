package com.warmupmini.warmupmini.service.attendance;

import com.warmupmini.warmupmini.domain.attendance.Team;
import com.warmupmini.warmupmini.dto.attendance.request.CreateTeamRequest;
import com.warmupmini.warmupmini.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Team save(CreateTeamRequest createTeamRequest) {
        Team team = new Team();
        team.setName(createTeamRequest.getName());
        team.setManager(createTeamRequest.getManager());
        return teamRepository.save(team);
    }

    public List<Team> getAll() {
        return teamRepository.findAll();
    }
}
