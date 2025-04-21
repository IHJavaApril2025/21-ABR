package com.ironhack.__ABR.repositories;

import com.ironhack.__ABR.models.StudentsCourses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<StudentsCourses, Integer> {

    // ESTA ES JPQL
    @Query("SELECT AVG(grade) FROM StudentsCourses")
    double findAverageGrade(); // este nombre será el que queramos

    //ESTA ES SQL NATIVO ( tal cual lo haríamos en SQL o MySQL)
    @Query(value = "SELECT SUM(grade) FROM students_courses", nativeQuery = true)
    double findTotalGrade();

    //JPQL Imaginemos que queremos pedir info de un CourseID en particular
    @Query("SELECT AVG(grade) FROM StudentsCourses WHERE courseId = :courseId")
    double findAverageGradeByCourseId(@Param("courseId") String courseId);


}
