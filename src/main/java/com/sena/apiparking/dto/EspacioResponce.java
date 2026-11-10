package com.sena.apiparking.dto;

import com.sena.apiparking.model.EspacionParqueo;
import com.sena.apiparking.model.EstadoEspacio;
import com.sena.apiparking.model.TipoVehiculo;

public record EspacioResponce(Long idEspacio, Integer numero, TipoVehiculo tipo, EstadoEspacio estado) {
	
	public static EspacioResponce de (EspacionParqueo e) {
		return new EspacioResponce(e.getId_espacios(), e.getNumero(), e.getTipo(),e.getEstado());
	}

}
