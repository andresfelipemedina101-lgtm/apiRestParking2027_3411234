package com.sena.apiparkink.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sena.apiparkink.model.EspacionParqueo;
import com.sena.apiparkink.model.EstadoEspacio;
import com.sena.apiparkink.model.TipoVehiculo;

import jakarta.persistence.LockModeType;

public interface EspacioParqueoRepository extends JpaRepository<EspacionParqueo, Long> {
	
	@Query("select count (e)> 0 from EspacioParqueo e where e.numero = :numero")
	boolean existsByNumero(@Param("numero") Integer numero);
	
	@Lock(LockModeType.PESSIMISTIC_WRITE)
	Optional<EspacionParqueo> findFirstByTipoAndEstadoOrderByNumeroAsc(TipoVehiculo tipo, EstadoEspacio estado);
	
	@Lock(LockModeType.PESSIMISTIC_WRITE)
	@Query("select e from EspacioParqueo e where e.numero = :numero")
	Optional<EspacionParqueo> bloquearPorNumero(@Param("numero") Integer numero);
	
	

}
