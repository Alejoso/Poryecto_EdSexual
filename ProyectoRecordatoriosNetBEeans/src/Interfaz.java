
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.time.*;
import java.time.format.*;


public class Interfaz extends javax.swing.JFrame {

    public DefaultTableModel dtm;
    public Object[] o = new Object[3];

    public Interfaz() {
        initComponents();
        dtm = (DefaultTableModel) tablaRecordatorios.getModel();
        int rowCount = dtm.getRowCount();
        if (rowCount < 4) {

        } else {
            for (int i = rowCount - 1; i >= rowCount - 4; i--) {
                dtm.removeRow(i);
            }
        }
    }

    //Instancias
    Usuario usuario = new Usuario();
    Notificacion notificacion = new Notificacion();



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        fieldTitulo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JLabel();
        scrollDescripcion = new javax.swing.JScrollPane();
        fieldDescripcion = new javax.swing.JTextArea();
        txtTipoRecordatorio = new javax.swing.JLabel();
        selectTipoRecordatorio = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JLabel();
        fieldFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JLabel();
        fieldHora = new javax.swing.JTextField();
        txtTipoNotificacion = new javax.swing.JLabel();
        selectTipoNotificacion = new javax.swing.JComboBox<>();
        checkSoloUnaVez = new javax.swing.JCheckBox();
        checkAltaImportancia = new javax.swing.JCheckBox();
        botonCrear = new javax.swing.JButton();
        txtSeleccionGenero = new javax.swing.JLabel();
        botonHombre = new javax.swing.JButton();
        botonMujer = new javax.swing.JButton();
        txtCorreo = new javax.swing.JLabel();
        fieldCorreo = new javax.swing.JTextField();
        botonAñadirCorreo = new javax.swing.JButton();
        txtListaRecordatorios = new javax.swing.JLabel();
        scrollRecordatorios = new javax.swing.JScrollPane();
        tablaRecordatorios = new javax.swing.JTable();
        botonComprobarRecordatorios = new javax.swing.JButton();
        txtInformacionETS = new javax.swing.JLabel();
        scrollInformacionETS = new javax.swing.JScrollPane();
        areaInformacionETS = new javax.swing.JTextArea();
        txtAnticonceptivos = new javax.swing.JLabel();
        scrollInformacionAnticonceptivos = new javax.swing.JScrollPane();
        areaInformacionAnticonceptivos = new javax.swing.JTextArea();
        txtInformacionFuentes = new javax.swing.JLabel();
        scrollFuentesInformacion = new javax.swing.JScrollPane();
        areaFuentesInformacion = new javax.swing.JTextArea();
        botonEliminarRecordatorio = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recordatorios");
        setBackground(new java.awt.Color(51, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Interfaz"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setText("Titulo");
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 15, 40, -1));

        fieldTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTituloActionPerformed(evt);
            }
        });
        getContentPane().add(fieldTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 170, 30));

        txtDescripcion.setText("Descripción");
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        fieldDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        fieldDescripcion.setColumns(20);
        fieldDescripcion.setLineWrap(true);
        fieldDescripcion.setRows(5);
        scrollDescripcion.setViewportView(fieldDescripcion);

        getContentPane().add(scrollDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 170, 140));

        txtTipoRecordatorio.setText("Tipo de Recordatorio");
        getContentPane().add(txtTipoRecordatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        selectTipoRecordatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hormonal", "Preservativo" }));
        getContentPane().add(selectTipoRecordatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 170, 30));

        txtFecha.setText("Fecha (YYYY-MM-dd)");
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        fieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFechaActionPerformed(evt);
            }
        });
        getContentPane().add(fieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 170, 30));

        txtHora.setText("Hora (00:00)");
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        fieldHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldHoraActionPerformed(evt);
            }
        });
        getContentPane().add(fieldHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 170, 30));

        txtTipoNotificacion.setText("Tipo de Notificación");
        getContentPane().add(txtTipoNotificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        selectTipoNotificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alerta", "Correo" }));
        getContentPane().add(selectTipoNotificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 170, 30));

        checkSoloUnaVez.setText("Solo Una Vez");
        checkSoloUnaVez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSoloUnaVezActionPerformed(evt);
            }
        });
        getContentPane().add(checkSoloUnaVez, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, -1, -1));

        checkAltaImportancia.setText("Alta Importancia");
        checkAltaImportancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAltaImportanciaActionPerformed(evt);
            }
        });
        getContentPane().add(checkAltaImportancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, -1, -1));

        botonCrear.setText("Crear Recordatorio");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });
        getContentPane().add(botonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, 170, 30));

        txtSeleccionGenero.setText("Seleccion De Genero");
        getContentPane().add(txtSeleccionGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 15, -1, -1));

        botonHombre.setText("Hombre");
        botonHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHombreActionPerformed(evt);
            }
        });
        getContentPane().add(botonHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 150, 50));

        botonMujer.setText("Mujer");
        botonMujer.setToolTipText("");
        botonMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMujerActionPerformed(evt);
            }
        });
        getContentPane().add(botonMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 150, 50));

        txtCorreo.setText("Correo");
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 165, -1, 20));
        getContentPane().add(fieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 260, 30));

        botonAñadirCorreo.setText("Añadir");
        botonAñadirCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(botonAñadirCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 225, 80, 20));

        txtListaRecordatorios.setText("Lista De Recordatorios");
        getContentPane().add(txtListaRecordatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        tablaRecordatorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "TItulo", "Fecha", "Hora"
            }
        ));
        scrollRecordatorios.setViewportView(tablaRecordatorios);

        getContentPane().add(scrollRecordatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 340, 259));

        botonComprobarRecordatorios.setText("Comprobar Recordatorio");
        botonComprobarRecordatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprobarRecordatoriosActionPerformed(evt);
            }
        });
        getContentPane().add(botonComprobarRecordatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 170, 40));

        txtInformacionETS.setText("Informacion ETS");
        getContentPane().add(txtInformacionETS, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));

        areaInformacionETS.setEditable(false);
        areaInformacionETS.setBackground(new java.awt.Color(255, 255, 255));
        areaInformacionETS.setColumns(20);
        areaInformacionETS.setLineWrap(true);
        areaInformacionETS.setRows(5);
        areaInformacionETS.setFocusable(false);
        scrollInformacionETS.setViewportView(areaInformacionETS);

        getContentPane().add(scrollInformacionETS, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 170, 140));

        txtAnticonceptivos.setText("Informacion Anticonceptivos");
        getContentPane().add(txtAnticonceptivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, 20));

        areaInformacionAnticonceptivos.setEditable(false);
        areaInformacionAnticonceptivos.setBackground(new java.awt.Color(255, 255, 255));
        areaInformacionAnticonceptivos.setColumns(20);
        areaInformacionAnticonceptivos.setLineWrap(true);
        areaInformacionAnticonceptivos.setRows(5);
        areaInformacionAnticonceptivos.setFocusable(false);
        scrollInformacionAnticonceptivos.setViewportView(areaInformacionAnticonceptivos);

        getContentPane().add(scrollInformacionAnticonceptivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 170, 140));

        txtInformacionFuentes.setText("Informacion y Lineas De Atención");
        getContentPane().add(txtInformacionFuentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, -1, -1));

        areaFuentesInformacion.setEditable(false);
        areaFuentesInformacion.setColumns(20);
        areaFuentesInformacion.setLineWrap(true);
        areaFuentesInformacion.setRows(5);
        areaFuentesInformacion.setFocusable(false);
        scrollFuentesInformacion.setViewportView(areaFuentesInformacion);

        getContentPane().add(scrollFuentesInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 170, 140));

        botonEliminarRecordatorio.setText("Eliminar Recordatorio");
        botonEliminarRecordatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarRecordatorioActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminarRecordatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 160, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTituloActionPerformed
    }//GEN-LAST:event_fieldTituloActionPerformed

    private void fieldHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldHoraActionPerformed
    }//GEN-LAST:event_fieldHoraActionPerformed

    private void botonAñadirCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirCorreoActionPerformed
        usuario.setCorreo(fieldCorreo.getText());
    }//GEN-LAST:event_botonAñadirCorreoActionPerformed

    private void fieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldFechaActionPerformed

    private void checkSoloUnaVezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSoloUnaVezActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkSoloUnaVezActionPerformed

    private void checkAltaImportanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAltaImportanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkAltaImportanciaActionPerformed

    private void botonHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHombreActionPerformed
        usuario.setGenero("Hombre");
        mostrarInformacion();
    }//GEN-LAST:event_botonHombreActionPerformed

    private void botonComprobarRecordatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprobarRecordatoriosActionPerformed
        boolean tiempoDeseado = notificacion.compararTimepo();
        notificacion.generarNotificacion(tiempoDeseado); 
    }//GEN-LAST:event_botonComprobarRecordatoriosActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        //Extraemos la informacion de la interfaz
        String titulo = fieldTitulo.getText();
        String descripcion = fieldDescripcion.getText();
        String tipoRecordatorio = selectTipoRecordatorio.getItemAt(selectTipoRecordatorio.getSelectedIndex());
        String fecha = fieldFecha.getText();
        String hora = fieldHora.getText();
        String tipoNotificacion = selectTipoNotificacion.getItemAt(selectTipoNotificacion.getSelectedIndex());
        boolean soloUnaVez = checkSoloUnaVez.isSelected();
        boolean altaImportancia = checkAltaImportancia.isSelected();
        LocalDate fechaEnformato = null;
        LocalTime horaEnformato = null;

        
        //Crear un recordatorio
                
              
        
        //Comparamos si todos los campos necesarios estan llenos
        if (!titulo.equals("") && !fecha.equals("") && !hora.equals("") && !descripcion.equals("") ) {

            //Debemos comparar si la fecha y la hora si se pueden convertir a tipo LocalTime y LocalDate
            boolean continuar;
             try {
                horaEnformato = LocalTime.parse(hora);
                
                    try {
                        fechaEnformato = LocalDate.parse(fecha);
                        continuar = true;
                    } catch(DateTimeParseException e) {
                        JOptionPane.showMessageDialog(null, "Formato de fecha invalido", "Error", JOptionPane.PLAIN_MESSAGE);
                        continuar = false;
            }
             
                
            } catch(DateTimeParseException e) {
                JOptionPane.showMessageDialog(null, "Formato de hora invalido", "Error", JOptionPane.PLAIN_MESSAGE);
                continuar = false;
            }
             
         
             
            if (continuar == true) {
            //Creamos el recordatorio
            Recordatorio recordatorio = new Recordatorio();
                
            recordatorio.setTitulo(titulo);
            recordatorio.setDescripcion(descripcion);
            recordatorio.setTipoRecordatorio(tipoRecordatorio);
            recordatorio.setFecha(fechaEnformato);
            recordatorio.setHora(horaEnformato);
            recordatorio.setNotificacion(tipoNotificacion);
            recordatorio.setRecordarUnaVez(soloUnaVez);
            recordatorio.setImportancia(altaImportancia);

            //Añadimos los objetos al array
            notificacion.agregarRecordatorioAlArray(recordatorio);
            
            
            //Añadir recordtorio a la tabla
            agregarALista(titulo , fecha , hora , altaImportancia);
           
            }
    
         
           

        } else {

            JOptionPane.showMessageDialog(null, "Llene todos los campos requeridos", "Error", JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_botonCrearActionPerformed

    private void botonEliminarRecordatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarRecordatorioActionPerformed
        eliminarLista();
    }//GEN-LAST:event_botonEliminarRecordatorioActionPerformed

    private void botonMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMujerActionPerformed
        usuario.setGenero("Mujer");
        mostrarInformacion();
    }//GEN-LAST:event_botonMujerActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
        
       
        
        
    }
    
    public void agregarALista(String titulo, String fecha, String hora , boolean importancia) {
         
            //Asignamos los valores al array o, el cual contiene los valores de las columnas
            o[0] = titulo;
            o[1] = fecha;
            o[2] = hora;
            
            //Compara la importancia de los recordatorios para asi agregarlos a la primera row de la lista
            if (importancia == true) {
               dtm.insertRow(0, o);
            } else {
                dtm.addRow(o);
            }
	}
    
    
    public int eliminarLista() {
            notificacion.eliminarRecordatorio(tablaRecordatorios.getSelectedRow());
            dtm.removeRow(tablaRecordatorios.getSelectedRow());
            return tablaRecordatorios.getSelectedRow();
	}
    
    public void mostrarInformacion() {
        Informacion infroAMostar = new Informacion();
        
        
        String genero = usuario.getGenero();
        
        //Informacion ETS
            areaFuentesInformacion.setText(infroAMostar.getFuentesInformacion());

            if (genero.equals("Hombre")) {
                areaInformacionETS.setText(infroAMostar.getInformacionETSHombre());
            } else {
                areaInformacionETS.setText(infroAMostar.getInformacionETSMujer());    
            }
            //Informacion Anticonceptivos 
            if (genero.equals("Hombre")) {
                areaInformacionAnticonceptivos.setText(infroAMostar.getInformacionAnticonceptivosHombre());
            } else {
                areaInformacionAnticonceptivos.setText(infroAMostar.getInformacionAnticonceptivosMujer());
            }
            
        
    }
	

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaFuentesInformacion;
    private javax.swing.JTextArea areaInformacionAnticonceptivos;
    private javax.swing.JTextArea areaInformacionETS;
    private javax.swing.JButton botonAñadirCorreo;
    private javax.swing.JButton botonComprobarRecordatorios;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonEliminarRecordatorio;
    private javax.swing.JButton botonHombre;
    private javax.swing.JButton botonMujer;
    private javax.swing.JCheckBox checkAltaImportancia;
    private javax.swing.JCheckBox checkSoloUnaVez;
    private javax.swing.JTextField fieldCorreo;
    private javax.swing.JTextArea fieldDescripcion;
    private javax.swing.JTextField fieldFecha;
    private javax.swing.JTextField fieldHora;
    private javax.swing.JTextField fieldTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollDescripcion;
    private javax.swing.JScrollPane scrollFuentesInformacion;
    private javax.swing.JScrollPane scrollInformacionAnticonceptivos;
    private javax.swing.JScrollPane scrollInformacionETS;
    private javax.swing.JScrollPane scrollRecordatorios;
    private javax.swing.JComboBox<String> selectTipoNotificacion;
    private javax.swing.JComboBox<String> selectTipoRecordatorio;
    private javax.swing.JTable tablaRecordatorios;
    private javax.swing.JLabel txtAnticonceptivos;
    private javax.swing.JLabel txtCorreo;
    private javax.swing.JLabel txtDescripcion;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtHora;
    private javax.swing.JLabel txtInformacionETS;
    private javax.swing.JLabel txtInformacionFuentes;
    private javax.swing.JLabel txtListaRecordatorios;
    private javax.swing.JLabel txtSeleccionGenero;
    private javax.swing.JLabel txtTipoNotificacion;
    private javax.swing.JLabel txtTipoRecordatorio;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
