/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ulohyprojekt.ConnectionProvider;

/**
 *
 * @author Joseph
 */
public class NewTask extends javax.swing.JFrame {

    /**
     * Creates new form NewTask
     */
    public NewTask() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        newTaskName = new javax.swing.JTextField();
        newTaskDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        newTaskDesc = new javax.swing.JTextArea();
        newTaskTime = new javax.swing.JTextField();
        btnAddTask = new javax.swing.JButton();
        btnCancelTask = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("New Task");

        jLabel2.setText("Name");

        jLabel3.setText("Description");

        jLabel4.setText("Date");

        jLabel5.setText("Time");

        newTaskName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newTaskNameKeyTyped(evt);
            }
        });

        newTaskDesc.setColumns(20);
        newTaskDesc.setLineWrap(true);
        newTaskDesc.setRows(5);
        newTaskDesc.setMaximumSize(new java.awt.Dimension(181, 66));
        newTaskDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newTaskDescKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newTaskDescKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(newTaskDesc);

        btnAddTask.setText("OK");
        btnAddTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTaskActionPerformed(evt);
            }
        });

        btnCancelTask.setText("Cancel");
        btnCancelTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelTaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newTaskName)
                            .addComponent(newTaskDate)
                            .addComponent(newTaskTime)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))))
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAddTask, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelTask, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(newTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(newTaskDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newTaskTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddTask)
                    .addComponent(btnCancelTask))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelTaskActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelTaskActionPerformed

    private void btnAddTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTaskActionPerformed
        String name = newTaskName.getText();
        String desc = newTaskDesc.getText();
        String deadline = newTaskDate.getText() + " " + newTaskTime.getText();
        
        if(newTaskName.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(null, "You need to name your new task.");
        }else if(newTaskDesc.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(null, "You need to put description on your new task.");
        }else if(newTaskDate.getText().trim().length() != 10){
            JOptionPane.showMessageDialog(null, "Like this: YYYY-MM-DD");
        }else if(newTaskTime.getText().trim().length() !=5){
            JOptionPane.showMessageDialog(null, "Like this: HH:MM");
        }else{
            ConnectionProvider conn = new ConnectionProvider();
            conn.addTask(name, desc, deadline);
            JOptionPane.showMessageDialog(null, "Task " + name + " added!");
            this.dispose();
        }

    }//GEN-LAST:event_btnAddTaskActionPerformed

    private void newTaskNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newTaskNameKeyTyped
        if(newTaskName.getText().length() >= 30){
            evt.consume();
        }
    }//GEN-LAST:event_newTaskNameKeyTyped

    private void newTaskDescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newTaskDescKeyTyped
        newTaskDesc.setFocusTraversalKeysEnabled(false);
        if(newTaskDesc.getText().length() >= 144){
            evt.consume();
        }
    }//GEN-LAST:event_newTaskDescKeyTyped

    private void newTaskDescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newTaskDescKeyPressed
        //newTaskDesc.setFocusTraversalKeysEnabled(true);
        if(evt.equals(KeyEvent.VK_TAB)){
            evt.consume();
            System.out.println("tab pressed");
        }
    }//GEN-LAST:event_newTaskDescKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTask;
    private javax.swing.JButton btnCancelTask;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField newTaskDate;
    private javax.swing.JTextArea newTaskDesc;
    private javax.swing.JTextField newTaskName;
    private javax.swing.JTextField newTaskTime;
    // End of variables declaration//GEN-END:variables
}