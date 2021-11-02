package co.usa.recursosh.recursosh.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.recursosh.recursosh.model.Reservation;

import co.usa.recursosh.recursosh.repository.crud.ReservationCrudRepository;

@Repository
public class ReservationRepository {
    @Autowired
    ReservationCrudRepository reservationCrudRepository;
    
    public List<Reservation>getAll(){
        return (List<Reservation>)reservationCrudRepository.findAll();
        
    }

    public Optional<Reservation>getReservation(int id){
        return reservationCrudRepository.findById(id);
    }
    
    public Reservation save (Reservation rsvt){
        return reservationCrudRepository.save(rsvt);
    }

    public void delete(Reservation rsvt){
        reservationCrudRepository.delete(rsvt);
    }
}
