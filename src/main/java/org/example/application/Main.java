package org.example.application;

import org.example.aplication.service.MedicoServiceImpl;
import org.example.domain.Medico;

public class Main {
    private static MedicoServiceImpl medicoService = new MedicoServiceImpl();
    public static void main(String[] args) {

        Medico medico1 = new Medico("Dr. García");
        Medico medico2 = new Medico("Dra. Martínez");


        medico1.start();
        medico2.start();


        try {
            medico1.join();
            medico2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Cantidad de pacientes atendidos por el " + medico1.getNombre() + ": " + medico1.getPacientesAtendidos().size());
        System.out.println("Pacientes atendidos por el " + medico1.getNombre() + ": " + medico1.getPacientesAtendidos());
        System.out.println("Cantidad de pacientes atendidos por la " + medico2.getNombre() + ": " + medico2.getPacientesAtendidos().size());
        System.out.println("Pacientes atendidos por la " + medico2.getNombre() + ": " + medico2.getPacientesAtendidos());
    }
}