
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class review extends javax.swing.JFrame {

    /**
     * Creates new form review
     */
    public review() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Aspartame BRK", 1, 36)); // NOI18N
        jLabel1.setText("REVIEW");

        jLabel2.setFont(new java.awt.Font("Conduit 2 BRK", 1, 14)); // NOI18N
        jLabel2.setText("ORDER-NO:");

        jLabel3.setFont(new java.awt.Font("Conduit 2 BRK", 1, 14)); // NOI18N
        jLabel3.setText("DELIVERY DETAILS");

        jLabel4.setFont(new java.awt.Font("Conduit 2 BRK", 1, 14)); // NOI18N
        jLabel4.setText("ORDER DETAILS");

        jButton1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM", "QUANTITY"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Conduit 2 BRK", 1, 14)); // NOI18N
        jLabel5.setText("TOTAL PRICE:");

        jLabel6.setFont(new java.awt.Font("Conduit 2 BRK", 1, 14)); // NOI18N
        jLabel6.setText("SPECIAL PRICE:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(92, 92, 92)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
String ord_id;
DefaultTableModel model=(DefaultTableModel) jTable1.getModel();      
try
    {
        Class.forName("java.sql.DriverManager");
        Connection con = (Connection)
        DriverManager.getConnection("jdbc:mysql://localhost/practical12","root","");
        Statement stmt = (Statement)
        con.createStatement();
       
        String query="select ord_id from order_temp;";
        ResultSet rs=stmt.executeQuery(query);
        if(rs.next());
        {
            ord_id = rs.getString("ord_id");
        jLabel2.setText("ORDER NO: "+ord_id);
        }
        
        String query1="select State,City,Area,House,Floor,Street,Building,Company,Landmark,username from details,user3 where details.username=user3.user and ord_id="+ord_id+";";
        ResultSet rp=stmt.executeQuery(query1);
        if(rp.next());
        {
            String State = rp.getString("State");
           String City = rp.getString("City");
    String Area = rp.getString("Area");
    String House = rp.getString("House");
    String Floor = rp.getString("Floor");
    String Street = rp.getString("Street");
    String Building = rp.getString("Building");
    String Company = rp.getString("Company");
    String Landmark = rp.getString("Landmark");
    String Delivery=House+','+Floor+','+Company+','+Building+','+Street+','+Area+','+Landmark+','+City+','+State;   
    jTextArea1.setText(Delivery);
        }
        
      
       String query3="select SUM(Price) from Order_det where Ord_Id="+ord_id+";";
     
        ResultSet rt=stmt.executeQuery(query3);
       
       while(rt.next())
        {
         String price=rt.getString("SUM(Price)");
         jLabel5.setText("Total Price:   "+price);
        }
       
       String query2="select item,quantity from Order_det where Ord_Id="+ord_id+";"; 
       ResultSet rq=stmt.executeQuery(query2);
       
     while(rq.next())
{
         String Item=rq.getString("item");
        String Quantity=rq.getString("quantity");
         model.addRow(new Object[] {Item,Quantity});
        }
         String query8="select special from special";
     
        ResultSet rz=stmt.executeQuery(query8);
       
       while(rz.next())
        {
         String special=rz.getString("special");
         jTextArea2.setText(special);
        }
      
            
    }
catch(Exception e)
    {
         JOptionPane.showMessageDialog(this, e.getMessage());
    }// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try
    {
        Class.forName("java.sql.DriverManager");
        Connection con = (Connection)
        DriverManager.getConnection("jdbc:mysql://localhost/practical12","root","");
        Statement stmt = (Statement)con.createStatement();
        String query4="delete from user1";
       String query5="delete from user2";
       String query6="delete from user3";
       String query7="delete from indicate";
       String del="delete from order_temp;";
       String query2="delete from special;";
       stmt.executeUpdate(query4);
       stmt.executeUpdate(query5);
       stmt.executeUpdate(query6);
       stmt.executeUpdate(query7);
       stmt.executeUpdate(del);
         stmt.executeUpdate(query2);
    }
catch(Exception e)
    {
         JOptionPane.showMessageDialog(this, e.getMessage());
    }
        this.setVisible(false);
new checkout().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new review().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}