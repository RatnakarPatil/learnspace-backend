package com.learnspace.mentor_service.repository;

import com.learnspace.mentor_service.dtos.ClassroomDTO;
import com.learnspace.mentor_service.pojos.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassroomRepo extends JpaRepository<Classroom, Long> {
    boolean existsByClassroomCode(String classroomCode);

    List<Classroom> findByMentorUserId(Long mentorId);
}

//List<ClassroomDTO> findByMentorUserId(Long mentorId);