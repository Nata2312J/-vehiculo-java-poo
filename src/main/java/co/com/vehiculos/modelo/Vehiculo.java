package co.com.vehiculos.modelo;

import java.util.Scanner;

public abstract class Vehiculo implements FuncionVehiculo {

    Scanner sc = new Scanner(System.in);

    private int idVehiculo;

    private String tipo;

    private String marca;

    private String referencia;

    private String modelo;


    public Vehiculo(){

    }

    public Vehiculo(int idVehiculo, String tipo, String marca, String referencia, String modelo) {
        this.idVehiculo = idVehiculo;
        this.tipo = tipo;
        this.marca = marca;
        this.referencia = referencia;
        this.modelo = modelo;
    }

    public Vehiculo(String tipo){
        this.tipo = "Terrestre";
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    //Vamos a impplmentar los metodos


    @Override
    public boolean encenderVehiculo() {
        return false;
    }

    @Override
    public boolean encenderVehiculo(String control) {
        return false;
    }

    @Override
    public float acelerarVehiculo() {
        return 0;
    }

    @Override
    public float frenarVehiculo() {
        return 0;
    }

    public void generarVenta(){

        System.out.println("Id Vehiculo");
        int id= sc.nextInt();
        setIdVehiculo(id);
        sc.skip("\n");
        System.out.println("Tipo Vehiculo");
        String tipo = sc.nextLine();
        setTipo(tipo);
        System.out.println("Marca: ");
        String marca = sc.nextLine();
        setMarca(marca);
        System.out.println("Referencia: ");
        String ref = sc.nextLine();
        setReferencia(ref);
        System.out.println("Modelo: ");
        String modelo = sc.nextLine();
        setModelo(modelo);
    }

    public void facturaVenta(){

        System.out.println("Id: " + getIdVehiculo());
        System.out.println("Tipo Vehiculo" + getTipo());
        System.out.println("Marca: "  + getMarca());
        System.out.println("Referencia" + getReferencia());
        System.out.println("Modelo" + getModelo());

    }
}
