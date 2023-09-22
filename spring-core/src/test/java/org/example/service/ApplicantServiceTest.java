package org.example.service;

import org.example.beans.ApplicantController;
import org.example.entity.Applicant;
import org.example.repository.ApplicantRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.containsString;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
@SpringBootTest
@AutoConfigureMockMvc
class ApplicantServiceTest {
    @Autowired
    private MockMvc mockMvc;

    @Mock
    ApplicantRepository applicantRepository;

    @InjectMocks
    //@Autowired
    ApplicantController applicantController;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {

        Applicant applicant = new Applicant();
        applicant.setName("Shalitha");
        applicant.setAddress("Srilanka");

       when(applicantRepository.findById(any())).thenReturn(Optional.of(applicant));
        Applicant returnedApplicant = applicantController.getSpecificApplicant("1");
        assertThat(returnedApplicant).isNotNull();

    }
}