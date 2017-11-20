/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import static java.lang.Integer.parseInt;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.text.NumberFormatter;
import ulohyprojekt.ConnectionProvider;

/**
 *
 * @author Joseph
 */
public class NewTask extends javax.swing.JFrame {
    private MainForm frame;
    
    /**
     * Creates new form NewTask
     */
    public NewTask(MainForm frame) {
        this.frame = frame;
        initComponents();
        //setLocationRelativeTo(rootPane);
        setTitle("New task");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Date currDate = new Date();
        newTaskDatePicker.setDate(currDate);
        newTaskDatePicker.getEditor().setEditable(false);
        JFormattedTextField spinnerHH = ((JSpinner.NumberEditor) newTaskHH.getEditor()).getTextField();
        JFormattedTextField spinnerMM = ((JSpinner.NumberEditor) newTaskMM.getEditor()).getTextField();
        ((NumberFormatter) spinnerHH.getFormatter()).setAllowsInvalid(false);
        ((NumberFormatter) spinnerMM.getFormatter()).setAllowsInvalid(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        newTaskDesc = new javax.swing.JTextArea();
        btnAddTask = new javax.swing.JButton();
        btnCancelTask = new javax.swing.JButton();
        newTaskDatePicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        newTaskHH = new javax.swing.JSpinner();
        newTaskMM = new javax.swing.JSpinner();

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

        newTaskDatePicker.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newTaskDatePickerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newTaskDatePickerKeyTyped(evt);
            }
        });

        jLabel6.setText("Hour");

        jLabel7.setText("Min");

        newTaskHH.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        newTaskHH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newTaskHHKeyPressed(evt);
            }
        });

        newTaskMM.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddTask, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btnCancelTask, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newTaskHH, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newTaskMM, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newTaskName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newTaskDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
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
                        .addComponent(newTaskDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(newTaskHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newTaskMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
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
        String name = newTaskName.getText().trim();
        String desc = newTaskDesc.getText().trim();
        Date datepicked = newTaskDatePicker.getDate();

        Calendar today = Calendar.getInstance();
        Calendar deadlineDate = new GregorianCalendar();
        deadlineDate.setTime(datepicked);

        commitSpinnerEdit(newTaskHH);
        commitSpinnerEdit(newTaskMM);
        int hodiny = (Integer) newTaskHH.getValue();
        int minuty = (Integer) newTaskMM.getValue();
        
        deadlineDate.set(Calendar.HOUR_OF_DAY, hodiny);
        deadlineDate.set(Calendar.MINUTE, minuty);
        String deadline = dateToString(deadlineDate);
        
        if(newTaskName.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(rootPane, "You need to name your new task.", "Invalid task name", JOptionPane.ERROR_MESSAGE);   
        }else if(deadlineDate.compareTo(today) <= 0){
            JOptionPane.showMessageDialog(rootPane, "Cannot pick past date!", "Invalid deadline", JOptionPane.ERROR_MESSAGE);

        }else{
            ConnectionProvider conn = new ConnectionProvider();
            conn.addTask(name, desc, deadline);
            JOptionPane.showMessageDialog(null, "Task " + name + " added!");
            this.dispose();
        }     
        
        frame.fillTable();

        
        
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

    }//GEN-LAST:event_newTaskDescKeyPressed

    private void newTaskHHKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newTaskHHKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_newTaskHHKeyPressed

    private void newTaskDatePickerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newTaskDatePickerKeyPressed
        
    }//GEN-LAST:event_newTaskDatePickerKeyPressed

    private void newTaskDatePickerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newTaskDatePickerKeyTyped
        
    }//GEN-LAST:event_newTaskDatePickerKeyTyped
    
    private String dateToString(Calendar cal){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(cal.getTimeZone());
        String dateString = sdf.format(cal.getTime());
        return dateString;
    }

    private void commitSpinnerEdit(JSpinner spinner){
        try{
            spinner.commitEdit();
        }catch(java.text.ParseException e){
            System.out.println("Error: " + e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTask;
    private javax.swing.JButton btnCancelTask;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker newTaskDatePicker;
    private javax.swing.JTextArea newTaskDesc;
    private javax.swing.JSpinner newTaskHH;
    private javax.swing.JSpinner newTaskMM;
    private javax.swing.JTextField newTaskName;
    // End of variables declaration//GEN-END:variables
}
