package com.example.celtica.ChampionsApi.Ligue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
class LigueServiceTest {

    @Autowired
    LigueService ligueService;
    @Mock
    LigueRepository ligueRepository;

    AutoCloseable closeable;

    @BeforeEach
    public void setUp(){

        closeable= MockitoAnnotations.openMocks(this);
        ligueService=new LigueService(ligueRepository);
    }
    @AfterEach
    public void cleanUp(){
        try {
            closeable.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



    @Test
    void getAllLigues() {
        //Mock data
        Ligue l1=new Ligue();
        l1.nom="Ligue 1";
        l1.setId(1L);

        Ligue l2=new Ligue();
        l1.nom="Ligue 2";
        l1.setId(2L);

        Ligue l3=new Ligue();
        l1.nom="Ligue 3";
        l1.setId(3L);

        Ligue l4=new Ligue();
        l1.nom="Ligue 4";
        l1.setId(4L);

        List<Ligue> ligues= (List<Ligue>) List.of(l1,l2,l3);

        given(ligueRepository.findAll()).willReturn(ligues);

        //test

        assertThat(ligueService.getAllLigues())
                .hasSize(3)
                .contains(l3);


    }

    @Test
    void getLigueById() {
        //Mock data

        Ligue l1=new Ligue();
        l1.nom="Ligue 1";
        l1.setId(1L);

        Ligue l2=new Ligue();
        l1.nom="Ligue 2";
        l1.setId(2L);

        Optional<Ligue> lo1=Optional.of(l1);

        given(ligueRepository.findById(1L)).willReturn(lo1);

        //test

        assertThat(ligueService.getLigueById(1L))
                .isEqualTo(l1);


    }

    @Test
    void addNewLigue() {
    }
}