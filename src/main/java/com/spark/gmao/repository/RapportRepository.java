package com.spark.gmao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spark.gmao.model.entity.Rapport;

@Repository
public interface RapportRepository extends CrudRepository<Rapport, Long>{

}
