package com.sena.apiparkink.dto;

import com.sena.apiparkink.model.TipoVehiculo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record EntradaRequest(@NotBlank String placa, @NotNull TipoVehiculo tipo, @Size(max = 1000) String descripcion,
		@Positive Integer numeroEspacio) {

}
