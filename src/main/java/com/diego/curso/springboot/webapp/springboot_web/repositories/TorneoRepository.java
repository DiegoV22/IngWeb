package com.diego.curso.springboot.webapp.springboot_web.repositories;

import com.diego.curso.springboot.webapp.springboot_web.models.Torneo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TorneoRepository extends JpaRepository<Torneo, Long> {
    // Aquí puedes agregar métodos personalizados si los necesitas
}