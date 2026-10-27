package com.sena.apiparkink.dto;

public record CobroDetalle(Long idTarifa, Long minutosTotales, Long horasTotales, Long fraccionCobrada, Long tarifaHora,
		Long tarifaFraccion, int tarifaMinutos, Long valorTotal) {

}
