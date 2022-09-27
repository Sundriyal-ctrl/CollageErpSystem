package com.collage_enterprise_resource_planning.studentservice;

import com.collage_enterprise_resource_planning.studentmodel.StudentDetails;
import com.collage_enterprise_resource_planning.studentmodel.StudentLiteDetails;
import com.collage_enterprise_resource_planning.studentrepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * this class providing crud services
 *
 * @author anuj sundriyal
 */
@Service
public class StudentServiceDaoImpl implements StudentServiceDao
{
    @Autowired
    StudentRepository studentRepository;



    public Optional<StudentDetails> getStudentDetails(int id)
    {
        return  studentRepository.findById(id);
    }

    public List<StudentLiteDetails> getStudentNameAndId()
    {
        return studentRepository.getStudentIdAndName();
    }
}
