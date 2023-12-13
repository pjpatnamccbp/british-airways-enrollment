package org.british.britishenrollment.dto;

import lombok.Data;

/**
 * @author hp ON 02-11-2023
 * @Description
 **/
@Data
public class EnrollmentResponse {
    private String responseCode;
    private String responseMessage;
    private String ffNumber;
}
