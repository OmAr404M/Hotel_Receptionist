/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;


import java.sql.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class addEmployee extends javax.swing.JFrame {

    /**
     * Creates new form addEmployee
     */
    public addEmployee() throws ClassNotFoundException, SQLException {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        
        
        DefaultTableModel model = (DefaultTableModel) dbTable.getModel();
        Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
            Statement st = c.createStatement();
            String sql1 = "select *from employees";
            
            ResultSet rs = st.executeQuery(sql1);
            while(rs.next()){
                
        model.addRow(new Object[]{rs.getInt("id"),rs.getString("Name"),rs.getString("Floor"),rs.getString("Address"),rs.getString("Phone"),rs.getString("Age"),rs.getString("Email"),rs.getString("Nationality"),rs.getString("Gender"),rs.getString("Hired_Date")});  
        
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

        jLabel1 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        floor = new javax.swing.JTextField();
        name4 = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        name6 = new javax.swing.JTextField();
        name7 = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        name8 = new javax.swing.JTextField();
        name9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        nationality = new com.toedter.components.JLocaleChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        dbTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        hired_date = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        gender = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("@EMPLOYEE PAGE@");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Address");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 70, 25));

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 197, 25));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Floor");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 70, 25));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 70, 25));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Age");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 70, 25));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Phone");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, 25));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 197, 25));

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 197, 25));

        floor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorActionPerformed(evt);
            }
        });
        getContentPane().add(floor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 197, 25));

        name4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name4ActionPerformed(evt);
            }
        });
        getContentPane().add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 197, 25));

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 197, 25));

        name6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name6ActionPerformed(evt);
            }
        });
        getContentPane().add(name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 197, 25));

        name7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name7ActionPerformed(evt);
            }
        });
        getContentPane().add(name7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 197, 25));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 197, 25));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Nationality");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 70, 25));

        name8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name8ActionPerformed(evt);
            }
        });
        getContentPane().add(name8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 197, 25));

        name9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name9ActionPerformed(evt);
            }
        });
        getContentPane().add(name9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 197, 25));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Email");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 70, 25));

        nationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationalityActionPerformed(evt);
            }
        });
        getContentPane().add(nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 200, 30));

        dbTable.setBackground(new java.awt.Color(240, 240, 240));
        dbTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        dbTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name", "Floor", "Address", "Phone", "Age", "Email", "Nationality", "Gender", "Hired Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        dbTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                dbTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(dbTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 1130, 470));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Hired Date");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 70, 25));
        getContentPane().add(hired_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 200, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Gender");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 70, 25));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("UPDATE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 1260, 80));

        gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Male", "Female" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 200, 30));

        jButton1.setBackground(java.awt.Color.black);
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 670, 170, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void floorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_floorActionPerformed

    private void name4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name4ActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void name6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name6ActionPerformed

    private void name7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name7ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void name8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name8ActionPerformed

    private void name9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            int row = dbTable.getSelectedRow();
            int id_value = (int) dbTable.getValueAt(row, 0);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
            Statement st=c.createStatement();
            String sql="delete from employees where id='"+id_value+"'";
            int result=st.executeUpdate(sql);
            if(result==1){
                JOptionPane.showMessageDialog(null,"Room has been deleted successfully" ,"Success",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,"Room has'nt been deleted","Error!",JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            new addEmployee().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        
        
        try {
            String Name =name.getText();
            int Floor = Integer.parseInt(floor.getText());
            String Address =address.getText();
            String Phone =phone.getText();
            int Age =Integer.parseInt(age.getText());
            String Email =email.getText();
            int intNation=nationality.getSelectedIndex();
            String Nationality = (String) nationality.getItemAt(intNation);
            int intG=gender.getSelectedIndex();
            String Gender = gender.getItemAt(intG);
            Date Hired_Date_temp =hired_date.getDate();
            String Hired_Date = Hired_Date_temp+"";
            
            
            if(Name.length()==0  || Email.length()==0 || intG==0|| Address.toString().length()==0 || Hired_Date.length()==0 ||
            floor.getText().length()==0|| intNation==0 )
{
   JOptionPane.showMessageDialog(null,"Fill all required data");
}
            else {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
            Statement st = c.createStatement();
            String sql = "insert into employees(Name,Floor,Address,Phone,Age,Email,Nationality,Gender,Hired_Date) VALUES('"+Name+"','"+Floor+"','"+Address+"','"+Phone+"','"+Age+"','"+Email+"','"+Nationality+"','"+Gender+"','"+Hired_Date+"')";
            int result =st.executeUpdate(sql);
            if(result==1){
                JOptionPane.showMessageDialog(null,"record has been inserted successfuly :)","success",JOptionPane.INFORMATION_MESSAGE);
            }
            DefaultTableModel model = (DefaultTableModel) dbTable.getModel();
            String sql2 = "SELECT * FROM employees WHERE id=(SELECT MAX(id) FROM employees);";
            ResultSet rs = st.executeQuery(sql2);
            while(rs.next()){
                
        model.addRow(new Object[]{rs.getInt("id"),rs.getString("Name"),rs.getInt("Floor"),rs.getString("Address"),rs.getString("Phone"),rs.getInt("Age"),rs.getString("Email"),rs.getString("Nationality"),rs.getString("Gender"),rs.getString("Hired_Date")});  
        
      } }
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"class not found","ERROR",JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(addEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            int row = dbTable.getSelectedRow();
            int value = (int) dbTable.getValueAt(row, 0);
            
             
            Update edit =new Update(value);
            edit.setVisible(true);
            edit.setLocation(550, 100);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        front f = new front();
        f.setLocation(500, 250);
        f.setSize(700, 300);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void dbTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_dbTableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_dbTableAncestorAdded

    private void nationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationalityActionPerformed

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
            java.util.logging.Logger.getLogger(addEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new addEmployee().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(addEmployee.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(addEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTable dbTable;
    private javax.swing.JTextField email;
    private javax.swing.JTextField floor;
    private javax.swing.JComboBox<String> gender;
    private com.toedter.calendar.JDateChooser hired_date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name4;
    private javax.swing.JTextField name6;
    private javax.swing.JTextField name7;
    private javax.swing.JTextField name8;
    private javax.swing.JTextField name9;
    private com.toedter.components.JLocaleChooser nationality;
    private javax.swing.JTextField phone;
    // End of variables declaration//GEN-END:variables
}
