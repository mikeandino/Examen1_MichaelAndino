package examen1;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {

    private String usuario;
    private String password;
    private Date nacimiento;
    private int telefono;
    private String correo;
    private String nombre;
    private String genero;
    private String tipo = "Cliente";;
    ArrayList<Libro> libro = new ArrayList();
    ArrayList<Usuario> amigos = new ArrayList();

    public Usuario() {
    }

    public Usuario(String usuario, String password, Date nacimiento, int telefono, String correo, String nombre, String genero, String tipo) {
        this.usuario = usuario;
        this.password = password;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.nombre = nombre;
        this.genero = genero;
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public ArrayList<Libro> getLibro() {
        return libro;
    }

    public void setLibro(ArrayList<Libro> libro) {
        this.libro = libro;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", password=" + password + ", nacimiento=" + nacimiento + ", correo=" + correo + ", nombre=" + nombre + ", genero=" + genero + ", libro=" + libro + ", amigos=" + amigos + '}';
    }

}
