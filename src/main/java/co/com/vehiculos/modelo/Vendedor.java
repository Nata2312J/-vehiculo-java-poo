package co.com.vehiculos.modelo;

public class Vendedor extends Usuario {
    Usuario usuario;
    Propietario propietario=new Propietario();
    Gerente gerente;
    private String cargo;
    String tipoDeCliente= propietario.tipoDeCliente;
    Matricula matricula=new Matricula();
//Constructor

    public Vendedor(){

    }
    public Vendedor(String cargo) {
        this.cargo = cargo;
    }
    //getters and setter

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    //Metodos






    public void crearPropietario(){
        crearusuario();
        System.out.println("Ingrese el tipo de cliente: ");
        tipoDeCliente=sc.nextLine();
    }

    public void crearMatricula(){
        System.out.println("Ingrese el numero de matricula: ");
           matricula.matricula= sc.nextInt();
           sc.skip("\n");
           System.out.println("Ingrese la ciudad de matricula: ");
           matricula.ciudad=sc.nextLine();
    }
    public void verMatricula(){
        System.out.println("Numero de matricula: " + matricula.getMatricula());
        System.out.println("Ciudad de matricula: "+ matricula.getCiudad());
    }

}
