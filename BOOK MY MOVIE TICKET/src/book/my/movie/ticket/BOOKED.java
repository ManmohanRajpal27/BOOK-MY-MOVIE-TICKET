/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package book.my.movie.ticket;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author SMPS
 */
public class BOOKED extends javax.swing.JFrame {
ResultSet rs=null;
Connection cn=null;
Statement st=null;
    /**
     * Creates new form BOOKED
     */
String s="";
    public BOOKED(String i) {
      s=i;  initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        c2 = new javax.swing.JComboBox<>();
        c1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B6.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        B6.setForeground(new java.awt.Color(255, 153, 51));
        B6.setText("NEXT");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        getContentPane().add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        b5.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 153, 51));
        b5.setText("BACK");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("SHOWS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        c2.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        c2.setForeground(new java.awt.Color(255, 153, 51));
        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Show1", "Show2", "Show3" }));
        c2.setMinimumSize(new java.awt.Dimension(67, 1));
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 248, -1));

        c1.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        c1.setForeground(new java.awt.Color(255, 153, 51));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 248, -1));

        jLabel1.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("DATE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 95, -1, 43));

        jLabel3.setFont(new java.awt.Font("Snap ITC", 2, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("SELECT DATE & TIME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\SMPS\\Desktop\\book my movie ticket\\images\\Made_In_China_(2019)_Hindi_Movie.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\SMPS\\Desktop\\book my movie ticket\\images\\Hotel_Mumbai_(2019)_Hindi_Movie.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 200, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\SMPS\\Desktop\\book my movie ticket\\images\\Ujda_Chaman_(2019)_Hindi_Movie.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
         LOGIN c=new LOGIN();
       c.setVisible(true);
       
    }//GEN-LAST:event_b5ActionPerformed
    
    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
    try{
            Class.forName("java.sql.Driver");
  cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_my_movie_ticket","root","1234");
 st=cn.createStatement();
String s1="update "+s+" set mdate='"+c1.getSelectedItem()+"',mtime='"+c2.getSelectedItem()+"' where mdate='"+c1.getSelectedItem()+"' && mtime='"+c2.getSelectedItem()+"';";
  int i= st.executeUpdate(s1);
      String dat=c1.getSelectedItem().toString();
       String mtime=c2.getSelectedItem().toString();
  if(i==1)
  {  
     BOOK1 b1=new BOOK1(dat,mtime,s);
     b1.setVisible(true);
  }
  else 
      System.out.println("sdsad");
        }
        catch(Exception a)
        {
        
            System.out.println(a);
        
        }

    }//GEN-LAST:event_B6ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
         try{
            Class.forName("java.sql.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_my_movie_ticket","root","1234");
            st=cn.createStatement();
            String cd="";
           for(int i=0;i<3;i++)
         {         
            String q1="select curdate()+"+i+" as cdate from dual;";
            rs=st.executeQuery(q1);
            if(rs.next())
            c1.insertItemAt(rs.getString("cdate").toString(),i);
            cd =rs.getString("cdate");
         }
        Statement st2=cn.createStatement();
        String q2="select *from "+s+" where mdate>curdate();";
         ResultSet rs2=st2.executeQuery(q2);
         if(rs2.next())
         {  Statement st3=cn.createStatement();
             String q3="delete from "+s+" where mdate<curdate();";
             int d=st3.executeUpdate(q3);
         if(d==1)
               
            System.out.println("delete");
         }
         Statement st5=cn.createStatement();
        String q5="select count(mdate) as 'm' from "+s+";";
         ResultSet rs5=st5.executeQuery(q5);
         int h=0;
         if(rs5.next())
              h=rs5.getInt("m");
         
         if(h<=8)
         {
         Statement st4=cn.createStatement();
         int i=1,k=0,t=0;
         
         for(i=1;i<=3;i++)
             for(t=0;t<=2;t++)
            k=st4.executeUpdate("insert into "+s+"(mdate,mtime) values(curdate()+"+t+",'show"+i+"');");
      
         } 
         }
        catch(Exception a)
        {
        
            System.out.println(a);
        
        }

                                      
 // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(BOOKED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BOOKED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BOOKED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BOOKED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new BOOKED().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B6;
    private javax.swing.JButton b5;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    private String curdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
