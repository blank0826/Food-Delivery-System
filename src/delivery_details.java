
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class delivery_details extends javax.swing.JFrame {

    /**
     * Creates new form delivery_details
     */
    public delivery_details() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DELIVERY DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Frizzed BRK", 1, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Conduit 2 BRK", 1, 14)); // NOI18N
        jLabel4.setText("STATE*");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "ANDRA PRADESH", "ARUNACHAL PRADESH", "ASSAM", "BIHAR", "CHATTISGARH", "GOA", "GUJARAT", "HARYANA", "HIMACHAL PRADESH", "JAMMU & KASHMIR", "JHARKHAND", "KARNATAKA", "KERALA", "MADHYA PRADESH", "MAHARASTHRA", "MANIPUR", "MEGHALAYA", "MIZORAM", "NAGALAND", "ODISHA", "PUNJAB", "RAJASTHAN", "SIKKIM", "TAMIL NADU", "TELANGANA", "TRIPURA", "UTRAKHAND", "UTTAR PRADESH", "WEST BENGAL" }));

        jLabel5.setFont(new java.awt.Font("Conduit 2 BRK", 1, 14)); // NOI18N
        jLabel5.setText("CITY*");

        jLabel6.setFont(new java.awt.Font("Conduit 2 BRK", 1, 14)); // NOI18N
        jLabel6.setText("AREA*");

        jLabel7.setFont(new java.awt.Font("Conduit 2 BRK", 1, 14)); // NOI18N
        jLabel7.setText("HOUSE*");

        jLabel8.setFont(new java.awt.Font("Conduit 2 BRK", 1, 14)); // NOI18N
        jLabel8.setText("FLOOR*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 155, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2))
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(jTextField4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Aspartame BRK", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADDRESS FORM");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 14)); // NOI18N
        jLabel2.setText("PLEASE ENTER YOUR DELIVERY ADDRESS:");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 14)); // NOI18N
        jLabel3.setText("*Required Fields");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ADDITIONAL INFORMATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Frizzed BRK", 1, 14))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Conduit 2 BRK", 1, 14)); // NOI18N
        jLabel9.setText("STREET NAME");

        jLabel10.setFont(new java.awt.Font("Conduit 2 BRK", 1, 14)); // NOI18N
        jLabel10.setText("BUILDING");

        jLabel11.setFont(new java.awt.Font("Conduit 2 BRK", 1, 14)); // NOI18N
        jLabel11.setText("COMPANY NAME");

        jLabel12.setFont(new java.awt.Font("Conduit 2 BRK", 1, 14)); // NOI18N
        jLabel12.setText("LANDMARK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.PNG"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("CLEAR");
        jMenu1.setFont(new java.awt.Font("8-bit Limit R BRK", 1, 18)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("EXIT");
        jMenu2.setFont(new java.awt.Font("8-bit Limit R BRK", 1, 18)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3))
                    .addComponent(jButton1))
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String state = null,city,area,house,floor,street,company,building,landmark,special,add,indicate;
String b,c,d,f,g,h;
if(jComboBox1.getSelectedIndex()==0)
    state="a";
else if(jComboBox1.getSelectedIndex()==1)
    state="ANDRA PRADESH";
else if(jComboBox1.getSelectedIndex()==2)
    state="ARUNACHAL PRADESH";
else if(jComboBox1.getSelectedIndex()==3)
    state="ASSAM";
else if(jComboBox1.getSelectedIndex()==4)
    state="BIHAR";
else if(jComboBox1.getSelectedIndex()==5)
    state="CHATTISGARH";
else if(jComboBox1.getSelectedIndex()==6)
    state="GOA";
else if(jComboBox1.getSelectedIndex()==7)
    state="GUJARAT";
else if(jComboBox1.getSelectedIndex()==8)
    state="HARYANA";
else if(jComboBox1.getSelectedIndex()==9)
    state="HIMACHAL PRADESH";
else if(jComboBox1.getSelectedIndex()==10)
    state="JAMMU & KASHMIR";
else if(jComboBox1.getSelectedIndex()==11)
    state="JHARKHAND";
else if(jComboBox1.getSelectedIndex()==12)
    state="KARNATAKA";
else if(jComboBox1.getSelectedIndex()==13)
    state="KERELA";
else if(jComboBox1.getSelectedIndex()==14)
    state="MADHYA PRADESH";
else if(jComboBox1.getSelectedIndex()==15)
    state="MAHARASHTRA";
else if(jComboBox1.getSelectedIndex()==16)
    state="MANIPUR";
else if(jComboBox1.getSelectedIndex()==17)
    state="MEGHALAYA";
else if(jComboBox1.getSelectedIndex()==18)
    state="MIZORAM";
else if(jComboBox1.getSelectedIndex()==19)
    state="NAGALAND";
    else if(jComboBox1.getSelectedIndex()==20)
    state="ODISHA";
            else if(jComboBox1.getSelectedIndex()==21)
    state="PUNJAB";
            else if(jComboBox1.getSelectedIndex()==22)
    state="RAJASTHAN";
            else if(jComboBox1.getSelectedIndex()==23)
    state="SIKKIM";
            else if(jComboBox1.getSelectedIndex()==24)
    state="TAMIL NADU";
            else if(jComboBox1.getSelectedIndex()==25)
    state="TELENGANA";
            else if(jComboBox1.getSelectedIndex()==26)
    state="TRIPURA";
            else if(jComboBox1.getSelectedIndex()==27)
    state="UTTRAKHAND";
            else if(jComboBox1.getSelectedIndex()==28)
    state="UTTAR PRADESH";
            else if(jComboBox1.getSelectedIndex()==29)
    state="WEST BENGAL";
city=jTextField1.getText()+" ,";
area=jTextField2.getText()+" ,";
house=jTextField3.getText()+" ,";
floor=jTextField4.getText();
street=jTextField5.getText()+" ,";
building=jTextField6.getText()+" ,";
company=jTextField7.getText()+" ,";
landmark=jTextField8.getText()+" ,";

if(state.equals("a")||city.equals(" ,")||area.equals(" ,")||house.equals(" ,")||floor.equals(" ,"))
    JOptionPane.showMessageDialog(null,"A FIELD IS LEFT BLANK.");
else
{
add=house+floor+company+building+street+landmark+area+city+state;   
int s = JOptionPane.showConfirmDialog(null,"YOUR CURRENT DELIVERY DETAILS IS:\n\t"+add+"\n\tIF YOU WANT TO CONTINUE PRESS YES\n \tAND IF YOU WANT TO CHANGE THE ADDRESS PRESS NO"
        ,null,JOptionPane.YES_NO_OPTION);

 {
     if(s==JOptionPane.YES_OPTION)
 {
    try
    {
        Class.forName("java.sql.DriverManager");
        Connection con = (Connection)
        DriverManager.getConnection("jdbc:mysql://localhost/practical12","root","");
        Statement stmt = (Statement)
        con.createStatement();
       
        String query="select Number from indicate;";
        ResultSet rs=stmt.executeQuery(query);
        if(rs.next());
        indicate =rs.getString("Number");
        int a=Integer.parseInt(indicate);
        if (a==0)
{
        try
    {
    Class.forName("java.sql.DriverManager");
     con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/practical12","root","");
     stmt=(Statement) con.createStatement();
    String user="select username from user2;"; 
    ResultSet rp=stmt.executeQuery(user);
    if(rp.next())
        user=rp.getString("username");
    
    String query1="insert into details values ('"+state+"','"+city+"','"+area+"','"+house+"',"+floor+",'"
            +street+"','"+building+"','"+company+"','"+landmark+"','"+user+"');";
  
    stmt.executeUpdate(query1);
    this.setVisible(false);
new login().setVisible(true);
    }
    catch(Exception e)
    {
         JOptionPane.showMessageDialog(this, e.getMessage());
    }
}
        else if(a==1)
        {
            try
    {
            Class.forName("java.sql.DriverManager");
     con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/practical12","root","");
     stmt=(Statement) con.createStatement();
    String user="select username from user1;"; 
    ResultSet rt=stmt.executeQuery(user);
    if(rt.next())
        user=rt.getString("username");
    
    String query3="update Details set State='"+state+"',City='"+city+"',Area='"+area+"',House='"+house+
            "',Floor='"+floor+"',Street='"+street+"',Building='"+building+"',Company='"+company+"',Landmark='"+landmark+"' where Username='"+user+"';"; 
   
    stmt.executeUpdate(query3);
     this.setVisible(false);
new check_delivery().setVisible(true);
    }
            catch(Exception e)
    {
         JOptionPane.showMessageDialog(this, e.getMessage());
    }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
 catch(Exception e)
    {
         JOptionPane.showMessageDialog(this, e.getMessage());
    }
 }
     
}
  
}
    }
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     String state,indicate;
     
     try
    {
        Class.forName("java.sql.DriverManager");
        Connection con = (Connection)
        DriverManager.getConnection("jdbc:mysql://localhost/practical12","root","");
        Statement stmt = (Statement)
        con.createStatement();
       
        String query="select Number from indicate;";
        ResultSet rs=stmt.executeQuery(query);
        if(rs.next());
        indicate =rs.getString("Number");
        int a=Integer.parseInt(indicate);
    
    
if (a==1)
{

    try
    {
         Class.forName("java.sql.DriverManager");
         con = (Connection)
        DriverManager.getConnection("jdbc:mysql://localhost/practical12","root","");
        stmt = (Statement)
        con.createStatement();
         String user="select Username from user1;"; 
         ResultSet br=stmt.executeQuery(user);
         if(br.next())
         {
             user=br.getString("Username");
         }
        String details="select State,City,Area,House,Floor,Street,Building,Company,Landmark from details where Username='"+user+"';";
        ResultSet ar=stmt.executeQuery(details);
        if(ar.next())
        {
            String b=ar.getString("State");
            if(b.equals("ANDRA PRADESH"))
    jComboBox1.setSelectedIndex(1);
else if(b.equals("ARUNACHAL PRADESH"))
jComboBox1.setSelectedIndex(2);
else if(b.equals("ASSAM"))
jComboBox1.setSelectedIndex(3);
else if(b.equals("BIHAR"))
jComboBox1.setSelectedIndex(4);
else if(b.equals("CHATTISGARH"))
jComboBox1.setSelectedIndex(5);
else if(b.equals("GOA"))
jComboBox1.setSelectedIndex(6);
else if(b.equals("GUJARAT"))
jComboBox1.setSelectedIndex(7);
else if(b.equals("HARYANA"))
jComboBox1.setSelectedIndex(8);
else if(b.equals("HIMACHAL PRADESH"))
jComboBox1.setSelectedIndex(9);
else if(b.equals("JAMMU & KASHMIR"))
 jComboBox1.setSelectedIndex(10);
else if(b.equals("JHARKHAND"))
jComboBox1.setSelectedIndex(11);
else if(b.equals("KARNATAKA"))
  jComboBox1.setSelectedIndex(12);
else if(b.equals("KERELA"))
jComboBox1.setSelectedIndex(13);
else if(b.equals("MADHYA RADESH"))
jComboBox1.setSelectedIndex(14);
else if(b.equals("MAHARASHTRA"))
jComboBox1.setSelectedIndex(15);
else if(b.equals("MANIPUR"))
jComboBox1.setSelectedIndex(16);
else if(b.equals("MEGHALAYA"))
  jComboBox1.setSelectedIndex(17);
else if(b.equals("MIZORAM"))
jComboBox1.setSelectedIndex(18);
else if(b.equals("NAGALAND"))
 jComboBox1.setSelectedIndex(19);
    else if(b.equals("ODISHA"))
  jComboBox1.setSelectedIndex(20);
            else if(b.equals("PUNJAB"))
    jComboBox1.setSelectedIndex(21);
            else if(b.equals("RAJASTHAN"))
    jComboBox1.setSelectedIndex(22);
            else if(b.equals("SIKKIM"))
   jComboBox1.setSelectedIndex(23);
            else if(b.equals("TAMIL NADU"))
   jComboBox1.setSelectedIndex(24);
            else if(b.equals("TELEGANA"))
   jComboBox1.setSelectedIndex(25);
            else if(b.equals("TRIPURA"))
   jComboBox1.setSelectedIndex(26);
            else if(b.equals("UTTRAKHAND"))
    jComboBox1.setSelectedIndex(27);
            else if(b.equals("UTTAR PRADESH"))
    jComboBox1.setSelectedIndex(28);
            else if(b.equals("WEST BENGAL"))
    jComboBox1.setSelectedIndex(29);
           
            jTextField1.setText(ar.getString("City"));
            jTextField2.setText(ar.getString("Area"));
            jTextField3.setText(ar.getString("House"));
            jTextField4.setText(ar.getString("Floor"));
            jTextField5.setText(ar.getString("Street"));
            jTextField6.setText(ar.getString("Building"));
            jTextField7.setText(ar.getString("Company"));
            jTextField8.setText(ar.getString("Landmark"));
           
        }
                   }
        catch(Exception e)
    {
         JOptionPane.showMessageDialog(this, e.getMessage());
    }
    
    }

    }  
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(this,e.getMessage());
}
   // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jTextField5.setText("");
jTextField6.setText("");
jTextField7.setText("");
jTextField8.setText("");
jComboBox1.setSelectedIndex(-1);// TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseClicked

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
            java.util.logging.Logger.getLogger(delivery_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delivery_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delivery_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delivery_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delivery_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
