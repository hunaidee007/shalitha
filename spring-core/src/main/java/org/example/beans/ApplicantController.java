package org.example.beans;


import org.example.entity.Applicant;
import org.example.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicantController {

    @Autowired
    ApplicantRepository applicantRepository;

    @Autowired
    Duck duck;

    @GetMapping("applicants")
    public Applicant getApplicant() {

        Applicant applicant = new Applicant();

        applicant.setName("A");
        applicant.setAddress("Home");

        applicantRepository.save(applicant);


        return applicant;
    }

    @GetMapping("applicants/{id}")
    public Applicant getSpecificApplicant(@PathVariable String id) {

        Applicant applicant = new Applicant();

        applicant.setName("A");
        applicant.setAddress("Home");

        applicantRepository.save(applicant);


        return applicant;
    }

    @GetMapping("applicants-findbyname")
    public Applicant getApplicantFindByName() {
        return applicantRepository.findApplicantByName("A").get(0);
    }

    @GetMapping("applicants-findbyname-and-address")
    public Applicant getApplicantFindByNameAndAddress() {

        return applicantRepository.findApplicantByNameAndAddress("A","Home").get(0);
    }

    @GetMapping("applicants-above5")
    public List<Applicant> getApplicantAboveFive() {

        return applicantRepository.findApplicantIdGreaterThanFive();
    }

    @GetMapping("consultants")
    public String consultants() {
        return "consultants found";
    }

    @GetMapping("slots")
    public String slots() {
        return "slots found";
    }

    @GetMapping("appointments")
    public String appointments() {
        return "appointments found";
    }
}
