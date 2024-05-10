
import java.util.ArrayList;
import java.time.*;
import javax.swing.JOptionPane;
import java.io. *;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Notificacion
{
        public ArrayList<Recordatorio>recordatorios = new ArrayList<>();
        String fileName = "my-file.txt";

    
        public void agregarRecordatorioAlArray (Recordatorio recordatorioParaAgregar) {
            recordatorios.add(recordatorioParaAgregar);
        }
        
	public void generarNotificacion(boolean tiempoComparado) {
            
            //Buscamos cual es el index de la notificacion que cumple
            
            int indexDeseado = -1;
            LocalTime horaYa = LocalTime.now();
            LocalDate fechaYa = LocalDate.now();
                
            String horaActual = horaYa.toString().substring(0 ,5);
            String fechaActual = fechaYa.toString();
            
            
            for (int i = 0; i < recordatorios.size(); i++) {
                LocalTime hora = recordatorios.get(i).getHora();
                String horaDeseada = hora.toString().substring(0, 5);
                LocalDate fecha = recordatorios.get(i).getFecha();
                String fechaDeseada = fecha.toString();
                
                if (horaActual.equals(horaDeseada) && fechaActual.equals(fechaDeseada)) {
                    indexDeseado = i;
                    break;
                }
            }
            
            //Colocar prints para ver si se esta guardando la info
            
            //Generamos la notificacion con el index de la hora deseada
            
            if (tiempoComparado == true && recordatorios.get(indexDeseado).getNotificacion().equals("Alerta")) {
                JOptionPane.showMessageDialog(null, recordatorios.get(indexDeseado).getDescripcion(), recordatorios.get(indexDeseado).getTitulo(), JOptionPane.PLAIN_MESSAGE);
                if (recordatorios.get(indexDeseado).getRecordarUnaVez() == true) {
                    eliminarRecordatorio(indexDeseado);
                }
            } 
            
         
           

	}
        
         public boolean compararTimepo() {
		boolean tiempoDeseado = false;
                
                LocalTime horaYa = LocalTime.now();
                LocalDate fechaYa = LocalDate.now();
                
                String horaActual = horaYa.toString().substring(0 ,5);
                String fechaActual = fechaYa.toString();
                
                //Iteramos por todas las horas y fechas y devuelve true cuando encuentra una hora igual a la del pc
                
                
                for (int i = 0 ; i < recordatorios.size() ; i++) {
                    LocalTime hora = recordatorios.get(i).getHora();
                    String horaDeseada = hora.toString().substring(0 , 5);
                    LocalDate fecha = recordatorios.get(i).getFecha();
                    String fechaDeseada = fecha.toString();
                    
                    if (horaActual.equals(horaDeseada) && fechaActual.equals(fechaDeseada)) {
                        tiempoDeseado = true;
                        break;
                    }
                        
                }
		return tiempoDeseado;
	}
        
                
        public void generarCorreo(boolean tiempoComparado , String correoAEnviar) {

            //Buscamos cual es el index de la notificacion que cumple, la misma estructura que el metodo generar notificacion
            
            int indexDeseado = 0;
            LocalTime horaYa = LocalTime.now();
            LocalDate fechaYa = LocalDate.now();
                
            String horaActual = horaYa.toString().substring(0 ,5);
            String fechaActual = fechaYa.toString();
            
            
            for (int i = 0; i < recordatorios.size(); i++) {
                LocalTime hora = recordatorios.get(i).getHora();
                String horaDeseada = hora.toString().substring(0, 5);
                LocalDate fecha = recordatorios.get(i).getFecha();
                String fechaDeseada = fecha.toString();

                if (horaActual.equals(horaDeseada) && fechaActual.equals(fechaDeseada)) {
                    indexDeseado = i;
                    break;
                }
            }
            
            if (!recordatorios.isEmpty()) {
                if (tiempoComparado == true && recordatorios.get(indexDeseado).getNotificacion().equals("Correo")) {
                EnvioCorreos correo = new EnvioCorreos();
            
                correo.createEmail( correoAEnviar , recordatorios.get(indexDeseado).getTitulo() , recordatorios.get(indexDeseado).getDescripcion() ); 
                correo.sendEmail();
                } 
            }
            
            if (!recordatorios.isEmpty()) {
                if (recordatorios.get(indexDeseado).getRecordarUnaVez() == true) {
                eliminarRecordatorio(indexDeseado);
                }     
            }
             
           
            
           
	}
        
        
        public void eliminarRecordatorio(int indexRecordatorio) {
            recordatorios.remove(indexRecordatorio);
	}
        
        
        public void guardarDatosCSV() {

            String encoding = "UTF-8";
            File f = new File(fileName);
            FileWriter writer = null;
            PrintWriter pw = null;
            
            if (!f.exists()) {
                try {
                    f.createNewFile();
                } catch (IOException exception){
                    System.err.println("Error creando el archivo");
                }
            } 
            try {
                writer = new FileWriter(fileName , true);
                pw = new PrintWriter(writer);
                for (int i = 0 ; i < recordatorios.size() ; i++) {
                    pw.println(recordatorios.get(i).getTitulo() + "," + recordatorios.get(i).getDescripcion() + "," + recordatorios.get(i).getTipoRecordatorio() + "," + recordatorios.get(i).getNotificacion() + "," + recordatorios.get(i).getImportancia() + "," + recordatorios.get(i).getFecha() + "," + recordatorios.get(i).getHora() + "," + recordatorios.get(i).getRecordarUnaVez());
                }
                
            } catch (IOException e) {
                System.err.println("Error abriendp el archivo");
            } finally {
                try {
                    if (null != writer) {
                        writer.close();
                    }
                } catch (Exception e2){
                    e2.printStackTrace();
                }
                    
            }
        
        }
	
        public void leerCsv() {
            InputStream ins = null;
            try {
                ins = new FileInputStream(fileName);
                Scanner obj = new Scanner(ins);
                while (obj.hasNextLine()) {
                    String[] partes = obj.nextLine().split(",");
                    String titulo = partes[0];
                    String descripcion = partes[1];
                    String tipoRecordatorio = partes[2];
                    String tipoNotificacion = partes[3];
                    String importanciaString = partes[4];
                    String fechaString = partes[5];
                    String horaString = partes[6];
                    String recordarUnaVezString = partes[7];
                    
                    boolean importancia;
                    boolean recordarUnaVez; 
                    LocalTime hora;
                    LocalDate fecha;
                    
                    if (importanciaString.equals("true")){
                        importancia = true;
                    } else {
                        importancia = false; 
                    }
                    
                     if (recordarUnaVezString.equals("true")){
                        recordarUnaVez = true;
                    } else {
                        recordarUnaVez = false; 
                    }
                     
                    hora = LocalTime.parse(horaString);
                    fecha = LocalDate.parse(fechaString);
                    
                    Recordatorio recordatorio = new Recordatorio();
                    
                    recordatorio.setTitulo(titulo);
                    recordatorio.setDescripcion(descripcion);
                    recordatorio.setTipoRecordatorio(tipoRecordatorio);
                    recordatorio.setFecha(fecha);
                    recordatorio.setHora(hora);
                    recordatorio.setNotificacion(tipoNotificacion);
                    recordatorio.setRecordarUnaVez(recordarUnaVez);
                    recordatorio.setImportancia(importancia);

                    agregarRecordatorioAlArray(recordatorio);
                    
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Notificacion.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    ins.close();
                } catch (IOException ex) {
                    System.err.println("Error");
                }
            }

        }

        
        
        public ArrayList<Recordatorio> getArray() {
            return recordatorios; 
        }
       	
}
