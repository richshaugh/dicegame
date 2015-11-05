/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author SCHOLES
 */
public class Game extends javax.swing.JFrame {

  public int count;
  public int playerscore;
  public int computerscore;
    public Game() {
        initComponents();
        count = 0;
        playerscore = 0;
        computerscore = 0;
    }
    
    public void rollOne(){
        Random rand = new Random();
        int randint = rand.nextInt(6)+1;
        System.out.println(randint);
        if(randint == 1)
        {
            playerscore += randint;
            d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("die11.png")));
            
        }
        else if(randint == 2)
        {
            playerscore += randint;
            d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("die22.png")));
        }
         else if(randint == 3)
        {
            playerscore += randint;
            d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("die33.png")));
        }
        
          else if(randint == 4)
        {
            playerscore += randint;
            d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("die44.png")));
        }
             else if(randint == 5)
        {
            playerscore += randint;
            d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("die55.png")));
        }
        
             else if(randint == 6)
        {
            playerscore += randint;
            d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("die66.png")));
        }
        
        rollThree();
        
    }
    
     public void rollTwo(){
        Random rand = new Random();
        int randint = rand.nextInt(6)+1;
        System.out.println(randint);
        if(randint == 1)
        {
            playerscore += randint;
            d2.setIcon(new javax.swing.ImageIcon(getClass().getResource("die11.png")));
        }
        else if(randint == 2)
        {
            playerscore += randint;
            d2.setIcon(new javax.swing.ImageIcon(getClass().getResource("die22.png")));
        }
         else if(randint == 3)
        {
            playerscore += randint;
            d2.setIcon(new javax.swing.ImageIcon(getClass().getResource("die33.png")));
        }
        
          else if(randint == 4)
        {
            playerscore += randint;
            d2.setIcon(new javax.swing.ImageIcon(getClass().getResource("die44.png")));
        }
             else if(randint == 5)
        {
            playerscore += randint;
            d2.setIcon(new javax.swing.ImageIcon(getClass().getResource("die55.png")));
        }
        
             else if(randint == 6)
        {
            playerscore += randint;
            d2.setIcon(new javax.swing.ImageIcon(getClass().getResource("die66.png")));
        }
        rollFour();
    }
     
      public void rollThree(){
        
        Random rand = new Random();
        int randint = rand.nextInt(6)+1;
        System.out.println(randint);
        if(randint == 1)
        {
            computerscore += randint;
            d3.setIcon(new javax.swing.ImageIcon(getClass().getResource("die11.png")));
        }
        else if(randint == 2)
        {
            computerscore += randint;
            d3.setIcon(new javax.swing.ImageIcon(getClass().getResource("die22.png")));
        }
         else if(randint == 3)
        {
            computerscore += randint;
            d3.setIcon(new javax.swing.ImageIcon(getClass().getResource("die33.png")));
        }
        
          else if(randint == 4)
        {
            computerscore += randint;
            d3.setIcon(new javax.swing.ImageIcon(getClass().getResource("die44.png")));
        }
             else if(randint == 5)
        {
            computerscore += randint;
            d3.setIcon(new javax.swing.ImageIcon(getClass().getResource("die55.png")));
        }
        
             else if(randint == 6)
        {
            computerscore += randint;
            d3.setIcon(new javax.swing.ImageIcon(getClass().getResource("die66.png")));
        }
        
    }
      
       public void rollFour(){
        Random rand = new Random();
        int randint = rand.nextInt(6)+1;
        System.out.println(randint);
        if(randint == 1)
        {
            computerscore += randint;
            d4.setIcon(new javax.swing.ImageIcon(getClass().getResource("die11.png")));
        }
        else if(randint == 2)
        {
            computerscore += randint;
            d4.setIcon(new javax.swing.ImageIcon(getClass().getResource("die22.png")));
        }
         else if(randint == 3)
        {
            computerscore += randint;
            d4.setIcon(new javax.swing.ImageIcon(getClass().getResource("die33.png")));
        }
        
          else if(randint == 4)
        {
            computerscore += randint;
            d4.setIcon(new javax.swing.ImageIcon(getClass().getResource("die44.png")));
        }
             else if(randint == 5)
        {
            computerscore += randint;
            d4.setIcon(new javax.swing.ImageIcon(getClass().getResource("die55.png")));
        }
        
             else if(randint == 6)
        {
            computerscore += randint;
            d4.setIcon(new javax.swing.ImageIcon(getClass().getResource("die6.png")));
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        RollBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Playertf = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Computertf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 102, 255));

        RollBtn.setBackground(new java.awt.Color(204, 204, 204));
        RollBtn.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        RollBtn.setForeground(new java.awt.Color(255, 51, 51));
        RollBtn.setText("Roll");
        RollBtn.setBorder(new javax.swing.border.MatteBorder(null));
        RollBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(RollBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RollBtn)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel1.setText("Player");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel3.setText("Score");

        Playertf.setBackground(new java.awt.Color(102, 102, 255));
        Playertf.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(Playertf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(d1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Playertf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel2.setText("Computer");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setText("Score");

        Computertf.setBackground(new java.awt.Color(255, 102, 102));
        Computertf.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(123, 123, 123))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(Computertf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Computertf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RollBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollBtnActionPerformed
        // TODO add your handling code here:
        count++;
        if(count == 1){rollOne();}
        else if(count == 2){rollTwo();}
        
        
        else if(count == 2){RollBtn.setEnabled(false);}
        Playertf.setText(String.valueOf(playerscore));
        Computertf.setText(String.valueOf(computerscore));
        
        
       
        
    }//GEN-LAST:event_RollBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Computertf;
    private javax.swing.JTextField Playertf;
    private javax.swing.JButton RollBtn;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel d4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
