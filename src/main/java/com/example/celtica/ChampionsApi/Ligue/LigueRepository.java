package com.example.celtica.ChampionsApi.Ligue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LigueRepository extends JpaRepository<Ligue,Long> {

}
