//Rochelle French
//Project 
//12/4/2015
package appointments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.io.*;
public class Appointments extends javax.swing.JFrame {
        Connection con;
        Statement stmt;
        ResultSet rs;
        BufferedWriter outfile; 
        
    public Appointments() {
        initComponents();
       
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Name = new javax.swing.JLabel();
        Doctor = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        textDoctor = new javax.swing.JTextField();
        DoB = new javax.swing.JLabel();
        textDob = new javax.swing.JTextField();
        pnum = new javax.swing.JLabel();
        textPnum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        DateText = new javax.swing.JTextField();
        timeText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        doctorText = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        Create = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Name.setText("Patient's Name:");

        Doctor.setText("Doctor's Name");

        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });

        textDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDoctorActionPerformed(evt);
            }
        });

        DoB.setText("Patient DOB:");

        pnum.setText("Phone Number:");

        jLabel7.setText("Request Appointment:");

        jLabel8.setText("Date:");

        jLabel9.setText("Time:");

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel1.setText("Doctor:");

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(Submit)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(DateText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timeText, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(doctorText, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Create))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DoB)
                                    .addComponent(Name)
                                    .addComponent(pnum)
                                    .addComponent(Doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textDob, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                        .addComponent(textPnum)))))
                        .addGap(92, 92, 92))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Name)
                        .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DoB)
                                    .addComponent(textDob, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pnum)
                                    .addComponent(textPnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Create)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Update)))
                        .addGap(11, 11, 11)
                        .addComponent(Delete))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Doctor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Clear)
                .addGap(2, 2, 2)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(DateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(doctorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Submit)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {                                       
       try {  
                outfile = new BufferedWriter(new FileWriter("Appointments.txt"));
                outfile.write("Patient: ");
                outfile.write(textName.getText()+" ");
                outfile.write("Date: ");
                outfile.write(DateText.getText()+" ");
                outfile.write("Time: ");
                outfile.write(timeText.getText()+" ");
                outfile.write("Docor: ");
                outfile.write(doctorText.getText()+" ");   
                outfile.close();
            }
            catch(FileNotFoundException e) {
                System.out.println("File not found.");
            }
            catch(NullPointerException j){
                System.out.println("Null.");
            }
            catch(IOException k){
                System.out.println("IO Exception.");            
            }
            JOptionPane.showMessageDialog(this,"Saved");      

    }                                      

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void textDoctorActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {                                      
                textDoctor.setText("");
                textDob.setText("");
                textPnum.setText("");
                textName.setText("");
    }                                     

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try { 
            String host = "jdbc:derby://localhost:1527/Patients"; 
            String uName = "useradmin"; 
            String uPass = "password";
            con = DriverManager.getConnection (host, uName, uPass);
            ResultSet rs; 
            Statement stmt; 
            String sql;
             
            sql = "SELECT * FROM Patients WHERE name = '" + textName.getText() + "' "; 
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            rs.next();
            int dob = rs.getInt("DOB"); 
            int pnum = rs.getInt("NUM");
            String BDay = Integer.toString(dob);                
            String doctor = rs.getString("DOCTOR");
            String num = Integer.toString(pnum);
            
            textDoctor.setText(doctor);
            textDob.setText(BDay);
            textPnum.setText(num);
            rs.close();
            stmt.close();
            }
            
            
            
        
        catch ( SQLException err){ 
            JOptionPane.showMessageDialog(this, err.getMessage());
            
            
        }
    }                                      

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {                                       
     
        String BDay = textDob.getText(); 
        String name = textName.getText();
        String doctor = textDoctor.getText();
        String num = textPnum.getText();
        if (name.length() == 0){ 
            JOptionPane.showMessageDialog(null,"Please enter something!");
        } else {
        Integer newDOB = Integer.parseInt(BDay);
        Integer newnum = Integer.parseInt(num);
        
        try { 
            String host = "jdbc:derby://localhost:1527/Patients"; 
            String uName = "useradmin"; 
            String uPass = "password";
            con = DriverManager.getConnection (host, uName, uPass);
            stmt = con.createStatement();
            String sql;
            sql = "update patients set DOCTOR='"+doctor+"', DOB ="+newDOB+", NUM ="+newnum+" where NAME = '"+name+"' ";
            int n = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"Updated rows" + n);
            stmt.close();
        } catch (Exception err) { 
            System.out.println(err.getMessage());
        }
    }                                      
    }
    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {
        try{ 
        String host = "jdbc:derby://localhost:1527/Patients"; 
        String uName = "useradmin"; 
        String uPass = "password";
        con = DriverManager.getConnection (host, uName, uPass);
        ResultSet rs; 
        Statement stmt; 
        String sql;
        String BDay = textDob.getText(); 
        String name = textName.getText();
        String doctor = textDoctor.getText();
        String num = textPnum.getText();
        Integer newDOB = Integer.parseInt(BDay);
        Integer newnum = Integer.parseInt(num);
             
        sql = "insert into Patients (NAME, DOCTOR, NUM, DOB) values('"+name+"','"+doctor+"',"+newnum+","+newDOB+")"; 
        stmt = con.createStatement(); 
        stmt.executeUpdate(sql);
        stmt.close();
        JOptionPane.showMessageDialog(null,"The record was added succesfully");
        } catch (Exception e){
            e.printStackTrace();
        }
    }                                      

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {                                       
         try{       
        String host = "jdbc:derby://localhost:1527/Patients"; 
        String uName = "useradmin"; 
        String uPass = "password";
        con = DriverManager.getConnection (host, uName, uPass);
        ResultSet rs; 
        Statement stmt; 
        String sql;
        String BDay = textDob.getText(); 
        String name = textName.getText();
        String doctor = textDoctor.getText();
        String num = textPnum.getText();
        Integer newDOB = Integer.parseInt(BDay);
        Integer newnum = Integer.parseInt(num);
        
        sql = "Delete from Login where NAME = '"+name+"' ";
        
        stmt = con.createStatement(); 
        stmt.executeUpdate(sql);
        stmt.close();
        JOptionPane.showMessageDialog(null,"The record was added succesfully");
        } catch (Exception e){
            e.printStackTrace();
        }
    }                                      
    
    
    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Clear;
    private javax.swing.JButton Create;
    private javax.swing.JTextField DateText;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel DoB;
    private javax.swing.JLabel Doctor;
    private javax.swing.JLabel Name;
    private javax.swing.JButton Search;
    private javax.swing.JButton Submit;
    private javax.swing.JButton Update;
    private javax.swing.JTextField doctorText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel pnum;
    private javax.swing.JTextField textDob;
    private javax.swing.JTextField textDoctor;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPnum;
    private javax.swing.JTextField timeText;
    // End of variables declaration                   
}

