/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_mecanica;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Administrador extends javax.swing.JDialog {
    public int r = 0;
    ListaDoble lista;

    /**
     * Creates new form Administrador
     */
    public Administrador(java.awt.Frame parent, boolean modal, ListaDoble lista) {
        super(parent, modal);
        initComponents();
        this.lista = lista;
        if (lista == null) {
            this.lista = new ListaDoble();
        } else {
            this.lista = lista;
        }
    }

    
    @SuppressWarnings("unchecked")
     private double calcularTotalRecaudado(String mes, String año, String tipoServicio) {
         
        return 0;
         
     }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bntrepor1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtresultado = new javax.swing.JTextArea();
        Jservicio = new javax.swing.JComboBox<>();
        JFecha3 = new com.toedter.calendar.JDateChooser();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrador");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Administración \"El Santo Cachon\"");

        bntrepor1.setText("Generar Reporte");
        bntrepor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntrepor1ActionPerformed(evt);
            }
        });

        txtresultado.setColumns(20);
        txtresultado.setRows(5);
        jScrollPane1.setViewportView(txtresultado);

        Jservicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mano de obra", "Repuestos", "Insumos", "Reparaciones" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(JFecha3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Jservicio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(bntrepor1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(Jservicio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JFecha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(bntrepor1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private String generarReporte(String mes, String año, String tipoServicio) {
        
        StringBuilder reporte = new StringBuilder();
        reporte.append("Reporte de ganancias\n");
        reporte.append("Mes: ").append(mes).append("\n");
        reporte.append("Año: ").append(año).append("\n");
        reporte.append("Tipo de Servicio: ").append(tipoServicio).append("\n");
        reporte.append("Total recaudado: ").append(calcularTotalRecaudado(mes, año, tipoServicio)).append("\n");

        return reporte.toString();
    }
    private void bntrepor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntrepor1ActionPerformed
    
        Nodo aux = lista.pri;
        txtresultado.setText("");

        double sumaEnero = 0;
        double sumaFebrero = 0;
        double sumaMarzo = 0;
        double sumaAbril = 0;
        double sumaMayo = 0;
        double sumaJunio = 0;
        double sumaJulio = 0;
        double sumaAgosto = 0;
        double sumaSeptiembre = 0;
        double sumaOctubre = 0;
        double sumaNoviembre = 0;
        double sumaDiciembre = 0;
        while (aux != null && aux.fec_Ingreso != null) {
            
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(aux.fec_Ingreso);
            int mesActual = calendar.get(Calendar.MONTH) + 1;

            double sumaMensual = 0;

            NodoRep aux2 = aux.priRep;
            
            while (aux2 != null) {
                
                aux2 = aux2.sigREP;
            }
            switch (mesActual) {
                case 1:
                    sumaEnero += sumaMensual;
                    break;
                case 2:
                    sumaFebrero += sumaMensual;
                    break;
                case 3:
                    sumaMarzo += sumaMensual;
                    break;
                case 4:
                    sumaAbril += sumaMensual;
                    break;
                case 5:
                    sumaMayo += sumaMensual;
                    break;
                case 6:
                    sumaJunio += sumaMensual;
                    break;
                case 7:
                    sumaJulio += sumaMensual;
                    break;
                case 8:
                    sumaAgosto += sumaMensual;
                    break;
                case 9:
                    sumaSeptiembre += sumaMensual;
                    break;
                case 10:
                    sumaOctubre += sumaMensual;
                    break;
                case 11:
                    sumaNoviembre += sumaMensual;
                    break;
                case 12:
                    sumaDiciembre += sumaMensual;
                    break;
                default:
                    break;
            }

            aux = aux.sig;
        }
        // Mostrar las sumas por cada mes
        txtresultado.append("Recaudado en Enero: $" + sumaEnero + "\n");
        txtresultado.append("Recaudado en Febrero: $" + sumaFebrero + "\n");
        txtresultado.append("Recaudado en Marzo: $" + sumaMarzo + "\n");
        txtresultado.append("Recaudado en Abril: $" + sumaAbril + "\n");
        txtresultado.append("Recaudado en Mayo: $" + sumaMayo + "\n");
        txtresultado.append("Recaudado en Junio: $" + sumaJunio + "\n");
        txtresultado.append("Recaudado en Julio: $" + sumaJulio + "\n");
        txtresultado.append("Recaudado en Agosto: $" + sumaAgosto + "\n");
        txtresultado.append("Recaudado en Septiembre: $" + sumaSeptiembre + "\n");
        txtresultado.append("Recaudado en Octubre: $" + sumaOctubre + "\n");
        txtresultado.append("Recaudado en Noviembre: $" + sumaNoviembre + "\n");
        txtresultado.append("Recaudado en Diciembre: $" + sumaDiciembre + "\n");
    }//GEN-LAST:event_bntrepor1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JFecha3;
    private javax.swing.JComboBox<String> Jservicio;
    private javax.swing.JButton bntrepor1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtresultado;
    // End of variables declaration//GEN-END:variables

   
}
