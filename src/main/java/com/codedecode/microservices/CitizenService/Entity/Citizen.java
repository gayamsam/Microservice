package com.codedecode.microservices.CitizenService.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Citizen {
	
	public Citizen() {}
	
	public Citizen(int id, String name, int vaccinationCenterId) {
		super();
		this.id = id;
		this.name = name;
		this.vaccinationCenterId = vaccinationCenterId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column(name = "vaccinationCenterId")
	private int vaccinationCenterId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVaccinationCenterId() {
		return vaccinationCenterId;
	}

	public void setVaccinationCenterId(int vaccinationCenterId) {
		this.vaccinationCenterId = vaccinationCenterId;
	}

	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", vaccinationCenterId=" + vaccinationCenterId + "]";
	}
	

}
