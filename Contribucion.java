
public class Contribucion {
    private String idContribucion;
    private double monto;
    private String fecha;
    private String usuarioId;
    private String proyectoId;

    public Contribucion(String idContribucion, double monto, String fecha, String usuarioId, String proyectoId) {
        this.idContribucion = idContribucion;
        this.monto = monto;
        this.fecha = fecha;
        this.usuarioId = usuarioId;
        this.proyectoId = proyectoId;
    }

    public String getIdContribucion() { return idContribucion; }
    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public String getUsuarioId() { return usuarioId; }
    public void setUsuarioId(String usuarioId) { this.usuarioId = usuarioId; }
    public String getProyectoId() { return proyectoId; }
    public void setProyectoId(String proyectoId) { this.proyectoId = proyectoId; }
}