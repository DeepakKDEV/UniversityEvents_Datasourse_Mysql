package com.example.UnivercityEvent.EventService;

import com.example.UnivercityEvent.EventModel.Department;
import com.example.UnivercityEvent.EventModel.EventModel;
import com.example.UnivercityEvent.EventModel.StudentModel;
import com.example.UnivercityEvent.EventRepo.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EventService {

      @Autowired
      IEventRepo   iEventRepo;

      public String addEvent(List<EventModel> myEvent) {
            iEventRepo.saveAll(myEvent);
            return "added Events";
      }

      //200
      public String removeEvent(List<Integer> id) {
            iEventRepo.deleteAllById(id);
         return  "delete one  record through id";
      }

      public String updateEvent(Integer id, String myEvent) {
                EventModel event=iEventRepo.findById(id).orElse(null);
            if(event != null){
                  event.setEventName(myEvent);
                iEventRepo.save(event);
                  return "event update";
            }
            return "miss match";
      }

   public  List<EventModel> getAllEvents(Date date) {
         return  iEventRepo.findByDate(date);
    }
}
