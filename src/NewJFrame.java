
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {
    public NewJFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        denemePaketi = new javax.swing.JCheckBox();
        ucuzPaket = new javax.swing.JCheckBox();
        ortaPaket = new javax.swing.JCheckBox();
        zenginPaket = new javax.swing.JCheckBox();
        bilgi = new javax.swing.JButton();
        abonelik = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Odeme Planı");

        denemePaketi.setText("Deneme Süresi 7 Gün(Hemen Başla)");

        ucuzPaket.setText("1 Aylık Temel üyelik: 17,99 TL/ay - Tek cihaz, SD çözünürlük.");

        ortaPaket.setText("Standart HD: 29,99 TL/ay - İki cihaz, HD çözünürlük.");

        zenginPaket.setText("Özel Ultra HD: 41,99 TL/ay - 4 cihaz, Full ve Ultra HD çözünürlük.");

        bilgi.setText("Ayrıntılı Bilgi için Tıklayınız");

        abonelik.setText("Abonelik Başlatmak/Yenilemek");
        abonelik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abonelikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(abonelik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ucuzPaket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(denemePaketi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ortaPaket, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                    .addComponent(zenginPaket, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(denemePaketi)
                .addGap(18, 18, 18)
                .addComponent(ucuzPaket)
                .addGap(18, 18, 18)
                .addComponent(ortaPaket)
                .addGap(18, 18, 18)
                .addComponent(zenginPaket)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bilgi, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(abonelik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abonelikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abonelikActionPerformed
       
    
        
        int sure ;
        
        if(!(denemePaketi.isSelected()) && !(ucuzPaket.isSelected()) && !(ortaPaket.isSelected()) && !(zenginPaket.isSelected())){
        String ms="Lütfen bir seçim yapınız";
        JOptionPane.showMessageDialog(this, ms);
        }else{
            
       
        String message ="Ödeme Işlemleri için Yönlendirliyorsunuz.\nLütfen Devam etmek için Ok'a basınız";
        
        JOptionPane.showMessageDialog(this, message);
        
        second sc = new second();
        sc.setVisible(true);
        close();}
        
    }//GEN-LAST:event_abonelikActionPerformed
public void close(){
    WindowEvent closeWindowEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindowEvent);
}
   
    public static void main(String args[]) {
       
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abonelik;
    private javax.swing.JButton bilgi;
    private javax.swing.JCheckBox denemePaketi;
    private javax.swing.JCheckBox ortaPaket;
    private javax.swing.JCheckBox ucuzPaket;
    private javax.swing.JCheckBox zenginPaket;
    // End of variables declaration//GEN-END:variables
}
