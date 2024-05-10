import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Informacion {	

	public String[] informacionETSHombre = new String[] {"Tu salud está en tus manos. \nProtégete y protégeles. Usa \nsiempre protección contra las \nETS." , "Prevenir es cuidar. No pongas\nen riesgo tu bienestar ni el de \nquienes te rodean. \nHazte pruebas regularmente." , "La responsabilidad es sexy. \n Cuídate, sé honesto y practica el \n sexo seguro. Tu cuerpo y tu pareja \n te lo agradecerán."};
	public String[] informacionETSMujer = new String[] {"Tu salud es tu prioridad. No \ncomprometas tu bienestar por \nplacer. Usa siempre protección \ncontra las ETS." , "Cuida de ti misma y de tus \nseres queridos. Hazte pruebas \nregularmente y toma el control de tu salud sexual." , "Empodérate a través del cuidado. Sé proactiva, sé segura y sé consciente de tu salud sexual. No te arriesgues."};
	public String[] informacionAnticonceptivosHombre = new String[] {"La planificación es clave. \nConoce tus opciones y elige el \nmétodo anticonceptivo que \nmejor se adapte a ti y a tu \npareja." , "La responsabilidad es parte del placer. Utiliza métodos \nanticonceptivos para disfrutar \nde relaciones sexuales seguras y sin preocupaciones." , "Protege tu futuro. Utiliza métodos anticonceptivos para tomar el control de tu vida sexual y reproductiva, sin dejar nada al azar."};
	public String[] informacionAnticonceptivosMujer = new String[] {"Tu cuerpo, tu elección. \nDescubre los métodos \nanticonceptivos que te \nempoderen y te brinden control sobre tu salud sexual y \nreproductiva." , "Cuida de ti misma y de tus \nplanes futuros. Investiga y elige \nel método anticonceptivo \nque se ajuste a tus \nnecesidades y estilo de vida." , "Prevenir es poder. Toma el control de tu fertilidad y protege tu bienestar con métodos anticonceptivos seguros y efectivos."};
	public String fuentesInformacion = ("https://profamilia.org.co/servicios/its/que-son/ \n Profamilia: (604) 283 6688") ;
        
	
        public String getInformacionETSHombre () {
            Random r = new Random();
            int indiceRandom = r.nextInt(2)+1; 
            return informacionETSHombre[indiceRandom-1];
        }
        
        public String getInformacionETSMujer () {
            Random r = new Random();
            int indiceRandom = r.nextInt(2)+1; 
            return informacionETSMujer[indiceRandom-1];            
        }
        
        public String getInformacionAnticonceptivosHombre () {
            Random r = new Random();
            int indiceRandom = r.nextInt(2)+1; 
            return informacionAnticonceptivosHombre[indiceRandom-1];           
        }
        
        public String getInformacionAnticonceptivosMujer () {
            Random r = new Random();
            int indiceRandom = r.nextInt(2)+1; 
            return informacionAnticonceptivosMujer[indiceRandom-1]; 
        }
        
        public String getFuentesInformacion () {
            return fuentesInformacion;
        }
        
        public void generarNotificacionCada5Minutos() {
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(null, getInformacionAnticonceptivosHombre(), "Informacion", JOptionPane.PLAIN_MESSAGE);
            }
            }, 2 * 60 * 1000, 2 * 60 * 1000); // 2 minutos en milisegundos con un retardo de 2 minutos
        }
                       
}

