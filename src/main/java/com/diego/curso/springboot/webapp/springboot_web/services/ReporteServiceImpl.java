package com.diego.curso.springboot.webapp.springboot_web.services;

import com.diego.curso.springboot.webapp.springboot_web.dto.*;
import com.diego.curso.springboot.webapp.springboot_web.repositories.ReporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReporteServiceImpl implements ReporteService {

    @Autowired
    private ReporteRepository reporteRepository;

    @Override
    public List<IngresosPorPartidoDTO> obtenerIngresosPorPartido() {
        return reporteRepository.obtenerIngresosPorPartido();
    }

    @Override
    public List<IngresosPorEquipoDTO> obtenerIngresosPorEquipo() {
        return reporteRepository.obtenerIngresosPorEquipo();
    }

    @Override
    public List<IngresosPorUbicacionDTO> obtenerIngresosPorUbicacion() {
        return reporteRepository.obtenerIngresosPorUbicacion();
    }

    @Override
    public List<IngresosPorFechaDTO> obtenerIngresosPorFecha(LocalDate fechaInicio, LocalDate fechaFin) {
        return reporteRepository.obtenerIngresosPorFecha(fechaInicio, fechaFin);
    }

    @Override
    public List<EntradasVendidasPorTipoDTO> obtenerEntradasPorTipo() {
        return reporteRepository.obtenerEntradasPorTipo();
    }

    @Override
    public List<ComparacionEquipoTipoEntradaUbicacionDTO> obtenerComparacionEquipoTipoEntradaUbicacion() {
        return reporteRepository.obtenerComparacionEquipoTipoEntradaUbicacion();
    }

    @Override
    public List<RankingPartidoExitosoDTO> obtenerRankingPartidos() {
        return reporteRepository.obtenerRankingPartidos();
    }

    @Override
    public List<RecomendacionCombinacionExitosaDTO> obtenerRecomendaciones() {
        return reporteRepository.obtenerRecomendaciones();
    }
    @Override
public List<IngresosPorCategoriaDTO> obtenerIngresosPorCategoria() {
    return reporteRepository.obtenerIngresosPorCategoria();
}

@Override
public List<RentabilidadTorneoDTO> calcularRentabilidadPorTorneo() {
    return reporteRepository.calcularRentabilidadPorTorneo();
}


}
