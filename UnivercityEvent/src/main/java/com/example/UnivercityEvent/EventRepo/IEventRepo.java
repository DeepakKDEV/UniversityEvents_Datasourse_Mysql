package com.example.UnivercityEvent.EventRepo;

import com.example.UnivercityEvent.EventModel.EventModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IEventRepo extends JpaRepository<EventModel,Integer> {

    List<EventModel> findByDate(Date date);

    //List<EventModel> findByEventData(Date eventDate);

}
