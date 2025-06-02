package com.diego.curso.springboot.webapp.springboot_web.services;

import com.diego.curso.springboot.webapp.springboot_web.dto.*;

import java.time.LocalDate;
import java.util.List;

public interface ReporteService {

    List<IngresosPorPartidoDTO> obtenerIngresosPorPartido();

    List<IngresosPorEquipoDTO> obtenerIngresosPorEquipo();

    List<IngresosPorUbicacionDTO> obtenerIngresosPorUbicacion();

    List<IngresosPorFechaDTO> obtenerIngresosPorFecha(LocalDate fechaInicio, LocalDate fechaFin);

    List<EntradasVendidasPorTipoDTO> obtenerEntradasPorTipo();

    List<ComparacionEquipoTipoEntradaUbicacionDTO> obtenerComparacionEquipoTipoEntradaUbicacion();

    List<RankingPartidoExitosoDTO> obtenerRankingPartidos();

    List<RecomendacionCombinacionExitosaDTO> obtenerRecomendaciones();

    List<IngresosPorCategoriaDTO> obtenerIngresosPorCategoria();

    List<RentabilidadTorneoDTO> calcularRentabilidadPorTorneo();


}
