
public class Usuario {
    private String idUsuario;
    private String nombre;
    private String email;
    private String password;
    private boolean activo;
    private String tipo;

    public Usuario(String idUsuario, String nombre, String email, String password) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.activo = false;
        this.tipo = "usuario";
    }

    public String getIdUsuario() { return idUsuario; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}