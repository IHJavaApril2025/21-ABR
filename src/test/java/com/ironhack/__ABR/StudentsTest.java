package com.ironhack.__ABR;

import com.ironhack.__ABR.repositories.StudentsRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentsTest {

    @Autowired
    public StudentsRepository studentsRepository;

    @Test
    @DisplayName("Recibimos todos los students")
    public void allStudents(){
        var allStudents = studentsRepository.findAll();
        System.out.println(allStudents);

        assertNotNull(allStudents);
    }
    
    @Test
    @DisplayName("Recibimos un double con la media de las notas")
    public void avgGrades(){
        double avg = studentsRepository.findAverageGrade();

        System.out.println("avg = " + avg);
        assertEquals(80.4444, avg);
    }

    @Test
    @DisplayName("Recibimos el total grade")
    public void totalGrade(){
        double total = studentsRepository.findTotalGrade();
        System.out.println("total = " + total);
        assertEquals(2896.0, total);
    }

    @Test
    @DisplayName("Recibimos la media de 80.8571 grade de un curso en CS101-A")
    public void courseGradeById(){
        double avg = studentsRepository.findAverageGradeByCourseId("CS101-A");

        System.out.println("avg = " + avg);
        assertEquals(80.8571, avg);
    }
}
