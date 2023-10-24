package co.com.vehiculos.modelo;

import java.util.Scanner;

public class VehiculoAcuatico extends Vehiculo {
    Scanner sc = new Scanner(System.in);

    private int numeroMotores;
    Propietario propietario;
    Matricula matricula;


    //Constructor

    public VehiculoAcuatico(){
        super();
    }

    public VehiculoAcuatico(int idVehiculo, String tipo, String marca, String referencia, String modelo, int numeroMotores) {
        super(idVehiculo, tipo, marca, referencia, modelo);
        this.numeroMotores = numeroMotores;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    @Override
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
        System.out.println("Numero de motores: ");
        numeroMotores = sc.nextInt();
    }

    @Override
    public void facturaVenta(){
        System.out.println("Id: " + getIdVehiculo());
        System.out.println("Tipo Vehiculo" + getTipo());
        System.out.println("Marca: "  + getMarca());
        System.out.println("Referencia" + getReferencia());
        System.out.println("Modelo" + getModelo());
        System.out.println("Numero de motores" + numeroMotores);
        System.out.println("Propietario" + propietario.getNombre());
        System.out.println("Numero de matricula" + matricula.getMatricula() );
        System.out.println("Ciudad de Matricula:" + matricula.getCiudad());
    }

}
