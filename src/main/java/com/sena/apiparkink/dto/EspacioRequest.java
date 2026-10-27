package com.sena.apiparkink.dto;

import com.sena.apiparkink.model.TipoVehiculo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record EspacioRequest(@NotNull @Positive Integer numero, @NotNull TipoVehiculo tipo) {

}
