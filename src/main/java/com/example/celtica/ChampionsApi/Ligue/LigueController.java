package com.example.celtica.ChampionsApi.Ligue;


import com.example.celtica.ChampionsApi.Club.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/ligue")
public class LigueController {

    private final LigueService ligueService;

    @Autowired
    public LigueController(LigueService ligueService) {
        this.ligueService = ligueService;
    }

    @GetMapping
    public List<Ligue> getAllLigues() throws ParseException {
        return ligueService.getAllLigues();
    }

    @GetMapping(path = "/{id}")
    public Ligue getLigueById(@PathVariable long id) throws ParseException {
        return ligueService.getLigueById(id);
    }


    @PostMapping
    public String addNewLigue(@RequestBody Ligue ligue){
        ligueService.addNewLigue(ligue);
        return "Success";
    }
}
