package rock_paper_scisor;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class StartPage extends javax.swing.JFrame
{
     ImageIcon crown = new ImageIcon("crown.png");
     ImageIcon exit = new ImageIcon("excla.png");
     
    public StartPage() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        startButton1 = new javax.swing.JButton();
        startButton2 = new javax.swing.JButton();
        startButton3 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        titleLabel.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        titleLabel.setText("Rock Paper Scissor");

        startButton.setBackground(new java.awt.Color(153, 153, 255));
        startButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        startButton.setText("Start");
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startButtonMouseExited(evt);
            }
        });
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        startButton1.setBackground(new java.awt.Color(153, 153, 255));
        startButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        startButton1.setText("Help");
        startButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startButton1MouseExited(evt);
            }
        });
        startButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButton1ActionPerformed(evt);
            }
        });

        startButton2.setBackground(new java.awt.Color(153, 153, 255));
        startButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        startButton2.setText("Exit");
        startButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startButton2MouseExited(evt);
            }
        });
        startButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButton2ActionPerformed(evt);
            }
        });

        startButton3.setBackground(new java.awt.Color(153, 153, 255));
        startButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        startButton3.setText("About");
        startButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startButton3MouseExited(evt);
            }
        });
        startButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(235, 235, 235))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(startButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(startButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(startButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        GameFrame game = new GameFrame();
        game.show();
        dispose();
    }//GEN-LAST:event_startButtonActionPerformed

    private void startButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButton1ActionPerformed
         JOptionPane.showConfirmDialog(null, "Select your move and press 'play' . The winner of each match will get 1 points, Who scores five points first will win the game.", "How to play ", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_startButton1ActionPerformed

    private void startButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButton2ActionPerformed
        int yes_no = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Exit", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, exit);
           if(yes_no == 0)
            {
                dispose();
            }    
    }//GEN-LAST:event_startButton2ActionPerformed

    private void startButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButton3ActionPerformed
        JOptionPane.showConfirmDialog(null, " Evangelist Richard Gomes, ID-10, CSE-20, NDUB", "Created by : ", JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE, crown);
    }//GEN-LAST:event_startButton3ActionPerformed

    private void startButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButton1MouseEntered
        startButton1.setBackground(new java.awt.Color(204, 255, 204));
        startButton1.setFont(new java.awt.Font("Arial ", 0, 16)); 
    }//GEN-LAST:event_startButton1MouseEntered

    private void startButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButton1MouseExited
        startButton1.setBackground(new java.awt.Color(152,153,255));
        startButton1.setFont(new java.awt.Font("Arial ", 0, 14));
    }//GEN-LAST:event_startButton1MouseExited

    private void startButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseEntered
         startButton.setBackground(new java.awt.Color(204, 255, 204));
         startButton.setFont(new java.awt.Font("Arial ", 0, 16)); 
    }//GEN-LAST:event_startButtonMouseEntered

    private void startButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseExited
          startButton.setBackground(new java.awt.Color(152,153,255));
          startButton.setFont(new java.awt.Font("Arial ", 0, 14));
    }//GEN-LAST:event_startButtonMouseExited

    private void startButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButton3MouseEntered
         startButton3.setBackground(new java.awt.Color(204, 255, 204));
         startButton3.setFont(new java.awt.Font("Arial ", 0, 16)); 
    }//GEN-LAST:event_startButton3MouseEntered

    private void startButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButton3MouseExited
          startButton3.setBackground(new java.awt.Color(152,153,255));
          startButton3.setFont(new java.awt.Font("Arial ", 0, 14));
    }//GEN-LAST:event_startButton3MouseExited

    private void startButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButton2MouseEntered
          startButton2.setBackground(new java.awt.Color(204, 255, 204));
          startButton2.setFont(new java.awt.Font("Arial ", 0, 16));
    }//GEN-LAST:event_startButton2MouseEntered

    private void startButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButton2MouseExited
          startButton2.setBackground(new java.awt.Color(152,153,255));
          startButton2.setFont(new java.awt.Font("Arial ", 0, 14));
    }//GEN-LAST:event_startButton2MouseExited

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton startButton;
    private javax.swing.JButton startButton1;
    private javax.swing.JButton startButton2;
    private javax.swing.JButton startButton3;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
