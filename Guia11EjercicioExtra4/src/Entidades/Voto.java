package Entidades;

import java.util.List;

public class Voto {
    private Alumno votoAlumno;
    private List<Alumno> alumnosVotados;

    public Voto(Alumno votoAlumno, List<Alumno> alumnosVotados) {
        this.votoAlumno = votoAlumno;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumnoQueVota() {
        return votoAlumno;
    }

    public void setAlumnoQueVota(Alumno votoAlumno) {
        this.votoAlumno = votoAlumno;
    }

    public List<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(List<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }
}