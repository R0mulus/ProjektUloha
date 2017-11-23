/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import ulohyprojekt.ConnectionProvider;
import ulohyprojekt.Task;

/**
 *
 * @author client
 */
public class MainForm extends javax.swing.JFrame {

    private List<Task> Tasks = new ArrayList();
    
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Task organizer");
        fillTable();
        TableColumn tableColumn =  tableTasks.getColumnModel().getColumn(4);
        tableColumn.setMinWidth(0);
        tableColumn.setMaxWidth(0);
        tableColumn.setWidth(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTasks = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAddNewTask = new javax.swing.JMenuItem();
        MainFormMenuFileExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Úlohy");

        tableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Due", "Created", "id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableTasks);
        if (tableTasks.getColumnModel().getColumnCount() > 0) {
            tableTasks.getColumnModel().getColumn(4).setResizable(false);
        }

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        menuAddNewTask.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuAddNewTask.setText("New Task");
        menuAddNewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddNewTaskActionPerformed(evt);
            }
        });
        jMenu1.add(menuAddNewTask);

        MainFormMenuFileExit.setText("Exit");
        MainFormMenuFileExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainFormMenuFileExitActionPerformed(evt);
            }
        });
        jMenu1.add(MainFormMenuFileExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete)
                        .addGap(79, 79, 79))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAddNewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddNewTaskActionPerformed
        NewTask newtask = new NewTask(this);
        newtask.setVisible(true);
    }//GEN-LAST:event_menuAddNewTaskActionPerformed

    private void MainFormMenuFileExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainFormMenuFileExitActionPerformed
        ExitConfirm exitConfirm = new ExitConfirm();
        exitConfirm.setVisible(true);
    }//GEN-LAST:event_MainFormMenuFileExitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DeleteConfirm deleteconfirm = new DeleteConfirm(tableTasks);
        deleteconfirm.setVisible(true);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void fillListWithTasks(){
        ConnectionProvider conn = new ConnectionProvider();
        Tasks = conn.getTasks();
    }
    
    public void fillTable(){
        if(Tasks.isEmpty()){
            fillListWithTasks();
        }else{
            Tasks.removeAll(Tasks);
            fillListWithTasks();
        }
        
        DefaultTableModel model = (DefaultTableModel) tableTasks.getModel();
        
        
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        for (Task task : Tasks) {
            Object[] o = new Object[5];
            o[0] = task.getName();
            o[1] = task.getDesc();
            o[2] = dateToString(task.getDeadline(),true);
            o[3] = dateToString(task.getDateCreated(), false);
            o[4] = task.getId();
            model.addRow(o);
        }
    }
    
    private String dateToString(Date date, boolean time){
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        SimpleDateFormat sdf = time ? new SimpleDateFormat("dd MMM yyyy 'at' HH:mm") : new SimpleDateFormat("dd MMM yyyy");
        sdf.setTimeZone(cal.getTimeZone());
        String dateString = sdf.format(cal.getTime());
        return dateString;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MainFormMenuFileExit;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuAddNewTask;
    private javax.swing.JTable tableTasks;
    // End of variables declaration//GEN-END:variables
}
