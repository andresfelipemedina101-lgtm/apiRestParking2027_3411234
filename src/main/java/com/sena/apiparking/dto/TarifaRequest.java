package com.sena.apiparking.dto;

import com.sena.apiparking.model.TipoVehiculo;



public record TarifaRequest(@NotNull TipoVehiculo tipo,
		@NotNull @PositiveOrZero Long valorHora,
		@NotNull @PositiveOrZero Long valorFraccion,
		@NotNull @Min(1) @Max(60) Integer fraccionMinutos) {

}
