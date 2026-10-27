package com.sena.apiparkink.dto;

import com.sena.apiparkink.model.TipoVehiculo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record EspacioLoteRequest(@NotNull @Positive Integer desde, @NotNull @Positive Integer hasta,
		@NotNull TipoVehiculo tipo) {

}
