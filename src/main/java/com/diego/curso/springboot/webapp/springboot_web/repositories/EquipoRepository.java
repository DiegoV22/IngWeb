package com.diego.curso.springboot.webapp.springboot_web.repositories;
import java.util.List;

import com.diego.curso.springboot.webapp.springboot_web.models.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {
    List<Equipo> findByTorneoId(Long torneoId);

}
