package com.example.celtica.ChampionsApi.Club;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/club")
public class ClubController {
    private final ClubService clubService;

    @Autowired
    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    @GetMapping
    public List<Club> getAllClubs(){
        return clubService.getAllClubs();
    }

    @PostMapping
    public String addNewClub(@RequestBody  Club club){
        clubService.addNewClub(club);

        return "Success";
    }
}
