package com.herokuYuklemeyeCalisiriq;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class calisdigimizYer {
    public String m;

    @GetMapping("/salam")
    public String miri(){
        m = "Salamm";
        return m;
    }
}
