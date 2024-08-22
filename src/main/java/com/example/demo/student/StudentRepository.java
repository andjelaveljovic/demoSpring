package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository //dependancy injection part we want to use this interface inside service class, gledaj tamo
public interface StudentRepository  extends JpaRepository<Student, Long> {
//anything that is accessing database
    //select * from student email =...
   // @Query("SELECT S FROM student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);



}
