package interfaz;

import java.util.logging.Level;
import java.util.logging.Logger;

import rojeru_san.complementos.RSAnimation;



public class DialogWithAnimation extends javax.swing.JDialog 
{

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );

        pack();
    }//GEN-END:initComponents

     public DialogWithAnimation(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        RSAnimation f = new RSAnimation();
        f.setBajar(-150, 170, 1, 2, this);
        
    }
      public DialogWithAnimation(java.awt.Frame parent, boolean modal,int posFinal) 
    {
        super(parent, modal);
        initComponents();
        RSAnimation f = new RSAnimation();
        f.setBajar(-150, posFinal, 1, 2, this);
        
        
    }
    
     public void cerrar()
     {
         RSAnimation f = new RSAnimation();
         f.setSubir(170, -350, 1, 2, this);
        try
        {
            Thread.sleep(300);
            this.dispose();
                    
        } catch (InterruptedException ex)
        {
            Logger.getLogger(DialogWithAnimation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
