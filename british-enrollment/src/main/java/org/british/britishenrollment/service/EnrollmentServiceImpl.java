package org.british.britishenrollment.service;

import org.british.britishenrollment.dao.IEnrollmentRepository;
import org.british.britishenrollment.dto.EnrollmentRequest;
import org.british.britishenrollment.dto.EnrollmentResponse;
import org.british.britishenrollment.model.Enrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author hp ON 02-11-2023
 * @Description
 **/
@Service
public class EnrollmentServiceImpl implements IEnrollmentService{
    @Autowired
    private IEnrollmentRepository enrollmentRepository;
    @Override
    public EnrollmentResponse enrollment(EnrollmentRequest enrollmentRequest) {
        String ffNumber = generateFfNumber();
        enrollmentRepository.save(buildEnrollmentFromRequest(enrollmentRequest,ffNumber));
        return buildEnrollmentResponse(ffNumber);
    }

    private EnrollmentResponse buildEnrollmentResponse(String ffNumber) {
        EnrollmentResponse enrollmentResponse = new EnrollmentResponse();
        enrollmentResponse.setResponseCode("0");
        enrollmentResponse.setResponseMessage("enrolled with british airways");
        enrollmentResponse.setFfNumber(ffNumber);
        return enrollmentResponse;
    }

    private Enrollment buildEnrollmentFromRequest(EnrollmentRequest enrollmentRequest, String ffNumber) {
        Enrollment enrollment = new Enrollment();

        enrollment.setFirstName(enrollmentRequest.getFirstName());
        enrollment.setLastName(enrollmentRequest.getLastName());
        enrollment.setMiddleName(enrollmentRequest.getMiddleName());
        enrollment.setCity(enrollmentRequest.getCity());
        enrollment.setCountry(enrollmentRequest.getCountry());
        enrollment.setState(enrollmentRequest.getState());
        enrollment.setTitle(enrollmentRequest.getTitle());
        enrollment.setMobile(enrollmentRequest.getMobile());
        enrollment.setGender(enrollmentRequest.getGender());
        enrollment.setPincode(enrollmentRequest.getPincode());
        enrollment.setEmail(enrollmentRequest.getEmail());
        enrollment.setAddress(enrollmentRequest.getAddress());
        enrollment.setFfNumber(ffNumber);
        return enrollment;
    }

    private String generateFfNumber() {
        Random random = new Random();
        int num = random.nextInt(900000)+100000;
        return "BAIR"+num;
    }
}
