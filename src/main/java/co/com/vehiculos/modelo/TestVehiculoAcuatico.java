package co.com.vehiculos.modelo;

public class TestVehiculoAcuatico {

    public static void main(String[] args) {


        Propietario propietario = new Propietario();
        Matricula matricula = new Matricula();
        VehiculoAcuatico yateCarolG = new VehiculoAcuatico();

        yateCarolG.matricula = matricula;
        yateCarolG.propietario = propietario;

        yateCarolG.generarVenta();
        yateCarolG.facturaVenta();











    }



}
