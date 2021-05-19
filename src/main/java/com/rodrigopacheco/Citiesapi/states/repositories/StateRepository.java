package com.rodrigopacheco.Citiesapi.states.repositories;

import com.rodrigopacheco.Citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
