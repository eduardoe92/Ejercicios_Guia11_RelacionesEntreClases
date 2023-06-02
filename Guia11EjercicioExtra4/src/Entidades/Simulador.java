package Entidades;

import Enumeraciones.Apellidos;
import Enumeraciones.Dni;
import Enumeraciones.Nombres;

import java.util.*;

public class Simulador {

    public List<Alumno> generarListaAlumnos() {
        List<Alumno> listaAlumnos = new ArrayList<>();

        List<Nombres> nombresDisponibles = new ArrayList<>(Arrays.asList(Nombres.values()));
        List<Apellidos> apellidosDisponibles = new ArrayList<>(Arrays.asList(Apellidos.values()));
        List<Dni> dniDisponibles = new ArrayList<>(Arrays.asList(Dni.values()));

        Collections.shuffle(nombresDisponibles);
        Collections.shuffle(apellidosDisponibles);
        Collections.shuffle(dniDisponibles);

        int cantidadAlumnos = Math.min(nombresDisponibles.size(), Math.min(apellidosDisponibles.size(), dniDisponibles.size()));

        for (int i = 0; i < cantidadAlumnos; i++) {
            Nombres nombre = nombresDisponibles.get(i);
            Apellidos apellido = apellidosDisponibles.get(i);
            Dni dni = dniDisponibles.get(i);

            Alumno alumno = new Alumno(nombre, apellido, dni, 0);
            listaAlumnos.add(alumno);
        }

        return listaAlumnos;
    }

    public void mostrarAlumnos(List<Alumno> listaAlumnos) {
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " DNI: " + alumno.getDni().getDni());
        }
    }

    public List<Voto> votacion(List<Alumno> listaAlumnos) {
        List<Voto> listaVotos = new ArrayList<>();
        Random random = new Random();

        for (Alumno alumnoQueVota : listaAlumnos) {
            Set<Alumno> alumnosVotados = new HashSet<>();
            alumnosVotados.add(alumnoQueVota);

            while (alumnosVotados.size() < 4) {
                int indiceAleatorio = random.nextInt(listaAlumnos.size());
                Alumno alumnoVotado = listaAlumnos.get(indiceAleatorio);

                if (alumnoVotado != alumnoQueVota) {
                    alumnosVotados.add(alumnoVotado);
                }
            }

            for (Alumno alumnoVotado : alumnosVotados) {
                alumnoVotado.setCantVotos(alumnoVotado.getCantVotos() + 1);
            }

            Voto voto = new Voto(alumnoQueVota, new ArrayList<>(alumnosVotados));
            listaVotos.add(voto);
        }

        return listaVotos;
    }

    public void mostrarResultadosVotacion(List<Voto> listaVotos) {
        for (Voto voto : listaVotos) {
            Alumno alumnoQueVota = voto.getAlumnoQueVota();
            List<Alumno> alumnosVotados = voto.getAlumnosVotados();

            System.out.println("Alumno: " + alumnoQueVota.getNombre() + " " + alumnoQueVota.getApellido() + " DNI: " + alumnoQueVota.getDni().getDni());
            System.out.println("Votos recibidos: " + alumnoQueVota.getCantVotos());
            System.out.println("Votos realizados:");

            int votosMostrados = 0;
            for (Alumno alumnoVotado : alumnosVotados) {
                if (votosMostrados < 3) {
                    System.out.println(alumnoVotado.getNombre() + " " + alumnoVotado.getApellido());
                    votosMostrados++;
                }
            }

            System.out.println("----------------------");
        }
    }

    public void realizarRecuentoVotos(List<Alumno> listaAlumnos, List<Voto> listaVotos) {
        for (Alumno alumno : listaAlumnos) {
            alumno.setCantVotos(0);
        }

        for (Voto voto : listaVotos) {
            Alumno alumnoQueVota = voto.getAlumnoQueVota();
            List<Alumno> alumnosVotados = voto.getAlumnosVotados();

            alumnoQueVota.setCantVotos(alumnoQueVota.getCantVotos() + alumnosVotados.size());

            for (Alumno alumnoVotado : alumnosVotados) {
                alumnoVotado.setCantVotos(alumnoVotado.getCantVotos() + 1);
            }
        }

        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " DNI: " + alumno.getDni().getDni());
            System.out.println("Cantidad de votos: " + alumno.getCantVotos());
            System.out.println("----------------------");
        }
    }

    public void crearFacilitadores(List<Alumno> listaAlumnos, List<Voto> listaVotos) {
        // Ordenar la lista de alumnos por la cantidad de votos en orden descendente
        Collections.sort(listaAlumnos, Comparator.comparingInt(Alumno::getCantVotos).reversed());

        List<Alumno> facilitadores = new ArrayList<>();
        List<Alumno> facilitadoresSuplentes = new ArrayList<>();

        // Obtener los 5 primeros alumnos más votados como facilitadores
        for (int i = 0; i < 5; i++) {
            facilitadores.add(listaAlumnos.get(i));
        }

        // Obtener los siguientes 5 alumnos más votados como facilitadores suplentes
        for (int i = 5; i < 10; i++) {
            facilitadoresSuplentes.add(listaAlumnos.get(i));
        }

        // Mostrar los facilitadores
        System.out.println("Facilitadores:");
        for (Alumno facilitador : facilitadores) {
            System.out.println(facilitador.getNombre() + " " + facilitador.getApellido() + " - Votos: " + facilitador.getCantVotos());
        }

        System.out.println("----------------------");

        // Mostrar los facilitadores suplentes
        System.out.println("Facilitadores Suplentes:");
        for (Alumno facilitadorSuplente : facilitadoresSuplentes) {
            System.out.println(facilitadorSuplente.getNombre() + " " + facilitadorSuplente.getApellido() + " - Votos: " + facilitadorSuplente.getCantVotos());
        }
    }

}
