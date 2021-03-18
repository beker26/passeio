package com.br.passeio.passeioapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.br.passeio.passeioapi.model.ThemeParkRide;

public interface ThemeParkRideRepository extends CrudRepository<ThemeParkRide, Long> {

	List<ThemeParkRide> findByName(String name);

}
