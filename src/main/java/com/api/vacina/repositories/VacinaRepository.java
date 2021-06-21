package com.api.vacina.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.vacina.entities.Vacina;

@Repository
public interface VacinaRepository extends CrudRepository<Vacina, Long> {

}
