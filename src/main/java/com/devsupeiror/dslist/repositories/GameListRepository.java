package com.devsupeiror.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsupeiror.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
