package com.unfit.api.repositories;


import com.unfit.api.model.Session;
import org.springframework.data.repository.CrudRepository;

public interface SessionRepository extends CrudRepository<Session,Long> {
}
