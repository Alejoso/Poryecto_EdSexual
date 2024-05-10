
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.time.*;
import java.time.format.*;
import java.util.ArrayList;


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

        fieldTitulo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JLabel();
        scrollDescripcion = new javax.swing.JScrollPane();
        fieldDescripcion = new javax.swing.JTextArea();
        selectTipoRecordatorio = new javax.swing.JComboBox<>();
        txtHora = new javax.swing.JLabel();
        fieldHora = new javax.swing.JTextField();
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
        scrollRecordatorios = new javax.swing.JScrollPane();
        tablaRecordatorios = new javax.swing.JTable();
        botonComprobarRecordatorios = new javax.swing.JButton();
        txtInformacionETS = new javax.swing.JLabel();
        scrollInformacionETS = new javax.swing.JScrollPane();
        areaInformacionETS = new javax.swing.JTextArea();
        scrollInformacionAnticonceptivos = new javax.swing.JScrollPane();
        areaInformacionAnticonceptivos = new javax.swing.JTextArea();
        scrollFuentesInformacion = new javax.swing.JScrollPane();
        areaFuentesInformacion = new javax.swing.JTextArea();
        botonEliminarRecordatorio = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        botonGuardar = new javax.swing.JButton();
        botonCargar = new javax.swing.JButton();
        txtListaRecordatorios = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JLabel();
        txtTipoRecordatorio = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtTipoNotificacion = new javax.swing.JLabel();
        txtAnticonceptivos = new javax.swing.JLabel();
        txtInformacionFuentes = new javax.swing.JLabel();
        fieldFecha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recordatorios");
        setBackground(new java.awt.Color(51, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Interfaz"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldTitulo.setBackground(new java.awt.Color(238, 247, 255));
        fieldTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTituloActionPerformed(evt);
            }
        });
        getContentPane().add(fieldTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 170, 30));

        txtDescripcion.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        txtDescripcion.setText("DESCRIPCIÓN");
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));
        txtDescripcion.getAccessibleContext().setAccessibleName("DESCRIPCIÓN");

        fieldDescripcion.setBackground(new java.awt.Color(238, 247, 255));
        fieldDescripcion.setColumns(20);
        fieldDescripcion.setLineWrap(true);
        fieldDescripcion.setRows(5);
        scrollDescripcion.setViewportView(fieldDescripcion);

        getContentPane().add(scrollDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 170, 140));

        selectTipoRecordatorio.setBackground(new java.awt.Color(238, 247, 255));
        selectTipoRecordatorio.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        selectTipoRecordatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hormonal", "Preservativo" }));
        getContentPane().add(selectTipoRecordatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 170, 30));

        txtHora.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        txtHora.setText("HORA (00:00)");
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        fieldHora.setBackground(new java.awt.Color(238, 247, 255));
        fieldHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldHoraActionPerformed(evt);
            }
        });
        getContentPane().add(fieldHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 170, 30));

        selectTipoNotificacion.setBackground(new java.awt.Color(238, 247, 255));
        selectTipoNotificacion.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        selectTipoNotificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alerta", "Correo" }));
        getContentPane().add(selectTipoNotificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 170, 30));

        checkSoloUnaVez.setBackground(new java.awt.Color(205, 232, 229));
        checkSoloUnaVez.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        checkSoloUnaVez.setLabel("SOLO UNA VEZ");
        checkSoloUnaVez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSoloUnaVezActionPerformed(evt);
            }
        });
        getContentPane().add(checkSoloUnaVez, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, -1, -1));

        checkAltaImportancia.setBackground(new java.awt.Color(205, 232, 229));
        checkAltaImportancia.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        checkAltaImportancia.setText("ALTA IMPORTANCIA");
        checkAltaImportancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAltaImportanciaActionPerformed(evt);
            }
        });
        getContentPane().add(checkAltaImportancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, -1, -1));

        botonCrear.setBackground(new java.awt.Color(77, 134, 156));
        botonCrear.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        botonCrear.setText("Crear Recordatorio");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });
        getContentPane().add(botonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, 170, 30));

        txtSeleccionGenero.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        txtSeleccionGenero.setText("SELEECION DE GENERO");
        getContentPane().add(txtSeleccionGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 15, 130, -1));

        botonHombre.setBackground(new java.awt.Color(77, 134, 156));
        botonHombre.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        botonHombre.setText("Hombre");
        botonHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHombreActionPerformed(evt);
            }
        });
        getContentPane().add(botonHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 150, 50));

        botonMujer.setBackground(new java.awt.Color(77, 134, 156));
        botonMujer.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        botonMujer.setText("Mujer");
        botonMujer.setToolTipText("");
        botonMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMujerActionPerformed(evt);
            }
        });
        getContentPane().add(botonMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 150, 50));

        txtCorreo.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        txtCorreo.setText("CORREO");
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 165, -1, 20));

        fieldCorreo.setBackground(new java.awt.Color(238, 247, 255));
        getContentPane().add(fieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 260, 30));

        botonAñadirCorreo.setBackground(new java.awt.Color(77, 134, 156));
        botonAñadirCorreo.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        botonAñadirCorreo.setText("Añadir");
        botonAñadirCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(botonAñadirCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 225, 80, 20));

        scrollRecordatorios.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N

        tablaRecordatorios.setBackground(new java.awt.Color(238, 247, 255));
        tablaRecordatorios.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
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

        botonComprobarRecordatorios.setBackground(new java.awt.Color(77, 134, 156));
        botonComprobarRecordatorios.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        botonComprobarRecordatorios.setText("Comprobar Recordatorio");
        botonComprobarRecordatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprobarRecordatoriosActionPerformed(evt);
            }
        });
        getContentPane().add(botonComprobarRecordatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 170, 40));

        txtInformacionETS.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        txtInformacionETS.setText("INFORMACIÓN ETS");
        getContentPane().add(txtInformacionETS, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 20, -1, -1));

        areaInformacionETS.setEditable(false);
        areaInformacionETS.setBackground(new java.awt.Color(238, 247, 255));
        areaInformacionETS.setColumns(20);
        areaInformacionETS.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        areaInformacionETS.setLineWrap(true);
        areaInformacionETS.setRows(5);
        areaInformacionETS.setFocusable(false);
        scrollInformacionETS.setViewportView(areaInformacionETS);

        getContentPane().add(scrollInformacionETS, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 170, 140));

        areaInformacionAnticonceptivos.setEditable(false);
        areaInformacionAnticonceptivos.setBackground(new java.awt.Color(238, 247, 255));
        areaInformacionAnticonceptivos.setColumns(20);
        areaInformacionAnticonceptivos.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        areaInformacionAnticonceptivos.setLineWrap(true);
        areaInformacionAnticonceptivos.setRows(5);
        areaInformacionAnticonceptivos.setFocusable(false);
        scrollInformacionAnticonceptivos.setViewportView(areaInformacionAnticonceptivos);

        getContentPane().add(scrollInformacionAnticonceptivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 170, 140));

        areaFuentesInformacion.setEditable(false);
        areaFuentesInformacion.setBackground(new java.awt.Color(238, 247, 255));
        areaFuentesInformacion.setColumns(20);
        areaFuentesInformacion.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        areaFuentesInformacion.setLineWrap(true);
        areaFuentesInformacion.setRows(5);
        areaFuentesInformacion.setFocusable(false);
        scrollFuentesInformacion.setViewportView(areaFuentesInformacion);

        getContentPane().add(scrollFuentesInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 170, 90));

        botonEliminarRecordatorio.setBackground(new java.awt.Color(77, 134, 156));
        botonEliminarRecordatorio.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        botonEliminarRecordatorio.setText("Eliminar Recordatorio");
        botonEliminarRecordatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarRecordatorioActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminarRecordatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 160, 40));

        jPanel1.setBackground(new java.awt.Color(205, 232, 229));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonGuardar.setBackground(new java.awt.Color(77, 134, 156));
        botonGuardar.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        botonGuardar.setText("Guardar recordatoriios");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 170, 20));

        botonCargar.setBackground(new java.awt.Color(77, 134, 156));
        botonCargar.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        botonCargar.setText("Cargar Recordatorios");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, 170, -1));

        txtListaRecordatorios.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        txtListaRecordatorios.setText("LISTA DE RECORDATORIOS");
        jPanel1.add(txtListaRecordatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        txtTitulo.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        txtTitulo.setText("TITULO");
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 10, 50, 20));

        txtTipoRecordatorio.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        txtTipoRecordatorio.setText("TIPO DE RECORDATORIO");
        jPanel1.add(txtTipoRecordatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        txtFecha.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        txtFecha.setText("FECHA (YYYY-MM-dd)");
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 315, -1, -1));

        txtTipoNotificacion.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        txtTipoNotificacion.setText("TIPO DE NOTIFICACIÓN");
        jPanel1.add(txtTipoNotificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 445, -1, -1));

        txtAnticonceptivos.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        txtAnticonceptivos.setText("INFORMACIÓN ANTICONCEPTIVOS");
        jPanel1.add(txtAnticonceptivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, -1, 20));

        txtInformacionFuentes.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        txtInformacionFuentes.setText("INFORMACIÓN Y LÍNEAS DE ATENCIÓN");
        jPanel1.add(txtInformacionFuentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, -1, -1));

        fieldFecha.setBackground(new java.awt.Color(238, 247, 255));
        fieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFechaActionPerformed(evt);
            }
        });
        jPanel1.add(fieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 170, 30));

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
        Informacion info = new Informacion();
        info.generarNotificacionCada5Minutos();
    }//GEN-LAST:event_botonHombreActionPerformed

    private void botonComprobarRecordatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprobarRecordatoriosActionPerformed
        boolean tiempoDeseado = notificacion.compararTimepo();
        notificacion.generarNotificacion(tiempoDeseado); 
        notificacion.generarCorreo(tiempoDeseado , usuario.getCorreo());
        agregarALista();
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
                agregarALista();

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
        Informacion info = new Informacion();
        info.generarNotificacionCada5Minutos();
    }//GEN-LAST:event_botonMujerActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        notificacion.guardarDatosCSV();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        notificacion.leerCsv();
        agregarALista(); 
    }//GEN-LAST:event_botonCargarActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });

        
    }
    
 
    public void agregarALista() {
       ArrayList<Recordatorio> array = notificacion.getArray();
    
        // Eliminar todas las filas existentes antes de agregar nuevas
        int rowCount = dtm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }
        
        for (int i = 0 ; i < array.size() ; i++) {
            Object[] o = new Object[3]; // Asegúrate de crear un nuevo arreglo para cada fila
            o[0] = array.get(i).getTitulo();
            o[1] = array.get(i).getFecha();
            o[2] = array.get(i).getHora();

            // Compara la importancia de los recordatorios para así agregarlos a la primera fila de la lista
            if (array.get(i).getImportancia() == true) {
                dtm.insertRow(0, o);
            } else {
                dtm.addRow(o);
        }
    }
    }
    
    
    public void eliminarLista() {
            notificacion.eliminarRecordatorio(tablaRecordatorios.getSelectedRow());
            dtm.removeRow(tablaRecordatorios.getSelectedRow());
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
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonComprobarRecordatorios;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonEliminarRecordatorio;
    private javax.swing.JButton botonGuardar;
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
