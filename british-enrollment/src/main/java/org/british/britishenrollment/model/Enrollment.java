package org.british.britishenrollment.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author hp ON 02-11-2023
 * @Description
 **/

@Entity
@Table(name = "enrollment_details")
@Data
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer enrollmentId;
    private String ffNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String mobile;
    private String email;
    private String address;
    private String city;
    private String state;
    private String country;
    private String pincode;
    private String title;
    private String dob;
}
