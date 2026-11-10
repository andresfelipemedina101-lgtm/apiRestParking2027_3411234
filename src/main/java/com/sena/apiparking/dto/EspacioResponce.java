package com.sena.apiparking.dto;

import com.sena.apiparking.model.EspacioParqueo;
import com.sena.apiparking.model.EstadoEspacio;
import com.sena.apiparking.model.TipoVehiculo;

public record EspacioResponce(Long idEspacio, Integer numero, TipoVehiculo tipo, EstadoEspacio estado) {
	
	public static EspacioResponce de (EspacioParqueo e) {
		return new EspacioResponce(e.getId_espacios(), e.getNumero(), e.getTipo(),e.getEstado());
	}

}
