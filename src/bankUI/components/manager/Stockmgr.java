/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bankUI.components.manager;

import Utils.Result;
import bankBackend.Config;
import bankBackend.entity.Stock;
import bankBackend.service.SvcMgr;
import bankUI.utils.AlertUI;

/**
 * @author NathanY
 */
public class Stockmgr extends javax.swing.JPanel {

    /**
     * Creates new form Stockmgr
     */
    public Stockmgr() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameF = new javax.swing.JTextField();
        textF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        amountF = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        dropBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        columnF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        valueF = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();

        jLabel1.setText("name");

        jLabel2.setText("price");

        jLabel3.setText("amount");

        addBtn.setText("add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        dropBtn.setText("drop");
        dropBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("stockName");

        jLabel5.setText("price");

        updateBtn.setText("update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(columnF, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(valueF))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(9, 9, 9)
                                                .addComponent(nameF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(textF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(amountF, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dropBtn))
                                        .addComponent(updateBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(nameF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(amountF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addBtn)
                                        .addComponent(dropBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(columnF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(valueF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(updateBtn))
                                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        String stockName = columnF.getText();
        int price = 0;
        try {
            price = Integer.parseInt(valueF.getText());
        } catch (NumberFormatException e) {
            AlertUI.error("Please enter a valid number");
            return;
        }
        if (price < 0) {
            AlertUI.error("Please enter a valid number");
            return;
        }
        if (stockName.equals("")) {
            AlertUI.error("Please enter a valid stock name");
            return;
        }
        Result r = SvcMgr.getStockService().updatePrice(stockName, price);
        if (!r.success) {
            AlertUI.error(r.msg);
        } else {
            AlertUI.success(r.msg);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        Stock stock = new Stock();
        if (nameF.getText().equals("") || textF.getText().equals("") || amountF.getText().equals("")) {
            AlertUI.error("Please enter a valid param");
            return;
        }
        int amount = 0;
        try {
            amount = Integer.parseInt(amountF.getText());
        } catch (NumberFormatException e) {
            AlertUI.error("Please enter a valid number");
            return;
        }
        int price = 0;
        try {
            price = Integer.parseInt(textF.getText());
        } catch (NumberFormatException e) {
            AlertUI.error("Please enter a valid number");
            return;
        }
        stock.setName(nameF.getText());
        stock.setBuyInPrice(price);
        stock.setCurrentPrice(price);
        stock.setUserId(Config.STOCK_MANAGER_USER_ID);
        stock.setAmount(amount);
        Result r = SvcMgr.getStockService().addStock(stock);
        if (!r.success) {
            AlertUI.error(r.msg);
        } else {
            AlertUI.success(r.msg);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void dropBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropBtnActionPerformed
        // TODO add your handling code here:
        String stockName = nameF.getText();
        if (stockName.equals("")) {
            AlertUI.error("Please enter a valid stock name");
            return;
        }
        Result r = SvcMgr.getStockService().removeStock(stockName);
        if (!r.success) {
            AlertUI.error(r.msg);
        } else {
            AlertUI.success(r.msg);
        }
    }//GEN-LAST:event_dropBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField amountF;
    private javax.swing.JTextField columnF;
    private javax.swing.JButton dropBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    javax.swing.JTextField nameF;
    private javax.swing.JTextField textF;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField valueF;
    // End of variables declaration//GEN-END:variables
}
