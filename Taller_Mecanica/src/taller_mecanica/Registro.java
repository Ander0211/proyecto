
package taller_mecanica;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Registro extends javax.swing.JDialog {

      public ListaDoble lista;
      
    public Registro(java.awt.Frame parent, boolean modal,ListaDoble lista ) {
        super(parent, modal);
        initComponents();
         this.lista = lista;
    }

    
    @SuppressWarnings("unchecked")
   
       
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtidenti = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtmarca = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        txtplaca = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPro = new javax.swing.JTextArea();
        JMotivo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro \"El santo cachon\"");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registrate en \"El Santo Cachon\"");

        txtidenti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidentiKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Placa del vehículo:");

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Identificación del dueño:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre del dueño:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Dirección:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Teléfono:");

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Modelo:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Marca del vehículo:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Motivo de ingreso:");

        txtmarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmarcaKeyTyped(evt);
            }
        });

        txtmodelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmodeloKeyTyped(evt);
            }
        });

        Agregar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Agregar.setText("Agregar Cliente");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        txtPro.setColumns(20);
        txtPro.setForeground(new java.awt.Color(0, 0, 0));
        txtPro.setRows(5);
        jScrollPane1.setViewportView(txtPro);

        JMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mantenimiento básico", "Reparaciones mecánicas", "Servicios de carrocería" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 289, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtidenti)
                                    .addComponent(txtnombre)
                                    .addComponent(txtdireccion)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtplaca, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(txtmodelo)
                                    .addComponent(txtmarca)
                                    .addComponent(JMotivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(366, 366, 366)
                                .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(167, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidenti, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtmodelo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtmarca, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(175, 175, 175)
                .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        
        if (txtidenti.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese la identificacion ");
            txtidenti.requestFocus();
            return;
        }
        if (txtnombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese el nombre ");
            txtnombre.requestFocus();
            return;
        }
        if (txtdireccion.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese la direccion ");
            txtdireccion.requestFocus();
            return;
        }
        if (txtmarca.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, " Ingrese la marca ");
            txtmarca.requestFocus();
            return;
        }
        if (txtmodelo.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, " Ingrese el modelo ");
            txtmodelo.requestFocus();
            return;
        }
       
        if (txtplaca.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese la placa");
            txtplaca.requestFocus();
            return;
        }
        if (txttelefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese el telefono");
            txttelefono.requestFocus();
            return;
        }
       
        
        
        int ID = Integer.parseInt(txtidenti.getText());
        String nom = txtnombre.getText();
        String direcc = txtdireccion.getText();
        String telef = txttelefono.getText();
        String placa = txtplaca.getText();
        String marca = txtmarca.getText();
        String model = txtmodelo.getText();
        String motivo = JMotivo.getSelectedItem().toString();
        Date date = new Date();
        LocalDate fecha = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
     
    
        
        Nodo nue = new Nodo(ID,nom, direcc,telef,placa,marca,model,motivo,fecha);
        lista.insertar(nue);
        JOptionPane.showMessageDialog(this, "Bienvenido al taller Santo Cachon");     
        txtnombre.setText("");
        txttelefono.setText("");
        txtPro.setText("");
        txtdireccion.setText("");
        txtidenti.setText("");
        txtmarca.setText("");
        txtmodelo.setText("");
        
        txtplaca.setText("");
   
        txtPro.setText("");
        txtPro.append("\t\t Registro" + "\n\n");
       
       
    
        
        Nodo aux = lista.pri;

        while (aux != null) {
         
                txtPro.append("Cedula: "+aux.cedula + "\n");
                txtPro.append("Nombre: " + aux.nombre + "\n");
                txtPro.append("Dirección: " + aux.direccion + "\n");
                txtPro.append("Telefono: " + aux.telefono + "\n");
                txtPro.append("Placa: " + aux.placa + "\n");
                txtPro.append("Marca: " + aux.marca+ "\n");
                txtPro.append("Modelo: " + aux.modelo+ "\n");
                txtPro.append("Motivo: " + aux.motivo_i+ "\n");
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String fechaFormateada = dateFormat.format(aux.fec_Ingreso);
                txtPro.append("Fecha: " + fechaFormateada+"\n");
                txtPro.append("_ _ _ _ _ _ _ _ _ _ _ _  _" + "\n");
                
            
            aux = aux.sig;
        }
      
       
    }//GEN-LAST:event_AgregarActionPerformed

    private void txtidentiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidentiKeyTyped
        int key=evt.getKeyChar();
        boolean numero =key>=48 && key <= 57;
        if(!numero){
             evt.consume();
        }
        
    }//GEN-LAST:event_txtidentiKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
       int key=evt.getKeyChar();
        boolean numero =key>=48 && key <= 57;
        if(!numero){
             evt.consume();
        }
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
         int key=evt.getKeyChar();
        boolean numero =key>=48 && key <= 57;
        if(numero){
             evt.consume();
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtmodeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmodeloKeyTyped
         int key=evt.getKeyChar();
        boolean numero =key>=48 && key <= 57;
        if(!numero){
             evt.consume();
        }
    }//GEN-LAST:event_txtmodeloKeyTyped

    private void txtmarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmarcaKeyTyped
         int key=evt.getKeyChar();
        boolean numero =key>=48 && key <= 57;
        if(numero){
             evt.consume();
        }
    }//GEN-LAST:event_txtmarcaKeyTyped

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JComboBox<String> JMotivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtPro;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtidenti;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtplaca;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
