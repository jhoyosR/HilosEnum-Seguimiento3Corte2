package org.example.domain;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Medico extends Thread {
    private String nombre;
    private List<String> pacientesAtendidos = new ArrayList<>();
    private Random random = new Random();

    public Medico(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        while (pacientesAtendidos.size() < 10) { // Atender a un número limitado de pacientes
            try {
                Thread.sleep(random.nextInt(1000)); // Tiempo de atención variable
                String paciente = Pacientes.values()[random.nextInt(Pacientes.values().length)].getNombre();
                pacientesAtendidos.add(paciente);
                System.out.println("El médico " + nombre + " ha atendido a " + paciente + ". Total pacientes atendidos: " + pacientesAtendidos.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public List<String> getPacientesAtendidos() {
        return pacientesAtendidos;
    }

    public String getNombre() {
        return nombre;
    }
}