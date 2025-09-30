package model;

public class Cita {
    private int fechaCita;
    private String especialidad, doctorAsociado, pacienteAsociado;

    public Cita(int fechaCita, String especialidad, String doctorAsociado, String pacienteAsociado) {
        this.fechaCita = fechaCita;
        this.especialidad = especialidad;
        this.doctorAsociado = doctorAsociado;
        this.pacienteAsociado = pacienteAsociado;
    }

    public Cita() {
    }

    public void mostrarDatos(){
        System.out.println("fechaCita = " + fechaCita);
        System.out.println("especialidad = " + especialidad);
        System.out.println("doctorAsociado = " + doctorAsociado);
        System.out.println("pacienteAsociado = " + pacienteAsociado);
    }

    public int getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(int fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDoctorAsociado() {
        return doctorAsociado;
    }

    public void setDoctorAsociado(String doctorAsociado) {
        this.doctorAsociado = doctorAsociado;
    }

    public String getPacienteAsociado() {
        return pacienteAsociado;
    }

    public void setPacienteAsociado(String pacienteAsociado) {
        this.pacienteAsociado = pacienteAsociado;
    }
}
