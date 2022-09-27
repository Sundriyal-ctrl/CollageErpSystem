package com.collage_enterprise_resource_planning.studentservice;

import com.collage_enterprise_resource_planning.studentmodel.StudentDetails;

import java.util.Optional;

public interface StudentServiceDao {

    Optional<StudentDetails> getStudentDetails(int id);
}
