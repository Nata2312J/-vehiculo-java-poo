package co.com.vehiculos.modelo;

public class TestGerente {
    public static void main(String[] args) {
        Gerente gerente=new Gerente();
        Vendedor vendedor=new Vendedor();

        vendedor.usuario=gerente.usuario;
        vendedor.crearPropietario();
         gerente.verPropietario();
    }
}













































































































































































































































































