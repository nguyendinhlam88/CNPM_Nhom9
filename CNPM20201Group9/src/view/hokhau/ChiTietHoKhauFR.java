/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.hokhau;

import controller.HoKhauManagerController;
import controller.NhanKhauManagerController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Vu
 */
public class ChiTietHoKhauFR extends javax.swing.JFrame {

    /**
     * Creates new form ChiTietHoKhauFR
     */
    
    HoKhauManagerController hoKhauControl = new HoKhauManagerController();
    NhanKhauManagerController nhanKhauControl = new NhanKhauManagerController();
    SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
    
    public void hienThiChiTiet(){
        hoKhauControl.hienThiChiTiet(nhanKhauControl.soHoKhau, txtTenChuHo, txtSoHoKhau, txtDiaChi, txtMaKhuVuc, txtNgayTao, txtNguoiThucHien, txtLyDoChuyen, txtNgayChuyenDi, txtGhiChu);
    }
    
    private void setTrangThaiSua(boolean t){
        if(t==true){
            xacnhansuabutton.setVisible(true);
            huysuabutton.setVisible(true);
            suahokhaubutton.setEnabled(false);
            themnhankhaubutton.setEnabled(false);
            txtTenChuHo.setEditable(true);
            txtSoHoKhau.setEditable(true);
            txtMaKhuVuc.setEditable(true);
            txtDiaChi.setEditable(true);
            txtNgayTao.setEditable(true);
            txtNgayChuyenDi.setEditable(true);
            txtNguoiThucHien.setEditable(true);
            txtGhiChu.setEditable(true);
            txtLyDoChuyen.setEditable(true);
        }
        else{
            xacnhansuabutton.setVisible(false);
            huysuabutton.setVisible(false);
            suahokhaubutton.setEnabled(true);
            themnhankhaubutton.setEnabled(true);
            txtTenChuHo.setEditable(false);
            txtSoHoKhau.setEditable(false);
            txtMaKhuVuc.setEditable(false);
            txtDiaChi.setEditable(false);
            txtNgayTao.setEditable(false);
            txtNgayChuyenDi.setEditable(false);
            txtNguoiThucHien.setEditable(false);
            txtGhiChu.setEditable(false);
            txtLyDoChuyen.setEditable(false);
        }
    }
    
    public ChiTietHoKhauFR() {
        initComponents();
        hienThiChiTiet();
        nhanKhauControl.capNhatBangNhanKhau1Ho(DSNhanKhauTable);
        setTrangThaiSua(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        themnhankhaubutton = new javax.swing.JButton();
        capnhantbutton = new javax.swing.JButton();
        suahokhaubutton = new javax.swing.JButton();
        thoatbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DSNhanKhauTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtMaKhuVuc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNguoiThucHien = new javax.swing.JTextField();
        txtNgayChuyenDi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLyDoChuyen = new javax.swing.JTextField();
        txtTenChuHo = new javax.swing.JTextField();
        txtSoHoKhau = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtGhiChu = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        xacnhansuabutton = new javax.swing.JButton();
        huysuabutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        themnhankhaubutton.setText("Thêm nhân khẩu");
        themnhankhaubutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themnhankhaubuttonActionPerformed(evt);
            }
        });

        capnhantbutton.setText("Cập nhật trạng thái");
        capnhantbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capnhantbuttonActionPerformed(evt);
            }
        });

        suahokhaubutton.setText("Sửa hộ khẩu");
        suahokhaubutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suahokhaubuttonActionPerformed(evt);
            }
        });

        thoatbutton.setText("Thoát");
        thoatbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatbuttonActionPerformed(evt);
            }
        });

        DSNhanKhauTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã định danh", "Tên nhân khẩu", "Quan hệ với chủ hộ", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DSNhanKhauTable);

        jLabel4.setText("Địa chỉ:");

        jLabel1.setText("Tên chủ hộ:");

        jLabel7.setText("Ngày chuyển đi:");

        jLabel8.setText("Lý do chuyển:");

        jLabel2.setText("Số hộ khẩu:");

        jLabel5.setText("Mã khu vực:");

        jLabel6.setText("Ngày tạo:");

        jLabel9.setText("Người thực hiện:");

        jLabel10.setText("Ghi chú:");

        xacnhansuabutton.setText("Xác nhận sửa");
        xacnhansuabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacnhansuabuttonActionPerformed(evt);
            }
        });

        huysuabutton.setText("Hủy sửa");
        huysuabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huysuabuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMaKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNguoiThucHien, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(huysuabutton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xacnhansuabutton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNgayChuyenDi, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLyDoChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtNgayChuyenDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMaKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtLyDoChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNguoiThucHien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(huysuabutton)
                    .addComponent(xacnhansuabutton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(suahokhaubutton)
                        .addGap(18, 18, 18)
                        .addComponent(themnhankhaubutton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(capnhantbutton)
                        .addGap(18, 18, 18)
                        .addComponent(thoatbutton)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themnhankhaubutton)
                    .addComponent(suahokhaubutton)
                    .addComponent(capnhantbutton)
                    .addComponent(thoatbutton))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void themnhankhaubuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themnhankhaubuttonActionPerformed
        //TODO add your handling code here:
        new ThemNhanKhauFR().setVisible(true);
    }//GEN-LAST:event_themnhankhaubuttonActionPerformed

    private void capnhantbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capnhantbuttonActionPerformed
        // TODO add your handling code here:
        nhanKhauControl.capNhatBangNhanKhau1Ho(DSNhanKhauTable);

    }//GEN-LAST:event_capnhantbuttonActionPerformed

    private void xacnhansuabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacnhansuabuttonActionPerformed
        // TODO add your handling code here:
        try{
            String soHoKhauMoi = txtSoHoKhau.getText();
            String tenChuHo = txtTenChuHo.getText();
            String maKhuVuc = txtMaKhuVuc.getText();
            String diaChi = txtDiaChi.getText();
            Date ngayTao = fmt.parse(txtNgayTao.getText());
            Date ngayChuyenDi = fmt.parse(txtNgayChuyenDi.getText());
            String lyDoChuyen = txtLyDoChuyen.getText();
            String nguoiThucHien = txtNguoiThucHien.getText();
            String ghiChu = txtGhiChu.getText();
            int i = hoKhauControl.capNhatHoKhau(soHoKhauMoi, tenChuHo, maKhuVuc, diaChi, ngayTao, ngayChuyenDi, lyDoChuyen, nguoiThucHien, ghiChu, nhanKhauControl.soHoKhau);
            if(i==1){
                JOptionPane.showMessageDialog(this," Cập nhật hộ khẩu thành công ");
                nhanKhauControl.setSoHoKhau(soHoKhauMoi);
            }else{
                JOptionPane.showMessageDialog(this," Cập nhật thất bại ");
                hienThiChiTiet();
            }
            
            /*trangthaimoi=controlhokhau.Luutrangthaihokhau(trangthaimoi, txtSoHoKhau.getText(), txtTenChuHo.getText(), txtdiachi.getText());
            controllichsu.LuuLichSuSuaHoKhau(trangthaicu, trangthaimoi);
            trangthaicu=controlhokhau.Luutrangthaihokhau(trangthaicu, txtSoHoKhau.getText(), txtTenChuHo.getText(), txtdiachi.getText());*/
            setTrangThaiSua(false);
        }catch(Exception e){
            
        }
        

    }//GEN-LAST:event_xacnhansuabuttonActionPerformed

    private void suahokhaubuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suahokhaubuttonActionPerformed
        // TODO add your handling code here:
        setTrangThaiSua(true);
        //trangthaicu = controlhokhau.Luutrangthaihokhau(trangthaicu, txtSoHoKhau.getText(), txtTenChuHo.getText(), txtdiachi.getText());*/
    }//GEN-LAST:event_suahokhaubuttonActionPerformed

    private void thoatbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatbuttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_thoatbuttonActionPerformed

    private void huysuabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huysuabuttonActionPerformed
        // TODO add your handling code here:
        //setSua(false);
    }//GEN-LAST:event_huysuabuttonActionPerformed

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
            java.util.logging.Logger.getLogger(ChiTietHoKhauFR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoKhauFR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoKhauFR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoKhauFR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietHoKhauFR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DSNhanKhauTable;
    private javax.swing.JButton capnhantbutton;
    private javax.swing.JButton huysuabutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton suahokhaubutton;
    private javax.swing.JButton themnhankhaubutton;
    private javax.swing.JButton thoatbutton;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtLyDoChuyen;
    private javax.swing.JTextField txtMaKhuVuc;
    private javax.swing.JTextField txtNgayChuyenDi;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtNguoiThucHien;
    private javax.swing.JTextField txtSoHoKhau;
    private javax.swing.JTextField txtTenChuHo;
    private javax.swing.JButton xacnhansuabutton;
    // End of variables declaration//GEN-END:variables
}
