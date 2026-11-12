package com.sena.apiparking.config;

import java.time.ZoneId;
import java.time.LocalDateTime;

public class ZonaHoraria {

	public static final ZoneId ZONA = ZoneId.of("America/Bogota");

	private ZonaHoraria() {

	}

	public static LocalDateTime ahora() {
		return LocalDateTime.now(ZONA);
	}
}
