package co.com.vehiculos.modelo;

public class TestVehiculoTerrestre {
    public static void main(String[] args) {
        Propietario propietario=new Propietario();
        Matricula matricula=new Matricula();
        VehiculoTerrestre vt=new VehiculoTerrestre();
        vt.generarVenta();
        vt.facturaVenta();

        vt.matricula=matricula;
        vt.propietario=propietario;


    }
}
