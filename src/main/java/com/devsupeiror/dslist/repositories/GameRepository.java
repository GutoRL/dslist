package com.devsupeiror.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsupeiror.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
