package co.com.vehiculos.modelo;

public class TestVehiculoAereo {
    public static void main(String[] args) {
        VehiculoAereo va=new VehiculoAereo();
        Matricula matricula=new Matricula();
        Propietario propietario=new Propietario();

        va.matricula=matricula;
        va.propietario=propietario;

        va.generarVenta();
        va.facturaVenta();
    }
}
