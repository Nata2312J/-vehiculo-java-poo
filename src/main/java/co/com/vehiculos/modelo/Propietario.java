package co.com.vehiculos.modelo;

public class Propietario extends Usuario{
    Vendedor vendedor;
    Propietario propietario;

    protected String tipoDeCliente;
    public Propietario(){

    }

    public Propietario(String TipoDeCliente) {
        tipoDeCliente = TipoDeCliente;
    }
    //Getter and setter


    public String getTipoDeCliente() {
        return tipoDeCliente;
    }

    public void setTipoDeCliente() {
        String TipoDeCliente;
    }


}
