package DangNhap;
import QL_DanhSachTaiSan.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DangKy extends javax.swing.JFrame {
    ArrayList<TaiKhoan> dsTK = new ArrayList<>();
    TaiKhoan tk = new TaiKhoan();
    DBEngine db = new DBEngine();
    String fname = "dsTK.dat";
    /**
     * Creates new form DangKy
     */
    public DangKy() {
        initComponents();
        readData();
        setLocationRelativeTo(null);
        setTitle("Đăng ký");
    }
    
    public void reset(){
        jTextDN.setText("");
        jPassMK.setText("");
    }
    
    public void readData(){
        try {
            dsTK=(ArrayList<TaiKhoan>) db.docFile(fname);
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Danh sách hiện tại rỗng!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi đọc dữ liệu:\n" +ex,"Lỗi", JOptionPane.ERROR_MESSAGE);
            //Logger.getLogger(DangKy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void saveData(){
        try {            
            db.LuuFile(fname, dsTK);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi lưu dữ liệu:\n" +ex,"Lỗi", JOptionPane.ERROR_MESSAGE);
            //Logger.getLogger(DangKy.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabelLogo = new javax.swing.JLabel();
        jLabelDN = new javax.swing.JLabel();
        jLabelMK = new javax.swing.JLabel();
        jTextDN = new javax.swing.JTextField();
        jButtonTao = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonDN = new javax.swing.JButton();
        jPassMK = new javax.swing.JPasswordField();
        jLabelTitl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DangNhap/logoDHCNHN.jpg"))); // NOI18N
        jPanel1.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, 156));

        jLabelDN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDN.setText("Tên đăng nhập:");
        jPanel1.add(jLabelDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabelMK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMK.setText("Mật khẩu:");
        jPanel1.add(jLabelMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));
        jPanel1.add(jTextDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 150, -1));

        jButtonTao.setText("Tạo");
        jButtonTao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTaoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 70, -1));

        jButtonReset.setText("Hủy");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 70, -1));

        jButtonDN.setText("Đăng nhập");
        jButtonDN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDNActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jPassMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassMKActionPerformed(evt);
            }
        });
        jPanel1.add(jPassMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 150, -1));

        jLabelTitl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitl.setText("ĐĂNG KÝ");
        jPanel1.add(jLabelTitl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 480, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTaoActionPerformed
        // TODO add your handling code here:
        String dn = jTextDN.getText();
        String mk = jPassMK.getText();
        tk = new TaiKhoan(dn,mk);
        if(dn.trim().length() == 0 || mk.trim().length() == 0) 
            JOptionPane.showMessageDialog(this,"Phải nhập đầy đủ thông tin!","Thông báo", JOptionPane.WARNING_MESSAGE);
        else if(checkTK(dn)) 
            JOptionPane.showMessageDialog(this,"Đã tồn tại tên đăng nhập!", "Lỗi", JOptionPane.ERROR_MESSAGE);            
        else{
            dsTK.add(tk);
            reset();
            saveData();
            JOptionPane.showMessageDialog(this,"Đã đăng ký tài khoản cho "+dn+"!", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        }                         
    }//GEN-LAST:event_jButtonTaoActionPerformed

    public boolean checkTK(String tendk){
        for(TaiKhoan itm : dsTK)
            if(itm.getTenDN().equals(tendk)) return true;
        return false;
    }
    
    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonDNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDNActionPerformed
        // TODO add your handling code here:
        DangNhap dnForm = new DangNhap();
        dnForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonDNActionPerformed

    private void jPassMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassMKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDN;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonTao;
    private javax.swing.JLabel jLabelDN;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMK;
    private javax.swing.JLabel jLabelTitl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassMK;
    private javax.swing.JTextField jTextDN;
    // End of variables declaration//GEN-END:variables
}
