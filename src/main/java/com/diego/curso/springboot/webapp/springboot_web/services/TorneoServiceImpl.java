package com.diego.curso.springboot.webapp.springboot_web.services;

import com.diego.curso.springboot.webapp.springboot_web.models.Torneo;
import com.diego.curso.springboot.webapp.springboot_web.repositories.TorneoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TorneoServiceImpl implements TorneoService {

    @Autowired
    private TorneoRepository torneoRepository;

    @Override
    public List<Torneo> findAll() {
        return torneoRepository.findAll();
    }

    @Override
    public Optional<Torneo> findById(Long id) {
        return torneoRepository.findById(id);
    }

    @Override
    public Torneo save(Torneo torneo) {
        return torneoRepository.save(torneo);
    }

    @Override
    public void deleteById(Long id) {
        torneoRepository.deleteById(id);
    }
}
