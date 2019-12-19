/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.*;
import java.util.ArrayList;

/**
 *
 * @author mbp5503
 */
public class ConfirmationPage extends javax.swing.JPanel {

    private Mockup myGUI;

    /**
     * Creates new form ConfirmationPage
     */
    public ConfirmationPage() {
        initComponents();
    }

    public ConfirmationPage(Mockup m) {
        myGUI = m;
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

        GameBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BuildTxtArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        ContinueShoppingBtn = new javax.swing.JButton();
        TotalPriceTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        GameBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        GameBtn.setText("Play Game");
        GameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Your Computer Build: ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Would you like to continue shopping or play a game?");

        BuildTxtArea.setEditable(false);
        BuildTxtArea.setColumns(20);
        BuildTxtArea.setRows(5);
        jScrollPane1.setViewportView(BuildTxtArea);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Thank you for building PC with us !!");

        ContinueShoppingBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ContinueShoppingBtn.setText("Continue Shopping");
        ContinueShoppingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueShoppingBtnActionPerformed(evt);
            }
        });

        TotalPriceTxt.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Total Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(GameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(ContinueShoppingBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TotalPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContinueShoppingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ContinueShoppingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueShoppingBtnActionPerformed
        myGUI.getBuildPC().reset();
        myGUI.getIndComp().reset();
        reset();
        myGUI.changePanel("confirm", "customer");
    }//GEN-LAST:event_ContinueShoppingBtnActionPerformed

    private void GameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GameBtnActionPerformed
        
        myGUI.changePanel("confirm", "game");
    }//GEN-LAST:event_GameBtnActionPerformed

    private void reset(){
        // clears text area and price
        BuildTxtArea.setText(null);
        TotalPriceTxt.setText("");
    }
    
    // displays
    protected void display(Item item) {
        // displays price
        TotalPriceTxt.setText(Double.toString((int) myGUI.getIndComp().getQty().getValue() * item.getPrice()));

        if (item instanceof CPU) {
            BuildTxtArea.append("CPU: ");
            BuildTxtArea.append(item.getName() + " Socket: " + ((CPU) item).getSocket() + "\n");
        } else if (item instanceof MOBO) {
            BuildTxtArea.append("MOBO: ");
            BuildTxtArea.append(item.getName() + " Socket: " + ((MOBO) item).getSocket() + " Size: " + ((MOBO) item).getSizeName(((MOBO) item).getSize()) + "\n");
        } else if (item instanceof RAM) {
            BuildTxtArea.append("RAM: ");
            BuildTxtArea.append(item.getName() + " Ram Type: DDR" + ((RAM) item).getRamType() + "\n");
        } else if (item instanceof GPU) {
            BuildTxtArea.append("GPU: ");
            BuildTxtArea.append(item.getName() + " Power: " + ((GPU) item).getPower() + "W\n");
        } else if (item instanceof PSU) {
            BuildTxtArea.append("PSU: ");
            BuildTxtArea.append(item.getName() + " Power Output: " + ((PSU) item).getPower() + "W\n");
        } else if (item instanceof Case) {
            BuildTxtArea.append("Case: ");
            BuildTxtArea.append(item.getName() + " Size: " + ((Case) item).getSizeName(((Case) item).getSize()) + "\n");
        } else {
            System.out.println("Lets hope it never comes to this...");
        }
    }

    protected void displayQuantity() {
        int quantity = (int) myGUI.getIndComp().getQty().getValue();
        if (quantity != 0) {
            BuildTxtArea.append("\nQuantity: " + quantity);
        } else {
            BuildTxtArea.append("Quantity: 1\n");
        }
    }

    protected void displayCart() {

        ArrayList<Item> cart = myGUI.getBuildPC().cart;
        double price = 0;

        for (Item item : cart) {
            price += item.getPrice();
            display(item);
            displayQuantity();
        } // end of for loop

        TotalPriceTxt.setText(Double.toString(price));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea BuildTxtArea;
    private javax.swing.JButton ContinueShoppingBtn;
    private javax.swing.JButton GameBtn;
    private javax.swing.JTextField TotalPriceTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
