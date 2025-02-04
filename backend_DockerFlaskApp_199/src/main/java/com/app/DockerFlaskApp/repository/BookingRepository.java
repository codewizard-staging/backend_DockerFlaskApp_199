package com.app.DockerFlaskApp.repository;

import com.app.DockerFlaskApp.model.Booking;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class BookingRepository extends SimpleJpaRepository<Booking, String> {
    private final EntityManager em;
    public BookingRepository(EntityManager em) {
        super(Booking.class, em);
        this.em = em;
    }
    @Override
    public List<Booking> findAll() {
        return em.createNativeQuery("Select * from \"dockerflaskapp\".\"Booking\"", Booking.class).getResultList();
    }
}