package com.example.UnivercityEvent.EventController;

import com.example.UnivercityEvent.EventModel.Department;
import com.example.UnivercityEvent.EventModel.EventModel;
import com.example.UnivercityEvent.EventService.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class EventController {

        @Autowired
       EventService   eventService;

         @PostMapping("events")
         public String addEvent(@RequestBody  @Valid List<EventModel> myEvent){
             return  eventService.addEvent(myEvent);
         }

         @DeleteMapping("delete/id/{id}")
         public String removeEvent(@PathVariable List<Integer> id){
             return  eventService.removeEvent(id);
         }

     @PutMapping("update/department/id/{id}")
      public String updateEvent(@PathVariable Integer id, @RequestParam String myEvent){
         return  eventService.updateEvent(id,myEvent);
    }

   @GetMapping("/getAllEvents/date")
   public List<EventModel> getAllEvents(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date date){
    return eventService.getAllEvents(date);
   }

}
