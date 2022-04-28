package com.williamfranco.springdemocrudapi.repositories;

import com.williamfranco.springdemocrudapi.models.RolModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolRepository extends CrudRepository<RolModel, Long> {

}