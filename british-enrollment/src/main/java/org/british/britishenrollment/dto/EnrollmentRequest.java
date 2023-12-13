package org.british.britishenrollment.dto;

import lombok.Data;

/**
 * @author hp ON 02-11-2023
 * @Description
 **/
@Data
public class EnrollmentRequest {
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String mobile;
    private String email;
    private String dob;
    private String address;
    private String city;
    private String state;
    private String country;
    private String pincode;
    private String title;
}
