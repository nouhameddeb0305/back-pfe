package com.spark.gmao.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.spark.gmao.exception.DemandeInterventionNotFoundException;
import com.spark.gmao.model.entity.DemandeIntervention;
import com.spark.gmao.repository.DemandeInterventionRepository;
import com.spark.gmao.service.DemandeInterventionService;

@Service
public class DemandeInterventionServiceImpl implements DemandeInterventionService{
	
	@Autowired
	private DemandeInterventionRepository demandeInterventionRepository;
	
	@Override
	public DemandeIntervention getDemandeIntervention(Long idI) {
		DemandeIntervention demandeIntervention = demandeInterventionRepository.findOne(idI);
		if(demandeIntervention == null) {
			throw new DemandeInterventionNotFoundException();
		}
		return demandeIntervention;
	}

	@Override
	public List<DemandeIntervention> getAllDemande() {
		return (List<DemandeIntervention>) demandeInterventionRepository.findAll();
	}
	
	@Transactional
	@Override
	public DemandeIntervention saveDemandeIntervention(DemandeIntervention demandeIntervention) {
		return demandeInterventionRepository.save(demandeIntervention);
		
	}

	@Override
	public void deleteDemandeIntervention(Long idI) {
		try {
			demandeInterventionRepository.delete(idI);
		} catch (EmptyResultDataAccessException e) {
			throw new DemandeInterventionNotFoundException();
		}
		
	}

	@Override
	public List<DemandeIntervention> getAllDemandeIntervention() {
		// TODO Auto-generated method stub
		return null;
	}


}
