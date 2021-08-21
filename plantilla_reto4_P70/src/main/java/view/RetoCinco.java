package view;

/**
 *
 * @author juliansoto
 */
public class RetoCinco extends javax.swing.JFrame {

    /**
     * Creates new form RetoCinco
     */
    public RetoCinco() {
        initComponents();
        setLocationRelativeTo(null);//pone la ventana en el centro de la pantalla

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnEnun1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reto Cinco UTP");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RETO 5 MISION 2022 - UTP");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEnun1.setBackground(new java.awt.Color(255, 255, 255));
        btnEnun1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnEnun1.setForeground(new java.awt.Color(0, 51, 102));
        btnEnun1.setText("<html><center>Enunciado Asesor por Ciudad<html><center>");
        btnEnun1.setMaximumSize(new java.awt.Dimension(50, 28));
        btnEnun1.setMinimumSize(new java.awt.Dimension(50, 28));
        btnEnun1.setPreferredSize(new java.awt.Dimension(50, 28));
        btnEnun1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnun1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnun1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 18, 182, 120));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 102));
        jButton3.setText("<html><center>Enunciado Compras por Proveedor<html><center>");
        jButton3.setMaximumSize(new java.awt.Dimension(50, 28));
        jButton3.setMinimumSize(new java.awt.Dimension(50, 28));
        jButton3.setPreferredSize(new java.awt.Dimension(50, 28));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 182, 120));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 102));
        jButton4.setText(("<html><center>Enunciado Proyectos Casa Campestre<html><center>"));
        jButton4.setMaximumSize(new java.awt.Dimension(50, 28));
        jButton4.setMinimumSize(new java.awt.Dimension(50, 28));
        jButton4.setPreferredSize(new java.awt.Dimension(50, 28));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 182, 120));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Avenir", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Julian Soto. V1.0");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnun1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnun1ActionPerformed
        VistaResUno v1 = new VistaResUno();
        v1.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnEnun1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        VistaResDos v2 = new VistaResDos();
        v2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        VistaResTres v3 = new VistaResTres();
        v3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnun1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
