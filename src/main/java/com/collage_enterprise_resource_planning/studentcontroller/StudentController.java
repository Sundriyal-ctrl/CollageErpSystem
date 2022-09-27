package com.collage_enterprise_resource_planning.studentcontroller;
import com.collage_enterprise_resource_planning.exceptions.ResourceNotFoundException;
import com.collage_enterprise_resource_planning.studentmodel.StudentData;
import com.collage_enterprise_resource_planning.studentmodel.StudentDetails;
import com.collage_enterprise_resource_planning.studentmodel.StudentLiteDetails;
import com.collage_enterprise_resource_planning.studentservice.StudentServiceDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

/**
 * StudentController is used to route the request
 *
 * @author anuj sundriyal
 */
@RestController
public class StudentController {

      @Autowired
      StudentServiceDaoImpl studentService;


   @CrossOrigin
    @GetMapping("/user/{id}")
    public ResponseEntity getStudentDetails(@PathVariable  int id)
    {
        Optional<StudentDetails> optionalStudentDetails=studentService.getStudentDetails(id);

        if(optionalStudentDetails.isPresent()) {
            StudentDetails data=optionalStudentDetails.get();
            StudentData studentData=new StudentData();
            studentData.setStudentDetails(data);

            return new ResponseEntity(studentData, HttpStatus.OK);
        }
        else
            return new ResponseEntity(Optional.of(new ResourceNotFoundException().notFoundException("Invalid Id")),HttpStatus.NOT_FOUND);
    }

    @CrossOrigin
    @GetMapping("/user")
    public ResponseEntity getAllStudentNameAndId()
    {
        List<StudentLiteDetails> data=studentService.getStudentNameAndId();
        HashMap hashMap=new HashMap();
        if(data.size()>0) {
            hashMap.put("data", data);
            hashMap.put("error",null);
        }
        else {
            hashMap.put("data",null);
            hashMap.put("error","data not found");
        }
        return new ResponseEntity(hashMap,HttpStatus.OK);
    }

    @GetMapping("/**")
    public ResponseEntity error()
    {
        return new ResponseEntity(Optional.of(new ResourceNotFoundException().notFoundException("Invalid url")),HttpStatus.NOT_FOUND);
    }
}
