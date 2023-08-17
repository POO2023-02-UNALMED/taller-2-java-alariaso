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
        return switch (color) {
            case "rojo", "verde", "amarillo", "negro", "blanco" -> true;
            default -> false;
        };
    }
}
