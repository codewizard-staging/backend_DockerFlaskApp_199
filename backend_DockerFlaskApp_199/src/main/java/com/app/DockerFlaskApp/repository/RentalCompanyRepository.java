package com.app.DockerFlaskApp.repository;

import com.app.DockerFlaskApp.model.RentalCompany;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class RentalCompanyRepository extends SimpleJpaRepository<RentalCompany, String> {
    private final EntityManager em;
    public RentalCompanyRepository(EntityManager em) {
        super(RentalCompany.class, em);
        this.em = em;
    }
    @Override
    public List<RentalCompany> findAll() {
        return em.createNativeQuery("Select * from \"dockerflaskapp\".\"RentalCompany\"", RentalCompany.class).getResultList();
    }
}