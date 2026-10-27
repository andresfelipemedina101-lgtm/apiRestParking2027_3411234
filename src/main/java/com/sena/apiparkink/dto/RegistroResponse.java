package com.sena.apiparkink.dto;

import java.time.LocalDateTime;

import com.sena.apiparkink.model.RegistroParqueo;
import com.sena.apiparkink.model.TipoVehiculo;

public record RegistroResponse(Long idRegistro, String placa, TipoVehiculo tipoVehiculo, Integer numeroEspacio,
		LocalDateTime fechaEntrada, LocalDateTime fechaSalida, Double valorPagado, CobroDetalle cobro) {

	public static RegistroResponse de(RegistroParqueo r, CobroDetalle cobro) {
		return new RegistroResponse(r.getId_registro(), r.getVehiculo().getPlaca(), r.getVehiculo().getTipo(),
				r.getEspacio().getNumero(), r.getFechaEntrada(), r.getFechaSalida(), r.getValorPagadp(), cobro);
	}

}
