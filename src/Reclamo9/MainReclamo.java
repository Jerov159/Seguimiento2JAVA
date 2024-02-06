package Reclamo9;

import javax.swing.text.StyledEditorKit;

public class MainReclamo {
    public int numeroReclamo;
    private String nombrePersona;
    private String asunto;          //publicas y privadas
    public String descripcionReclamo;
    private Boolean estadoReclamo;
//constructor
    public MainReclamo(int numeroReclamo, String nombrePersona, String asunto, String descripcionReclamo) {
        this.numeroReclamo = numeroReclamo;
        this.nombrePersona = nombrePersona;
        this.asunto = asunto;
        this.descripcionReclamo = descripcionReclamo;
        this.estadoReclamo = false; // Inicialmente, el reclamo está pendiente
    }
    public void validarEstadoReclamo() {
        if (estadoReclamo) {
            System.out.println("El reclamo #" + numeroReclamo + " está resuelto.");
        } else {
            System.out.println("El reclamo #" + numeroReclamo + " está pendiente de resolución.");
        }
    }
    public void mensajeRecepcionReclamo() {
        System.out.println("Reclamo #" + numeroReclamo + " recibido. Asunto: " + asunto);
    }
    public void marcarReclamoResuelto() {
        estadoReclamo = true;
        System.out.println("Reclamo #" + numeroReclamo + " marcado como resuelto.");
    }

    // Método para obtener el nombre de la persona
    public String getNombrePersona() {
        return nombrePersona;
    }
    public void setEstadoReclamo(boolean estado) {
        this.estadoReclamo = estado;
    }
}

