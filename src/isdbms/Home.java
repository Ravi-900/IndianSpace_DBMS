/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isdbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ravi
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        ShowLauncher();
    }

    public void ShowSmall() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "SELECT `Name`, `LaunchMass`, `MissionLife`, `LauncherId`, `LauchDate`, `OrbitType`, `Application`, `Remark` FROM `addsatellite` WHERE Application Like '%Small%'";
            PreparedStatement pst=con.prepareStatement(sql);
   
         ResultSet rs=pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)SMALLTABLE.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getString("Name"),rs.getString("LauchDate"),rs.getString("LaunchMass"),rs.getString("LauncherId"),rs.getString("OrbitType"),rs.getString("Application"),rs.getString("Remark")};
                tm.addRow(o);
            }
            con.close();
            
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
      public void ShowCommunication() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "SELECT `Name`, `LaunchMass`, `MissionLife`, `LauncherId`, `LauchDate`, `OrbitType`, `Application`, `Remark` FROM `addsatellite` WHERE Application Like '%Communication%'";
            PreparedStatement pst=con.prepareStatement(sql);
   
         ResultSet rs=pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)COMMUNICATIONTABLE.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getString("Name"),rs.getString("LauchDate"),rs.getString("LaunchMass"),rs.getString("LauncherId"),rs.getString("OrbitType"),rs.getString("Application"),rs.getString("Remark")};
                tm.addRow(o);
            }
            con.close();
            
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
      
      
       public void ShowEarth() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "SELECT `Name`, `LaunchMass`, `MissionLife`, `LauncherId`, `LauchDate`, `OrbitType`, `Application`, `Remark` FROM `addsatellite` WHERE Application Like '%EARTH%'";
            PreparedStatement pst=con.prepareStatement(sql);
   
         ResultSet rs=pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)EARTHTABLE.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getString("Name"),rs.getString("LauchDate"),rs.getString("LaunchMass"),rs.getString("LauncherId"),rs.getString("OrbitType"),rs.getString("Application"),rs.getString("Remark")};
                tm.addRow(o);
            }
            con.close();
            
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
       
       public void ShowNavigation() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "SELECT `Name`, `LaunchMass`, `MissionLife`, `LauncherId`, `LauchDate`, `OrbitType`, `Application`, `Remark` FROM `addsatellite` WHERE Application Like '%NAVIGATION%'";
            PreparedStatement pst=con.prepareStatement(sql);
   
         ResultSet rs=pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)NAVIGATIONTABLE.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getString("Name"),rs.getString("LauchDate"),rs.getString("LaunchMass"),rs.getString("LauncherId"),rs.getString("OrbitType"),rs.getString("Application"),rs.getString("Remark")};
                tm.addRow(o);
            }
            con.close();
            
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
       
              public void ShowScientific() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "SELECT `Name`, `LaunchMass`, `MissionLife`, `LauncherId`, `LauchDate`, `OrbitType`, `Application`, `Remark` FROM `addsatellite` WHERE Application Like '%SCIENTIFIC%'";
            PreparedStatement pst=con.prepareStatement(sql);
   
         ResultSet rs=pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)SCIENTIFICTABLE.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getString("Name"),rs.getString("LauchDate"),rs.getString("LaunchMass"),rs.getString("LauncherId"),rs.getString("OrbitType"),rs.getString("Application"),rs.getString("Remark")};
                tm.addRow(o);
            }
            con.close();
            
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
              
              
        public void ShowExperimental() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "SELECT `Name`, `LaunchMass`, `MissionLife`, `LauncherId`, `LauchDate`, `OrbitType`, `Application`, `Remark` FROM `addsatellite` WHERE Application Like '%EXPERIMENTAL%'";
            PreparedStatement pst=con.prepareStatement(sql);
   
         ResultSet rs=pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)EXPERIMENTALTABLE.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getString("Name"),rs.getString("LauchDate"),rs.getString("LaunchMass"),rs.getString("LauncherId"),rs.getString("OrbitType"),rs.getString("Application"),rs.getString("Remark")};
                tm.addRow(o);
            }
            con.close();
            
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
        
        
              public void ShowStudent() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "SELECT `Name`, `LaunchMass`, `MissionLife`, `LauncherId`, `LauchDate`, `OrbitType`, `Application`, `Remark` FROM `addsatellite` WHERE Application Like '%student%'";
            PreparedStatement pst=con.prepareStatement(sql);
   
         ResultSet rs=pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)STUDENTTABLE.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getString("Name"),rs.getString("LauchDate"),rs.getString("LaunchMass"),rs.getString("LauncherId"),rs.getString("OrbitType"),rs.getString("Application"),rs.getString("Remark")};
                tm.addRow(o);
            }
            con.close();
            
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
              
               public void ShowLauncher() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "SELECT `ID`, `Date`, `Weight`, `Height`, `LOF`, `LauncherType`, `OrbitType`, `Remark` FROM `addlauncher` ";
            PreparedStatement pst=con.prepareStatement(sql);
   
         ResultSet rs=pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)LAUTABLE.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getString("Id"),rs.getString("Date"),rs.getString("Weight"),rs.getString("Height"),rs.getString("LOF"),rs.getString("LauncherType"),rs.getString("OrbitType"),rs.getString("Remark")};
                tm.addRow(o);
            }
            con.close();
            
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        kButton3 = new keeptoo.KButton();
        EARTH = new javax.swing.JLabel();
        HOMEPAGE = new javax.swing.JLabel();
        SPACE = new javax.swing.JLabel();
        NAVIGATION = new javax.swing.JLabel();
        SCIENTIFIC = new javax.swing.JLabel();
        STUDENT = new javax.swing.JLabel();
        EXPERIMENTAL = new javax.swing.JLabel();
        LAUNCHER = new javax.swing.JLabel();
        COMMUNICATION = new javax.swing.JLabel();
        SMALL = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        jPanel3 = new javax.swing.JPanel();
        HOME = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        SPACECRAFTS = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        SMALLSAT = new keeptoo.KGradientPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SMALLTABLE = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        COMMUNICATIONSAT = new keeptoo.KGradientPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        COMMUNICATIONTABLE = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        EARTHSAT = new keeptoo.KGradientPanel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        EARTHTABLE = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NAVIGATIONSAT = new keeptoo.KGradientPanel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        NAVIGATIONTABLE = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        SCIENTIFICSAT = new keeptoo.KGradientPanel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        SCIENTIFICTABLE = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        EXPERIMENTALSAT = new keeptoo.KGradientPanel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        EXPERIMENTALTABLE = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        STUDENTSAT = new keeptoo.KGradientPanel();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        STUDENTTABLE = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        LAUNCHERTABLE = new keeptoo.KGradientPanel();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        LAUTABLE = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(240, 100, 1420, 787));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kButton3.setText("ADMIN LOGIN");
        kButton3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        kButton3.setkBorderRadius(40);
        kButton3.setkEndColor(new java.awt.Color(255, 255, 0));
        kButton3.setkFillButton(false);
        kButton3.setkStartColor(new java.awt.Color(255, 255, 0));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 740, -1, -1));

        EARTH.setBackground(new java.awt.Color(255, 255, 255));
        EARTH.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        EARTH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EARTH.setText("<HTML><P ALIGN =\"CENTER\">EARTH SATELLITE</P></HTML>");
        EARTH.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));
        EARTH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EARTH.setOpaque(true);
        EARTH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouceClicked(evt);
            }
        });
        jPanel1.add(EARTH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 280, 70));

        HOMEPAGE.setBackground(new java.awt.Color(255, 255, 255));
        HOMEPAGE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        HOMEPAGE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HOMEPAGE.setText("HOME");
        HOMEPAGE.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));
        HOMEPAGE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HOMEPAGE.setOpaque(true);
        HOMEPAGE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouceClicked(evt);
            }
        });
        jPanel1.add(HOMEPAGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 280, 50));

        SPACE.setBackground(new java.awt.Color(255, 255, 255));
        SPACE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SPACE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SPACE.setText("SPACECRAFTS");
        SPACE.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));
        SPACE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SPACE.setOpaque(true);
        SPACE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouceClicked(evt);
            }
        });
        jPanel1.add(SPACE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, 50));

        NAVIGATION.setBackground(new java.awt.Color(255, 255, 255));
        NAVIGATION.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NAVIGATION.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NAVIGATION.setText("<HTML><P ALIGN =\"CENTER\">NAVIGATION SATELLITE</P></HTML>");
        NAVIGATION.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));
        NAVIGATION.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NAVIGATION.setOpaque(true);
        NAVIGATION.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouceClicked(evt);
            }
        });
        jPanel1.add(NAVIGATION, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 280, 70));

        SCIENTIFIC.setBackground(new java.awt.Color(255, 255, 255));
        SCIENTIFIC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SCIENTIFIC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SCIENTIFIC.setText("<HTML><P ALIGN =\"CENTER\">SCIENTIFC SATELLITE</P></HTML>");
        SCIENTIFIC.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));
        SCIENTIFIC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SCIENTIFIC.setOpaque(true);
        SCIENTIFIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouceClicked(evt);
            }
        });
        jPanel1.add(SCIENTIFIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 280, 70));

        STUDENT.setBackground(new java.awt.Color(255, 255, 255));
        STUDENT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        STUDENT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        STUDENT.setText("<HTML><P ALIGN =\"CENTER\">STUDENT SATELLITE</P></HTML>");
        STUDENT.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));
        STUDENT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        STUDENT.setOpaque(true);
        STUDENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouceClicked(evt);
            }
        });
        jPanel1.add(STUDENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 280, 70));

        EXPERIMENTAL.setBackground(new java.awt.Color(255, 255, 255));
        EXPERIMENTAL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        EXPERIMENTAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EXPERIMENTAL.setText("<HTML><P ALIGN =\"CENTER\">EXPERIMENTAL SATELLITE</P></HTML>");
        EXPERIMENTAL.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));
        EXPERIMENTAL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EXPERIMENTAL.setOpaque(true);
        EXPERIMENTAL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouceClicked(evt);
            }
        });
        jPanel1.add(EXPERIMENTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 280, 70));

        LAUNCHER.setBackground(new java.awt.Color(255, 255, 255));
        LAUNCHER.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LAUNCHER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LAUNCHER.setText("<HTML><P ALIGN =\"CENTER\">LIST OF LAUNCHERS</P></HTML>");
        LAUNCHER.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));
        LAUNCHER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LAUNCHER.setOpaque(true);
        LAUNCHER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouceClicked(evt);
            }
        });
        jPanel1.add(LAUNCHER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 280, 70));

        COMMUNICATION.setBackground(new java.awt.Color(255, 255, 255));
        COMMUNICATION.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        COMMUNICATION.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        COMMUNICATION.setText("<HTML><P ALIGN =\"CENTER\">COMMUNICATION SATELLITE</P></HTML>");
        COMMUNICATION.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));
        COMMUNICATION.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        COMMUNICATION.setOpaque(true);
        COMMUNICATION.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouceClicked(evt);
            }
        });
        jPanel1.add(COMMUNICATION, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 280, 70));

        SMALL.setBackground(new java.awt.Color(255, 255, 255));
        SMALL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SMALL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SMALL.setText("<HTML><P ALIGN =\"CENTER\">SMALL SATELLITE</P></HTML>");
        SMALL.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));
        SMALL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SMALL.setOpaque(true);
        SMALL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouceClicked(evt);
            }
        });
        jPanel1.add(SMALL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 280, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 790));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(51, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("INDIAN SPACE DATABASE MANAGEMENT SYSTEM");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 4, 600, 30));

        kButton1.setText("EXIT");
        kButton1.setkBorderRadius(100);
        kButton1.setkFillButton(false);
        kButton1.setkStartColor(new java.awt.Color(204, 0, 0));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 60, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1140, 40));

        jPanel3.setLayout(new java.awt.CardLayout());

        HOME.setBackground(new java.awt.Color(255, 255, 255));
        HOME.setkEndColor(new java.awt.Color(255, 255, 255));
        HOME.setkStartColor(new java.awt.Color(255, 255, 255));
        HOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouceClicked(evt);
            }
        });
        HOME.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isdbms/Images/back00.png"))); // NOI18N
        jLabel2.setText("<html> The space research activities were initiated in India during the early 1960’s, when applications using satellites were  in experimental stages even in the United States. With the live transmission of Tokyo Olympic Games across  the Pacific by the American Satellite ‘Syncom-3’ demonstrating the power of communication satellites, Dr. Vikram Sarabhai,  the founding father of Indian space programme, quickly recognized the benefits of space technologies for India.  As a first step,  the Department of Atomic Energy formed the INCOSPAR (Indian National Committee for Space Research) under the leadership of Dr. Sarabhai and Dr. Ramanathan in 1962.  The Indian Space Research Organisation (ISRO) was later formed on August 15, 1969. The prime objective of ISRO is to develop space technology and  its application to various national needs. It is one of the six largest space agencies in the world. The Department of Space (DOS) and the Space Commission were  set up in 1972 and ISRO was brought under DOS on June 1, 1972.  Since inception, the Indian space programme has been orchestrated well and had three distinct  elements such as, satellites for communication and remote sensing, the space transportation system and application programmes. Two majot operational systems have been  established – the Indian National Satellite (INSAT) for telecommunication, television broadcasting, and meteorological services and the Indian Remote Sensing Satellite (IRS)  for monitoring and management of natural resources and Disaster Management Support. </html>");
        HOME.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 710));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        HOME.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 710, 1150, 40));

        jPanel3.add(HOME, "card2");

        SPACECRAFTS.setkEndColor(new java.awt.Color(255, 255, 255));
        SPACECRAFTS.setkStartColor(new java.awt.Color(255, 255, 255));
        SPACECRAFTS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isdbms/Images/Communication.png"))); // NOI18N
        jLabel3.setText("<html>\nCommunication<br>\nSatellites\n</html>");
        SPACECRAFTS.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 280, 160));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html>\n\n Supports telecommunication, television \n broadcasting, satellite news gathering,\n societal applications, weather forecasting\n disaster warning and Search and Rescue operation \nservices.\n\n</html>");
        SPACECRAFTS.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 250, 170));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isdbms/Images/EarthObservation.png"))); // NOI18N
        jLabel15.setText("<html>\nEarth Observation<br>\nSatellites\n</html>");
        SPACECRAFTS.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 270, 160));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("<html>\n\nThe largest civilian remote sensing satellite \nconstellation in the world - thematic series of\n satellites supporting multitude of applications\nin the areas of land and water resources \ncartography and ocean & atmosphere.\n\n</html>");
        SPACECRAFTS.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 270, 170));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isdbms/images/Nav.png"))); // NOI18N
        jLabel5.setText("<html> Navigation<br> Satellites </html>");
        SPACECRAFTS.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 260, 160));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("<html>\n\nSatellites for navigation services to meet the \nemerging demands of the Civil Aviation \nrequirements and to meet the user requirement\nof the positioning, navigation and timing based\non the independent satellite navigation system. \n\n</html>");
        SPACECRAFTS.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 290, 170));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isdbms/Images/scientific.png"))); // NOI18N
        jLabel6.setText("<html> Scientific<br> Satellites </html>");
        SPACECRAFTS.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, 240, 160));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("<html>   Spacecraft for research in areas like  astronomy, astrophysics, planetary and  earth sciences, atmospheric sciences  and theoretical physics.  </html>");
        SPACECRAFTS.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 220, 220, 170));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isdbms/Images/Experimental.png"))); // NOI18N
        jLabel12.setText("<html>\nExperimental <br>\nSatellites\n</html>");
        SPACECRAFTS.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 270, 160));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html>\n\nA host of small satellites mainly for the\n experimental purposes. These experiments \ninclude Remote Sensing, Atmospheric Studies\n, Payload Development, Orbit Controls, \nrecovery technology etc..\n\n</html>");
        SPACECRAFTS.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 330, 130));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 204, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isdbms/Images/SmallSatellites.png"))); // NOI18N
        jLabel16.setText("<html>\nSmall<br>\nSatellites\n</html>");
        SPACECRAFTS.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 270, 160));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<html>\n\nSub 500 kg class satellites - a platform for\n stand-alone payloads for earth imaging\n and science missions within a quick turn \naround time. \n\n</html>");
        SPACECRAFTS.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 570, 320, 130));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isdbms/Images/StudentSatellite.png"))); // NOI18N
        jLabel9.setText("<html>\nStudent<br>\nSatellites\n</html>");
        SPACECRAFTS.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, 270, 160));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("<html>\n\n ISRO's Student Satellite programme is \nenvisaged to encourage various Universities \nand Institutions for the development of \nNano/Pico Satellites.\n\n</html>");
        SPACECRAFTS.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, 300, 120));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel18.setText("Indian SpaceCrafts");
        SPACECRAFTS.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        SPACECRAFTS.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 710, 1150, 40));

        jPanel3.add(SPACECRAFTS, "card3");

        SMALLSAT.setkEndColor(new java.awt.Color(255, 255, 255));
        SMALLSAT.setkStartColor(new java.awt.Color(255, 255, 255));
        SMALLSAT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel21.setText("SMALL SATELLITE");
        SMALLSAT.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 40));

        SMALLTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "LAUNCH DATE", "LAUNCH MASS", "LAUNCHER ID", "ORBIT TYPE", "APPLICATION", "REMARK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SMALLTABLE.setGridColor(new java.awt.Color(0, 102, 255));
        jScrollPane1.setViewportView(SMALLTABLE);

        SMALLSAT.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1140, 160));

        jLabel23.setFont(new java.awt.Font("Segoe UI Symbol", 0, 20)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isdbms/Images/SMALLSAT.png"))); // NOI18N
        jLabel23.setText("<html>    The small satellite project is envisaged to provide platform for stand-alone payloads for earth imaging   and science missions within a quick turn around time. For making the versatile platform for different   kinds of payloads, two kinds of buses have been configured and developed. <H2 ALIGN=\"CENTER\">Indian Mini Satellite -1 (IMS-1)</H2>  IMS-1 bus has been developed as a versatile bus of 100 kg class which includes a payload capability  of around 30 kg.  <H2 ALIGN=\"CENTER\">Indian Mini Satellite -2 (IMS-2) Bus</H2>  IMS-2 Bus is evolved as a standard bus of 400 kg class which includes a payload capability of around   200kg.   IMS-2 development is an important milestone as it is envisaged to be a work horse for different types of remote sensing applications. The first mission of IMS-2 is SARAL.  SARAL is a co-operative mission between ISRO and CNES with payloads from CNES and spacecraft bus from ISRO. </HTML>");
        SMALLSAT.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1140, 490));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        SMALLSAT.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 710, 1150, 40));

        jPanel3.add(SMALLSAT, "card4");

        COMMUNICATIONSAT.setkEndColor(new java.awt.Color(255, 255, 255));
        COMMUNICATIONSAT.setkStartColor(new java.awt.Color(255, 255, 255));
        COMMUNICATIONSAT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel24.setText("COMMUNICATION SATELLITE");
        COMMUNICATIONSAT.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 40));

        COMMUNICATIONTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "LAUNCH DATE", "LAUNCH MASS", "LAUNCHER ID", "ORBIT TYPE", "APPLICATION", "REMARK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        COMMUNICATIONTABLE.setGridColor(new java.awt.Color(51, 102, 255));
        jScrollPane2.setViewportView(COMMUNICATIONTABLE);

        COMMUNICATIONSAT.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1140, 160));

        jLabel27.setFont(new java.awt.Font("Segoe UI Symbol", 0, 20)); // NOI18N
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isdbms/Images/COMMUNICATIONSAT.png"))); // NOI18N
        jLabel27.setText("<HTML>The Indian National Satellite (INSAT) system is one of the largest domestic communication satellite\n systems in Asia-Pacific  region with nine operational communication satellites placed in Geo-stationary orbit. \nEstablished  in 1983 with  commissioning of INSAT-1B, it initiated a major revolution in India’s communications sector and  sustained the same later. \n GSAT-17 joins the constellation of INSAT System consisting 15 operational satellites,  namely - INSAT-3A, 3C, 4A, 4B, 4CR and GSAT-6, 7, 8, 9, 10, 12, 14, 15, 16 and 18. The INSAT system with more than 200 transponders in the C, \nExtended C and Ku-bands provides services to  telecommunications, television broadcasting, satellite newsgathering, societal applications, weather forecasting,  disaster warning and Search and Rescue operations.</HTML>\n");
        COMMUNICATIONSAT.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1140, 500));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        COMMUNICATIONSAT.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 710, 1150, 40));

        jPanel3.add(COMMUNICATIONSAT, "card4");

        EARTHSAT.setForeground(new java.awt.Color(255, 255, 255));
        EARTHSAT.setkEndColor(new java.awt.Color(255, 255, 255));
        EARTHSAT.setkStartColor(new java.awt.Color(255, 255, 255));
        EARTHSAT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel26.setText("EARTH OBSERVATION SATELLITE");
        EARTHSAT.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 40));

        EARTHTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "LAUNCH DATE", "LAUNCH MASS", "LAUNCHER ID", "ORBIT TYPE", "APPLICATION", "REMARK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EARTHTABLE.setGridColor(new java.awt.Color(0, 102, 255));
        jScrollPane3.setViewportView(EARTHTABLE);

        EARTHSAT.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1140, 160));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        EARTHSAT.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 710, 1150, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 20)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isdbms/Images/EARTHSAT.png"))); // NOI18N
        jLabel1.setText("<HTML>Starting with IRS-1A in 1988, ISRO has launched many operational remote sensing satellites. Today, India has one of the largest constellations of remote sensing satellites in operation. Currently, *thirteen* operational satellites are in Sun-synchronous orbit – RESOURCESAT-1, 2, 2A CARTOSAT-1, 2, 2A, 2B, RISAT-1 and 2, OCEANSAT-2, Megha-Tropiques, SARAL and SCATSAT-1, and *four* in Geostationary orbit- INSAT-3D, Kalpana & INSAT 3A, INSAT -3DR. Varieties of instruments have been flown onboard these satellites to provide necessary data in a diversified spatial, spectral and temporal resolutions to cater to different user requirements in the country and for global usage. The data from these satellites are used for several applications covering agriculture, water resources, urban planning, rural development, mineral prospecting, environment, forestry, ocean resources and disaster management.</HTML>");
        EARTHSAT.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1140, 510));

        jPanel3.add(EARTHSAT, "card4");

        NAVIGATIONSAT.setkEndColor(new java.awt.Color(255, 255, 255));
        NAVIGATIONSAT.setkStartColor(new java.awt.Color(255, 255, 255));
        NAVIGATIONSAT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel30.setText("NAVIGATION SATELLITE");
        NAVIGATIONSAT.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 40));

        NAVIGATIONTABLE.setBackground(new java.awt.Color(51, 51, 51));
        NAVIGATIONTABLE.setForeground(new java.awt.Color(255, 255, 255));
        NAVIGATIONTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "LAUNCH DATE", "LAUNCH MASS", "LAUNCHER ID", "ORBIT TYPE", "APPLICATION", "REMARK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        NAVIGATIONTABLE.setGridColor(new java.awt.Color(0, 102, 255));
        jScrollPane4.setViewportView(NAVIGATIONTABLE);

        NAVIGATIONSAT.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 1140, 190));

        jLabel25.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel25.setText("<html>Satellite Navigation service is an emerging satellite based system with commercial and strategic applications. ISRO is committed to provide the satellite based Navigation services to meet the emerging demands of the Civil Aviation requirements and to meet the user requirements of the positioning, navigation and timing based on the independent satellite navigation system. To meet the Civil Aviation requirements, ISRO is working jointly with Airport Authority of India (AAI) in establishing the GPS Aided Geo Augmented Navigation (GAGAN) system. To meet the user requirements of the positioning, navigation and timing services based on the indigenous system, ISRO is establishing a regional satellite navigation system called Indian Regional Navigation Satellite System (IRNSS).  \n<b><h2 align=\"center\">(a) GPS Aided GEO Augmented Navigation (GAGAN): </h2></b>This is a Satellite Based Augmentation System (SBAS) implemented jointly with Airport Authority of India (AAI). The main objectives of GAGAN are to provide Satellite-based Navigation services with accuracy and integrity required for civil aviation applications and to provide better Air Traffic Management over Indian Airspace. The system will be interoperable with other international SBAS systems and provide seamless navigation across regional boundaries. The GAGAN Signal-In-Space (SIS) is available through GSAT-8 and GSAT-10. \n<b><h2 align=center\"> (b) Indian Regional Navigation Satellite System (IRNSS) : </h2></b>NavIC This is an independent Indian Satellite based positioning system for critical National applications. The main objective is to provide Reliable Position, Navigation and Timing services over India and its neighbourhood, to provide fairly good accuracy to the user. The IRNSS will provide basically two types of services  Standard Positioning Service (SPS) Restricted Service (RS) To date, ISRO has built a total of nine satellites in the IRNSS series; of which eight are currently in orbit Three of these satellites are in geostationary orbit (GEO) while the remaining in geosynchronous orbits (GSO) that maintain an inclination of 29° to the equatorial plane. The IRNSS constellation was named as “NavIC” (Navigation with Indian Constellation) by the Honourable Prime Minister, Mr. Narendra Modi and dedicated to the nation on the occasion of the successful launch of the IRNSS-1G satellite. The eight operational satellites in the IRNSS series, namely IRNSS-1A, 1B, 1C, 1D, 1E, 1F, 1G and 1I were launched on Jul 02, 2013; Apr 04, 2014; Oct 16, 2014; Mar 28, 2015; Jan 20, 2016; Mar 10, 2016, Apr 28, 2016; and Apr 12, 2018 respectively. The PSLV-39 / IRNSS-1H being unsuccessful; the satellite could not reach orbit.</html>");
        NAVIGATIONSAT.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1140, 480));

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        NAVIGATIONSAT.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 710, 1150, 40));

        jPanel3.add(NAVIGATIONSAT, "card4");

        SCIENTIFICSAT.setkEndColor(new java.awt.Color(255, 255, 255));
        SCIENTIFICSAT.setkStartColor(new java.awt.Color(255, 255, 255));
        SCIENTIFICSAT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel33.setText("SCIENTIFIC SATELLITE");
        SCIENTIFICSAT.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 40));

        SCIENTIFICTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "LAUNCH DATE", "LAUNCH MASS", "LAUNCHER ID", "ORBIT TYPE", "APPLICATION", "REMARK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SCIENTIFICTABLE.setGridColor(new java.awt.Color(0, 102, 255));
        jScrollPane5.setViewportView(SCIENTIFICTABLE);

        SCIENTIFICSAT.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1140, 160));

        jLabel19.setFont(new java.awt.Font("Segoe UI Symbol", 0, 15)); // NOI18N
        jLabel19.setText("<HTML>Indian space programme encompasses research in areas like astronomy, astrophysics, planetary and earth sciences, atmospheric sciences and theoretical physics. Balloons, sounding rockets, space platforms and ground-based facilities support these research efforts. A series of sounding rockets are available for atmospheric experiments. Several scientific instruments have been flown on satellites especially to direct celestial X-ray and gamma-ray bursts. \n<BR><B>AstroSat</B><BR>\n AstroSat is the first dedicated Indian astronomy mission aimed at studying celestial sources in X-ray, optical and UV spectral bands simultaneously. The payloads cover the energy bands of Ultraviolet (Near and For), limited optical and X-ray regime (0.3 keV to 100keV). One of the unique features of AstroSat mission is that it enables the simultaneous multi-wavelength observations of various astronomical objects with a single satellite. AstroSat with a lift-off mass of 1515 kg was launched on September 28, 2015 into a 650 km orbit inclined at an angle of 6 deg to the equator by PSLV-C30 from Satish Dhawan Space Centre, Sriharikota. The minimum useful life of the AstroSat mission is expected to be 5 years.\n<BR><B> Mars Orbiter Mission</B><BR>\n Mars Orbiter Mission is ISRO’s first interplanetary mission to planet Mars with an orbiter craft designed to orbit Mars in an elliptical orbit of 372 km by 80,000 km. Mars Orbiter mission can be termed as a challenging technological mission and a science mission considering the critical mission operations and stringent requirements on propulsion, communications and other bus systems of the spacecraft. The primary driving technological objective of the mission is to design and realize a spacecraft with a capability to perform Earth Bound Manoeuvre (EBM), Martian Transfer Trajectory (MTT) and Mars Orbit Insertion (MOI) phases and the related deep space mission planning and communication management at a distance of nearly 400 million Km. Autonomous fault detection and recovery also becomes vital for the mission.\n<BR><B> Chandrayaan-1</B><BR>\n Chandrayaan-1, India's first mission to Moon, was launched successfully on October 22, 2008 from SDSC SHAR, Sriharikota. The spacecraft was orbiting around the Moon at a height of 100 km from the lunar surface for chemical, mineralogical and photo-geologic mapping of the Moon. The spacecraft carried 11 scientific instruments built in India, USA, UK, Germany, Sweden and Bulgaria.\n<BR><B> Chandrayaan-2</B><BR>\n Chandrayaan-2 will be an advanced version of the previous Chandrayaan-1 mission to Moon.Chandrayaan-2 is configured as a two module system comprising of an Orbiter Craft module (OC) and a Lander Craft module (LC) carrying the Rover developed by ISRO.</HTML>");
        SCIENTIFICSAT.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1140, 500));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        SCIENTIFICSAT.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 710, 1150, 40));

        jPanel3.add(SCIENTIFICSAT, "card4");

        EXPERIMENTALSAT.setForeground(new java.awt.Color(255, 255, 255));
        EXPERIMENTALSAT.setkEndColor(new java.awt.Color(255, 255, 255));
        EXPERIMENTALSAT.setkStartColor(new java.awt.Color(255, 255, 255));
        EXPERIMENTALSAT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel36.setText("EXPERIMENTAL SATELLITE");
        EXPERIMENTALSAT.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 40));

        EXPERIMENTALTABLE.setBackground(new java.awt.Color(51, 51, 51));
        EXPERIMENTALTABLE.setForeground(new java.awt.Color(255, 255, 255));
        EXPERIMENTALTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "LAUNCH DATE", "LAUNCH MASS", "LAUNCHER ID", "ORBIT TYPE", "APPLICATION", "REMARK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EXPERIMENTALTABLE.setGridColor(new java.awt.Color(0, 102, 255));
        jScrollPane6.setViewportView(EXPERIMENTALTABLE);

        EXPERIMENTALSAT.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 1140, 190));

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        EXPERIMENTALSAT.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 710, 1150, 40));

        jLabel22.setFont(new java.awt.Font("Segoe UI Symbol", 0, 20)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isdbms/Images/satellite-biyitself-2016.png"))); // NOI18N
        jLabel22.setText("<html>ISRO has launched many small satellites mainly for the experimental purposes. This experiment include Remote Sensing, Atmospheric Studies, Payload Development, Orbit Controls, recovery technology etc.</html>");
        EXPERIMENTALSAT.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1140, 480));

        jPanel3.add(EXPERIMENTALSAT, "card4");

        STUDENTSAT.setkEndColor(new java.awt.Color(255, 255, 255));
        STUDENTSAT.setkStartColor(new java.awt.Color(255, 255, 255));
        STUDENTSAT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel39.setText("STUDENT SATELLITE");
        STUDENTSAT.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 40));

        STUDENTTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "LAUNCH DATE", "LAUNCH MASS", "LAUNCHER ID", "ORBIT TYPE", "APPLICATION", "REMARK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        STUDENTTABLE.setGridColor(new java.awt.Color(0, 102, 255));
        STUDENTTABLE.setInheritsPopupMenu(true);
        jScrollPane7.setViewportView(STUDENTTABLE);

        STUDENTSAT.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 1140, 180));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        STUDENTSAT.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 710, 1150, 40));

        jLabel20.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel20.setText("<html>ISRO has influenced educational institutions by its activities like making satellites for communication, remote sensing and astronomy. The launch of Chandrayaan-1 increased the interest of universities and institutions towards making experimental student satellites. Capable Universities and institution can venture into space technology on-orbit with guidance and support from ISRO in following ways.  \n<b><h2 align=\"center\">Development of Payload (by Universities/Institutions)</h2></b>\n Every satellite carries a payload that performs the intended function to achieve the mission goal and the main bus that supports the payload function. The Development of payloads may comprise of detectors, electronics and associated algorithms, which can be an experimental piggy back payload on the ISRO’s on-going (Small or operational) satellite projects.   Design and development of detectors, payload electronics, and associated algorithm  / experiments that enhance the application of space services to mankind is a continuing R&D  activity in several educational institutions all over the world. Educational institutions can propose the payloads developed by them to be flown on ISRO’s small satellites.   Under this option, payload only is developed by the Universities or Institutions and launched with ISROs satellite missions which has other ISRO’s payloads. Data Handing and data transmission is done by ISRO as the part of satellite bus.  After launch ISRO will acquire payload data and disseminate it to Universities/ institutions further processing and analysis.  \n<b><h2 align=\"center\"> Satellite Design & Fabrication by Universities/Institutions</h2></b>\n Under this option Universities have to design, fabricate, test the satellite Bus & Payload and deliver the integrated spacecraft for launch. Technical guidance in designing,  fabrication and testing will be provided by ISRO. Some critical materials for the space mission also will be provided by ISRO.   The designs and test results will be reviewed by ISRO team.   Under this option more than one University/Institution may participate. One among them will be the focal point for the ISRO. After launch, the collected data will be archived and disseminated by university/Institution(s).</html>");
        STUDENTSAT.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1140, 490));

        jPanel3.add(STUDENTSAT, "card4");

        LAUNCHERTABLE.setkEndColor(new java.awt.Color(255, 255, 255));
        LAUNCHERTABLE.setkStartColor(new java.awt.Color(255, 255, 255));
        LAUNCHERTABLE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel42.setText("TYPES OF LAUNCHERS");
        LAUNCHERTABLE.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 40));

        LAUTABLE.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LAUTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DATE", "WEIGHT", "HEIGHT", "LIFT OFF MASS", "LAUNCHER TYPE", "ORBIT TYPE", "REMARK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LAUTABLE.setGridColor(new java.awt.Color(51, 51, 51));
        LAUTABLE.setOpaque(false);
        jScrollPane9.setViewportView(LAUTABLE);

        LAUNCHERTABLE.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1140, 660));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        LAUNCHERTABLE.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 710, 1150, 40));

        jPanel3.add(LAUNCHERTABLE, "card4");

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 1140, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
       new AdminLogin().setVisible(true);
    }//GEN-LAST:event_kButton3ActionPerformed

    private void mouceClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouceClicked
        // TODO add your handling code here:
        if (evt.getSource()==HOMEPAGE){
            HOME.setVisible(true);
            SPACECRAFTS.setVisible(false);
            SMALLSAT.setVisible(false);
            COMMUNICATIONSAT.setVisible(false);
            EARTHSAT.setVisible(false);
            NAVIGATIONSAT.setVisible(false);
            SCIENTIFICSAT.setVisible(false);
            EXPERIMENTALSAT.setVisible(false);
            STUDENTSAT.setVisible(false);
            LAUNCHERTABLE.setVisible(false);
        }
         if (evt.getSource()==SPACE){
            HOME.setVisible(false);
            SPACECRAFTS.setVisible(true);
            SMALLSAT.setVisible(false);
            COMMUNICATIONSAT.setVisible(false);
            EARTHSAT.setVisible(false);
            NAVIGATIONSAT.setVisible(false);
            SCIENTIFICSAT.setVisible(false);
            EXPERIMENTALSAT.setVisible(false);
            STUDENTSAT.setVisible(false);
            LAUNCHERTABLE.setVisible(false);
        }
           if (evt.getSource()==SMALL){
            HOME.setVisible(false);
            SPACECRAFTS.setVisible(false);
            SMALLSAT.setVisible(true);
            ShowSmall();
            COMMUNICATIONSAT.setVisible(false);
            EARTHSAT.setVisible(false);
            NAVIGATIONSAT.setVisible(false);
            SCIENTIFICSAT.setVisible(false);
            EXPERIMENTALSAT.setVisible(false);
            STUDENTSAT.setVisible(false);
            LAUNCHERTABLE.setVisible(false);
        }
            if (evt.getSource()==COMMUNICATION){
            HOME.setVisible(false);
            SPACECRAFTS.setVisible(false);
            SMALLSAT.setVisible(false);
            COMMUNICATIONSAT.setVisible(true);
            ShowCommunication();
            EARTHSAT.setVisible(false);
            NAVIGATIONSAT.setVisible(false);
            SCIENTIFICSAT.setVisible(false);
            EXPERIMENTALSAT.setVisible(false);
            STUDENTSAT.setVisible(false);
            LAUNCHERTABLE.setVisible(false);
        }
             if (evt.getSource()==EARTH){
            HOME.setVisible(false);
            SPACECRAFTS.setVisible(false);
            SMALLSAT.setVisible(false);
            COMMUNICATIONSAT.setVisible(false);
            EARTHSAT.setVisible(true);
            ShowEarth();
            NAVIGATIONSAT.setVisible(false);
            SCIENTIFICSAT.setVisible(false);
            EXPERIMENTALSAT.setVisible(false);
            STUDENTSAT.setVisible(false);
            LAUNCHERTABLE.setVisible(false);
        }
             if (evt.getSource()==NAVIGATION){
            HOME.setVisible(false);
            SPACECRAFTS.setVisible(false);
            SMALLSAT.setVisible(false);
            COMMUNICATIONSAT.setVisible(false);
            EARTHSAT.setVisible(false);
            NAVIGATIONSAT.setVisible(true);
            ShowNavigation();
            SCIENTIFICSAT.setVisible(false);
            EXPERIMENTALSAT.setVisible(false);
            STUDENTSAT.setVisible(false);
            LAUNCHERTABLE.setVisible(false);
        }
             if (evt.getSource()==SCIENTIFIC){
            HOME.setVisible(false);
            SPACECRAFTS.setVisible(false);
            SMALLSAT.setVisible(false);
            COMMUNICATIONSAT.setVisible(false);
            EARTHSAT.setVisible(false);
            NAVIGATIONSAT.setVisible(false);
            SCIENTIFICSAT.setVisible(true);
            ShowScientific();
            EXPERIMENTALSAT.setVisible(false);
            STUDENTSAT.setVisible(false);
            LAUNCHERTABLE.setVisible(false);
        }
             if (evt.getSource()==EXPERIMENTAL){
            HOME.setVisible(false);
            SPACECRAFTS.setVisible(false);
            SMALLSAT.setVisible(false);
            COMMUNICATIONSAT.setVisible(false);
            EARTHSAT.setVisible(false);
            NAVIGATIONSAT.setVisible(false);
            SCIENTIFICSAT.setVisible(false);
            EXPERIMENTALSAT.setVisible(true);
            ShowExperimental();
            STUDENTSAT.setVisible(false);
            LAUNCHERTABLE.setVisible(false);
             }
            if (evt.getSource()==STUDENT){
            HOME.setVisible(false);
            SPACECRAFTS.setVisible(false);
            SMALLSAT.setVisible(false);
            COMMUNICATIONSAT.setVisible(false);
            EARTHSAT.setVisible(false);
            NAVIGATIONSAT.setVisible(false);
            SCIENTIFICSAT.setVisible(false);
            EXPERIMENTALSAT.setVisible(false);
            STUDENTSAT.setVisible(true);
            ShowStudent();
            LAUNCHERTABLE.setVisible(false);
             }
            if (evt.getSource()==LAUNCHER){
            HOME.setVisible(false);
            SPACECRAFTS.setVisible(false);
            SMALLSAT.setVisible(false);
            COMMUNICATIONSAT.setVisible(false);
            EARTHSAT.setVisible(false);
            NAVIGATIONSAT.setVisible(false);
            SCIENTIFICSAT.setVisible(false);
            EXPERIMENTALSAT.setVisible(false);
            STUDENTSAT.setVisible(false);
            LAUNCHERTABLE.setVisible(true);
            ShowLauncher();
             }
         
    }//GEN-LAST:event_mouceClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel COMMUNICATION;
    private keeptoo.KGradientPanel COMMUNICATIONSAT;
    private javax.swing.JTable COMMUNICATIONTABLE;
    private javax.swing.JLabel EARTH;
    private keeptoo.KGradientPanel EARTHSAT;
    private javax.swing.JTable EARTHTABLE;
    private javax.swing.JLabel EXPERIMENTAL;
    private keeptoo.KGradientPanel EXPERIMENTALSAT;
    private javax.swing.JTable EXPERIMENTALTABLE;
    private keeptoo.KGradientPanel HOME;
    private javax.swing.JLabel HOMEPAGE;
    private javax.swing.JLabel LAUNCHER;
    private keeptoo.KGradientPanel LAUNCHERTABLE;
    private javax.swing.JTable LAUTABLE;
    private javax.swing.JLabel NAVIGATION;
    private keeptoo.KGradientPanel NAVIGATIONSAT;
    private javax.swing.JTable NAVIGATIONTABLE;
    private javax.swing.JLabel SCIENTIFIC;
    private keeptoo.KGradientPanel SCIENTIFICSAT;
    private javax.swing.JTable SCIENTIFICTABLE;
    private javax.swing.JLabel SMALL;
    private keeptoo.KGradientPanel SMALLSAT;
    private javax.swing.JTable SMALLTABLE;
    private javax.swing.JLabel SPACE;
    private keeptoo.KGradientPanel SPACECRAFTS;
    private javax.swing.JLabel STUDENT;
    private keeptoo.KGradientPanel STUDENTSAT;
    private javax.swing.JTable STUDENTTABLE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton3;
    // End of variables declaration//GEN-END:variables
}
