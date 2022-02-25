package org.generation.QuickTrip.reservations;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/reservation/")
public class reservationController {
    
    private final reservationService resService;

    @Autowired
    public reservationController(reservationService resService){
        this.resService = resService;
    }//constructor

    @GetMapping
    public List<reservation> getReservation(){
        return resService.getReservations();
    }

    @GetMapping(path = "{reservationId}")
    public reservation getReservation(@PathVariable("reservationId") Long reservationId){
        return resService.getReservation(reservationId);
    }//getReservation

    
    @DeleteMapping(path = "{reservationId}")
    public void deleteReservation(@PathVariable("reservationId") Long reservationId){
        resService.deleteReservation(reservationId);
    }//deleteReservation


    @PostMapping
    public void addReservation(){

    }//addReservation

    @PutMapping
    public void updateReservation(){

    }


}