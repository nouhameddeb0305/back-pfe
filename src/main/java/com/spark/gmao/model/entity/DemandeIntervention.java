package com.spark.gmao.model.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "DEMANDEINTERVENTION")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class DemandeIntervention implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idI;
	
	@Column(name = "TYPE", length = 50, nullable = false)
	 private String type;
	
	 
	 @Column(name = "MODULE", length = 50, nullable = false)
	 private String module;
	 
	 @Column(name = "ETAT", length = 50, nullable = false)
	 private String etat;
	 
	 @OneToMany(mappedBy = "demandeIntervention", fetch = FetchType.LAZY)
	   private Set<Diagnostic> diagnostics;
	 
	 @OneToMany(mappedBy = "demandeIntervention", fetch = FetchType.LAZY)
	   private Set<MaintenancePreventive> maintenancePreventives;
 
	 @ManyToOne(fetch = FetchType.LAZY)
	   @JoinColumn(name ="idM")
	   private Machine machine;
	
}
