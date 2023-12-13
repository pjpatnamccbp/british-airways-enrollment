package org.british.britishenrollment.service;

import org.british.britishenrollment.dto.EnrollmentRequest;
import org.british.britishenrollment.dto.EnrollmentResponse;

/**
 * @author hp ON 02-11-2023
 * @Description
 **/
public interface IEnrollmentService {
    EnrollmentResponse enrollment(EnrollmentRequest enrollmentRequest);
}
