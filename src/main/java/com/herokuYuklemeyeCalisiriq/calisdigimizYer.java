package com.herokuYuklemeyeCalisiriq;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/adlar")
public class calisdigimizYer {
    private adlarRepo adlarrepo;

    public calisdigimizYer(adlarRepo ar){
        this.adlarrepo = ar;
    }
    @GetMapping
    List<adlar> adlarr(){
        return adlarrepo.findAll();
    }

    @PostMapping
    adlar save(adlar adlar){
        return adlarrepo.save(adlar);
    }

}
