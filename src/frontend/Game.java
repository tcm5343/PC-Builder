/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author mbp5503
 */
public class Game extends javax.swing.JPanel {

    private Mockup myGUI;

    /**
     * Creates new form Game
     */
    public Game(Mockup m) {
        myGUI = m;
        initComponents();
    }

    public Game() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        CancelBtn = new javax.swing.JButton();
        CheckBtn = new javax.swing.JButton();
        GameCmb = new javax.swing.JComboBox<>();
        ResultLabel = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Rock        Papers       Scissors");

        CancelBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        CheckBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CheckBtn.setText("Check Results");
        CheckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBtnActionPerformed(evt);
            }
        });

        GameCmb.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        GameCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rock", "Paper", "Scissor" }));
        GameCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameCmbActionPerformed(evt);
            }
        });

        ResultLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(CheckBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GameCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(ResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GameCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        ResultLabel.setText("");
        GameCmb.setSelectedIndex(0);
        myGUI.changePanel("game", "confirm");
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void CheckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBtnActionPerformed
        int computerNumber = (int) (Math.random() * 3);
        //computerNumber = 0 is scissor
        //computerNumber = 1 is rock
        //computerNumber = 2 is paper
        int userNumber = GameCmb.getSelectedIndex();

        switch (computerNumber) {
            case 0:                              //computer is scissor
                if (userNumber == 0) {
                    ResultLabel.setText("You win");
                } else if (userNumber == 1) {
                    ResultLabel.setText("You lost");
                } else if (userNumber == 2) {
                    ResultLabel.setText("It's a draw");
                }
                break;
            case 1:                          //computer is rock
                if (userNumber == 0) {
                    ResultLabel.setText("It's a draw");
                } else if (userNumber == 1) {
                    ResultLabel.setText("You win");
                } else if (userNumber == 2) {
                    ResultLabel.setText("You lost");
                }
                break;
            case 2:
                if (userNumber == 0) //computer paper
                {
                    ResultLabel.setText("You lost");
                } else if (userNumber == 1) {
                    ResultLabel.setText("It's a draw");
                } else if (userNumber == 2) {
                    ResultLabel.setText("You win");
                }
                break;
        }
    }//GEN-LAST:event_CheckBtnActionPerformed

    private void GameCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GameCmbActionPerformed

    }//GEN-LAST:event_GameCmbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton CheckBtn;
    private javax.swing.JComboBox<String> GameCmb;
    private javax.swing.JLabel ResultLabel;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
