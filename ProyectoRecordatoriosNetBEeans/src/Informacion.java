import java.time.*; 
import java.util.Random;

public class Informacion {	

	public String[] informacionETSHombre = new String[] {"Tu salud está en tus manos. Protégete y protégeles. Usa siempre protección contra las ETS." , "Prevenir es cuidar. No pongas en riesgo tu bienestar ni el de quienes te rodean. Hazte pruebas regularmente." , "La responsabilidad es sexy. Cuídate, sé honesto y practica el sexo seguro. Tu cuerpo y tu pareja te lo agradecerán."};
	public String[] informacionETSMujer = new String[] {"Tu salud es tu prioridad. No comprometas tu bienestar por placer. Usa siempre protección contra las ETS." , "Cuida de ti misma y de tus seres queridos. Hazte pruebas regularmente y toma el control de tu salud sexual." , "Empodérate a través del cuidado. Sé proactiva, sé segura y sé consciente de tu salud sexual. No te arriesgues."};
	public String[] informacionAnticonceptivosHombre = new String[] {"La planificación es clave. Conoce tus opciones y elige el método anticonceptivo que mejor se adapte a ti y a tu pareja." , "La responsabilidad es parte del placer. Utiliza métodos anticonceptivos para disfrutar de relaciones sexuales seguras y sin preocupaciones." , "Protege tu futuro. Utiliza métodos anticonceptivos para tomar el control de tu vida sexual y reproductiva, sin dejar nada al azar."};
	public String[] informacionAnticonceptivosMujer = new String[] {"Tu cuerpo, tu elección. Descubre los métodos anticonceptivos que te empoderen y te brinden control sobre tu salud sexual y reproductiva." , "Cuida de ti misma y de tus planes futuros. Investiga y elige el método anticonceptivo que se ajuste a tus necesidades y estilo de vida." , "Prevenir es poder. Toma el control de tu fertilidad y protege tu bienestar con métodos anticonceptivos seguros y efectivos."};
	public String fuentesInformacion = ("https://profamilia.org.co/servicios/its/que-son/ \n Profamilia: (604) 283 6688") ;
        
       
	
	public Informacion(){
		super();
	}

	
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
        
        
	
	
	
	
}

