package org.example.application.service;
import org.example.domain.Pacientes;

public interface MedicoService {
    Pacientes obtenerPacientes(int id) throws Exception;

    Pacientes obtenerPacientes(String idPaciente) throws Exception;
    Pacientes guardarTodosPacientes(String nombre, int id) throws Exception;
}
