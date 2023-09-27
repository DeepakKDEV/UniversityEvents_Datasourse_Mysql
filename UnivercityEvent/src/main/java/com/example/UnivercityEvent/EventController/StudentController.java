package com.example.UnivercityEvent.EventController;

import com.example.UnivercityEvent.EventModel.Department;
import com.example.UnivercityEvent.EventModel.StudentModel;
import com.example.UnivercityEvent.EventService.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

   @Autowired
    StudentService studentService;
   @PostMapping("students")
   public String addStudents(@RequestBody @Valid List<StudentModel> myStudent){
       return  studentService.addStudents(myStudent);
   }
   @GetMapping("getStudents")
   public List<StudentModel> getStudents(){
       return studentService.getStudents();
   }
   @GetMapping("get/students/id/{id}")
   public StudentModel getById(@PathVariable Integer id){
       return studentService.getById(id);
   }

    @DeleteMapping("users/ids")
    public String removeStudentByIds(@RequestBody List<Integer> ids)
    {
        return studentService.removeStudentByIds(ids);
    }
    @PutMapping("update/department/{id}")
    public String updateDepartment(@PathVariable Integer id, @RequestBody Department myDp){
           return  studentService.updateDepartment(id,myDp);
    }


}
