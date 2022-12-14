/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asesoriasapp;

/**
 *
 * @author J Sebastian M Posada
 */
public class FramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(300,300);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AlumnoFrame = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jComboBoxMateria = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        listaAsesores = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();
        AsesorFrame = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        listaAlumnos = new javax.swing.JButton();
        AltaAsesor = new javax.swing.JButton();
        listaAlumnosFramen = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListaAlumnos = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jFrameAltaAsesor = new javax.swing.JFrame();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox3MateriaAsesor = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox4HoraAsesor = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonAsesor = new javax.swing.JButton();
        botonAlumno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoBienvenida = new javax.swing.JTextArea();

        jLabel2.setText("ASESORIAS app");

        jLabel3.setText("Selecciona la materia y el horario que requieres paera asesorias:");

        jButton9.setText("Regresar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jComboBoxMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "calculo diferecial", "calculo integral", "calculo vectorial", "quimica", "fisica", "algebra lineal" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "14", "15", "16", "17", "18", "19", "20", "21" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton3.setText("BUSCAR ASESORES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel13.setText("Ingresa tus datos:");

        jLabel14.setText("Nombre:");

        jLabel15.setText("Apellido:");

        jLabel16.setText("Numero de control");

        jTextField3.setText("jTextField3");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setText("jTextField4");

        jTextField5.setText("jTextField5");

        javax.swing.GroupLayout AlumnoFrameLayout = new javax.swing.GroupLayout(AlumnoFrame.getContentPane());
        AlumnoFrame.getContentPane().setLayout(AlumnoFrameLayout);
        AlumnoFrameLayout.setHorizontalGroup(
            AlumnoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnoFrameLayout.createSequentialGroup()
                .addGroup(AlumnoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AlumnoFrameLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton9)
                        .addGap(122, 122, 122)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AlumnoFrameLayout.createSequentialGroup()
                        .addGroup(AlumnoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AlumnoFrameLayout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jLabel2))
                            .addGroup(AlumnoFrameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(AlumnoFrameLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(AlumnoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(AlumnoFrameLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlumnoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(AlumnoFrameLayout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlumnoFrameLayout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addGroup(AlumnoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlumnoFrameLayout.createSequentialGroup()
                                                    .addComponent(jLabel15)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(AlumnoFrameLayout.createSequentialGroup()
                                                    .addComponent(jLabel16)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jTextField5))))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlumnoFrameLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jComboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AlumnoFrameLayout.setVerticalGroup(
            AlumnoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlumnoFrameLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AlumnoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AlumnoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(AlumnoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AlumnoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(AlumnoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9)))
        );

        jLabel4.setText("Lista de Asesores disponibes:");

        jList1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jList1ComponentAdded(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listaAsesoresLayout = new javax.swing.GroupLayout(listaAsesores.getContentPane());
        listaAsesores.getContentPane().setLayout(listaAsesoresLayout);
        listaAsesoresLayout.setHorizontalGroup(
            listaAsesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaAsesoresLayout.createSequentialGroup()
                .addGroup(listaAsesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listaAsesoresLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(listaAsesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jLabel4)))
                    .addGroup(listaAsesoresLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        listaAsesoresLayout.setVerticalGroup(
            listaAsesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaAsesoresLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton4)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel5.setText("Bienvenido Asesor");

        jLabel6.setText("Elige la opcion que desees:");

        listaAlumnos.setText("Ver Lista de alumnos");
        listaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAlumnosActionPerformed(evt);
            }
        });

        AltaAsesor.setText("Darme de Alta como Asesor");
        AltaAsesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaAsesorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AsesorFrameLayout = new javax.swing.GroupLayout(AsesorFrame.getContentPane());
        AsesorFrame.getContentPane().setLayout(AsesorFrameLayout);
        AsesorFrameLayout.setHorizontalGroup(
            AsesorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsesorFrameLayout.createSequentialGroup()
                .addGroup(AsesorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AsesorFrameLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel6))
                    .addGroup(AsesorFrameLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AsesorFrameLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(AltaAsesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(listaAlumnos)
                .addGap(29, 29, 29))
        );
        AsesorFrameLayout.setVerticalGroup(
            AsesorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsesorFrameLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(AsesorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AltaAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        jScrollPane3.setViewportView(jListaAlumnos);

        jLabel7.setText("Lista de Alumnos que buscan Asesoria: ");

        javax.swing.GroupLayout listaAlumnosFramenLayout = new javax.swing.GroupLayout(listaAlumnosFramen.getContentPane());
        listaAlumnosFramen.getContentPane().setLayout(listaAlumnosFramenLayout);
        listaAlumnosFramenLayout.setHorizontalGroup(
            listaAlumnosFramenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaAlumnosFramenLayout.createSequentialGroup()
                .addGroup(listaAlumnosFramenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listaAlumnosFramenLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(listaAlumnosFramenLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        listaAlumnosFramenLayout.setVerticalGroup(
            listaAlumnosFramenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaAlumnosFramenLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jLabel8.setText("Asesor por favor inserta tus datos para completar el registro");

        jTextField1.setText("nombre");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Nombre:");

        jLabel10.setText("Apellido:");

        jComboBox3MateriaAsesor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "calculo diferecial", "calculo integral", "calculo vectorial", "quimica", "fisica", "algebra lineal" }));

        jTextField2.setText("Apellido");

        jLabel11.setText("Materia:");

        jLabel12.setText("Hora:");

        jComboBox4HoraAsesor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "14", "15", "16", "17", "18", "19", "20", "21" }));
        jComboBox4HoraAsesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4HoraAsesorActionPerformed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("regresar");

        javax.swing.GroupLayout jFrameAltaAsesorLayout = new javax.swing.GroupLayout(jFrameAltaAsesor.getContentPane());
        jFrameAltaAsesor.getContentPane().setLayout(jFrameAltaAsesorLayout);
        jFrameAltaAsesorLayout.setHorizontalGroup(
            jFrameAltaAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameAltaAsesorLayout.createSequentialGroup()
                .addGroup(jFrameAltaAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrameAltaAsesorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jFrameAltaAsesorLayout.createSequentialGroup()
                        .addGroup(jFrameAltaAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrameAltaAsesorLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jFrameAltaAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameAltaAsesorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jFrameAltaAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jFrameAltaAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox3MateriaAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4HoraAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jFrameAltaAsesorLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton2)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameAltaAsesorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jFrameAltaAsesorLayout.setVerticalGroup(
            jFrameAltaAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameAltaAsesorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addGap(36, 36, 36)
                .addGroup(jFrameAltaAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrameAltaAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrameAltaAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3MateriaAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrameAltaAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox4HoraAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrameAltaAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addGroup(jFrameAltaAsesorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ASESORIAS app");

        botonAsesor.setText("ASESOR");
        botonAsesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAsesorActionPerformed(evt);
            }
        });

        botonAlumno.setText("ALUMNO");
        botonAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlumnoActionPerformed(evt);
            }
        });

        textoBienvenida.setColumns(20);
        textoBienvenida.setRows(5);
        textoBienvenida.setText("Bienvenido a tu aplicacion de asesorias\npor favor selecciona tu roll de usuario:");
        jScrollPane1.setViewportView(textoBienvenida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(botonAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(botonAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAsesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAsesorActionPerformed
       // TODO add your handling code here:
       AsesorFrame.setVisible(true);
       AsesorFrame.setLocation(450,450);
       AsesorFrame.setSize(350, 300);
       
    }//GEN-LAST:event_botonAsesorActionPerformed

    private void botonAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlumnoActionPerformed
        // TODO add your handling code here:
        AlumnoFrame.setVisible(rootPaneCheckingEnabled);
        AlumnoFrame.setLocationRelativeTo(null);
        AlumnoFrame.setSize(350,300);
    }//GEN-LAST:event_botonAlumnoActionPerformed

    private void AltaAsesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaAsesorActionPerformed
        // TODO add your handling code here:
        jFrameAltaAsesor.setVisible(rootPaneCheckingEnabled);
        jFrameAltaAsesor.setLocationRelativeTo(null);
        jFrameAltaAsesor.setSize(450,450);
    }//GEN-LAST:event_AltaAsesorActionPerformed

    private void listaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaAlumnosActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox4HoraAsesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4HoraAsesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4HoraAsesorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        listaAsesores.setVisible(rootPaneCheckingEnabled);
        listaAsesores.setLocationRelativeTo(null);
        listaAsesores.setSize(350, 300);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        AlumnoFrame.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        listaAsesores.dispose();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jList1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jList1ComponentAdded
        // TODO add your handling code here:
        System.out.println("hola");
    }//GEN-LAST:event_jList1ComponentAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AltaAsesor;
    private javax.swing.JFrame AlumnoFrame;
    private javax.swing.JFrame AsesorFrame;
    private javax.swing.JButton botonAlumno;
    private javax.swing.JButton botonAsesor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3MateriaAsesor;
    private javax.swing.JComboBox<String> jComboBox4HoraAsesor;
    private javax.swing.JComboBox<String> jComboBoxMateria;
    private javax.swing.JFrame jFrameAltaAsesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jListaAlumnos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton listaAlumnos;
    private javax.swing.JFrame listaAlumnosFramen;
    private javax.swing.JFrame listaAsesores;
    private javax.swing.JTextArea textoBienvenida;
    // End of variables declaration//GEN-END:variables
}
