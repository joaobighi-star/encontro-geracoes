package com.encontro.controller;

import com.encontro.model.Participante;
import com.encontro.repository.ParticipanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/participantes")
@CrossOrigin(origins = "*") // Permite que o seu site no GitHub acesse o backend
public class ParticipanteController {

    @Autowired
    private ParticipanteRepository repository;

    @PostMapping
    public Participante salvarParticipante(@RequestBody Participante participante) {
        return repository.save(participante);
    }

    @GetMapping
    public List<Participante> listarTodos() {
        return repository.findAll();
    }
}