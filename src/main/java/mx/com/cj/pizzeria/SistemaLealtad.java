package mx.com.cj.pizzeria;

public class SistemaLealtad {

    private boolean estatusTajeta;
    private int saldoPuntos;
    private boolean estatusCupon = false;


    public boolean getEstatusTarjeta() {
        return this.estatusTajeta;
    }

    public void setEstatusTarjeta(boolean estatusTarjeta) {
        this.estatusTajeta = estatusTarjeta;
    }

    public int getSaldoPuntos() {
        return saldoPuntos;
    }

    public void setSaldoPuntos(int saldoPuntos) {
        this.saldoPuntos = saldoPuntos;
    }

    public boolean getEstatusCupon() {
        return estatusCupon;
    }

    public void setEstatusCupon(boolean estatusCupon) {
        this.estatusCupon = estatusCupon;
    }

    public String mostrarProductosExtras() {
        String productosExtras = "";

        if (getSaldoPuntos() >= 50 && getSaldoPuntos() <= 100) {
            productosExtras = "Espagueti";
        } else if (getSaldoPuntos() >= 101 && getSaldoPuntos() <= 150) {
            productosExtras = "Espagueti,Queso Extra";
        } else if (getSaldoPuntos() >= 150) {
            productosExtras = "Espagueti,Queso Extra,Cupon Pizza Gratis";
            setEstatusCupon(true);
        }

        return productosExtras;
    }

    public void usarCupon(String respuesta) {

        if (respuesta.equals("Y")) {
            setEstatusCupon(false);
        } else if (respuesta.equals("N")) {
            setEstatusCupon(true);
        } else {

        }
    }

}
