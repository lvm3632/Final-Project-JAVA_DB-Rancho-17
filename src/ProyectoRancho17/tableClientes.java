
package ProyectoRancho17;
import Connection.*;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Thread.State.NEW;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFrame;

public class tableClientes extends javax.swing.JFrame {



  
    //private static DecimalFormat df2 = new DecimalFormat(".##");
    //DefaultTableModel model;
   // static Object[] row = new Object[12];
    
    ArrayList<Cliente_17> cliente;
    
    
    ClientesDB db = new ClientesDB();
    

    /**
     * Creates new form table
     */
    public tableClientes() {
        initComponents();
       // model = (DefaultTableModel) tblClients.getModel();
         //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    
    public void showAllClients() throws ClassNotFoundException{
          DefaultTableModel model = (DefaultTableModel)tblClients.getModel();
        cliente = db.ListClients();
      int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        
       
       
             for(Cliente_17 cl: cliente){
            model.addRow(new Object[]{cl.getId_cliente(), cl.getNombre_cliente(), cl.getApellido_cliente(), cl.getDireccion(), cl.getCorreo(), cl.getTelefono()});
        }
       
      
    }
    
    public boolean findClient(){
        DefaultTableModel model = (DefaultTableModel)tblClients.getModel();
          
        boolean found = false;
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        Cliente_17 cl = new Cliente_17();
        
     
        cl = db.findClient(txtSearchID.getText());
 
       if(cl != null){
            model.addRow(new Object[]{cl.getId_cliente(), cl.getNombre_cliente(), cl.getApellido_cliente(), cl.getCorreo(), cl.getDireccion(), cl.getTelefono()});
            return found=true;
       }
       
       return found;
        
    }
 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGender = new javax.swing.ButtonGroup();
        lblUserID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnAddNewCustomer = new javax.swing.JButton();
        btnClearAll = new javax.swing.JButton();
        lblSearchID = new javax.swing.JLabel();
        txtSearchID = new javax.swing.JTextField();
        btnSearchID = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClients = new javax.swing.JTable();
        btnDeleteRowSelected = new javax.swing.JButton();
        btnShowAll = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnGoToSales = new javax.swing.JButton();
        lblTelephone = new javax.swing.JLabel();
        txtTelephone = new javax.swing.JTextField();
        btnGenerateAll = new javax.swing.JButton();
        btnClearAllRows = new javax.swing.JButton();
        btnGoToProducts1 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes");

        lblUserID.setText("User ID (4 Digits):");

        lblName.setText("Name (50 varchar):");

        lblLastName.setText("Last Name (50 varchar):");

        lblEmail.setText("Email (80 varchar):");

        lblAddress.setText("Address (80 varchar):");

        txtUserID.setDocument(new JTextFieldCharLimit(4));
        txtUserID.setEditable(false);
        txtUserID.setBackground(new java.awt.Color(204, 204, 204));
        txtUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIDActionPerformed(evt);
            }
        });
        txtUserID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserIDKeyTyped(evt);
            }
        });

        txtName.setDocument(new JTextFieldCharLimit(50));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtLastName.setDocument(new JTextFieldCharLimit(50));
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLastNameKeyTyped(evt);
            }
        });

        txtEmail.setDocument(new JTextFieldCharLimit(80));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        txtAddress.setDocument(new JTextFieldCharLimit(80));
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressKeyTyped(evt);
            }
        });

        btnAddNewCustomer.setText("Add New Client");
        btnAddNewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewCustomerActionPerformed(evt);
            }
        });

        btnClearAll.setText("Clear All Text");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });

        lblSearchID.setText("Search ID: ");

        txtSearchID.setDocument(new JTextFieldCharLimit(4));
        txtSearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchIDActionPerformed(evt);
            }
        });
        txtSearchID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchIDKeyTyped(evt);
            }
        });

        btnSearchID.setText("Find");
        btnSearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchIDActionPerformed(evt);
            }
        });

        tblClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Name", "Last Name", "Email", "Address", "Telephone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblClients);

        btnDeleteRowSelected.setText("Delete Row Selected");
        btnDeleteRowSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRowSelectedActionPerformed(evt);
            }
        });

        btnShowAll.setText("Show All Clients");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnGoToSales.setText("Orders");
        btnGoToSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToSalesActionPerformed(evt);
            }
        });

        lblTelephone.setText("Telephone (50 varchar):");

        txtTelephone.setDocument(new JTextFieldCharLimit(50));
        txtTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelephoneActionPerformed(evt);
            }
        });
        txtTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelephoneKeyTyped(evt);
            }
        });

        btnGenerateAll.setText("Generate All");
        btnGenerateAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateAllActionPerformed(evt);
            }
        });

        btnClearAllRows.setText("Clear All");
        btnClearAllRows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllRowsActionPerformed(evt);
            }
        });

        btnGoToProducts1.setText("Products");
        btnGoToProducts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToProducts1ActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserID)
                            .addComponent(lblName)
                            .addComponent(lblLastName)
                            .addComponent(lblEmail)
                            .addComponent(lblAddress))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtLastName))
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelephone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGenerateAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnClearAll, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(btnAddNewCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(btnShowAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSearchID))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTelephone)
                        .addGap(546, 546, 546)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeleteRowSelected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearchID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSearchID)
                            .addComponent(btnClearAllRows, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGoToProducts1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGoToSales, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserID)
                            .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddNewCustomer))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClearAll))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelephone)
                            .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(btnGenerateAll, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSearchID)
                                    .addComponent(txtSearchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate)
                                .addGap(11, 11, 11)
                                .addComponent(btnClearAllRows)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeleteRowSelected))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGoToSales, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGoToProducts1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(126, 126, 126)
                        .addComponent(btnExit)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnAddNewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewCustomerActionPerformed
        
        int id_cliente = Integer.parseInt(txtUserID.getText());
        
        Cliente_17 cl = new Cliente_17(id_cliente, txtName.getText(), txtLastName.getText(), txtAddress.getText(), txtEmail.getText(), txtTelephone.getText());
        
        
        if(db.findClient(txtUserID.getText()) == null){
              db.InsertInto(cl);
        
            try {
                showAllClients();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(tableClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        txtUserID.setText("");
        txtName.setText("");
        txtLastName.setText("");
        txtEmail.setText("");
        txtAddress.setText("");
        txtTelephone.setText("");
        txtSearchID.setText("");    
        
        JOptionPane.showMessageDialog(null, "Insert was successful");
        }else{
            JOptionPane.showMessageDialog(null, "ID Already Registered");
        }
        
      
 
        
        
    }//GEN-LAST:event_btnAddNewCustomerActionPerformed

    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed

        txtUserID.setText("");
        txtName.setText("");
        txtLastName.setText("");
        txtEmail.setText("");
        txtAddress.setText("");
        txtTelephone.setText("");
        txtSearchID.setText("");

    }//GEN-LAST:event_btnClearAllActionPerformed

    private void btnSearchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchIDActionPerformed

       
            
        //Cliente_17 c17 = new Cliente_17();
        
        if(findClient() ){
            
                DefaultTableModel model = (DefaultTableModel)tblClients.getModel();
                Object user_id = model.getValueAt(0,0);
                Object name = model.getValueAt(0,1);
                Object LastName = model.getValueAt(0,2);
                Object email = model.getValueAt(0,3);
                Object address = model.getValueAt(0,4);
                Object telephone = model.getValueAt(0,5);
                txtUserID.setText((user_id.toString()));
                txtName.setText((name.toString()));
                txtLastName.setText((LastName.toString()));
                txtEmail.setText((email.toString()));
                txtAddress.setText((address.toString()));
                txtTelephone.setText((telephone.toString()));
        }else{
            JOptionPane.showMessageDialog(null, "ID: " + txtSearchID.getText() +  ". Not found");
                     txtUserID.setText("");
                     txtName.setText("");
                     txtLastName.setText("");
                     txtEmail.setText("");
                     txtAddress.setText("");
                     txtTelephone.setText("");
                     txtSearchID.setText("");
              
        }
        
        
    }//GEN-LAST:event_btnSearchIDActionPerformed

    private void btnDeleteRowSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRowSelectedActionPerformed
         
        int des = -1;
        DefaultTableModel model = (DefaultTableModel)tblClients.getModel();
        
        int i = -1;
        
        i = tblClients.getSelectedRow();
       
        if(i>=0){
           Object id_obj_ex = model.getValueAt(i, 0);
            des = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this client? ID: " + id_obj_ex.toString() ,"Delete", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
       
       
        if(i >= 0 && des == 0){
            ClientesDB cl_db = new ClientesDB();
            Object id_obj = model.getValueAt(i, 0);
            cl_db.delete((int)id_obj);
            try {
                this.showAllClients();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(tableClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "User ID was successfully deleted");
        }
        
        
    }//GEN-LAST:event_btnDeleteRowSelectedActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        try {
            this.showAllClients();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tableClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void txtUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIDActionPerformed
            
    }//GEN-LAST:event_txtUserIDActionPerformed

    private void txtUserIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserIDKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUserIDKeyTyped

    private void txtSearchIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchIDKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSearchIDKeyTyped

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        super.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnGoToSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToSalesActionPerformed
          UserLevel level = new UserLevel();
        
        if(UserLevel.level == 1 || UserLevel.level == 3){
               tableOrders program1 = new tableOrders();
                program1.setVisible(true);
                dispose();
        }else{
                   JOptionPane.showMessageDialog(null, "Not allowed");
        }
    }//GEN-LAST:event_btnGoToSalesActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped

    }//GEN-LAST:event_txtNameKeyTyped

    private void txtLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyTyped

    }//GEN-LAST:event_txtLastNameKeyTyped

    private void txtAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtSearchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchIDActionPerformed

    private void btnGenerateAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateAllActionPerformed

 
        
       txtUserID.setText(RandomAll.generateUserID());
       txtName.setText(RandomAll.generateName());
       txtLastName.setText(RandomAll.generateLastName());
       txtEmail.setText(RandomAll.generateEmail());
       txtAddress.setText(RandomAll.generateAddress());
       txtTelephone.setText(RandomAll.generateTelephone());
       
        
    
       

    }//GEN-LAST:event_btnGenerateAllActionPerformed

    private void btnClearAllRowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllRowsActionPerformed

        
        DefaultTableModel model = (DefaultTableModel)tblClients.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        txtUserID.setText("");
        txtName.setText("");
        txtLastName.setText("");
        txtEmail.setText("");
        txtAddress.setText("");
        txtTelephone.setText("");
        txtSearchID.setText("");
        
        
    }//GEN-LAST:event_btnClearAllRowsActionPerformed

    private void btnGoToProducts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToProducts1ActionPerformed
        
       if(UserLevel.level == 1 || UserLevel.level == 2){
            
                 tableProductos test1 = new tableProductos();
        test1.setVisible(true);
        super.dispose();
        }else{
              JOptionPane.showMessageDialog(null, "Not Allowed");
        }
    }//GEN-LAST:event_btnGoToProducts1ActionPerformed

    private void txtTelephoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelephoneKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE   ) || (c == KeyEvent.VK_DELETE)             )            )  ) {

            evt.consume();
        }
    }//GEN-LAST:event_txtTelephoneKeyTyped

    private void txtTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelephoneActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       if(txtName.getText().trim().equals(("")) || txtUserID.getText().trim().equals("") || txtLastName.getText().trim().equals("") || txtAddress.getText().trim().equals("")  || txtTelephone.getText().trim().equals("") || txtEmail.getText().trim().equals(""))
       {
           JOptionPane.showMessageDialog(null, "Please fill out the form");
       }else{
           ClientesDB cl_db = new ClientesDB();
           Cliente_17 cl = new Cliente_17();
           
           cl.setId_cliente(Integer.parseInt(txtUserID.getText()));
           cl.setNombre_cliente(txtName.getText());
           cl.setApellido_cliente(txtLastName.getText());
           cl.setDireccion(txtAddress.getText());
           cl.setTelefono(txtTelephone.getText());
           cl.setCorreo(txtEmail.getText());
           
           cl_db.Update(cl);
           
           
           if(findClient() ){
            
                DefaultTableModel model = (DefaultTableModel)tblClients.getModel();
                Object user_id = model.getValueAt(0,0);
                Object name = model.getValueAt(0,1);
                Object LastName = model.getValueAt(0,2);
                Object email = model.getValueAt(0,3);
                Object address = model.getValueAt(0,4);
                Object telephone = model.getValueAt(0,5);
                txtUserID.setText((user_id.toString()));
                txtName.setText((name.toString()));
                txtLastName.setText((LastName.toString()));
                txtEmail.setText((email.toString()));
                txtAddress.setText((address.toString()));
                txtTelephone.setText((telephone.toString()));
        }else{
            JOptionPane.showMessageDialog(null, "ID: " + txtSearchID.getText() +  ". Not found");
                     txtUserID.setText("");
                     txtName.setText("");
                     txtLastName.setText("");
                     txtEmail.setText("");
                     txtAddress.setText("");
                     txtTelephone.setText("");
                     txtSearchID.setText("");
              
        }
           
           JOptionPane.showMessageDialog(null, "Successful update");
           
           
           
              
       }
       
       
       
       
       
    }//GEN-LAST:event_btnUpdateActionPerformed

    public void listProducts() throws IOException {

        

    }

    public void searchProduct() throws IOException {

        

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {
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
            java.util.logging.Logger.getLogger(tableClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tableClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tableClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tableClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tableClientes().setVisible(true);
                
                
                
          
                
                
            }
        });

        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewCustomer;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnClearAllRows;
    private javax.swing.JButton btnDeleteRowSelected;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btnGender;
    private javax.swing.JButton btnGenerateAll;
    private javax.swing.JButton btnGoToProducts1;
    private javax.swing.JButton btnGoToSales;
    private javax.swing.JButton btnSearchID;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSearchID;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JTable tblClients;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearchID;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables

}
