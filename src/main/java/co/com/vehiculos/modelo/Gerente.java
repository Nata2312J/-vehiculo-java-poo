package co.com.vehiculos.modelo;

public class Gerente extends Usuario {
    Usuario usuario;
    Gerente gerente;
    Vendedor vendedor=new Vendedor();
    Propietario propietario=new Propietario();

    @Override
        public void verUsuario() {
            super.verUsuario();
        }


    public void verPropietario(){
        vendedor.verUsuario();
        System.out.println("El tipo de cliente es: ");
        System.out.println(vendedor.tipoDeCliente);
    }

}
