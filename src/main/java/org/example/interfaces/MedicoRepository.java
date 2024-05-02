package org.example.interfaces;

import org.example.domain.Pacientes;

public interface MedicoRepository {
    Pacientes[] findAll();
    Pacientes findById(int id);
    Pacientes save(Pacientes pacientes);
    Pacientes delete(int id);
}