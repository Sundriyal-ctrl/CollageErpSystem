package com.collage_enterprise_resource_planning.studentrepository;

import com.collage_enterprise_resource_planning.studentmodel.StudentDetails;
import com.collage_enterprise_resource_planning.studentmodel.StudentLiteDetails;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

/**
 * This class is used to manipulate student record
 *
 * @author anuj sundriyal
 */
public interface StudentRepository extends CrudRepository<StudentDetails,Integer> {
    @Query("select new com.collage_enterprise_resource_planning.studentmodel.StudentLiteDetails(s.id,s.name) from StudentDetails s")
     List<StudentLiteDetails> getStudentIdAndName();
}
