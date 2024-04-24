import java.util.ArrayList;
import java.time.*; 
import javax.swing.JOptionPane;

public class Notificacion
{
        public ArrayList<Recordatorio>recordatorios = new ArrayList<>();
    
	public Notificacion(){
		super();
	}
        

        public void agregarRecordatorioAlArray (Recordatorio recordatorioParaAgregar) {
            recordatorios.add(recordatorioParaAgregar);
        }
        
	public void generarNotificacion(boolean tiempoComparado) {
            
            //Buscamos cual es el index de la notificacion que cumple
            
            int indexDeseado = 0;
            LocalTime horaYa = LocalTime.now();
                
            String horaActual = horaYa.toString().substring(0 ,5);
                
            for (int i = 0 ; i < recordatorios.size() ; i++) {
                LocalTime hora = recordatorios.get(i).getHora();
                String horaDeseada = hora.toString().substring(0 , 5);
                    
                if (horaActual.equals(horaDeseada))
                {
                    indexDeseado = i;
                    break;
                }
            }
            
            //Generamos la notificacion
            
            if (tiempoComparado == true && recordatorios.get(indexDeseado).getNotificacion().equals("Alerta")) {
                JOptionPane.showMessageDialog(null, recordatorios.get(indexDeseado).getDescripcion(), recordatorios.get(indexDeseado).getTitulo(), JOptionPane.PLAIN_MESSAGE);
            } 
	}
        
        
       
        
         public boolean compararTimepo() {
		boolean tiempoDeseado = false;
                
                LocalTime horaYa = LocalTime.now();
                LocalDate fechaYa = LocalDate.now();
                
                String horaActual = horaYa.toString().substring(0 ,5);
                String fechaActual = fechaYa.toString();
                
                //Iteramos por todas las horas y fechas y devuelve true cuando encuentra una hora igual a la del pc
                
                int indexComparado = 0;
                
                for (int i = 0 ; i < recordatorios.size() ; i++) {
                    LocalTime hora = recordatorios.get(i).getHora();
                    String horaDeseada = hora.toString().substring(0 , 5);
                    LocalDate fecha = recordatorios.get(indexComparado).getFecha();
                    String fechaDeseada = fecha.toString();
                    
                    if (horaActual.equals(horaDeseada) && fechaActual.equals(fechaDeseada)) {
                        tiempoDeseado = true;
                        break;
                    }
                        
                }
		return tiempoDeseado;
	}
        
                
        public void generarCorreo(String titulo, String tipoRecordatorio, String descripcion, boolean tiempo) {
		// TODO implement me
		
	}
        
        
        public void eliminarRecordatorio(int indexRecordatorio) {
            recordatorios.remove(indexRecordatorio);
	}
        
        
        public void guardarDatosCSV(String titulo, String descripcion, boolean importancia, LocalDate fecha, LocalTime hora, boolean UnaVez, String tipo, String notificacion) {
		// TODO implement me
		
	}
	
}

