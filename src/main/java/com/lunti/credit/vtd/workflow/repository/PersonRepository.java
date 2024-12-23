package com.lunti.credit.vtd.workflow.repository;

import com.lunti.credit.vtd.workflow.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByUsername(String username);

}