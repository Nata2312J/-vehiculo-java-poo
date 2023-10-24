package co.com.vehiculos.modelo;
import java.util.Scanner;
public abstract class Usuario implements UtilUsuario {
    Scanner sc=new Scanner(System.in);
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;

    //Constructor
    public Usuario(){
        super();
    }

    public Usuario(Scanner sc, int id, String nombre, String apellido, String correo, String contrasena) {
        this.sc = sc;
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public void crearusuario() {
        System.out.println("Ingrese su id: ");
        int id=sc.nextInt();
        setId(id);
        sc.skip("\n");
        System.out.println("Ingrese su nombre: ");
        String nombre=sc.nextLine();
        setNombre(nombre);
        System.out.println("Ingrese su apellido: ");
        apellido=sc.nextLine();
        setApellido(apellido);
        System.out.println("Ingrese su correo: ");
        String correo=sc.nextLine();
        setCorreo(correo);
        System.out.println("Ingrese su contraseña: ");
        contrasena=sc.nextLine();
        setContrasena(contrasena);
    }



    @Override
    public void verUsuario() {
        System.out.println("Id: " + getId() + "\nNombre: " + getNombre() + "\nApellido: " + getApellido() + "\nCorreo: " + getCorreo() + "\nContraseña: " + getContrasena());

    }
}
