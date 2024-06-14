/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom11_qltrasua;

import Model.NhanVien;
import Model.KetNoi;
import Model.PhanQuyen;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TitledPane;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyen Cat Tuong
 */
public class frmDangNhap extends javax.swing.JFrame {

    /**
     * Creates new form frmDangNhap
     */
    public frmDangNhap() {
        initComponents();
        
        showLogoStore();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Nhập");

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng nhập");

        txtTaiKhoan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tài khoản:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mật khẩu:");

        txtMatKhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnDangNhap.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        btnDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDangNhapKeyPressed(evt);
            }
        });

        lblLogo.setText("Logo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        
        if(txtMatKhau.getText().isEmpty() || txtTaiKhoan.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Tài khoản hoặc mật khẩu không được để trống");
            return;
        }
      
        try 
        {
            Connection con = KetNoi.connectToDatabase(); // Kết nối sql
            String sql= "select * from DANGNHAP";
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String matKhau = null;
            String taiKhoan = null;
            int correct =0;
           
                while (rs.next())
                {
                     taiKhoan = rs.getString("TAIKHOAN");
                      matKhau = rs.getString("MATKHAU");
                      NhanVien nhanVien = new NhanVien(taiKhoan, matKhau);
                                      frmMain main = new frmMain(nhanVien.getTaiKhoan());
                                      frmMainNhanVien mainNhanVien = new frmMainNhanVien();
                                      PhanQuyen  phanQuyen = new PhanQuyen();
        
                       if(txtTaiKhoan.getText().toString().equals(taiKhoan) && txtMatKhau.getText().toString().equals(matKhau))
                    {
                            
                phanQuyen.setTaiKhoanCu(taiKhoan);
                        if(taiKhoan.equals("admin"))
                        {
                             main.setVisible(true);
                         this.dispose();
                         correct = 1;
                         break;
                
                        }
                        else 
                        {
                            mainNhanVien.setVisible(true);
                            this.dispose();
                            correct =1;
                            break;
                        }
                      }
                }
           
           if (correct == 0)
           {
               JOptionPane.showMessageDialog(null, "Sai tài khoản hoặc mật khẩu");
               return;
           }
          
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(frmDanhSachTraSua.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnDangNhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDangNhapKeyPressed
        // TODO add your handling code here:
       if(evt.getKeyCode() == KeyEvent.VK_ENTER)
       {
             if(txtMatKhau.getText().isEmpty() || txtTaiKhoan.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Tài khoản hoặc mật khẩu không được để trống");
            return;
        }
      
        try 
        {
            Connection con = KetNoi.connectToDatabase(); // Kết nối sql
            String sql= "select * from DANGNHAP";
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String matKhau = null;
            String taiKhoan = null;
            int correct =0;
           
                while (rs.next())
                {
                     taiKhoan = rs.getString("TAIKHOAN");
                      matKhau = rs.getString("MATKHAU");
                      NhanVien nhanVien = new NhanVien(taiKhoan, matKhau);
                                      frmMain main = new frmMain(nhanVien.getTaiKhoan());
                                      frmMainNhanVien mainNhanVien = new frmMainNhanVien();
                                      PhanQuyen  phanQuyen = new PhanQuyen();
        
                       if(txtTaiKhoan.getText().toString().equals(taiKhoan) && txtMatKhau.getText().toString().equals(matKhau))
                    {
                            
                phanQuyen.setTaiKhoanCu(taiKhoan);
                        if(taiKhoan.equals("admin"))
                        {
                             main.setVisible(true);
                         this.dispose();
                         correct = 1;
                         break;
                        }
                        else 
                        {
                            mainNhanVien.setVisible(true);
                            this.dispose();
                            correct =1;
                            break;
                        }
                      }
                }
           
           if (correct == 0)
           {
               JOptionPane.showMessageDialog(null, "Sai tài khoản hoặc mật khẩu");
               return;
           }
          
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(frmDanhSachTraSua.class.getName()).log(Level.SEVERE, null, ex);
        } 
       }
    }//GEN-LAST:event_btnDangNhapKeyPressed

        
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
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDangNhap().setVisible(true);
                
            }
        });
    }
    
   public void showLogoStore()
   {
        ImageIcon imageIcon = new ImageIcon("src\\Img\\Logo.png");
              Image image = imageIcon.getImage().getScaledInstance(235,230, Image.SCALE_SMOOTH);
              lblLogo.setIcon(new ImageIcon(image));
              return;

   }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
