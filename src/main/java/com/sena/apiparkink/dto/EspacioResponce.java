package com.sena.apiparkink.dto;

import com.sena.apiparkink.model.EspacionParqueo;
import com.sena.apiparkink.model.EstadoEspacio;
import com.sena.apiparkink.model.TipoVehiculo;

public record EspacioResponce(Long idEspacio, Integer numero, TipoVehiculo tipo, EstadoEspacio estado) {
	
	public static EspacioResponce de (EspacionParqueo e) {
		return new EspacioResponce(e.getId_espacios(), e.getNumero(), e.getTipo(),e.getEstado());
	}

}
