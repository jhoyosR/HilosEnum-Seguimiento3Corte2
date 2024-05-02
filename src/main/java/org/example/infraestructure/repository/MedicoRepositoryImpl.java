package org.example.infraestructure.repository;

import org.example.domain.Pacientes;
import org.example.interfaces.MedicoRepository;

import java.io.*;

public class MedicoRepositoryImpl implements MedicoRepository {
    private static final String RUTA_ARCHIVO = "Medicos.dat";

    public Pacientes[] findAll() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(RUTA_ARCHIVO))) {
            return (Pacientes[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return Pacientes.values();
        }}

    @Override
    public Pacientes findById(int id) {
        for (Pacientes paciente : Pacientes.values()) {
            if (paciente.getId() == id) {
                return paciente;
            }
        }
        return null;
    }

    @Override
    public Pacientes save(Pacientes pacientes) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RUTA_ARCHIVO, true))) {
            oos.writeObject(pacientes);
            oos.flush();
        } catch (IOException e) {
            System.err.println("Error al guardar el paciente: " + e.getMessage());
        }
        return pacientes;
    }

    @Override
    public Pacientes delete(int id) {
        return null;
    }
}