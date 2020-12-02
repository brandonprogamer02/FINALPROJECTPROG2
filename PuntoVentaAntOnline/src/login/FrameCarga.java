package login;

public class FrameCarga extends javax.swing.JFrame {

    public FrameCarga() 
    {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        panelCarga5 = new javax.swing.JPanel();
        rSProgressMaterial6 = new rojerusan.componentes.RSProgressMaterial();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridLayout());

        panelCarga5.setBackground(new java.awt.Color(255, 255, 255));
        panelCarga5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 112, 192), 3));
        panelCarga5.setMaximumSize(new java.awt.Dimension(256, 210));
        panelCarga5.setMinimumSize(new java.awt.Dimension(256, 210));

        rSProgressMaterial6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Espera mientra se carga");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("La aplicacion ...");

        javax.swing.GroupLayout panelCarga5Layout = new javax.swing.GroupLayout(panelCarga5);
        panelCarga5.setLayout(panelCarga5Layout);
        panelCarga5Layout.setHorizontalGroup(
            panelCarga5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarga5Layout.createSequentialGroup()
                .addGroup(panelCarga5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCarga5Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(rSProgressMaterial6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 76, Short.MAX_VALUE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelCarga5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelCarga5Layout.setVerticalGroup(
            panelCarga5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarga5Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(rSProgressMaterial6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(21, 21, 21))
        );

        getContentPane().add(panelCarga5);

        pack();
    }//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FrameCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FrameCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FrameCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FrameCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel panelCarga;
    public javax.swing.JPanel panelCarga1;
    public javax.swing.JPanel panelCarga2;
    public javax.swing.JPanel panelCarga3;
    public javax.swing.JPanel panelCarga4;
    public javax.swing.JPanel panelCarga5;
    public rojerusan.componentes.RSProgressMaterial rSProgressMaterial1;
    public rojerusan.componentes.RSProgressMaterial rSProgressMaterial2;
    public rojerusan.componentes.RSProgressMaterial rSProgressMaterial3;
    public rojerusan.componentes.RSProgressMaterial rSProgressMaterial4;
    public rojerusan.componentes.RSProgressMaterial rSProgressMaterial5;
    public rojerusan.componentes.RSProgressMaterial rSProgressMaterial6;
    // End of variables declaration//GEN-END:variables
}
