import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.lang.*;
import java.sql.ResultSetMetaData;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adharsh
 */
public class Frame12 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Frame12() {
        initComponents();
    }
//public class Scroll extends JPanel{

    public Frame12(String a , String n) {
        initComponents();
        int status=0;
        jTextField7.setText(a);
        jTextField13.setText(n);
        try {
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Adharsh\\Documents\\project.accdb");
        System.out.println("Connected!");
        String sql= "select * from Semester";// where roll_no =? and password=?";
        PreparedStatement ps=con.prepareStatement(sql);
        JOptionPane j=  new JOptionPane();
        ResultSet rs= ps.executeQuery();
        while(rs.next())
        {
            if(rs.getString("Published").equals("Yes"))
            {
                
                status=1;
                System.out.println(rs.getString("Published"));
                jTextField1.setBackground(Color.blue);
                jTextField1.setText("RESULTS PUBLISHED!");
                jToggleButton1.setEnabled(true);
                
            }
            else
                
              {
                
                status=0;
                System.out.println("Not Published");
                jTextField1.setBackground(Color.red);
                jTextField1.setText("RESULTS NOT PUBLISHED!");
                jToggleButton1.setEnabled(false);
                break;
                
            }
        }
        if(status==1)
        {
            jToggleButton1.setEnabled(true);
        }
        con.close();
    }
                
 catch(Exception e)
 {
     JOptionPane j=  new JOptionPane();
     j.showMessageDialog(null,e.toString());
 }}
/*      
  if(status==1)
        {
        int x=0,y=100;
        public void paint(Graphics g)
        {
            g.drawString("Results Published",x,y);
            System.out.println(x+" "+y);
          
           
            try{Thread.sleep(100);} 
            catch(Exception e){System.out.println("Error");}
            x+=10;
            if(x>this.getWidth())
            {    x=0;
            }
            repaint();
        }
        }       */ 
     
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student - Semester ");
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel1.setText("Status :");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setEnabled(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 500));

        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel10.setText("Register Number");

        jLabel11.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel11.setText("Name");

        jLabel12.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)))
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(132, 132, 132)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(134, 134, 134))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jToggleButton1.setText("View Results");
        jToggleButton1.setEnabled(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Frame10 f= new Frame10(jTextField7.getText(),jTextField13.getText());
this.setVisible(false);
  f.getContentPane().setBackground(Color.blue);
f.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
  try {
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Adharsh\\Documents\\project.accdb");
        System.out.println("Connected!");
        int x=1;
        String sql= "select * from Semester where Student_ID=?";// where roll_no =? and password=?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,jTextField13.getText());
        JOptionPane j=new JOptionPane();    
        ResultSet rs= ps.executeQuery();
        int a,b;
        String p = "(Pass)";
        String f= "(Fail)";
        
        String sql1= "select * from Internals where Student_ID=? and Subject_ID=?";// where roll_no =? and password=?";
        PreparedStatement ps1=con.prepareStatement(sql1);
        ps1.setString(1,jTextField13.getText());
        ResultSet rs1;
        rs.next();
        jLabel12.setText(rs.getString("Subject_ID"));
        ps1.setString(2,rs.getString("Subject_ID"));
        rs1= ps1.executeQuery();
        rs1.next();
        a = rs1.getShort("Taken") ;
        b = rs.getShort("Score");
        System.out.println(b);
        a=a+(b/2);
        
        System.out.println(a);
        if(a>=50)
        {    
        jTextField15.setText(""+a+ " "+p);//rs.getString("Score"));
        }
        else
        {
              jTextField15.setText(""+a+ " "+f);//rs.getString("Score"));
        }
            
        
        
        //rs1.next()
        rs.next();
        jLabel13.setText(rs.getString("Subject_ID"));
      
        ps1.setString(2,rs.getString("Subject_ID"));
         rs1= ps1.executeQuery();
        rs1.next();
        a = rs1.getShort("Taken") ;
        b = rs.getShort("Score");
        System.out.println(b);
        a=a+(b/2);
        
        System.out.println(a);
        if(a>=50)
        {    
        jTextField12.setText(""+a+ " "+p);//rs.getString("Score"));
        }
        else
        {
              jTextField12.setText(""+a+ " "+f);//rs.getString("Score"));
        }
        
        //rs1.next();
        rs.next();
        jLabel16.setText(rs.getString("Subject_ID"));
        ps1.setString(2,rs.getString("Subject_ID"));
         rs1= ps1.executeQuery();
        rs1.next();
        a = rs1.getShort("Taken") ;
        b = rs.getShort("Score");
        System.out.println(b);
        a=a+(b/2);
        
        System.out.println(a);
        if(a>=50)
        {    
        jTextField8.setText(""+a+ " "+p);//rs.getString("Score"));
        }
        else
        {
              jTextField8.setText(""+a+ " "+f);//rs.getString("Score"));
        }
        
       
        rs.next();
        jLabel15.setText(rs.getString("Subject_ID"));
        ps1.setString(2,rs.getString("Subject_ID"));
        rs1= ps1.executeQuery();
        rs1.next();
        a = rs1.getShort("Taken") ;
        b = rs.getShort("Score");
        System.out.println(b);
        a=a+(b/2);
        
        System.out.println(a);
        if(a>=50)
        {    
        jTextField14.setText(""+a+ " "+p);//rs.getString("Score"));
        }
        else
        {
              jTextField14.setText(""+a+ " "+f);//rs.getString("Score"));
        }
        
        rs.next();
        jLabel17.setText(rs.getString("Subject_ID"));
        ps1.setString(2,rs.getString("Subject_ID"));
        rs1= ps1.executeQuery();
        rs1.next();
        a = rs1.getShort("Taken") ;
        b = rs.getShort("Score");
        System.out.println(b);
        a=a+(b/2);
        
        System.out.println(a);
        if(a>=50)
        {    
        jTextField9.setText(""+a+ "  "+p);//rs.getString("Score"));
        }
        else
        {
              jTextField9.setText(""+a+ "  "+f);//rs.getString("Score"));
        }
    }
  
  catch(Exception e)
  {
      System.out.println(e);
  }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold> {

 new Frame12().setVisible(true);
            }
       
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}