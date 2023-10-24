package co.com.vehiculos.modelo;

public class TestVendedor {
    public static void main(String[] args) {
        Propietario propietario=new Propietario();
        Matricula matricula=new Matricula();
        Gerente gerente=new Gerente();
        Vendedor vendedor= new Vendedor();
        vendedor.propietario=propietario;
        gerente.propietario=propietario;

        vendedor.usuario=gerente.usuario;
        vendedor.crearPropietario();
        gerente.verPropietario();

    }
}
