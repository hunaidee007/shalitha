package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultantController {


    @Autowired
    Duck duck;

    @GetMapping("applicants1")
    public String getApplicant() {

        return duck.fly();
    }
}
