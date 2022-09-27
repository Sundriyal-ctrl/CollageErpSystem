package com.collage_enterprise_resource_planning.studentmodel;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class StudentDetails {
    @Id
    private int id;
    private String name;
    private String collageName;
    private String studentCource;
    private String enrollNo;
    private String profilePic;
    @OneToOne
    private StudentAddress address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public String getStudentCource() {
        return studentCource;
    }

    public void setStudentCource(String studentCource) {
        this.studentCource = studentCource;
    }

    public String getEnrollNo() {
        return enrollNo;
    }

    public void setEnrollNo(String enrollNo) {
        this.enrollNo = enrollNo;
    }

    public StudentAddress getAddress() {
        return address;
    }

    public void setAddress(StudentAddress address) {
        this.address = address;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
}
