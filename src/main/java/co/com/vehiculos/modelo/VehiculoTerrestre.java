package co.com.vehiculos.modelo;

public class VehiculoTerrestre extends Vehiculo {
    private String categoria;
    Propietario propietario;
    Matricula matricula;

    public VehiculoTerrestre() {
        super();
    }

    //CONSTRUCTOR
    public VehiculoTerrestre(String categoria) {
        this.categoria = categoria;
    }

    public VehiculoTerrestre(int idVehiculo, String tipo, String marca, String referencia, String modelo, String categoria) {
        super(idVehiculo, tipo, marca, referencia, modelo);
        this.categoria = categoria;
    }

    public VehiculoTerrestre(String tipo, String categoria) {
        super(tipo);
        this.categoria = categoria;
    }

    //Getter setter

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void generarVenta() {
        super.generarVenta();
        System.out.println("Ingrese la categoria: ");
        categoria= sc.nextLine();
    }

    @Override
    public void facturaVenta() {
        super.facturaVenta();
        System.out.println("Categoria: " + categoria);
        System.out.println("Nombre cliente: "+ propietario.getNombre());
        System.out.println("Matricula: " + matricula.getMatricula());
        System.out.println( "Ciudad de matricula: " + matricula.getCiudad());

    }


}

