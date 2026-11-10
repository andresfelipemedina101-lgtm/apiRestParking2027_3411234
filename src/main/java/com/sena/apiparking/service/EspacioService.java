package com.sena.apiparking.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sena.apiparking.dto.EspacioRequest;
import com.sena.apiparking.dto.EspacioResponce;
import com.sena.apiparking.repository.EspacioParqueoRepository;
import com.sena.apiparking.repository.RegistroParqueoRepository;
import com.sena.apiparking.exception.ApiException;
import com.sena.apiparking.model.EspacioParqueo;

import lombok.RequiredArgsConstructor;

@Service

@RequiredArgsConstructor

public class EspacioService {

	private static final int MAX_LOTE = 500;

	private final EspacioParqueoRepository espacioRepo;
	private final RegistroParqueoRepository registroRepo;

	@Transactional
	public EspacioResponce crear(EspacioRequest req) {
		if (espacioRepo.existsByNumero(req.numero())) {
			throw ApiException.conflict("Ya existe el espacio numero " + req.numero());
		}

		EspacioParqueo e = EspacioParqueo.builder().numero(req.numero()).tipo(req.tipo()).build();
		return EspacioResponce.de(espacioRepo.save(e));

	}
}
