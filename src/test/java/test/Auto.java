package test;

public class Auto {
    public String modelo;
    public int precio;
    public Asiento[] asientos;
    public String marca;
    public Motor motor;
    public int registro;
    public static int cantidadCreados;

    public int cantidadAsientos() {
        int cantidad = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public String verificarIntegridad() {
        if (esIntegro()) {
            return "Auto original";
        }
        return "Las piezas no son originales";
    }

    private boolean esIntegro() {
        if (motor.registro != registro) {
            return false;
        }

        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.registro != registro) {
                return false;
            }
        }

        return true;
    }
}
