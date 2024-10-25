package rock_paper_scisor;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GameFrame extends javax.swing.JFrame
{
      int youWin = 0;
      int computerWins = 0;
      int gameRound = 0;
      char bot, player;
      
      ImageIcon rock = new ImageIcon("rock.png");
      ImageIcon paper = new ImageIcon("paper.png");
      ImageIcon scissor = new ImageIcon("scissor.png");
      ImageIcon rock1 = new ImageIcon("rock1.png");
      ImageIcon paper1 = new ImageIcon("paper1.png");
      ImageIcon scissor1 = new ImageIcon("scissor1.png");
      ImageIcon trophy = new ImageIcon("Trophy.png");
      ImageIcon question = new ImageIcon("question.png");
            
    public GameFrame()      //constructor
    {
        initComponents();
        
        playerPicLabel.setText("");
        computerPicLabel.setText("");
        
        resultShow.setVisible(false);
        resultShow.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        selectLabel = new javax.swing.JLabel();
        rockButton = new javax.swing.JButton();
        paperButton = new javax.swing.JButton();
        scisorButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        computerPicLabel = new javax.swing.JLabel();
        playerPicLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cPanel = new javax.swing.JLabel();
        uPanel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        resultShow = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        roundLabel = new javax.swing.JLabel();
        mainMenu = new javax.swing.JButton();
        restart = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        titleLabel.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 102, 0));
        titleLabel.setText("Rock Paper Scissor");

        selectLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        selectLabel.setText("Select an option :");

        rockButton.setBackground(new java.awt.Color(255, 204, 204));
        rockButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rockButton.setText("Rock");
        rockButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rockButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rockButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rockButtonMouseExited(evt);
            }
        });
        rockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockButtonActionPerformed(evt);
            }
        });

        paperButton.setBackground(new java.awt.Color(255, 204, 204));
        paperButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        paperButton.setText("Paper");
        paperButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paperButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paperButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paperButtonMouseExited(evt);
            }
        });
        paperButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperButtonActionPerformed(evt);
            }
        });

        scisorButton.setBackground(new java.awt.Color(255, 204, 204));
        scisorButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        scisorButton.setText("Scisor");
        scisorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        scisorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                scisorButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                scisorButtonMouseExited(evt);
            }
        });
        scisorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scisorButtonActionPerformed(evt);
            }
        });

        playButton.setBackground(new java.awt.Color(204, 255, 204));
        playButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        playButton.setText("Play");
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                playButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                playButtonMouseExited(evt);
            }
        });
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        computerPicLabel.setText("jLabel3");

        playerPicLabel.setText("jLabel3");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel3.setText("-");

        cPanel.setFont(new java.awt.Font("Arial Black", 0, 19)); // NOI18N
        cPanel.setForeground(new java.awt.Color(255, 0, 0));
        cPanel.setText("0");

        uPanel.setFont(new java.awt.Font("Arial Black", 0, 19)); // NOI18N
        uPanel.setForeground(new java.awt.Color(0, 204, 0));
        uPanel.setText("0");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel2.setText("You");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setText("Computer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(uPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(cPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        resultShow.setBackground(new java.awt.Color(255, 255, 255));
        resultShow.setText("jLabel5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(playerPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(computerPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultShow, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(computerPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(resultShow, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Round  :");

        roundLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        roundLabel.setText("0");

        mainMenu.setBackground(new java.awt.Color(153, 153, 255));
        mainMenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mainMenu.setText("Main Menu");
        mainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainMenuMouseExited(evt);
            }
        });
        mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuActionPerformed(evt);
            }
        });

        restart.setBackground(new java.awt.Color(153, 153, 255));
        restart.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        restart.setText("Restart");
        restart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                restartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                restartMouseExited(evt);
            }
        });
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(rockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(selectLabel)
                        .addGap(37, 37, 37)))
                .addComponent(paperButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(scisorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(restart, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paperButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scisorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(roundLabel)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restart, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed

        gameRound++;
        roundLabel.setText(String.valueOf(gameRound));

        Random random = new Random();
        char[] dice = {'r', 'p', 's'};
        bot = dice[random.nextInt(dice.length)];

        if(bot == 'r')
        {
            computerPicLabel.setIcon(rock1);
            computerPicLabel.setVisible(true);

            if( player == 'p')
            youWin++;
            else if(player == 's')
            computerWins++;
            uPanel.setText(String.valueOf(youWin));
            cPanel.setText(String.valueOf(computerWins));
        }

        else if(bot == 'p')
        {
            computerPicLabel.setIcon(paper1);
            computerPicLabel.setVisible(true);

            if( player == 'r')
            computerWins++;
            else if(player == 's')
            youWin++;
            uPanel.setText(String.valueOf(youWin));
            cPanel.setText(String.valueOf(computerWins));
        }

        else
        {
            computerPicLabel.setIcon(scissor1);
            computerPicLabel.setVisible(true);

            if( player == 'r')
            youWin++;
            else if(player == 'p')
            computerWins++;
            uPanel.setText(String.valueOf(youWin));
            cPanel.setText(String.valueOf(computerWins));
        }

        if(youWin == 5 || computerWins == 5)
        {
            if(youWin == 5)
            {
                JOptionPane.showConfirmDialog(null, "... Congratulations ! You won ...", "Result", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, trophy);
            }

            else
            {
                JOptionPane.showConfirmDialog(null, "... Computer wins ...", "Result", JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE, trophy);
            }
            
            int yes_no = JOptionPane.showConfirmDialog(null, "Want to play a new match ?", "Play Again", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, question);
           if(yes_no == 0)      //yes = 0
            {
               playerPicLabel.setText("");
               computerPicLabel.setText("");
                youWin = 0;
                computerWins = 0;
                uPanel.setText(String.valueOf(youWin));
                cPanel.setText(String.valueOf(computerWins));
                gameRound = 0;
                roundLabel.setText(String.valueOf(gameRound));
            }
           
           else
               dispose();
        }
    }//GEN-LAST:event_playButtonActionPerformed

    private void playButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseExited
        playButton.setBackground(new java.awt.Color(204, 255, 204));
        playButton.setFont(new java.awt.Font("Arial Black", 0, 14)); 
    }//GEN-LAST:event_playButtonMouseExited

    private void playButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseEntered
        playButton.setBackground(new java.awt.Color(152, 255, 153));
        playButton.setFont(new java.awt.Font("Arial Black", 0, 16)); 

    }//GEN-LAST:event_playButtonMouseEntered

    private void scisorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scisorButtonActionPerformed
        playerPicLabel.setIcon(scissor);
        playerPicLabel.setVisible(true);
        player = 's';
    }//GEN-LAST:event_scisorButtonActionPerformed

    private void scisorButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scisorButtonMouseExited
        scisorButton.setBackground(new java.awt.Color(255, 204, 204));
        scisorButton.setFont(new java.awt.Font("Arial Black", 0, 12)); 
    }//GEN-LAST:event_scisorButtonMouseExited

    private void scisorButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scisorButtonMouseEntered
        scisorButton.setBackground(new java.awt.Color(255, 153, 153));
       scisorButton.setFont(new java.awt.Font("Arial Black", 0, 14)); 
    }//GEN-LAST:event_scisorButtonMouseEntered

    private void paperButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperButtonActionPerformed
        playerPicLabel.setIcon(paper);
        playerPicLabel.setVisible(true);
        player = 'p';
    }//GEN-LAST:event_paperButtonActionPerformed

    private void paperButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paperButtonMouseExited
        paperButton.setBackground(new java.awt.Color(255, 204, 204));
        paperButton.setFont(new java.awt.Font("Arial Black", 0, 12)); 
    }//GEN-LAST:event_paperButtonMouseExited

    private void paperButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paperButtonMouseEntered
        paperButton.setBackground(new java.awt.Color(255, 153, 153));
        paperButton.setFont(new java.awt.Font("Arial Black", 0, 14)); 
    }//GEN-LAST:event_paperButtonMouseEntered

    private void rockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockButtonActionPerformed
        playerPicLabel.setIcon(rock);
        playerPicLabel.setVisible(true);
        player = 'r';
    }//GEN-LAST:event_rockButtonActionPerformed

    private void rockButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rockButtonMouseExited
        rockButton.setBackground(new java.awt.Color(255, 204, 204));
        rockButton.setFont(new java.awt.Font("Arial Black", 0, 12)); 
    }//GEN-LAST:event_rockButtonMouseExited

    private void rockButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rockButtonMouseEntered
        rockButton.setBackground(new java.awt.Color(255, 153, 153));
        rockButton.setFont(new java.awt.Font("Arial Black", 0, 14)); 
    }//GEN-LAST:event_rockButtonMouseEntered

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
                 GameFrame again = new GameFrame();
                 again.show();
                 dispose();
               
                youWin = 0;
                computerWins = 0;
                uPanel.setText(String.valueOf(youWin));
                cPanel.setText(String.valueOf(computerWins));
                gameRound = 0;
                roundLabel.setText(String.valueOf(gameRound));
    }//GEN-LAST:event_restartActionPerformed

    private void mainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuActionPerformed
        StartPage start =new StartPage();
        start.show();
        dispose();
    }//GEN-LAST:event_mainMenuActionPerformed

    private void restartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restartMouseEntered
         restart.setBackground(new java.awt.Color(204, 255, 204));
         restart.setFont(new java.awt.Font("Arial Black", 0, 12)); 
    }//GEN-LAST:event_restartMouseEntered

    private void restartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restartMouseExited
          restart.setBackground(new java.awt.Color(152,153,255));
          restart.setFont(new java.awt.Font("Arial ", 0, 14));
    }//GEN-LAST:event_restartMouseExited

    private void mainMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMenuMouseEntered
        mainMenu.setBackground(new java.awt.Color(204, 255, 204));
        mainMenu.setFont(new java.awt.Font("Arial Black", 0, 12)); 
    }//GEN-LAST:event_mainMenuMouseEntered

    private void mainMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMenuMouseExited
          mainMenu.setBackground(new java.awt.Color(152,153,255));
          mainMenu.setFont(new java.awt.Font("Arial ", 0, 14));
    }//GEN-LAST:event_mainMenuMouseExited

    
    public static void main(String args[])      //main_method
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cPanel;
    private javax.swing.JLabel computerPicLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton mainMenu;
    private javax.swing.JButton paperButton;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel playerPicLabel;
    private javax.swing.JButton restart;
    private javax.swing.JLabel resultShow;
    private javax.swing.JButton rockButton;
    private javax.swing.JLabel roundLabel;
    private javax.swing.JButton scisorButton;
    private javax.swing.JLabel selectLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel uPanel;
    // End of variables declaration//GEN-END:variables
}
