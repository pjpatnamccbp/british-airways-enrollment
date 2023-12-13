package org.british.britishenrollment.dao;

import org.british.britishenrollment.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hp ON 02-11-2023
 * @Description
 **/
@Repository
public interface IEnrollmentRepository extends JpaRepository<Enrollment,String> {
}
