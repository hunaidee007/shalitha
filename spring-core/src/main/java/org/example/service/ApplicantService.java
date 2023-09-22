package org.example.service;

import org.example.entity.Applicant;
import org.example.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicantService {

    @Autowired
    ApplicantRepository applicantRepository;

    public Applicant saveApplicant(Applicant applicant) {
        if(applicant.getName().startsWith("A")) {
            applicant.setName("B");
        }
        return applicantRepository.save(applicant);
    }
}
