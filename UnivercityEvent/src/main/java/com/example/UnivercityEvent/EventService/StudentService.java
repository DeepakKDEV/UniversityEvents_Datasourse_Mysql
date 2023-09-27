package com.example.UnivercityEvent.EventService;


import com.example.UnivercityEvent.EventModel.Department;
import com.example.UnivercityEvent.EventModel.StudentModel;
import com.example.UnivercityEvent.EventRepo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepo iStudentRepo;

    public String addStudents(List<StudentModel> myStudent) {
        iStudentRepo.saveAll(myStudent);
        return "added Students";
    }

    public List<StudentModel> getStudents() {
      return (List<StudentModel>) iStudentRepo.findAll();
    }

    public StudentModel getById(Integer id) {
        return iStudentRepo.findById(id).get();
    }

    public String removeStudentByIds (List < Integer > id) {
        iStudentRepo.deleteAllById(id);
        return "delete by id one records student";
    }

    public String updateDepartment(Integer id, Department myDp) {
        StudentModel student=iStudentRepo.findById(id).orElse(null);
        if(student != null){
            student.setDepartment(myDp);
            iStudentRepo.save(student);
            return "department update";
        }
        return "miss match";
    }
}
