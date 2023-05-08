/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

/**
 *
 * @author TITANIUM
 */
import DatabaseLayer.DBConnection;
import DatabaseLayer.DBUserConnection;
import Code.Registeration;
import com.sun.jmx.mbeanserver.Repository;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class CustomerRegister extends javax.swing.JInternalFrame {
    
Code.Registeration reg;
    //Connection conn =null;
    //PreparedStatement pst = null;
    //ResultSet rs =null;
    
    public CustomerRegister() {
        
        initComponents();
       
        reg=new Registeration();
        updateTable();
        
    }
    public void clearField()
    {
        txt_name.setText("");
        txt_IDnumber.setText("");
        txt_phone.setText("");
        txt_mail.setText("");
        txA_Address.setText("");
        
        jRadioButton_male.setSelected(false);
        jRadioButton_female.setSelected(false);
        
    };
    
    private void updateTable(){
            
             try{
    DBConnection con = new DBConnection();
    String sql ="SELECT * From cr";
    PreparedStatement prep = con.ConnectDB().prepareStatement(sql);
    ResultSet rs = prep.executeQuery();
    Table_data.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    }
     
         
        /* try {
             String sql="SELECT*FROM cr";
             pst=conn.prepareStatement(sql);
             rs=pst.executeQuery();
             Table_data.setModel(DbUtils.resultSetToTableModel(rs));
         } catch (Exception e) 
         {
             JOptionPane.showMessageDialog(null, e);
         }finally
         {
             try {
                 rs.close();
                 pst.close();
             } catch (Exception e) {
             }
         }*/
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_IDnumber = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txA_Address = new javax.swing.JTextArea();
        jRadioButton_male = new javax.swing.JRadioButton();
        jRadioButton_female = new javax.swing.JRadioButton();
        btn_add = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_data = new javax.swing.JTable();
        txtsearch = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbSearch = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1675, 920));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Phone Number ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("E-mail");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Address");

        txA_Address.setColumns(20);
        txA_Address.setRows(5);
        jScrollPane1.setViewportView(txA_Address);

        jRadioButton_male.setText("Male");
        jRadioButton_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_maleActionPerformed(evt);
            }
        });

        jRadioButton_female.setText("Female");
        jRadioButton_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_femaleActionPerformed(evt);
            }
        });

        btn_add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_add.setText("ADD");
        btn_add.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_clear.setText("CLEAR");
        btn_clear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_cancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_cancel.setText("Print");
        btn_cancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        Table_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_dataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table_data);

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Search By");

        cmbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name ", "ID Number", "Phone Number" }));
        cmbSearch.setSelectedIndex(-1);
        cmbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSearchActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                            .addComponent(txt_mail)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel6))
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_IDnumber)
                                            .addComponent(txt_name)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jRadioButton_male)
                                                .addGap(37, 37, 37)
                                                .addComponent(jRadioButton_female)))))
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(33, 33, 33)
                                .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_IDnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jRadioButton_male)
                            .addComponent(jRadioButton_female))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_maleActionPerformed

        gender="Male";

    }//GEN-LAST:event_jRadioButton_maleActionPerformed

    private void jRadioButton_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_femaleActionPerformed

        gender="Female";
    }//GEN-LAST:event_jRadioButton_femaleActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        /*re update
        String  name_validate = txt_name.getText();
        String  ID_validate = txt_IDnumber.getText();
        String  phone_validate = txt_phone.getText();
        String  email_validate = txt_mail.getText();
        String  addres_validate = txA_Address.getText();*/
       
        
        //book.setContact(Integer.parseInt(txtContact.getText().trim()));


        
    if (txt_name.getText().equals("")||txt_IDnumber.getText().equals("")||txt_phone.getText().equals("")||txt_mail.getText().equals("")||txA_Address.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please provide all the details!");
       }else
        {
        reg.setName(txt_name.getText().trim());
        reg.setIdnumber(txt_IDnumber.getText().trim());
        reg.setPhoneno(Integer.parseInt(txt_phone.getText().trim()));
        reg.setEmail(txt_mail.getText());
        reg.setGender(gender);
        reg.setAddress(txA_Address.getText());
        DatabaseLayer.DBUserConnection up = new DBUserConnection();
        up.regCostomer(reg);
        JOptionPane.showMessageDialog(rootPane, "Register Added Successfuly");
        
        }

          /*  try {
           //     String sql = "INSERT INTO cr (Name,IDnumber,PhoneNumber,Email,Gender,Address)VALUES(?,?,?,?,?,?)";
                pst=conn.prepareStatement(sql);
                pst.setString(1, txt_name.getText());
                pst.setString(2, txt_IDnumber.getText());
                pst.setString(3, txt_phone.getText());
                pst.setString(4, txt_mail.getText());
                pst.setString(5, gender);
                pst.setString(6, txA_Address.getText());

                pst.execute();
                JOptionPane.showMessageDialog(null, "DATA Saved Succesfull");

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);

            }finally{
                try {
                    rs.close();
                    pst.close();
                } catch (Exception e) {
                }
            }
        }*/
            
        
        
            
        

        //clearField();
        updateTable();

        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed

        clearField();
        btn_add.setEnabled(true);
        btn_delete.setEnabled(false);
        btn_update.setEnabled(false);
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        MessageFormat header = new MessageFormat("Customer List");
        MessageFormat footer = new MessageFormat("page{0,number,integer}");
       
        try {
            Table_data.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        } catch (java.awt.print.PrinterException e) {
        
            System.err.format("Cannot Print Table", e.getMessage());
        }
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

       // try {
            reg.setName(txt_name.getText());//.trim());
        reg.setIdnumber(txt_IDnumber.getText());//.trim());
        reg.setPhoneno(Integer.parseInt(txt_phone.getText()));//.trim());
        reg.setEmail(txt_mail.getText());
        reg.setAddress(txA_Address.getText());
            if(jRadioButton_male.isSelected())
            {
                reg.setGender(jRadioButton_male.getText());
                
            }
            else
            {
                reg.setGender(jRadioButton_female.getText());
            }
            
            JOptionPane.showMessageDialog(null,"UPDATE SUCESSFULL");

        /*} catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally
        {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }
        }*/
        updateTable();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        
            int p = JOptionPane.showConfirmDialog(null, "DO YOU REALLY WANT TO DELETE", "Delete", JOptionPane.YES_NO_OPTION);

            if(p==0)
            {
                try {
                    String sql ="DELETE FROM cr WHERE IDNumber=?";
                    DBConnection con = new DBConnection();
                    PreparedStatement prep = con.ConnectDB().prepareStatement(sql);

                    prep.setString(1, txt_IDnumber.getText());
                    prep.execute();
                    JOptionPane.showMessageDialog(null,"DELETED SUCCESFULL");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
          
        clearField();
        updateTable();

        btn_add.setEnabled(false);
        btn_delete.setEnabled(true);
        btn_update.setEnabled(true);
        btn_clear.setEnabled(true);
            }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void Table_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_dataMouseClicked

        int row = Table_data.getSelectedRow();
        String Table_click =(Table_data.getModel().getValueAt(row, 0).toString());
        try
        {
            DBConnection con = new DBConnection();
            String sql="SELECT * FROM cr WHERE IDNumber='"+Table_click+"'";
            PreparedStatement prep = con.ConnectDB().prepareStatement(sql);
            ResultSet rs = prep.executeQuery();

            if(rs.next())
            {
                

                String strcname = rs.getString("Name");
                txt_name.setText(strcname);

                String stridnum = rs.getString("IDnumber");
                txt_IDnumber.setText(stridnum);

                String strpnum = rs.getString("PhoneNumber");
                txt_phone.setText(strpnum);

                String stremail = rs.getString("Email");//Name,IDnumber,PhoneNumber,Email,Gender,Address
                txt_mail.setText(stremail);

                String strgender = rs.getString("Gender");
                if("Male".equals(strgender))
                {
                    jRadioButton_male.setSelected(true);
                }
                if("Female".equals(strgender))
                {
                    jRadioButton_female.setSelected(true);
                }

                String straddre = rs.getString("Address");   //Email,Gender,Address
                txA_Address.setText(straddre);
            }

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

        btn_add.setEnabled(false);
        btn_clear.setEnabled(true);
        btn_delete.setEnabled(true);
        btn_update.setEnabled(true);
    }//GEN-LAST:event_Table_dataMouseClicked

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased

        try {
            DBConnection con = new DBConnection();
            //String by = cmbSearch.getSelectedItem().toString();
            String sql ="SELECT * FROM cr WHERE IDnumber=?";
            PreparedStatement prep = con.ConnectDB().prepareStatement(sql);

            prep.setString(1, txtsearch.getText());
            ResultSet rs = prep.executeQuery();

            if(rs.next())
            {
                

                String strcname = rs.getString("Name");
                txt_name.setText(strcname);

                String stridnum = rs.getString("IDnumber");
                txt_IDnumber.setText(stridnum);

                String strpnum = rs.getString("PhoneNumber");
                txt_phone.setText(strpnum);

                String stremail = rs.getString("Email");//Name,IDnumber,PhoneNumber,Email,Gender,Address
                txt_mail.setText(stremail);

                String strgender = rs.getString("Gender");
                if("Male".equals(strgender))
                {
                    jRadioButton_male.setSelected(true);
                }
                if("Female".equals(strgender))
                {
                    jRadioButton_female.setSelected(true);
                }

                String straddre = rs.getString("Address");   //Email,Gender,Address
                txA_Address.setText(straddre);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_txtsearchKeyReleased

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void cmbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       DBConnection con = new DBConnection();
        String by = cmbSearch.getSelectedItem().toString();
        if(by=="Name"){
        try
        {
            String search = txtsearch.getText();
            String sql = "select * from cr where (IDnumber ='"+search+"')";
            PreparedStatement prep = con.ConnectDB().prepareStatement(sql);
            ResultSet rs = prep.executeQuery();  
            Table_data.setModel(DbUtils.resultSetToTableModel(rs));
             
           
            
        }catch(Exception ex)
        {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());        
        }
        }
        else if(by=="ID Number"){
        try
        {
            String search = txtsearch.getText();
            String sql = "select * from cr where (Name ='"+search+"')";
            PreparedStatement prep = con.ConnectDB().prepareStatement(sql);
            ResultSet rs = prep.executeQuery();  
            Table_data.setModel(DbUtils.resultSetToTableModel(rs));
             
           
            
        }catch(Exception ex)
        {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());        
        }
        }
        else if(by=="Phone Number"){
        try
        {
            String search = txtsearch.getText();
            String sql = "select * from cr where (PhoneNumber ='"+search+"')";
            PreparedStatement prep = con.ConnectDB().prepareStatement(sql);
            ResultSet rs = prep.executeQuery();  
            Table_data.setModel(DbUtils.resultSetToTableModel(rs));
             
           
            
        }catch(Exception ex)
        {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());        
        }
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_data;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cmbSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton_female;
    private javax.swing.JRadioButton jRadioButton_male;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txA_Address;
    private javax.swing.JTextField txt_IDnumber;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
private String gender;
}//txtCusName = new javax.swing.JTextField();
