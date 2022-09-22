package com.example.celtica.ChampionsApi.Club;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ClubService {

    private final ClubRepository clubRepository;

    @Autowired
    public ClubService(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }


    public List<Club> getAllClubs(){
        return clubRepository.findAll();
    }

    public void addNewClub(Club club){
        clubRepository.save(club);
    }
}
