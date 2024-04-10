import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class Recordatorio extends Notificacion implements ActionListener {
    //Atributos de la clase
    public boolean altaImportancia;
    public String fechaRecordatorio;
    public int horaRecordatorio;
    public boolean recordarUnaSolaVez; 
    
    //Referencias a los atributos de la interfaz
    JButton botonCrear;
    JTextField titulo;
    JTextField descripcion;
    JComboBox tipo;
    JTextField fecha;
    JCheckBox soloUnaVez;
    JComboBox tipoNoti;
    JCheckBox importancia;


    public void crearRecordatorio () {
        botonCrear.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonCrear) {
            tituloRecordatorio = titulo.getText();

            descripcionRecordatorio = descripcion.getText();

            tipoRecordatorio = tipo.getSelectedItem().toString();

            fechaRecordatorio = fecha.getText();

            recordarUnaSolaVez = soloUnaVez.isSelected();

            tipoNotificacion = tipoNoti.getSelectedItem().toString();

            altaImportancia = importancia.isSelected();

            System.out.println(tituloRecordatorio);
            System.out.println(descripcionRecordatorio);
            System.out.println(fecha);
            System.out.println(tipoNotificacion);
            System.out.println(tipoRecordatorio);
            System.out.println(recordarUnaSolaVez);
            System.out.println(altaImportancia);

        }
    }

    public static void eliminarRecordatorio () {
        //elimina el recordatorio elegido
    }

    public static void generarNotificacion () {
        //Genera la notificacion comparando si es la hora deseada
    }


}
