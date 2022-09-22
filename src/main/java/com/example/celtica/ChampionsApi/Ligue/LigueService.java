package com.example.celtica.ChampionsApi.Ligue;


import com.example.celtica.ChampionsApi.Club.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class LigueService {

    private final LigueRepository ligueRepository;

    @Autowired
    public LigueService(LigueRepository ligueRepository) {
        this.ligueRepository = ligueRepository;
    }

    public List<Ligue> getAllLigues()   {
        return ligueRepository.findAll();
    }

    public Ligue getLigueById(Long id)  {
        return ligueRepository.findById(id).get();
    }

    public void addNewLigue(Ligue ligue){
        ligueRepository.save(ligue);
    }
}
