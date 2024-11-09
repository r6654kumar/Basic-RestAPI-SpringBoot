package com.basic_restapi.Basic.RestAPI.SpringBoot.repository;
import com.basic_restapi.Basic.RestAPI.SpringBoot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    //ToDO
}
