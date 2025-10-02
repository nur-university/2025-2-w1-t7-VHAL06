
public class Proyecto {
    private String idProyecto;
    private String titulo;
    private String descripcion;
    private double metaFinanciacion;
    private double montoRecaudado;
    private String fechaCreacion;
    private String fechaLimite;
    private String usuarioId;
    private String categoriaId;
    private String estado;

    public Proyecto(String idProyecto, String titulo, String descripcion, double metaFinanciacion, String usuarioId, String categoriaId) {
        this.idProyecto = idProyecto;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.metaFinanciacion = metaFinanciacion;
        this.montoRecaudado = 0;
        this.usuarioId = usuarioId;
        this.categoriaId = categoriaId;
        this.estado = "borrador";
    }

    public String getIdProyecto() { return idProyecto; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public double getMetaFinanciacion() { return metaFinanciacion; }
    public void setMetaFinanciacion(double metaFinanciacion) { this.metaFinanciacion = metaFinanciacion; }
    public double getMontoRecaudado() { return montoRecaudado; }
    public void setMontoRecaudado(double montoRecaudado) { this.montoRecaudado = montoRecaudado; }
    public String getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(String fechaCreacion) { this.fechaCreacion = fechaCreacion; }
    public String getFechaLimite() { return fechaLimite; }
    public void setFechaLimite(String fechaLimite) { this.fechaLimite = fechaLimite; }
    public String getUsuarioId() { return usuarioId; }
    public void setUsuarioId(String usuarioId) { this.usuarioId = usuarioId; }
    public String getCategoriaId() { return categoriaId; }
    public void setCategoriaId(String categoriaId) { this.categoriaId = categoriaId; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}