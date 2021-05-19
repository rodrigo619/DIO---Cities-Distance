package com.rodrigopacheco.Citiesapi.countries.repositories;

import com.rodrigopacheco.Citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
