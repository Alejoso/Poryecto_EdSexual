import java.time.*; 

public class Recordatorio
{
	
	public String tituloRecordatorio;
	public String descripcionRecordatorio;
	public String tipoRecordatorio;
	public String tipoNotificacion;
	public boolean altaImportnacia;
	public LocalDate fechaRecordatorio;
	public LocalTime horaRecordatorio;
	public boolean recordarUnaVez;
	
	public Recordatorio(){
		super();
	}

        
	public void setImportancia(boolean importancia) {
		altaImportnacia = importancia;
			
	}
	
	
	
	public void setFecha(LocalDate nuevaFecha) {
                fechaRecordatorio = nuevaFecha;			
	}
	
	
	
	public void setHora(LocalTime nuevaHora) {
		horaRecordatorio = nuevaHora;
			
	}
	
	
	
	public void setRecordarUnaVez(boolean unaVez) {
		recordarUnaVez = unaVez;
			
	}


	public boolean getImportancia() {
		return altaImportnacia;	
	}
	
	
	
	public LocalDate getFecha() {
		return fechaRecordatorio;	
	}
	
	
	
	public LocalTime getHora() {
		return horaRecordatorio;	
	}
	
	
	
	public boolean getRecordarUnaVez() {
		// TODO implement me
		return recordarUnaVez;	
	}
	
	public void setTitulo(String nuevoTitulo) {
               tituloRecordatorio = nuevoTitulo; 
	}
	
	
	public void setDescripcion(String nuevaDescripcion) {
               descripcionRecordatorio = nuevaDescripcion; 
	}
	
	
	
	public void setTipoRecordatorio(String nuevoTipo) {
               tipoRecordatorio = nuevoTipo; 
	}
	
	
	
	public void setNotificacion(String nuevaNotificacion) {
               tipoNotificacion = nuevaNotificacion; 
	}
	
	
	
	public String getTitulo() {
		return tituloRecordatorio;	
	}
	
	
	
	public String getDescripcion() {
            return descripcionRecordatorio;	
	}
	
	
	
	public String getTipoRecordatorio() {
		return tipoRecordatorio;	
	}
	
	
	
	public String getNotificacion() {
		return tipoNotificacion;	
	}
	
	
	
}

