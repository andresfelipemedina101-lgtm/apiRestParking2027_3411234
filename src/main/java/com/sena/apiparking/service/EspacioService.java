package com.sena.apiparking.service;

import com.sena.apiparking.ApiRestParking2027Application;
import com.sena.apiparking.repository.VehiculoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sena.apiparking.dto.EspacioRequest;
import com.sena.apiparking.dto.EspacioResponce;
import com.sena.apiparking.model.EspacionParqueo;
import com.sena.apiparking.repository.EspacioParqueoRepository;
import com.sena.apiparking.repository.RegistroParqueoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class EspacioService {

	private final ApiRestParking2027Application apiRestParking2027Application;

	private final VehiculoRepository vehiculoRepository;

	private static final int MAX_LOTE = 500;

	private final EspacioParqueoRepository espacioRepo;
	private final RegistroParqueoRepository registroRepo;

	EspacioService(VehiculoRepository vehiculoRepository, ApiRestParking2027Application apiRestParking2027Application) {
		this.vehiculoRepository = vehiculoRepository;
		this.apiRestParking2027Application = apiRestParking2027Application;
	}

	@Transactional
	public EspacioResponce crear(EspacioRequest req) {
		if (espacioRepo.existsByNumero(req.numero())) {
			throw "Ya existe el espacio numero " + req.numero();
		}
		EspacionParqueo e = EspacionParqueo.builder().numero(req.numero()).tipo(req.tipo()).build();
		return EspacioResponce.de(espacioRepo.save(e));
	}
}