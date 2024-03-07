package com.warmupmini.warmupmini.repository;

import com.warmupmini.warmupmini.domain.attendance.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {

    Team findByName(String teamName);
}
