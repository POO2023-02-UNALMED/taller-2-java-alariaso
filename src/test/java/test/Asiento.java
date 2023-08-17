package test;

public class Asiento {
    public String color;
    public int precio;
    public int registro;

    public void cambiarColor(String color) {
        if (colorPermitido(color)) {
            this.color = color;
        }
    }

    private boolean colorPermitido(String color) {
        switch (color) {
            case "rojo":
            case "verde":
            case "amarillo":
            case "negro":
            case "blanco":
                return true;
            default:
                return false;
        }
    }
}
