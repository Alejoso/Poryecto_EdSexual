import java.awt.*;
import javax.swing.*;


public class Interfaz extends JPanel {

    public JTextField descripcion;
    public JTextField titulo;
    public JLabel txt1;
    public JLabel txt2;
    public JLabel txt3;
    public JComboBox tipo;
    public JLabel txt5;
    public JTextField fecha;
    public JCheckBox soloUnaVez;
    public JComboBox tipoNoti;
    public JLabel txt6;
    public JCheckBox importancia;
    public JButton botonCrear;
    public JLabel txt4;
    public JButton botonMujer;
    public JLabel txt7;
    public JButton botonHombre;
    public JLabel txt8;
    public JList mostrarRecordatorios;
    public JLabel txt9;
    public JTextArea mostrarETS;
    public JLabel txt10;
    public JTextArea mostrarAnticonceptivos;
    public JLabel txt11;
    public JTextArea mostrarInformacion;
    public JButton botonCkeck;

    public Interfaz() {
        //construct preComponents
        String[] tipoItems = {"Hormonal", "Preservativo"};
        String[] tipoNotiItems = {"Correo", "Alerta"};
        String[] mostrarRecordatoriosItems = {"Recordatorio 1", "Recordatorio 2", "Recordatorio 3"};

        //construct components
        descripcion = new JTextField (5);
        titulo = new JTextField (5);
        txt1 = new JLabel ("Crear Recordatorio");
        txt2 = new JLabel ("Titulo");
        txt3 = new JLabel ("Descripción");
        tipo = new JComboBox (tipoItems);
        txt5 = new JLabel ("Fecha");
        fecha = new JTextField (5);
        soloUnaVez = new JCheckBox ("Recordar una sola vez");
        tipoNoti = new JComboBox (tipoNotiItems);
        txt6 = new JLabel ("Tipo de notificación");
        importancia = new JCheckBox ("Alta importancia");
        botonCrear = new JButton ("Crear Recordatorio");
        txt4 = new JLabel ("Tipo de recordatorio");
        botonMujer = new JButton ("Mujer");
        txt7 = new JLabel ("Seleccion de genero");
        botonHombre = new JButton ("Hombre");
        txt8 = new JLabel ("Recordatorios");
        mostrarRecordatorios = new JList (mostrarRecordatoriosItems);
        txt9 = new JLabel ("Informacion ETS");
        mostrarETS = new JTextArea (5, 5);
        txt10 = new JLabel ("Informacion anticonceptivos ");
        mostrarAnticonceptivos = new JTextArea (5, 5);
        txt11 = new JLabel ("Fuestes de informacion");
        mostrarInformacion = new JTextArea (5, 5);
        botonCkeck = new JButton ("Comprobar recordatorios");

        //adjust size and set layout
        setPreferredSize (new Dimension (973, 557));
        setLayout (null);

        //add components
        add (descripcion);
        add (titulo);
        add (txt1);
        add (txt2);
        add (txt3);
        add (tipo);
        add (txt5);
        add (fecha);
        add (soloUnaVez);
        add (tipoNoti);
        add (txt6);
        add (importancia);
        add (botonCrear);
        add (txt4);
        add (botonMujer);
        add (txt7);
        add (botonHombre);
        add (txt8);
        add (mostrarRecordatorios);
        add (txt9);
        add (mostrarETS);
        add (txt10);
        add (mostrarAnticonceptivos);
        add (txt11);
        add (mostrarInformacion);
        add (botonCkeck);


        //set component bounds (only needed by Absolute Positioning)
        descripcion.setBounds (700, 120, 260, 85);
        titulo.setBounds (700, 65, 160, 25);
        txt1.setBounds (745, 10, 120, 30);
        txt2.setBounds (700, 40, 100, 25);
        txt3.setBounds (700, 95, 100, 25);
        tipo.setBounds (700, 235, 100, 25);
        txt5.setBounds (700, 265, 100, 25);
        fecha.setBounds (700, 295, 180, 25);
        soloUnaVez.setBounds (700, 330, 160, 25);
        tipoNoti.setBounds (700, 390, 100, 25);
        txt6.setBounds (700, 355, 125, 25);
        importancia.setBounds (700, 425, 125, 25);
        botonCrear.setBounds (700, 465, 150, 55);
        txt4.setBounds (700, 205, 125, 25);
        botonMujer.setBounds (85, 45, 130, 55);
        txt7.setBounds (90, 10, 120, 25);
        botonHombre.setBounds (85, 115, 130, 55);
        txt8.setBounds (105, 195, 100, 25);
        mostrarRecordatorios.setBounds (25, 235, 240, 260);
        txt9.setBounds (415, 15, 100, 25);
        mostrarETS.setBounds (390, 55, 150, 125);
        txt10.setBounds (384, 190, 175, 25);
        mostrarAnticonceptivos.setBounds (390, 225, 150, 125);
        txt11.setBounds (395, 355, 145, 25);
        mostrarInformacion.setBounds (390, 385, 150, 125);
        botonCkeck.setBounds (45, 505, 195, 40);

       
    }



}

