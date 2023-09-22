package org.example.beans;


import org.example.entity.Applicant;
import org.example.repository.ApplicantRepository;
import org.example.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
public class ApplicantController {

    @Autowired
    ApplicantRepository applicantRepository;

    @Autowired
    ApplicantService applicantService;

    @Autowired
    Duck duck;

    @GetMapping("applicants")
    public List<Applicant> getApplicants() {
        return applicantRepository.findAll();
    }

    @PostMapping("applicants")
    public Applicant saveApplicant(Applicant applicant) {
        return applicantService.saveApplicant(applicant);
    }

    @GetMapping("applicants/{id}")
    public Applicant getSpecificApplicant(@PathVariable String id) {
        System.out.println(applicantRepository);
        Optional<Applicant> optionalApplicant= applicantRepository.findById(Integer.parseInt(id));

        if(!optionalApplicant.isEmpty()) {
            return optionalApplicant.get();
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

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
