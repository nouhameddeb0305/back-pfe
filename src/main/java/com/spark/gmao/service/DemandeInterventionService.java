package com.spark.gmao.service;

import java.util.List;

import com.spark.gmao.model.entity.DemandeIntervention;

public interface DemandeInterventionService {

	DemandeIntervention getDemandeIntervention(Long idI);

	List<DemandeIntervention> getAllDemande();

	DemandeIntervention saveDemandeIntervention(DemandeIntervention demandeIntervention);

	void deleteDemandeIntervention(Long idI);

	List<DemandeIntervention> getAllDemandeIntervention();

	

}
