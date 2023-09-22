package org.example.repository;

import org.example.entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant,Integer> {

    public List<Applicant> findApplicantByName(String name);

    public List<Applicant> findApplicantByNameAndAddress(String name,String address);

    @Query("SELECT a from Applicant a where a.id > 5")
    public List<Applicant> findApplicantIdGreaterThanFive();

}
