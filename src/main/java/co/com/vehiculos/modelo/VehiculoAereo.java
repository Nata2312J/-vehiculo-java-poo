package co.com.vehiculos.modelo;

public class VehiculoAereo extends Vehiculo{
    private String tipoAereonave;
    Propietario propietario;
    Matricula matricula;
    //Constructor

     public VehiculoAereo(){
         super();
     }
    public VehiculoAereo(String tipoAereonave) {
        this.tipoAereonave = tipoAereonave;
    }

    public VehiculoAereo(int idVehiculo, String tipo, String marca, String referencia, String modelo, String tipoAereonave) {
        super(idVehiculo, tipo, marca, referencia, modelo);
        this.tipoAereonave = tipoAereonave;
    }

    public VehiculoAereo(String tipo, String tipoAereonave) {
        super(tipo);
        this.tipoAereonave = tipoAereonave;
    }
    //Getter y setter

    public String getTipoAereonave() {
        return tipoAereonave;
    }

    public void setTipoAereonave(String tipoAereonave) {
        this.tipoAereonave = tipoAereonave;
    }

    @Override
    public void generarVenta() {
        super.generarVenta();
        System.out.println("ingrese el tipo de aereonave: " );
        tipoAereonave= sc.nextLine();
    }
    @Override
    public void facturaVenta() {
        super.facturaVenta();
        System.out.println("Tipo de aereonave: " + tipoAereonave);
        System.out.println("Nombre del propietario: " + propietario.getNombre());
        System.out.println("Numero de matricula: " + matricula.getMatricula());
    }

}
