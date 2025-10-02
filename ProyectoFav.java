
public class ProyectoFav {
    private String usuarioId;
    private String proyectoId;

    public ProyectoFav(String usuarioId, String proyectoId) {
        this.usuarioId = usuarioId;
        this.proyectoId = proyectoId;
    }

    public String getUsuarioId() { return usuarioId; }
    public void setUsuarioId(String usuarioId) { this.usuarioId = usuarioId; }
    public String getProyectoId() { return proyectoId; }
    public void setProyectoId(String proyectoId) { this.proyectoId = proyectoId; }
}