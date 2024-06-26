/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wecare;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static jdk.nashorn.internal.runtime.Debug.id;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Fariha
 */
public class Payments extends javax.swing.JFrame {

    /**
     * Creates new form Payments
     */
    public Payments() {
        initComponents();
       
        DisplayPayment();
        GetMember();
         GetAmount();
          MemberCb.addActionListener(new ActionListener(){
        
        
            @Override
            public void actionPerformed(ActionEvent ae) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                GetAmount();
            }
        });
    }

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        MemberCb = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        Paybtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PaymentTable = new javax.swing.JTable();
        PeriodDate = new com.toedter.calendar.JDateChooser();
        AmountTb = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Coach");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Logout");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Members");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel4)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(-10, -10, 270, 510);

        jLabel6.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Month");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(280, 100, 100, 39);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(510, 120, 190, 40);

        jLabel8.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("Amount");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(440, 230, 140, 39);

        MemberCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberCbActionPerformed(evt);
            }
        });
        jPanel1.add(MemberCb);
        MemberCb.setBounds(280, 280, 81, 26);

        jLabel11.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel11.setText("Member");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(280, 230, 110, 39);

        Paybtn.setBackground(new java.awt.Color(102, 0, 102));
        Paybtn.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        Paybtn.setForeground(new java.awt.Color(255, 255, 255));
        Paybtn.setText("Pay");
        Paybtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaybtnMouseClicked(evt);
            }
        });
        Paybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaybtnActionPerformed(evt);
            }
        });
        jPanel1.add(Paybtn);
        Paybtn.setBounds(280, 399, 117, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 102));
        jLabel12.setText("Manage Finance");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(410, 20, 446, 58);

        PaymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Amount", "PaymentType"
            }
        ));
        PaymentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaymentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PaymentTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(490, 320, 470, 160);
        jPanel1.add(PeriodDate);
        PeriodDate.setBounds(270, 140, 119, 26);
        jPanel1.add(AmountTb);
        AmountTb.setBounds(590, 230, 80, 40);

        jComboBox1.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Card", "Bkash", "Nagad", "Rocket" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(710, 230, 130, 45);

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search By Name");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(720, 120, 240, 47);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1022, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        new Members().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
      int MNum=0;
    private void CountMembers()
    {
        try{
            St1=(Statement) Con.createStatement();
            Rs1= St1.executeQuery("select Max(MId) from MemberTbl");
            Rs1.next();
            MNum=Rs1.getInt(1)+1;
        }catch(Exception e){
            
        }
    }
    private void PaybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaybtnActionPerformed
        // TODO add your handling code here:
        if(AmountTb.getText().isEmpty()||MemberCb.getSelectedIndex()==-1||jComboBox1.getSelectedIndex()==-1 )
        {
          JOptionPane.showMessageDialog(this,"Missing Information");
        }else
        {
            try{
                CountMembers();
             Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
             PreparedStatement Add = (PreparedStatement) Con.prepareStatement("insert into payment values(?,?,?)");
             Add.setString(1,MemberCb.getSelectedItem().toString());
             
             //Add.setString(3, PhoneTb.getText());
             //Add.setInt(4, Integer.valueOf(AgeTb.getText()));
             Add.setInt(2, Integer.valueOf(AmountTb.getText()));
             Add.setString(3, jComboBox1.getSelectedItem().toString());
            
             int row = Add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Payment info Saved");
            Con.close();
             DisplayPayment();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
        
        
        String name=(String) MemberCb.getSelectedItem();
        //String mobileNumber=jTextField5.getText();
        String amount=AmountTb.getText();
        
       // String checkout=jTextField4.getText();
        String type=(String) jComboBox1.getSelectedItem();
        
       
        String path="D:\\";
        com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
        try{
            PdfWriter.getInstance(doc,new FileOutputStream(path+""+name+".pdf"));
              doc.open();
            Paragraph paragrgraph1=new Paragraph("                                         WeCare\n");
            doc.add(paragrgraph1);
             Paragraph paragrgraph2=new Paragraph("*********************************************************************************");
            doc.add(paragrgraph2);
            Paragraph paragrgraph3=new Paragraph("\tCustomer Details:\nName: "+name+"\nAmount: "+amount+"\ntype:"+type+"\n");
            doc.add(paragrgraph3);
            doc.add(paragrgraph2);
            //Paragraph paragrgraph4=new Paragraph("\tRoom Details:\nNumber:"+jTextField1.getText()+"\nType: "+roomType+"\nBed: "+bed+"\nPrice per Day: "+jTextField6.getText()+"");
            // doc.add(paragrgraph4);
             doc.add(paragrgraph2);
             PdfPTable tb1=new PdfPTable(4);
             tb1.addCell("name: "+MemberCb.getSelectedItem()+"");
             tb1.addCell("amount: "+amount+"");
             tb1.addCell("type: "+type+"");
             //tb1.addCell("Total Amount Paid: "+totalAmount+"");
             doc.add(tb1);
             doc.add(paragrgraph2);
             Paragraph paragrgraph5=new Paragraph("Thank you ,Please visit Again.");
             doc.add(paragrgraph5);
                          
                         
                   
                   
                
             
            
          
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        doc.close();
        int a=JOptionPane.showConfirmDialog(null,"Do you want to print the bill","Selecyt",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            try{
                if((new File("D:\\"+name+".pdf")).exists())
                {
                    Process p=Runtime
                            .getRuntime()
                            .exec("rundll32 url.dll,FileProtocolHandler D:\\"+name+".pdf");
                }
                else
                    System.out.println("File is not Exists");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_PaybtnActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new Coachs().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    Connection Con=null;
PreparedStatement pst =null;
ResultSet Rs=null, Rs1=null;
Statement St=null,St1=null;
private void DisplayPayment()
{
    try{
        Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
        St=(Statement) Con.createStatement();
        Rs=St.executeQuery("select * from payment");
        PaymentTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
}
    private void GetMember(){
        try {
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
            St=(Statement) Con.createStatement();
            String Query="Select * from membertbl";
            Rs=St.executeQuery(Query);
            while(Rs.next()){
                String MemberName=Rs.getString("MName");
                MemberCb.addItem(MemberName);
            }
            
            
        } catch (Exception e) {
        }
    }
     private void GetAmount(){
        try {
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
            St=(Statement) Con.createStatement();
            String name=MemberCb.getSelectedItem().toString();
            String Query="Select *  from membertbl where MName='"+name+"' ";
           // String Query="Select * from membertbl";
            Rs=St.executeQuery(Query);
            while(Rs.next()){
                String amount=Rs.getString("MAmount");
                AmountTb.setText(amount);
                //MemberCb.addItem(amount);
            }
            
            
            
        } catch (Exception e) {
        }
    }
    private void PaybtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaybtnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PaybtnMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    private void PaymentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaymentTableMouseClicked
        // TODO add your handling code here:
         int index=PaymentTable.getSelectedRow();
        TableModel model=PaymentTable.getModel();
        String name=model.getValueAt(index,0).toString();
        try{
            if((new File("D:\\"+name+".pdf")).exists())
            {
                Process p=Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler D:\\"+name+".pdf");
            }
            else{
                    JOptionPane.showMessageDialog(null,"File is not exist");
                    }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_PaymentTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name=jTextField2.getText();
          ResultSet rs=Select.getData("select *from payment where name='"+name+"'");
        DefaultTableModel model=(DefaultTableModel)PaymentTable.getModel();
        model.setRowCount(0);
        try{
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)});
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MemberCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MemberCbActionPerformed

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
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountTb;
    private javax.swing.JComboBox<String> MemberCb;
    private javax.swing.JButton Paybtn;
    private javax.swing.JTable PaymentTable;
    private com.toedter.calendar.JDateChooser PeriodDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
