package org.british.britishenrollment.controller;

import org.british.britishenrollment.dto.EnrollmentRequest;
import org.british.britishenrollment.dto.EnrollmentResponse;
import org.british.britishenrollment.service.IEnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hp ON 02-11-2023
 * @Description
 **/
@RestController
@RequestMapping("/british-airways")
public class EnrollmentController {
    @Autowired
    private IEnrollmentService enrollmentService;

    @PostMapping("/enrollment")
    public EnrollmentResponse enrollment(@RequestBody EnrollmentRequest enrollmentRequest){
        return enrollmentService.enrollment(enrollmentRequest);
    }

}
