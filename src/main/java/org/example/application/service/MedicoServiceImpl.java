package org.example.aplication.service;

import org.example.application.service.MedicoService;
import org.example.domain.Pacientes;
import org.example.infraestructure.repository.MedicoRepositoryImpl;

public class MedicoServiceImpl implements MedicoService {
    MedicoRepositoryImpl medicoRepositoryImpl = new MedicoRepositoryImpl();

    @Override
    public Pacientes obtenerPacientes(int id) throws Exception {
        Pacientes paciente = medicoRepositoryImpl.findById(id);
        if (paciente == null) {
            throw new Exception("El paciente no existe");
        }
        return paciente;
    }

    public void guardarTodosPacientes() {
        for (Pacientes paciente : Pacientes.values()) {

            medicoRepositoryImpl.save(paciente);
        }
    }

    @Override
    public Pacientes obtenerPacientes(String idPaciente) throws Exception {
        return null;
    }

    @Override
    public Pacientes guardarTodosPacientes(String nombre, int id) throws Exception {
        return null;
    }
}