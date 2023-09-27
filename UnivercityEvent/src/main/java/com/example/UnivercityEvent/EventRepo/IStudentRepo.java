package com.example.UnivercityEvent.EventRepo;

import com.example.UnivercityEvent.EventModel.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepo extends JpaRepository<StudentModel,Integer> {


}
