package com.systemsmart.repository;
/*Author: @Phumelela Hoho
* <212195131@mycput.ac.za>
Description: Domain class description
* Date: 28/08/2020*/


import com.systemsmart.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UniversityRepository extends JpaRepository<University, Integer> {
}

