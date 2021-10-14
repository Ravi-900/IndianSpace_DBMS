/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isdbms;
//CALL `shwousers`();
import java.awt.Color;
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
public class Admin extends javax.swing.JFrame {
    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        ShowEmployee();
        ShowLauncher();
        ShowSatellite();
        ShowExpenses();
    }
    
    //CREATING CONNECTION FUNCTION
    static Connection con() {
		try {
			String driver="com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/isdbms";
			Class.forName(driver);
			return DriverManager.getConnection(url,"root","");
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, "CONNECTION ERROR !!!!!!!!!!");
		}
		return null;
	}
    
    
    //CREATING FUNCTION FOR DISPLAYING STORED EMPLOYEE DATA FROM DATABASE INTO EMPTABLE
    public void ShowEmployee() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "SELECT * FROM `addemployee` ";
            PreparedStatement pst=con.prepareStatement(sql);
   
         ResultSet rs=pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)EMPTABLE.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getString("Id"),rs.getString("Name"),rs.getString("Email"),rs.getString("Address"),rs.getString("Mobile"),rs.getString("Department"),rs.getString("DOJ"),rs.getString("Salary")};
                tm.addRow(o);
            }
            con.close();
            
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
    //CREATING FUNCTION FOR DISPLAYING STORED LAUNCHER DATA FROM DATABASE INTO LAUTABLE
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
    
    
    //CREATING FUNCTION FOR DISPLAYING STORED SATELLITE DATA FROM DATABASE INTO SATTABLE
    public void ShowSatellite() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "SELECT `Id`, `Name`, `LaunchMass`, `MissionLife`, `LauncherId`, `LauchDate`, `OrbitType`, `Application`, `Remark` FROM `addsatellite`";
            PreparedStatement pst=con.prepareStatement(sql);
   
         ResultSet rs=pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)SATTABLE.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getString("Id"),rs.getString("Name"),rs.getString("LaunchMass"),rs.getString("MissionLife"),rs.getString("LauncherId"),rs.getString("LauchDate"),rs.getString("OrbitType"),rs.getString("Application"),rs.getString("Remark")};
                tm.addRow(o);
            }
            con.close();
            
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
    //CREATING FUNCTION FOR DISPLAYING STORED EXPENSES DATA FROM DATABASE INTO EXPTABLE
    public void ShowExpenses() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "SELECT * FROM `addexpenses`";
            PreparedStatement pst=con.prepareStatement(sql);
   
         ResultSet rs=pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)EXPTABLE.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getString("SatelliteId"),rs.getString("LauncherID"),rs.getString("MaterialCost"),rs.getString("BuildingCost"),rs.getString("transportationCost"),rs.getString("LaunchingCost"),rs.getString("DamageRepairCost"),rs.getString("TotalCost")};
                tm.addRow(o);
            }
            con.close();
            
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }    
    
    
     public void Showusers() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "CALL `shwousers`();";
            PreparedStatement pst=con.prepareStatement(sql);
   
         ResultSet rs=pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)USERTABLE.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getString("FullName"),rs.getString("Gender"),rs.getString("E-Mail"),rs.getString("Number"),rs.getString("Address"),rs.getString("UserID"),rs.getString("Password")};
                tm.addRow(o);
            }
            con.close();
            
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }    
    
     
          public void ShowSalarylogs() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "SELECT `LogID`, `EmployeeID`, `Old Salary`, `New Salary`, `Action`, `Date` FROM `salarylog`";
            PreparedStatement pst=con.prepareStatement(sql);
   
         ResultSet rs=pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)LOGTABLE.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getString("LogID"),rs.getString("EmployeeID"),rs.getString("Old Salary"),rs.getString("New Salary"),rs.getString("Action"),rs.getString("Date")};
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
        LAU = new keeptoo.KButton();
        EMP = new keeptoo.KButton();
        SAT = new keeptoo.KButton();
        EXP = new keeptoo.KButton();
        USER = new keeptoo.KButton();
        TRIGGER = new keeptoo.KButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        kButton2 = new keeptoo.KButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        Panel_Center = new javax.swing.JPanel();
        AddEmployee = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        emp2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emp3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        emp4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emp5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        emp6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        emp7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        emp8 = new javax.swing.JTextField();
        ClearEmp = new keeptoo.KButton();
        SubmitEMP = new keeptoo.KButton();
        emp1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        SearchEmployee = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SearchEMP = new keeptoo.KButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EMPTABLE = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        DeleteEMP = new keeptoo.KButton();
        UpdateEMP = new keeptoo.KButton();
        AddLauncher = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        LAU2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        LAU3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        LAU4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        LAU5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        LAU6 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        LAU7 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        LAU8 = new javax.swing.JTextField();
        ClearLAU = new keeptoo.KButton();
        SubmitLAU = new keeptoo.KButton();
        LAU1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        SearchLauncher = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        SearchLAU = new keeptoo.KButton();
        jLabel23 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        DeletLAU = new keeptoo.KButton();
        UpdateLAU = new keeptoo.KButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        LAUTABLE = new javax.swing.JTable();
        AddSatellite = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        SAT2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        SAT3 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        SAT4 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        SAT5 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        SAT6 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        SAT7 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        SAT9 = new javax.swing.JTextField();
        ClearSAT = new keeptoo.KButton();
        SubmitSAT = new keeptoo.KButton();
        SAT1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        SAT8 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        SearchSAT = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        SearchLAU1 = new keeptoo.KButton();
        jLabel34 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        DeletSAT = new keeptoo.KButton();
        UpdateSAT = new keeptoo.KButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        SATTABLE = new javax.swing.JTable();
        AddExpenses = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        EXP2 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        EXP3 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        EXP4 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        EXP5 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        EXP6 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        TOTALCOST = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        ClearEXP = new keeptoo.KButton();
        SubmitEXP = new keeptoo.KButton();
        EXP1 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        EXP7 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        SearchEXP = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        SearchEXPENSES = new keeptoo.KButton();
        jLabel46 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        DeleteEXP = new keeptoo.KButton();
        UpdateEXP = new keeptoo.KButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        EXPTABLE = new javax.swing.JTable();
        SHOWUSER = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        USERTABLE = new javax.swing.JTable();
        SALARYLOG = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        LOGTABLE = new javax.swing.JTable();
        jLabel51 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(240, 100, 1420, 787));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Admin.this.mouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LAU.setText("Add Launcher");
        LAU.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LAU.setkBorderRadius(0);
        LAU.setkFillButton(false);
        LAU.setkHoverEndColor(new java.awt.Color(255, 255, 0));
        LAU.setkHoverForeGround(new java.awt.Color(255, 102, 0));
        LAU.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        LAU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Admin.this.mouseClicked(evt);
            }
        });
        jPanel1.add(LAU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 280, 50));

        EMP.setText("Add Employee");
        EMP.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        EMP.setkBorderRadius(0);
        EMP.setkFillButton(false);
        EMP.setkHoverEndColor(new java.awt.Color(255, 255, 0));
        EMP.setkHoverForeGround(new java.awt.Color(255, 102, 0));
        EMP.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        EMP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Admin.this.mouseClicked(evt);
            }
        });
        jPanel1.add(EMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 280, 50));

        SAT.setText("Add Satellite");
        SAT.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SAT.setkBorderRadius(0);
        SAT.setkFillButton(false);
        SAT.setkHoverEndColor(new java.awt.Color(255, 255, 0));
        SAT.setkHoverForeGround(new java.awt.Color(255, 102, 0));
        SAT.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        SAT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Admin.this.mouseClicked(evt);
            }
        });
        jPanel1.add(SAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 280, 50));

        EXP.setText("Add Expenses");
        EXP.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        EXP.setkBorderRadius(0);
        EXP.setkFillButton(false);
        EXP.setkHoverEndColor(new java.awt.Color(255, 255, 0));
        EXP.setkHoverForeGround(new java.awt.Color(255, 102, 0));
        EXP.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        EXP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Admin.this.mouseClicked(evt);
            }
        });
        EXP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXPActionPerformed(evt);
            }
        });
        jPanel1.add(EXP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 280, 50));

        USER.setText("Show Users");
        USER.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        USER.setkBorderRadius(0);
        USER.setkFillButton(false);
        USER.setkHoverEndColor(new java.awt.Color(255, 255, 0));
        USER.setkHoverForeGround(new java.awt.Color(255, 102, 0));
        USER.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        USER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Admin.this.mouseClicked(evt);
            }
        });
        jPanel1.add(USER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 280, 50));

        TRIGGER.setText("Employee Salary Log");
        TRIGGER.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TRIGGER.setkBorderRadius(0);
        TRIGGER.setkFillButton(false);
        TRIGGER.setkHoverEndColor(new java.awt.Color(255, 255, 0));
        TRIGGER.setkHoverForeGround(new java.awt.Color(255, 102, 0));
        TRIGGER.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        TRIGGER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Admin.this.mouseClicked(evt);
            }
        });
        TRIGGER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRIGGERActionPerformed(evt);
            }
        });
        jPanel1.add(TRIGGER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 280, 50));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("ADMIN");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 40));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("ACTIONS");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 40));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("PERFORMED BY");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 280, 40));

        kButton2.setText("LOG OUT");
        kButton2.setkBorderRadius(40);
        kButton2.setkEndColor(new java.awt.Color(51, 51, 255));
        kButton2.setkFillButton(false);
        kButton2.setkStartColor(new java.awt.Color(204, 0, 0));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 720, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 780));

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.setForeground(new java.awt.Color(51, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("INDIAN SPACE DATABASE MANAGEMENT SYSTEM");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 4, 600, 30));

        kButton1.setText("EXIT");
        kButton1.setkBorderRadius(100);
        kButton1.setkFillButton(false);
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 60, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1140, 40));

        Panel_Center.setMinimumSize(new java.awt.Dimension(1140, 740));
        Panel_Center.setPreferredSize(new java.awt.Dimension(1140, 740));
        Panel_Center.setLayout(new java.awt.CardLayout());

        AddEmployee.setBackground(new java.awt.Color(51, 51, 51));
        AddEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD NEW EMPLOYEE :-");
        AddEmployee.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 290, 50));

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 51), 2, true));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emp2.setBackground(new Color(0,0,0,0));
        emp2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        emp2.setForeground(new java.awt.Color(255, 255, 255));
        emp2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emp2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        emp2.setOpaque(false);
        jPanel4.add(emp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 380, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Full Name :-");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, 30));

        emp3.setBackground(new Color(0,0,0,0));
        emp3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        emp3.setForeground(new java.awt.Color(255, 255, 255));
        emp3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emp3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        emp3.setOpaque(false);
        jPanel4.add(emp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 380, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email-Id :-");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 90, 30));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address :-");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 100, 30));

        emp4.setBackground(new Color(0,0,0,0));
        emp4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        emp4.setForeground(new java.awt.Color(255, 255, 255));
        emp4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emp4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        emp4.setOpaque(false);
        jPanel4.add(emp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 380, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mobile Number :- ");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 150, 30));

        emp5.setBackground(new Color(0,0,0,0));
        emp5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        emp5.setForeground(new java.awt.Color(255, 255, 255));
        emp5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emp5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        emp5.setOpaque(false);
        jPanel4.add(emp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 380, 30));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Department :-");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 120, 30));

        emp6.setBackground(new Color(0,0,0,0));
        emp6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        emp6.setForeground(new java.awt.Color(255, 255, 255));
        emp6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emp6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        emp6.setOpaque(false);
        jPanel4.add(emp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 380, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date Of Joining :-");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 150, 30));

        emp7.setBackground(new Color(0,0,0,0));
        emp7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        emp7.setForeground(new java.awt.Color(255, 255, 255));
        emp7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emp7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        emp7.setOpaque(false);
        jPanel4.add(emp7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 380, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Salary :-");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 90, 30));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Employee ID :-");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 30));

        emp8.setBackground(new Color(0,0,0,0));
        emp8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        emp8.setForeground(new java.awt.Color(255, 255, 255));
        emp8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emp8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        emp8.setOpaque(false);
        jPanel4.add(emp8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 380, 30));

        ClearEmp.setText("CLEAR");
        ClearEmp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ClearEmp.setkBorderRadius(40);
        ClearEmp.setkFillButton(false);
        ClearEmp.setkStartColor(new java.awt.Color(204, 0, 51));
        ClearEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearEmpActionPerformed(evt);
            }
        });
        jPanel4.add(ClearEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 130, -1));

        SubmitEMP.setText("SUBMIT");
        SubmitEMP.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SubmitEMP.setkBorderRadius(40);
        SubmitEMP.setkFillButton(false);
        SubmitEMP.setkStartColor(new java.awt.Color(204, 0, 51));
        SubmitEMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitEMPActionPerformed(evt);
            }
        });
        jPanel4.add(SubmitEMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 130, -1));

        emp1.setBackground(new Color(0,0,0,0));
        emp1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        emp1.setForeground(new java.awt.Color(255, 255, 255));
        emp1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emp1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        emp1.setOpaque(false);
        jPanel4.add(emp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 380, 30));

        AddEmployee.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 600, 480));

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SearchEmployee.setBackground(new Color(0,0,0,0));
        SearchEmployee.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        SearchEmployee.setForeground(new java.awt.Color(255, 255, 255));
        SearchEmployee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SearchEmployee.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        SearchEmployee.setOpaque(false);
        jPanel5.add(SearchEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 380, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SEARCH EMPLOYEE DATA HERE :-");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 410, 30));

        SearchEMP.setText("SEARCH");
        SearchEMP.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SearchEMP.setkBorderRadius(40);
        SearchEMP.setkFillButton(false);
        SearchEMP.setkStartColor(new java.awt.Color(153, 0, 0));
        SearchEMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEMPActionPerformed(evt);
            }
        });
        jPanel5.add(SearchEMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 130, -1));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Enter Employee Id :-");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 170, 30));

        AddEmployee.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 500, 250));

        EMPTABLE.setBackground(new java.awt.Color(51, 51, 51));
        EMPTABLE.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        EMPTABLE.setForeground(new java.awt.Color(255, 255, 255));
        EMPTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "EMAIL", "ADDRESS", "MOBILE NO", "DEPARTMENT", "DOJ", "SALARY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EMPTABLE.setOpaque(false);
        EMPTABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EMPTABLEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EMPTABLE);

        AddEmployee.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1140, 170));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true), "OPERATIONS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteEMP.setText("DELETE");
        DeleteEMP.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DeleteEMP.setkBorderRadius(40);
        DeleteEMP.setkFillButton(false);
        DeleteEMP.setkStartColor(new java.awt.Color(153, 0, 0));
        DeleteEMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEMPActionPerformed(evt);
            }
        });
        jPanel6.add(DeleteEMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 130, -1));

        UpdateEMP.setText("UPDATE");
        UpdateEMP.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        UpdateEMP.setkBorderRadius(40);
        UpdateEMP.setkFillButton(false);
        UpdateEMP.setkStartColor(new java.awt.Color(153, 0, 0));
        UpdateEMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateEMPActionPerformed(evt);
            }
        });
        jPanel6.add(UpdateEMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 130, -1));

        AddEmployee.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 500, 180));

        Panel_Center.add(AddEmployee, "card2");

        AddLauncher.setBackground(new java.awt.Color(51, 51, 51));
        AddLauncher.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ADD NEW LAUNCHER :-");
        AddLauncher.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 290, 50));

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 51), 2, true));
        jPanel7.setOpaque(false);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LAU2.setBackground(new Color(0,0,0,0));
        LAU2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        LAU2.setForeground(new java.awt.Color(255, 255, 255));
        LAU2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LAU2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        LAU2.setOpaque(false);
        jPanel7.add(LAU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 380, 30));

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Lauch Date :-");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 30));

        LAU3.setBackground(new Color(0,0,0,0));
        LAU3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        LAU3.setForeground(new java.awt.Color(255, 255, 255));
        LAU3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LAU3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        LAU3.setOpaque(false);
        LAU3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LAU3ActionPerformed(evt);
            }
        });
        jPanel7.add(LAU3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 380, 30));

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Weight :-");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 90, 30));

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Height :-");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 100, 30));

        LAU4.setBackground(new Color(0,0,0,0));
        LAU4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        LAU4.setForeground(new java.awt.Color(255, 255, 255));
        LAU4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LAU4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        LAU4.setOpaque(false);
        jPanel7.add(LAU4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 380, 30));

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Lift Off Mass :-");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 150, 30));

        LAU5.setBackground(new Color(0,0,0,0));
        LAU5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        LAU5.setForeground(new java.awt.Color(255, 255, 255));
        LAU5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LAU5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        LAU5.setOpaque(false);
        jPanel7.add(LAU5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 380, 30));

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Launcher Type :-");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 150, 30));

        LAU6.setBackground(new Color(0,0,0,0));
        LAU6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        LAU6.setForeground(new java.awt.Color(255, 255, 255));
        LAU6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LAU6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        LAU6.setOpaque(false);
        jPanel7.add(LAU6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 380, 30));

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Orbit Type :-");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 150, 30));

        LAU7.setBackground(new Color(0,0,0,0));
        LAU7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        LAU7.setForeground(new java.awt.Color(255, 255, 255));
        LAU7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LAU7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        LAU7.setOpaque(false);
        jPanel7.add(LAU7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 380, 30));

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Remark :-");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 90, 30));

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Launcher Id :-");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 30));

        LAU8.setBackground(new Color(0,0,0,0));
        LAU8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        LAU8.setForeground(new java.awt.Color(255, 255, 255));
        LAU8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LAU8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        LAU8.setOpaque(false);
        jPanel7.add(LAU8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 380, 30));

        ClearLAU.setText("CLEAR");
        ClearLAU.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ClearLAU.setkBorderRadius(40);
        ClearLAU.setkFillButton(false);
        ClearLAU.setkStartColor(new java.awt.Color(204, 0, 51));
        ClearLAU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearLAUActionPerformed(evt);
            }
        });
        jPanel7.add(ClearLAU, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 130, -1));

        SubmitLAU.setText("SUBMIT");
        SubmitLAU.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SubmitLAU.setkBorderRadius(40);
        SubmitLAU.setkFillButton(false);
        SubmitLAU.setkStartColor(new java.awt.Color(204, 0, 51));
        SubmitLAU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitLAUActionPerformed(evt);
            }
        });
        jPanel7.add(SubmitLAU, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 130, -1));

        LAU1.setBackground(new Color(0,0,0,0));
        LAU1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        LAU1.setForeground(new java.awt.Color(255, 255, 255));
        LAU1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LAU1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        LAU1.setOpaque(false);
        jPanel7.add(LAU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 380, 30));

        AddLauncher.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 600, 480));

        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true));
        jPanel8.setOpaque(false);
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SearchLauncher.setBackground(new Color(0,0,0,0));
        SearchLauncher.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        SearchLauncher.setForeground(new java.awt.Color(255, 255, 255));
        SearchLauncher.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SearchLauncher.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        SearchLauncher.setOpaque(false);
        jPanel8.add(SearchLauncher, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 380, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("SEARCH LAUNCHER DATA HERE :-");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 410, 30));

        SearchLAU.setText("SEARCH");
        SearchLAU.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SearchLAU.setkBorderRadius(40);
        SearchLAU.setkFillButton(false);
        SearchLAU.setkStartColor(new java.awt.Color(153, 0, 0));
        SearchLAU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchLAUActionPerformed(evt);
            }
        });
        jPanel8.add(SearchLAU, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 130, -1));

        jLabel23.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Enter Launcher Id :-");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 170, 30));

        AddLauncher.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 500, 250));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true), "OPERATIONS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel9.setOpaque(false);
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeletLAU.setText("DELETE");
        DeletLAU.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DeletLAU.setkBorderRadius(40);
        DeletLAU.setkFillButton(false);
        DeletLAU.setkStartColor(new java.awt.Color(153, 0, 0));
        DeletLAU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletLAUActionPerformed(evt);
            }
        });
        jPanel9.add(DeletLAU, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 130, -1));

        UpdateLAU.setText("UPDATE");
        UpdateLAU.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        UpdateLAU.setkBorderRadius(40);
        UpdateLAU.setkFillButton(false);
        UpdateLAU.setkStartColor(new java.awt.Color(153, 0, 0));
        UpdateLAU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateLAUActionPerformed(evt);
            }
        });
        jPanel9.add(UpdateLAU, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 130, -1));

        AddLauncher.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 500, 180));

        LAUTABLE.setBackground(new java.awt.Color(51, 51, 51));
        LAUTABLE.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LAUTABLE.setForeground(new java.awt.Color(255, 255, 255));
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
        LAUTABLE.setOpaque(false);
        LAUTABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LAUTABLEMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(LAUTABLE);

        AddLauncher.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1140, 170));

        Panel_Center.add(AddLauncher, "card3");

        AddSatellite.setBackground(new java.awt.Color(51, 51, 51));
        AddSatellite.setMinimumSize(new java.awt.Dimension(1140, 740));
        AddSatellite.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("ADD NEW SATELLITE :-");
        AddSatellite.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 290, 50));

        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 51), 2, true));
        jPanel10.setOpaque(false);
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SAT2.setBackground(new Color(0,0,0,0));
        SAT2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        SAT2.setForeground(new java.awt.Color(255, 255, 255));
        SAT2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SAT2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        SAT2.setOpaque(false);
        jPanel10.add(SAT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 380, 30));

        jLabel25.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Name :-");
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 120, 30));

        SAT3.setBackground(new Color(0,0,0,0));
        SAT3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        SAT3.setForeground(new java.awt.Color(255, 255, 255));
        SAT3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SAT3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        SAT3.setOpaque(false);
        SAT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAT3ActionPerformed(evt);
            }
        });
        jPanel10.add(SAT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 380, 30));

        jLabel26.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Launch Mass :-");
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 140, 30));

        jLabel27.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Mission Life :-");
        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 30));

        SAT4.setBackground(new Color(0,0,0,0));
        SAT4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        SAT4.setForeground(new java.awt.Color(255, 255, 255));
        SAT4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SAT4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        SAT4.setOpaque(false);
        jPanel10.add(SAT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 380, 30));

        jLabel28.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Launcher Id :-");
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 150, 30));

        SAT5.setBackground(new Color(0,0,0,0));
        SAT5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        SAT5.setForeground(new java.awt.Color(255, 255, 255));
        SAT5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SAT5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        SAT5.setOpaque(false);
        jPanel10.add(SAT5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 380, 30));

        jLabel29.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Launch Date :-");
        jPanel10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 150, 30));

        SAT6.setBackground(new Color(0,0,0,0));
        SAT6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        SAT6.setForeground(new java.awt.Color(255, 255, 255));
        SAT6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SAT6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        SAT6.setOpaque(false);
        jPanel10.add(SAT6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 380, 30));

        jLabel30.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Orbit Type :-");
        jPanel10.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 150, 30));

        SAT7.setBackground(new Color(0,0,0,0));
        SAT7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        SAT7.setForeground(new java.awt.Color(255, 255, 255));
        SAT7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SAT7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        SAT7.setOpaque(false);
        jPanel10.add(SAT7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 380, 30));

        jLabel31.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Remark :-");
        jPanel10.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 90, 30));

        jLabel32.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Satellite Id :-");
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 30));

        SAT9.setBackground(new Color(0,0,0,0));
        SAT9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        SAT9.setForeground(new java.awt.Color(255, 255, 255));
        SAT9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SAT9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        SAT9.setOpaque(false);
        jPanel10.add(SAT9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 380, 30));

        ClearSAT.setText("CLEAR");
        ClearSAT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ClearSAT.setkBorderRadius(40);
        ClearSAT.setkFillButton(false);
        ClearSAT.setkStartColor(new java.awt.Color(204, 0, 51));
        ClearSAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearSATActionPerformed(evt);
            }
        });
        jPanel10.add(ClearSAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 120, 50));

        SubmitSAT.setText("SUBMIT");
        SubmitSAT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SubmitSAT.setkBorderRadius(40);
        SubmitSAT.setkFillButton(false);
        SubmitSAT.setkStartColor(new java.awt.Color(204, 0, 51));
        SubmitSAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitSATActionPerformed(evt);
            }
        });
        jPanel10.add(SubmitSAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 110, 50));

        SAT1.setBackground(new Color(0,0,0,0));
        SAT1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        SAT1.setForeground(new java.awt.Color(255, 255, 255));
        SAT1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SAT1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        SAT1.setOpaque(false);
        jPanel10.add(SAT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 380, 30));

        jLabel35.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Application :-");
        jPanel10.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 140, 30));

        SAT8.setBackground(new Color(0,0,0,0));
        SAT8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        SAT8.setForeground(new java.awt.Color(255, 255, 255));
        SAT8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SAT8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        SAT8.setOpaque(false);
        jPanel10.add(SAT8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 380, 30));

        AddSatellite.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 600, 480));

        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true));
        jPanel11.setOpaque(false);
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SearchSAT.setBackground(new Color(0,0,0,0));
        SearchSAT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        SearchSAT.setForeground(new java.awt.Color(255, 255, 255));
        SearchSAT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SearchSAT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        SearchSAT.setOpaque(false);
        jPanel11.add(SearchSAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 380, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("SEARCH SATELLITE DATA HERE :-");
        jPanel11.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 410, 30));

        SearchLAU1.setText("SEARCH");
        SearchLAU1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SearchLAU1.setkBorderRadius(40);
        SearchLAU1.setkFillButton(false);
        SearchLAU1.setkStartColor(new java.awt.Color(153, 0, 0));
        SearchLAU1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchLAU1ActionPerformed(evt);
            }
        });
        jPanel11.add(SearchLAU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 130, -1));

        jLabel34.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Enter Satellite Id :-");
        jPanel11.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 170, 30));

        AddSatellite.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 500, 250));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true), "OPERATIONS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel12.setOpaque(false);
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeletSAT.setText("DELETE");
        DeletSAT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DeletSAT.setkBorderRadius(40);
        DeletSAT.setkFillButton(false);
        DeletSAT.setkStartColor(new java.awt.Color(153, 0, 0));
        DeletSAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletSATActionPerformed(evt);
            }
        });
        jPanel12.add(DeletSAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 130, -1));

        UpdateSAT.setText("UPDATE");
        UpdateSAT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        UpdateSAT.setkBorderRadius(40);
        UpdateSAT.setkFillButton(false);
        UpdateSAT.setkStartColor(new java.awt.Color(153, 0, 0));
        UpdateSAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateSATActionPerformed(evt);
            }
        });
        jPanel12.add(UpdateSAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 130, -1));

        AddSatellite.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 500, 180));

        SATTABLE.setBackground(new java.awt.Color(51, 51, 51));
        SATTABLE.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SATTABLE.setForeground(new java.awt.Color(255, 255, 255));
        SATTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SATELLITE ID", "NAME", "LAUNCH MASS", "MISSION LIFE", "LAUNCHER ID", "LAUNCH DATE", "ORBIT TYPE", "APPLICATION", "REMARK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SATTABLE.setOpaque(false);
        SATTABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SATTABLEMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(SATTABLE);

        AddSatellite.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1140, 170));

        Panel_Center.add(AddSatellite, "card4");

        AddExpenses.setBackground(new java.awt.Color(51, 51, 51));
        AddExpenses.setMinimumSize(new java.awt.Dimension(1140, 740));
        AddExpenses.setPreferredSize(new java.awt.Dimension(1140, 740));
        AddExpenses.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("ADD EXPENSES DETAILS OF SATELLITE TO LAUNCH :-");
        AddExpenses.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 640, 50));

        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 51), 2, true));
        jPanel13.setOpaque(false);
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EXP2.setBackground(new Color(0,0,0,0));
        EXP2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        EXP2.setForeground(new java.awt.Color(255, 255, 255));
        EXP2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EXP2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        EXP2.setOpaque(false);
        jPanel13.add(EXP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 380, 30));

        jLabel37.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Launcher ID :-");
        jPanel13.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 130, 30));

        EXP3.setBackground(new Color(0,0,0,0));
        EXP3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        EXP3.setForeground(new java.awt.Color(255, 255, 255));
        EXP3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EXP3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        EXP3.setOpaque(false);
        jPanel13.add(EXP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 380, 30));

        jLabel38.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Material Cost :-");
        jPanel13.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 140, 30));

        jLabel39.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Building Cost :-");
        jPanel13.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, 30));

        EXP4.setBackground(new Color(0,0,0,0));
        EXP4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        EXP4.setForeground(new java.awt.Color(255, 255, 255));
        EXP4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EXP4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        EXP4.setOpaque(false);
        jPanel13.add(EXP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 380, 30));

        jLabel40.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Transportation Cost :-");
        jPanel13.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 200, 30));

        EXP5.setBackground(new Color(0,0,0,0));
        EXP5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        EXP5.setForeground(new java.awt.Color(255, 255, 255));
        EXP5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EXP5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        EXP5.setOpaque(false);
        jPanel13.add(EXP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 350, 30));

        jLabel41.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Launching Cost :-");
        jPanel13.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 150, 30));

        EXP6.setBackground(new Color(0,0,0,0));
        EXP6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        EXP6.setForeground(new java.awt.Color(255, 255, 255));
        EXP6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EXP6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        EXP6.setOpaque(false);
        jPanel13.add(EXP6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 380, 30));

        jLabel42.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Total Cost :- ");
        jPanel13.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 110, 30));

        TOTALCOST.setEditable(false);
        TOTALCOST.setBackground(new Color(0,0,0,0));
        TOTALCOST.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TOTALCOST.setForeground(new java.awt.Color(255, 255, 255));
        TOTALCOST.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TOTALCOST.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TOTALCOST.setOpaque(false);
        jPanel13.add(TOTALCOST, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 410, 30));

        jLabel44.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Satellite ID :-");
        jPanel13.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 30));

        ClearEXP.setText("CLEAR");
        ClearEXP.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ClearEXP.setkBorderRadius(40);
        ClearEXP.setkFillButton(false);
        ClearEXP.setkStartColor(new java.awt.Color(204, 0, 51));
        ClearEXP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearEXPActionPerformed(evt);
            }
        });
        jPanel13.add(ClearEXP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 130, -1));

        SubmitEXP.setText("SUBMIT");
        SubmitEXP.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SubmitEXP.setkBorderRadius(40);
        SubmitEXP.setkFillButton(false);
        SubmitEXP.setkStartColor(new java.awt.Color(204, 0, 51));
        SubmitEXP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitEXPActionPerformed(evt);
            }
        });
        jPanel13.add(SubmitEXP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 130, -1));

        EXP1.setBackground(new Color(0,0,0,0));
        EXP1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        EXP1.setForeground(new java.awt.Color(255, 255, 255));
        EXP1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EXP1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        EXP1.setOpaque(false);
        jPanel13.add(EXP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 380, 30));

        jLabel43.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Damages Repair Cost :- ");
        jPanel13.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 200, 30));

        EXP7.setBackground(new Color(0,0,0,0));
        EXP7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        EXP7.setForeground(new java.awt.Color(255, 255, 255));
        EXP7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EXP7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        EXP7.setOpaque(false);
        jPanel13.add(EXP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 340, 30));

        AddExpenses.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 600, 480));

        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true));
        jPanel14.setOpaque(false);
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SearchEXP.setBackground(new Color(0,0,0,0));
        SearchEXP.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        SearchEXP.setForeground(new java.awt.Color(255, 255, 255));
        SearchEXP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SearchEXP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        SearchEXP.setOpaque(false);
        jPanel14.add(SearchEXP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 380, 30));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("SEARCH EXPENSES DATA HERE :-");
        jPanel14.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 410, 30));

        SearchEXPENSES.setText("SEARCH");
        SearchEXPENSES.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SearchEXPENSES.setkBorderRadius(40);
        SearchEXPENSES.setkFillButton(false);
        SearchEXPENSES.setkStartColor(new java.awt.Color(153, 0, 0));
        SearchEXPENSES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEXPENSESActionPerformed(evt);
            }
        });
        jPanel14.add(SearchEXPENSES, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 130, -1));

        jLabel46.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Enter Satellite Id :-");
        jPanel14.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 170, 30));

        AddExpenses.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 500, 250));

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true), "OPERATIONS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel15.setOpaque(false);
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteEXP.setText("DELETE");
        DeleteEXP.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DeleteEXP.setkBorderRadius(40);
        DeleteEXP.setkFillButton(false);
        DeleteEXP.setkStartColor(new java.awt.Color(153, 0, 0));
        DeleteEXP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEXPActionPerformed(evt);
            }
        });
        jPanel15.add(DeleteEXP, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 130, -1));

        UpdateEXP.setText("UPDATE");
        UpdateEXP.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        UpdateEXP.setkBorderRadius(40);
        UpdateEXP.setkFillButton(false);
        UpdateEXP.setkStartColor(new java.awt.Color(153, 0, 0));
        UpdateEXP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateEXPActionPerformed(evt);
            }
        });
        jPanel15.add(UpdateEXP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 130, -1));

        AddExpenses.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 500, 180));

        EXPTABLE.setBackground(new java.awt.Color(51, 51, 51));
        EXPTABLE.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        EXPTABLE.setForeground(new java.awt.Color(255, 255, 255));
        EXPTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SARELLITE ID", "LAUNCHER ID", "MATERIAL COST", "BUILDING COST", "TRANSPORTATION COST", "LAUNCHING COST", "DAMAGES REPAIR COST", "TOTAL COST"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EXPTABLE.setOpaque(false);
        EXPTABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXPTABLEMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(EXPTABLE);

        AddExpenses.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1140, 170));

        Panel_Center.add(AddExpenses, "card5");

        SHOWUSER.setBackground(new java.awt.Color(0, 0, 0));
        SHOWUSER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("REGISTERED USERS ARE:-");
        SHOWUSER.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, 50));

        USERTABLE.setBackground(new java.awt.Color(51, 51, 51));
        USERTABLE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        USERTABLE.setForeground(new java.awt.Color(255, 255, 255));
        USERTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FULL NAME", "GENDER", "E-MAIL", "NUMBER", "ADDRESS", "USERID", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(USERTABLE);
        if (USERTABLE.getColumnModel().getColumnCount() > 0) {
            USERTABLE.getColumnModel().getColumn(6).setHeaderValue("PASSWORD");
        }

        SHOWUSER.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1140, 680));

        Panel_Center.add(SHOWUSER, "card6");

        SALARYLOG.setBackground(new java.awt.Color(0, 0, 0));
        SALARYLOG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGTABLE.setBackground(new java.awt.Color(51, 51, 51));
        LOGTABLE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LOGTABLE.setForeground(new java.awt.Color(255, 255, 255));
        LOGTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LOG ID", "EMPLOYEE ID", "OLD SALARY", "NEW SALARY", "ACTION", "DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(LOGTABLE);

        SALARYLOG.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1140, 680));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("SALARY INCREMENTS AND DECREMENTS OF EMPLOYEES");
        SALARYLOG.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 30));

        Panel_Center.add(SALARYLOG, "card7");

        getContentPane().add(Panel_Center, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_kButton1ActionPerformed

    private void UpdateEMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateEMPActionPerformed
        // TODO add your handling code here:
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "UPDATE `addemployee` SET `Name`=?,`Email`=?,`Address`=?,`Mobile`=?,`Department`=?,`DOJ`=?,`Salary`=? WHERE  Id=?";

            PreparedStatement pst=con.prepareStatement(sql); 
            pst.setString(1, emp2.getText());
			pst.setString(2, emp3.getText());
			pst.setString(3, emp4.getText());
			pst.setString(4, emp5.getText());
			pst.setString(5, emp6.getText());
			pst.setString(6, emp7.getText());
			pst.setString(7, emp8.getText());
                        pst.setString(8, emp1.getText());
            if(pst.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Data Updated Successfully!!!");
                ShowEmployee();
                emp1.setText("");
                emp2.setText("");
                emp3.setText("");
                emp4.setText("");
                emp5.setText("");
                emp6.setText("");
                emp7.setText("");
                emp8.setText("");
                
            }
            else{
                    JOptionPane.showMessageDialog(null, "Something Is Wrong!!!");
                    }
            con.close();
            
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_UpdateEMPActionPerformed

    private void SearchEMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchEMPActionPerformed
        // TODO add your handling code here:
        try{
          Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "SELECT * FROM `addemployee` WHERE Id=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, SearchEmployee.getText());
            ResultSet rs=pst.executeQuery();
            DefaultTableModel tr=(DefaultTableModel)EMPTABLE.getModel();
            tr.setRowCount(0);
            
            while(rs.next()){
                 Object o[]={rs.getString("Id"),rs.getString("Name"),rs.getString("Email"),rs.getString("Address"),rs.getString("Mobile"),rs.getString("Department"),rs.getString("DOJ"),rs.getString("Salary")};
                tr.addRow(o);
                SearchEmployee.setText("");
            }
            con.close();
            
       }catch(Exception exp){
           JOptionPane.showMessageDialog(null, exp);
       }
    }//GEN-LAST:event_SearchEMPActionPerformed

    private void DeleteEMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEMPActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "DELETE FROM `addemployee` WHERE Id=?";
            PreparedStatement pst=con.prepareStatement(sql);
            
            pst.setString(1, emp1.getText());
            
            if(pst.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Data deleted from database succeessfully!!!");
                ShowEmployee();
                emp1.setText("");
                emp2.setText("");
                emp3.setText("");
                emp4.setText("");
                emp5.setText("");
                emp6.setText("");
                emp7.setText("");
                emp8.setText("");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Something Is Wrong!!!!!");
            }
            con.close();
        }catch(Exception exp){
            JOptionPane.showMessageDialog(null, exp);
            }
    }//GEN-LAST:event_DeleteEMPActionPerformed

    private void SubmitEMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitEMPActionPerformed
        // TODO add your handling code here:
        Connection con=con();
		try {
			String query="INSERT INTO `addemployee`(`Id`, `Name`, `Email`, `Address`, `Mobile`, `Department`, `DOJ`, `Salary`) VALUES (?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, "EMP"+emp1.getText());
			ps.setString(2, emp2.getText());
			ps.setString(3, emp3.getText());
			ps.setString(4, emp4.getText());
			ps.setString(5, emp5.getText());
			ps.setString(6, emp6.getText());
			ps.setString(7, emp7.getText());
			ps.setString(8, emp8.getText());
			ps.execute();{
                            JOptionPane.showMessageDialog(null, "Registered Successfully...............");
                            ShowEmployee();
                            emp1.setText("");
                            emp2.setText("");
                            emp3.setText("");
                            emp4.setText("");
                            emp5.setText("");
                            emp6.setText("");
                            emp7.setText("");
                            emp8.setText("");
                            
                }
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, ex);
		}
    }//GEN-LAST:event_SubmitEMPActionPerformed

    private void EMPTABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMPTABLEMouseClicked
        // TODO add your handling code here:
         
            int rowIndex=EMPTABLE.getSelectedRow();
            emp1.setText(EMPTABLE.getValueAt(rowIndex, 0).toString());
            emp2.setText(EMPTABLE.getValueAt(rowIndex, 1).toString());
            emp3.setText(EMPTABLE.getValueAt(rowIndex, 2).toString());
            emp4.setText(EMPTABLE.getValueAt(rowIndex, 3).toString());
            emp5.setText(EMPTABLE.getValueAt(rowIndex, 4).toString());
            emp6.setText(EMPTABLE.getValueAt(rowIndex, 5).toString());
            emp7.setText(EMPTABLE.getValueAt(rowIndex, 6).toString());
            emp8.setText(EMPTABLE.getValueAt(rowIndex, 7).toString());
        
    }//GEN-LAST:event_EMPTABLEMouseClicked

    private void ClearEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearEmpActionPerformed
        // TODO add your handling code here:
            emp1.setText("");
            emp2.setText("");
            emp3.setText("");
            emp4.setText("");
            emp5.setText("");
            emp6.setText("");
            emp7.setText("");
            emp8.setText("");
            SearchEmployee.setText("");
            ShowEmployee();
    }//GEN-LAST:event_ClearEmpActionPerformed

    private void LAU3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAU3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LAU3ActionPerformed

    private void ClearLAUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearLAUActionPerformed
        // TODO add your handling code here:
                    LAU1.setText("");
            LAU2.setText("");
            LAU3.setText("");
            LAU4.setText("");
            LAU5.setText("");
            LAU6.setText("");
            LAU7.setText("");
            LAU8.setText("");
            SearchLauncher.setText("");
            ShowLauncher();
    }//GEN-LAST:event_ClearLAUActionPerformed

    private void SubmitLAUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitLAUActionPerformed
        // TODO add your handling code here:
        Connection con=con();
		try {
			String query="INSERT INTO `addlauncher`(`ID`, `Date`, `Weight`, `Height`, `LOF`, `LauncherType`, `OrbitType`, `Remark`) VALUES (?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, "LAU"+LAU1.getText());
			ps.setString(2, LAU2.getText());
			ps.setString(3, LAU3.getText());
			ps.setString(4, LAU4.getText());
			ps.setString(5, LAU5.getText());
			ps.setString(6, LAU6.getText());
			ps.setString(7, LAU7.getText());
			ps.setString(8, LAU8.getText());
			ps.execute();{
                            JOptionPane.showMessageDialog(null, "Registered Successfully...............");
                            ShowLauncher();
                            LAU1.setText("");
                            LAU2.setText("");
                            LAU3.setText("");
                            LAU4.setText("");
                            LAU5.setText("");
                            LAU6.setText("");
                            LAU7.setText("");
                            LAU8.setText("");
                            
                }
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, ex);
		}
    }//GEN-LAST:event_SubmitLAUActionPerformed

    private void SearchLAUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchLAUActionPerformed
        // TODO add your handling code here:
        try{
          Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "SELECT * FROM `addlauncher` WHERE Id=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, SearchLauncher.getText());
            ResultSet rs=pst.executeQuery();
            DefaultTableModel tr=(DefaultTableModel)LAUTABLE.getModel();
            tr.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getString("Id"),rs.getString("Date"),rs.getString("Weight"),rs.getString("Height"),rs.getString("LOF"),rs.getString("LauncherType"),rs.getString("OrbitType"),rs.getString("Remark")};
                tr.addRow(o);
                SearchLauncher.setText("");
            }
            con.close();
            
       }catch(Exception exp){
           JOptionPane.showMessageDialog(null, exp);
       }
    }//GEN-LAST:event_SearchLAUActionPerformed

    private void DeletLAUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletLAUActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "DELETE FROM `addlauncher` WHERE Id=?";
            PreparedStatement pst=con.prepareStatement(sql);
            
            pst.setString(1, LAU1.getText());
            
            if(pst.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Data deleted from database succeessfully!!!");
                ShowLauncher();
                LAU1.setText("");
                LAU2.setText("");
                LAU3.setText("");
                LAU4.setText("");
                LAU5.setText("");
                LAU6.setText("");
                LAU7.setText("");
                LAU8.setText("");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Something Is Wrong!!!!!");
            }
            con.close();
        }catch(Exception exp){
            JOptionPane.showMessageDialog(null, exp);
            }
    }//GEN-LAST:event_DeletLAUActionPerformed

    private void UpdateLAUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateLAUActionPerformed
        // TODO add your handling code here:
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "UPDATE `addlauncher` SET `Date`=?,`Weight`=?,`Height`=?,`LOF`=?,`LauncherType`=?,`OrbitType`=?,`Remark`=? WHERE Id=?";

            PreparedStatement pst=con.prepareStatement(sql); 
            pst.setString(1, LAU2.getText());
			pst.setString(2, LAU3.getText());
			pst.setString(3, LAU4.getText());
			pst.setString(4, LAU5.getText());
			pst.setString(5, LAU6.getText());
			pst.setString(6, LAU7.getText());
			pst.setString(7, LAU8.getText());
                        pst.setString(8, LAU1.getText());
            if(pst.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Data Updated Successfully!!!");
                ShowLauncher();
                LAU1.setText("");
                LAU2.setText("");
                LAU3.setText("");
                LAU4.setText("");
                LAU5.setText("");
                LAU6.setText("");
                LAU7.setText("");
                LAU8.setText("");
                
                
            }
            else{
                    JOptionPane.showMessageDialog(null, "Something Is Wrong!!!");
                    }
            con.close();
            
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_UpdateLAUActionPerformed

    private void LAUTABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LAUTABLEMouseClicked
        // TODO add your handling code here:
          int rowIndex=LAUTABLE.getSelectedRow();
            LAU1.setText(LAUTABLE.getValueAt(rowIndex, 0).toString());
            LAU2.setText(LAUTABLE.getValueAt(rowIndex, 1).toString());
            LAU3.setText(LAUTABLE.getValueAt(rowIndex, 2).toString());
            LAU4.setText(LAUTABLE.getValueAt(rowIndex, 3).toString());
            LAU5.setText(LAUTABLE.getValueAt(rowIndex, 4).toString());
            LAU6.setText(LAUTABLE.getValueAt(rowIndex, 5).toString());
            LAU7.setText(LAUTABLE.getValueAt(rowIndex, 6).toString());
            LAU8.setText(LAUTABLE.getValueAt(rowIndex, 7).toString());
    }//GEN-LAST:event_LAUTABLEMouseClicked

    private void SAT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAT3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SAT3ActionPerformed

    private void ClearSATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearSATActionPerformed
        // TODO add your handling code here:
                            SAT1.setText("");
                            SAT2.setText("");
                            SAT3.setText("");
                            SAT4.setText("");
                            SAT5.setText("");
                            SAT6.setText("");
                            SAT7.setText("");
                            SAT8.setText("");
                            SAT9.setText("");
                            SearchSAT.setText("");
    }//GEN-LAST:event_ClearSATActionPerformed

    private void SubmitSATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitSATActionPerformed
        // TODO add your handling code here:
        Connection con=con();
		try {
			String query="INSERT INTO `addsatellite`(`Id`, `Name`, `LaunchMass`, `MissionLife`, `LauncherId`, `LauchDate`, `OrbitType`, `Application`, `Remark`) VALUES (?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, "SAT"+SAT1.getText());
			ps.setString(2, SAT2.getText());
			ps.setString(3, SAT3.getText());
			ps.setString(4, SAT4.getText());
			ps.setString(5, SAT5.getText());
			ps.setString(6, SAT6.getText());
			ps.setString(7, SAT7.getText());
			ps.setString(8, SAT8.getText());
                        ps.setString(9, SAT9.getText());
			ps.execute();{
                            JOptionPane.showMessageDialog(null, "Registered Successfully...............");
                            ShowSatellite();
                            SAT1.setText("");
                            SAT2.setText("");
                            SAT3.setText("");
                            SAT4.setText("");
                            SAT5.setText("");
                            SAT6.setText("");
                            SAT7.setText("");
                            SAT8.setText("");
                            SAT9.setText("");
                }
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, ex);
		}
    }//GEN-LAST:event_SubmitSATActionPerformed

    private void SearchLAU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchLAU1ActionPerformed
        // TODO add your handling code here:
         try{
          Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "SELECT * FROM `addsatellite` WHERE Id=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, SearchSAT.getText());
            ResultSet rs=pst.executeQuery();
            DefaultTableModel tr=(DefaultTableModel)SATTABLE.getModel();
            tr.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getString("Id"),rs.getString("Name"),rs.getString("LaunchMass"),rs.getString("MissionLife"),rs.getString("LauncherId"),rs.getString("LauchDate"),rs.getString("OrbitType"),rs.getString("Application"),rs.getString("Remark")};
                tr.addRow(o);
                SearchSAT.setText("");
            }
            con.close();
            
       }catch(Exception exp){
           JOptionPane.showMessageDialog(null, exp);
       }
    }//GEN-LAST:event_SearchLAU1ActionPerformed

    private void DeletSATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletSATActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "DELETE FROM `addsatellite` WHERE Id=?";
            PreparedStatement pst=con.prepareStatement(sql);
            
            pst.setString(1, SAT1.getText());
            
            if(pst.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Data deleted from database succeessfully!!!");
                            ShowSatellite();
                            SAT1.setText("");
                            SAT2.setText("");
                            SAT3.setText("");
                            SAT4.setText("");
                            SAT5.setText("");
                            SAT6.setText("");
                            SAT7.setText("");
                            SAT8.setText("");
                            SAT9.setText("");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Something Is Wrong!!!!!");
            }
            con.close();
        }catch(Exception exp){
            JOptionPane.showMessageDialog(null, exp);
            }
    }//GEN-LAST:event_DeletSATActionPerformed

    private void UpdateSATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateSATActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "UPDATE `addsatellite` SET `Name`=?,`LaunchMass`=?,`MissionLife`=?,`LauncherId`=?,`LauchDate`=?,`OrbitType`=?,`Application`=?,`Remark`=? WHERE Id=?";

            PreparedStatement pst=con.prepareStatement(sql); 
            pst.setString(1, SAT2.getText());
            pst.setString(2, SAT3.getText());
            pst.setString(3, SAT4.getText());
	    pst.setString(4, SAT5.getText());
            pst.setString(5, SAT6.getText());
	    pst.setString(6, SAT7.getText());
	    pst.setString(7, SAT8.getText());
            pst.setString(8, SAT9.getText());
            pst.setString(9, SAT1.getText());
            if(pst.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Data Updated Successfully!!!");
                ShowSatellite();
                SAT1.setText("");
                SAT2.setText("");
                SAT3.setText("");
                SAT4.setText("");
                SAT5.setText("");
                SAT6.setText("");
                SAT7.setText("");
                SAT8.setText("");
                SAT9.setText("");
                
                
            }
            else{
                    JOptionPane.showMessageDialog(null, "Something Is Wrong!!!");
                    }
            con.close();
            
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_UpdateSATActionPerformed

    private void SATTABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SATTABLEMouseClicked
        // TODO add your handling code here:
        
            int rowIndex=SATTABLE.getSelectedRow();
            SAT1.setText(SATTABLE.getValueAt(rowIndex, 0).toString());
            SAT2.setText(SATTABLE.getValueAt(rowIndex, 1).toString());
            SAT3.setText(SATTABLE.getValueAt(rowIndex, 2).toString());
            SAT4.setText(SATTABLE.getValueAt(rowIndex, 3).toString());
            SAT5.setText(SATTABLE.getValueAt(rowIndex, 4).toString());
            SAT6.setText(SATTABLE.getValueAt(rowIndex, 5).toString());
            SAT7.setText(SATTABLE.getValueAt(rowIndex, 6).toString());
            SAT8.setText(SATTABLE.getValueAt(rowIndex, 7).toString());
            SAT9.setText(SATTABLE.getValueAt(rowIndex, 8).toString());
        
    }//GEN-LAST:event_SATTABLEMouseClicked

    private void ClearEXPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearEXPActionPerformed
        // TODO add your handling code here:
        
        EXP1.setText("");
                            EXP2.setText("");
                            EXP3.setText("");
                            EXP4.setText("");
                            EXP5.setText("");
                            EXP6.setText("");
                            EXP7.setText("");
                            TOTALCOST.setText("");
    }//GEN-LAST:event_ClearEXPActionPerformed

    private void SubmitEXPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitEXPActionPerformed
        // TODO add your handling code here:	
        Connection con=con();
		try {
			String query="INSERT INTO `addexpenses`(`SatelliteId`, `LauncherId`, `MaterialCost`, `BuildingCost`, `TransportationCost`, `LaunchingCost`, `DamageRepairCost`, `TotalCost`) VALUES (?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, EXP1.getText());
			ps.setString(2, EXP2.getText());
			ps.setString(3, EXP3.getText());
			ps.setString(4, EXP4.getText());
			ps.setString(5, EXP5.getText());
			ps.setString(6, EXP6.getText());
			ps.setString(7, EXP7.getText());
                        int Total=0;
                        Total=Integer.parseInt(EXP3.getText())+Integer.parseInt(EXP4.getText())+Integer.parseInt(EXP5.getText())+Integer.parseInt(EXP6.getText())+Integer.parseInt(EXP7.getText());
                        ps.setInt(8, Total);
                        
			ps.execute();{
                            JOptionPane.showMessageDialog(null, "Registered Successfully...............");
                           
                            EXP1.setText("");
                            EXP2.setText("");
                            EXP3.setText("");
                            EXP4.setText("");
                            EXP5.setText("");
                            EXP6.setText("");
                            EXP7.setText("");
                            TOTALCOST.setText("");
                            ShowExpenses();
                }
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, ex);
		}
    }//GEN-LAST:event_SubmitEXPActionPerformed

    private void SearchEXPENSESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchEXPENSESActionPerformed
        // TODO add your handling code here:
        
        try{
          Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "SELECT * FROM `addexpenses` WHERE SatelliteId=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, SearchEXP.getText());
            ResultSet rs=pst.executeQuery();
            DefaultTableModel tr=(DefaultTableModel)EXPTABLE.getModel();
            tr.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getString("SatelliteId"),rs.getString("LauncherID"),rs.getString("MaterialCost"),rs.getString("BuildingCost"),rs.getString("transportationCost"),rs.getString("LaunchingCost"),rs.getString("DamageRepairCost"),rs.getString("TotalCost")};
                tr.addRow(o);
                SearchEXP.setText("");
            }
            con.close();
            
       }catch(Exception exp){
           JOptionPane.showMessageDialog(null, exp);
       }
    }//GEN-LAST:event_SearchEXPENSESActionPerformed

    private void DeleteEXPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEXPActionPerformed
        // TODO add your handling code here:
                try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "DELETE FROM `addExpenses` WHERE SatelliteId=?";
            PreparedStatement pst=con.prepareStatement(sql);
            
            pst.setString(1, EXP1.getText());
            
            if(pst.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Data deleted from database succeessfully!!!");
                EXP1.setText("");
                            EXP2.setText("");
                            EXP3.setText("");
                            EXP4.setText("");
                            EXP5.setText("");
                            EXP6.setText("");
                            EXP7.setText("");
                            TOTALCOST.setText("");
                            ShowExpenses();
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Something Is Wrong!!!!!");
            }
            con.close();
        }catch(Exception exp){
            JOptionPane.showMessageDialog(null, exp);
            }

    }//GEN-LAST:event_DeleteEXPActionPerformed

    private void UpdateEXPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateEXPActionPerformed
        // TODO add your handling code here:
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdbms","root","");
            String sql = "UPDATE `addexpenses` SET `LauncherId`=?,`MaterialCost`=?,`BuildingCost`=?,`TransportationCost`=?,`LaunchingCost`=?,`DamageRepairCost`=?,`TotalCost`=? WHERE `SatelliteId`=?";

            PreparedStatement pst=con.prepareStatement(sql); 
            pst.setString(1, EXP2.getText());
            pst.setString(2, EXP3.getText());
            pst.setString(3, EXP4.getText());
	    pst.setString(4, EXP5.getText());
            pst.setString(5, EXP6.getText());
	    pst.setString(6, EXP7.getText());
            int Total=0;
            Total=Integer.parseInt(EXP3.getText())+Integer.parseInt(EXP4.getText())+Integer.parseInt(EXP5.getText())+Integer.parseInt(EXP6.getText())+Integer.parseInt(EXP7.getText());
	    pst.setInt(7, Total);
            pst.setString(8, EXP1.getText());
            
            if(pst.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Data Updated Successfully!!!");
                EXP1.setText("");
                            EXP2.setText("");
                            EXP3.setText("");
                            EXP4.setText("");
                            EXP5.setText("");
                            EXP6.setText("");
                            EXP7.setText("");
                            TOTALCOST.setText("");
                            ShowExpenses();
            }
            else{
                    JOptionPane.showMessageDialog(null, "Something Is Wrong!!!");
                    }
            con.close();
            
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_UpdateEXPActionPerformed

    private void EXPTABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXPTABLEMouseClicked
        // TODO add your handling code here:
         int rowIndex=EXPTABLE.getSelectedRow();
            EXP1.setText(EXPTABLE.getValueAt(rowIndex, 0).toString());
            EXP2.setText(EXPTABLE.getValueAt(rowIndex, 1).toString());
            EXP3.setText(EXPTABLE.getValueAt(rowIndex, 2).toString());
            EXP4.setText(EXPTABLE.getValueAt(rowIndex, 3).toString());
            EXP5.setText(EXPTABLE.getValueAt(rowIndex, 4).toString());
            EXP6.setText(EXPTABLE.getValueAt(rowIndex, 5).toString());
            EXP7.setText(EXPTABLE.getValueAt(rowIndex, 6).toString());
            TOTALCOST.setText(EXPTABLE.getValueAt(rowIndex, 7).toString());
            
    }//GEN-LAST:event_EXPTABLEMouseClicked

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
        // TODO add your handling code here:
        if (evt.getSource()==EMP){
            AddEmployee.setVisible(true);
            AddLauncher.setVisible(false);
            AddSatellite.setVisible(false);
            AddExpenses.setVisible(false);
            SHOWUSER.setVisible(false);
            SALARYLOG.setVisible(false);
        }
        if (evt.getSource()==LAU){
            AddEmployee.setVisible(false);
            AddLauncher.setVisible(true);
            AddSatellite.setVisible(false);
            AddExpenses.setVisible(false);
            SHOWUSER.setVisible(false);
            SALARYLOG.setVisible(false);
        }
        if (evt.getSource()==SAT){
            AddEmployee.setVisible(false);
            AddLauncher.setVisible(false);
            AddSatellite.setVisible(true);
            AddExpenses.setVisible(false);
            SHOWUSER.setVisible(false);
            SALARYLOG.setVisible(false);
        }
        if (evt.getSource()==EXP){
            AddEmployee.setVisible(false);
            AddLauncher.setVisible(false);
            AddSatellite.setVisible(false);
            AddExpenses.setVisible(true);
            SHOWUSER.setVisible(false);
            SALARYLOG.setVisible(false);
        }

        if (evt.getSource()==USER){
            AddEmployee.setVisible(false);
            AddLauncher.setVisible(false);
            AddSatellite.setVisible(false);
            AddExpenses.setVisible(false);
            SHOWUSER.setVisible(true);
            Showusers();
            SALARYLOG.setVisible(false);
        }
         if (evt.getSource()==TRIGGER){
            AddEmployee.setVisible(false);
            AddLauncher.setVisible(false);
            AddSatellite.setVisible(false);
            AddExpenses.setVisible(false);
            SHOWUSER.setVisible(false);
            SALARYLOG.setVisible(true);
        ShowSalarylogs();
         }
    }//GEN-LAST:event_mouseClicked

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_kButton2ActionPerformed

    private void TRIGGERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRIGGERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TRIGGERActionPerformed

    private void EXPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EXPActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddEmployee;
    private javax.swing.JPanel AddExpenses;
    private javax.swing.JPanel AddLauncher;
    private javax.swing.JPanel AddSatellite;
    private keeptoo.KButton ClearEXP;
    private keeptoo.KButton ClearEmp;
    private keeptoo.KButton ClearLAU;
    private keeptoo.KButton ClearSAT;
    private keeptoo.KButton DeletLAU;
    private keeptoo.KButton DeletSAT;
    private keeptoo.KButton DeleteEMP;
    private keeptoo.KButton DeleteEXP;
    private keeptoo.KButton EMP;
    private javax.swing.JTable EMPTABLE;
    private keeptoo.KButton EXP;
    private javax.swing.JTextField EXP1;
    private javax.swing.JTextField EXP2;
    private javax.swing.JTextField EXP3;
    private javax.swing.JTextField EXP4;
    private javax.swing.JTextField EXP5;
    private javax.swing.JTextField EXP6;
    private javax.swing.JTextField EXP7;
    private javax.swing.JTable EXPTABLE;
    private keeptoo.KButton LAU;
    private javax.swing.JTextField LAU1;
    private javax.swing.JTextField LAU2;
    private javax.swing.JTextField LAU3;
    private javax.swing.JTextField LAU4;
    private javax.swing.JTextField LAU5;
    private javax.swing.JTextField LAU6;
    private javax.swing.JTextField LAU7;
    private javax.swing.JTextField LAU8;
    private javax.swing.JTable LAUTABLE;
    private javax.swing.JTable LOGTABLE;
    private javax.swing.JPanel Panel_Center;
    private javax.swing.JPanel SALARYLOG;
    private keeptoo.KButton SAT;
    private javax.swing.JTextField SAT1;
    private javax.swing.JTextField SAT2;
    private javax.swing.JTextField SAT3;
    private javax.swing.JTextField SAT4;
    private javax.swing.JTextField SAT5;
    private javax.swing.JTextField SAT6;
    private javax.swing.JTextField SAT7;
    private javax.swing.JTextField SAT8;
    private javax.swing.JTextField SAT9;
    private javax.swing.JTable SATTABLE;
    private javax.swing.JPanel SHOWUSER;
    private keeptoo.KButton SearchEMP;
    private javax.swing.JTextField SearchEXP;
    private keeptoo.KButton SearchEXPENSES;
    private javax.swing.JTextField SearchEmployee;
    private keeptoo.KButton SearchLAU;
    private keeptoo.KButton SearchLAU1;
    private javax.swing.JTextField SearchLauncher;
    private javax.swing.JTextField SearchSAT;
    private keeptoo.KButton SubmitEMP;
    private keeptoo.KButton SubmitEXP;
    private keeptoo.KButton SubmitLAU;
    private keeptoo.KButton SubmitSAT;
    private javax.swing.JTextField TOTALCOST;
    private keeptoo.KButton TRIGGER;
    private keeptoo.KButton USER;
    private javax.swing.JTable USERTABLE;
    private keeptoo.KButton UpdateEMP;
    private keeptoo.KButton UpdateEXP;
    private keeptoo.KButton UpdateLAU;
    private keeptoo.KButton UpdateSAT;
    private javax.swing.JTextField emp1;
    private javax.swing.JTextField emp2;
    private javax.swing.JTextField emp3;
    private javax.swing.JTextField emp4;
    private javax.swing.JTextField emp5;
    private javax.swing.JTextField emp6;
    private javax.swing.JTextField emp7;
    private javax.swing.JTextField emp8;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
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
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    // End of variables declaration//GEN-END:variables
}
