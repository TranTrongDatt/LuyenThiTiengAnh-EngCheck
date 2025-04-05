                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ
package com.mycompany.doanbmtt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**@author
 * Nhóm ChillGroup
 * Nguyễn Hải Đăng - 2280600668
 * Bùi Bảo Hân - 2280600871
 * Trương Minh Nhiều - 2280602242
 * Nguyễn Xuân Minh - 2280601952
 * Nguyễn Thành Phúc - 2280602462
 */
public class frmThemCauHoi extends javax.swing.JFrame {
    private static final String url = "jdbc:sqlserver://FAROLPC\\SQLEXPRESS:1433;databaseName=ENGCHECK;encrypt=true;trustServerCertificate=true;";
    private static final String username = "sa";
    private static final String password = "123456789";
    private int maNguoiDung;
    private boolean isEditing = false; 
    /**
     * Creates new form frmThemCauHoi
     */
    public frmThemCauHoi(int maNguoiDung) {
        initComponents();
        pnDanhSachCauHoi.setVisible(false);
        setupCheckboxBehavior();
        this.maNguoiDung = maNguoiDung;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnDanhSachCauHoi = new javax.swing.JPanel();
        btnChon = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDanhSachCauHoi = new javax.swing.JTable();
        HinhNen1 = new javax.swing.JLabel();
        pnThemCauHoi = new javax.swing.JPanel();
        CauHoi = new javax.swing.JScrollPane();
        txtCauHoi = new javax.swing.JTextArea();
        txtC = new javax.swing.JTextField();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        txtD = new javax.swing.JTextField();
        cbC = new javax.swing.JCheckBox();
        cbA = new javax.swing.JCheckBox();
        cbB = new javax.swing.JCheckBox();
        cbD = new javax.swing.JCheckBox();
        cboDoKho = new javax.swing.JComboBox<>();
        lbThongBao = new javax.swing.JLabel();
        btnSave = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        btnSua = new javax.swing.JLabel();
        lblMaCauHoi = new javax.swing.JLabel();
        IconVietnam = new javax.swing.JLabel();
        HinhNen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnDanhSachCauHoi.setBackground(new java.awt.Color(255, 255, 51));
        pnDanhSachCauHoi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnChon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnChon.setText("Chọn");
        btnChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonActionPerformed(evt);
            }
        });
        pnDanhSachCauHoi.add(btnChon, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 100, -1));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 102));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHỌN CÂU HỎI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        tbDanhSachCauHoi.setBackground(new java.awt.Color(255, 255, 204));
        tbDanhSachCauHoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã câu hỏi", "Nội dung câu hỏi", "Độ khó", "Câu trả lời đúng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbDanhSachCauHoi);

        pnDanhSachCauHoi.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 30, 680, 400));

        HinhNen1.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\HinhNen2.jpg")); // NOI18N
        pnDanhSachCauHoi.add(HinhNen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 940, -1));

        getContentPane().add(pnDanhSachCauHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 950, 500));

        pnThemCauHoi.setBackground(new java.awt.Color(102, 204, 255));
        pnThemCauHoi.setForeground(new java.awt.Color(0, 0, 0));
        pnThemCauHoi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CauHoi.setBorder(null);
        CauHoi.setWheelScrollingEnabled(false);

        txtCauHoi.setColumns(20);
        txtCauHoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCauHoi.setRows(5);
        txtCauHoi.setBorder(null);
        CauHoi.setViewportView(txtCauHoi);

        pnThemCauHoi.add(CauHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 350, 110));
        pnThemCauHoi.add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 380, 40));
        pnThemCauHoi.add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 380, 40));
        pnThemCauHoi.add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 380, 40));
        pnThemCauHoi.add(txtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 380, 40));

        cbC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cbC.setForeground(new java.awt.Color(0, 0, 0));
        cbC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnThemCauHoi.add(cbC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, -1, -1));

        cbA.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cbA.setForeground(new java.awt.Color(0, 0, 0));
        cbA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnThemCauHoi.add(cbA, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, -1, -1));

        cbB.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cbB.setForeground(new java.awt.Color(0, 0, 0));
        cbB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnThemCauHoi.add(cbB, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 420, 20, 20));

        cbD.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cbD.setForeground(new java.awt.Color(0, 0, 0));
        cbD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnThemCauHoi.add(cbD, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 500, -1, -1));

        cboDoKho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "easy", "medium", "hard" }));
        pnThemCauHoi.add(cboDoKho, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 140, -1));

        lbThongBao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnThemCauHoi.add(lbThongBao, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 800, 40));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\btnSave.png")); // NOI18N
        btnSave.setText("Lưu");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        pnThemCauHoi.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Câu hỏi");
        pnThemCauHoi.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("Độ khó");
        pnThemCauHoi.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Thêm câu hỏi");
        pnThemCauHoi.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Made by ChillGroup");
        pnThemCauHoi.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, -1));

        btnBack.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\btnback.png")); // NOI18N
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        pnThemCauHoi.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 50, 50));

        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 153, 153));
        btnSua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSua.setText("Sửa");
        btnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });
        pnThemCauHoi.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(1029, 156, 80, 40));

        lblMaCauHoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnThemCauHoi.add(lblMaCauHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, -1, -1));

        IconVietnam.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\iconVietNam.png")); // NOI18N
        pnThemCauHoi.add(IconVietnam, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 50, -1, -1));

        HinhNen.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\HinhNen3.jpg")); // NOI18N
        pnThemCauHoi.add(HinhNen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        getContentPane().add(pnThemCauHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int chieuRong = 950, chieuCao = 500;  
    void openDanhSachCauHoi() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= chieuRong; i+=10) {
                    pnDanhSachCauHoi.setSize(i, chieuCao);
                    try {
                        Thread.sleep(1);                      } catch (InterruptedException ex) {
                        Logger.getLogger(frmThemCauHoi.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    void closeDanhSachCauHoi() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = chieuRong; i >= 0; i-=20) {
                    pnDanhSachCauHoi.setSize(i, chieuCao);
                    try {
                        Thread.sleep(1);                      } catch (InterruptedException ex) {
                        Logger.getLogger(frmThemCauHoi.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        String noiDungCauHoi = txtCauHoi.getText().trim();
        String doKho = cboDoKho.getSelectedItem().toString();
        String[] dapAn = {txtA.getText().trim(), txtB.getText().trim(), txtC.getText().trim(), txtD.getText().trim()};
        boolean[] dungSai = {cbA.isSelected(), cbB.isSelected(), cbC.isSelected(), cbD.isSelected()};

                if (noiDungCauHoi.isEmpty() || doKho.isEmpty()) {
            lbThongBao.setText("Vui lòng nhập đầy đủ thông tin câu hỏi!");
            return;
        }
        for (String da : dapAn) {
            if (da.isEmpty()) {
                lbThongBao.setText("Vui lòng nhập đầy đủ nội dung đáp án!");
                return;
            }
        }
        if (!cbA.isSelected() && !cbB.isSelected() && !cbC.isSelected() && !cbD.isSelected()) {
            lbThongBao.setText("Vui lòng chọn đáp án đúng!");
            return;
        }

        try {
            if (isEditing) {
                int maCauHoi = Integer.parseInt(lblMaCauHoi.getText().replace("Mã câu hỏi: ", "").trim());
                suaCauHoi(maCauHoi, noiDungCauHoi, doKho, dapAn, dungSai);
                ghiNhatKyHoatDong(maNguoiDung, "Sửa câu hỏi có mã số " + maCauHoi);
                lbThongBao.setText("Sửa câu hỏi thành công!");
                pnDanhSachCauHoi.setVisible(false);
                lblMaCauHoi.setText("");
            } else {
                int maCauHoi = themCauHoi(noiDungCauHoi, doKho);
                if (maCauHoi > 0) {
                    for (int i = 0; i < dapAn.length; i++) {
                        themDapAn(maCauHoi, dapAn[i], dungSai[i]);
                    }
                    ghiNhatKyHoatDong(maNguoiDung, "Thêm câu hỏi");
                    lbThongBao.setText("Thêm câu hỏi thành công!");
                    pnDanhSachCauHoi.setVisible(false);
                } else {
                    lbThongBao.setText("Thêm câu hỏi thất bại!");
                }
            }
            resetForm();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi lưu câu hỏi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveMouseClicked
    private void suaCauHoi(int maCauHoi, String noiDungCauHoi, String doKho, String[] dapAn, boolean[] dungSai) throws SQLException {
    String updateCauHoiQuery = "UPDATE CauHoi SET noi_dung_cau_hoi = ?, do_kho = ? WHERE ma_cau_hoi = ?";
    String updateDapAnQuery = "UPDATE DapAn SET noi_dung_dap_an = ?, dung_sai = ? WHERE ma_cau_hoi = ? AND ma_dap_an = ?";

    try (Connection conn = DriverManager.getConnection(url, username, password);
         PreparedStatement updateCauHoiStmt = conn.prepareStatement(updateCauHoiQuery);
         PreparedStatement updateDapAnStmt = conn.prepareStatement(updateDapAnQuery)) {

        updateCauHoiStmt.setString(1, noiDungCauHoi);
        updateCauHoiStmt.setString(2, doKho);
        updateCauHoiStmt.setInt(3, maCauHoi);
        updateCauHoiStmt.executeUpdate();

        List<Integer> maDapAnList = new ArrayList<>();
        String getDapAnQuery = "SELECT ma_dap_an FROM DapAn WHERE ma_cau_hoi = ?";
        try (PreparedStatement getDapAnStmt = conn.prepareStatement(getDapAnQuery)) {
            getDapAnStmt.setInt(1, maCauHoi);
            try (ResultSet rs = getDapAnStmt.executeQuery()) {
                while (rs.next()) {
                    maDapAnList.add(rs.getInt("ma_dap_an"));
                }
            }
        }

                for (int i = 0; i < dapAn.length; i++) {
            if (i < maDapAnList.size()) {
                updateDapAnStmt.setString(1, dapAn[i]);                  
                updateDapAnStmt.setBoolean(2, dungSai[i]);                  
                updateDapAnStmt.setInt(3, maCauHoi);                  
                updateDapAnStmt.setInt(4, maDapAnList.get(i));                  
                updateDapAnStmt.executeUpdate();              
            }
        }
    }
}


    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
       this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
       if (!isEditing) {
            hienThiDanhSachCauHoi();              setComponentsVisible(false);              pnDanhSachCauHoi.setVisible(true);
            openDanhSachCauHoi();            btnSua.setText("Thêm");
            isEditing = true;
            
        } else {         
            setComponentsVisible(true); 
            closeDanhSachCauHoi();                        btnSua.setText("Sửa");
            isEditing = false;
        }
    }//GEN-LAST:event_btnSuaMouseClicked
    private void setComponentsVisible(boolean visible) {
    lblMaCauHoi.setVisible(visible);
    CauHoi.setVisible(visible);
    txtCauHoi.setVisible(visible);
    txtA.setVisible(visible);
    txtB.setVisible(visible);
    txtC.setVisible(visible);
    txtD.setVisible(visible);
    cbA.setVisible(visible);
    cbB.setVisible(visible);
    cbC.setVisible(visible);
    cbD.setVisible(visible);
    btnSave.setVisible(visible);
    cboDoKho.setVisible(visible);
    }


    private void btnChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonActionPerformed
        int selectedRow = tbDanhSachCauHoi.getSelectedRow();  
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một câu hỏi để sửa!");
            return;
        }

                DefaultTableModel model = (DefaultTableModel) tbDanhSachCauHoi.getModel();
        int maCauHoi = (int) model.getValueAt(selectedRow, 0);
        String noiDungCauHoi = (String) model.getValueAt(selectedRow, 1);
        String doKho = (String) model.getValueAt(selectedRow, 2);

        lblMaCauHoi.setText("Mã câu hỏi: " + maCauHoi);
        txtCauHoi.setText(noiDungCauHoi);
        cboDoKho.setSelectedItem(doKho);

                hienThiDapAn(maCauHoi);
        
                if(pnThemCauHoi.isVisible()){
            btnSua.setText("Sửa");
        }else{
            btnSua.setText("Thêm");
        }       
        closeDanhSachCauHoi();
        pnDanhSachCauHoi.setVisible(false);       
        setComponentsVisible(true); 
    }//GEN-LAST:event_btnChonActionPerformed
    private void hienThiDapAn(int maCauHoi) {
        String query = "SELECT noi_dung_dap_an, dung_sai FROM DapAn WHERE ma_cau_hoi = ?";
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, maCauHoi);

            try (ResultSet rs = stmt.executeQuery()) {
                int index = 0;
                JCheckBox[] checkBoxes = {cbA, cbB, cbC, cbD};                  JTextField[] txtFields = {txtA, txtB, txtC, txtD};  
                while (rs.next() && index < 4) {
                    txtFields[index].setText(rs.getString("noi_dung_dap_an"));
                    checkBoxes[index].setSelected(rs.getBoolean("dung_sai"));                      index++;
                }

                                for (int i = index; i < 4; i++) {
                    txtFields[i].setText("");
                    checkBoxes[i].setSelected(false);
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi tải đáp án: " + e.getMessage());
        }
    }

    private int themCauHoi(String noiDungCauHoi, String doKho) throws SQLException {
        String query = "INSERT INTO CauHoi (noi_dung_cau_hoi, do_kho) OUTPUT INSERTED.ma_cau_hoi VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, noiDungCauHoi);
            stmt.setString(2, doKho);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);             }
        }
        return -1;
    }

        private void themDapAn(int maCauHoi, String noiDungDapAn, boolean dungSai) throws SQLException {
        String query = "INSERT INTO DapAn (ma_cau_hoi, noi_dung_dap_an, dung_sai) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, maCauHoi);
            stmt.setString(2, noiDungDapAn);
            stmt.setBoolean(3, dungSai);

            stmt.executeUpdate();
        }
    }
        private void setupCheckboxBehavior() {
        cbA.addItemListener(e -> handleCheckboxStateChange(cbA, cbB, cbC, cbD));
        cbB.addItemListener(e -> handleCheckboxStateChange(cbB, cbA, cbC, cbD));
        cbC.addItemListener(e -> handleCheckboxStateChange(cbC, cbA, cbB, cbD));
        cbD.addItemListener(e -> handleCheckboxStateChange(cbD, cbA, cbB, cbC));
    }

        private void handleCheckboxStateChange(javax.swing.JCheckBox selected, javax.swing.JCheckBox... others) {
        boolean isSelected = selected.isSelected();
        for (javax.swing.JCheckBox checkbox : others) {
            checkbox.setEnabled(!isSelected);         }
    }

     private void resetForm() {
        txtCauHoi.setText("");
        txtA.setText("");
        txtB.setText("");
        txtC.setText("");
        txtD.setText("");
        cbA.setSelected(false);
        cbB.setSelected(false);
        cbC.setSelected(false);
        cbD.setSelected(false);
        cboDoKho.setSelectedIndex(0);
    }
     private void ghiNhatKyHoatDong(int maNguoiDung, String hanhDong) {
        String query = "INSERT INTO NhatKyHoatDong (ma_nguoi_dung, hanh_dong) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, maNguoiDung);
            stmt.setString(2, hanhDong);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } 
    private void hienThiDanhSachCauHoi() {
        DefaultTableModel model = (DefaultTableModel) tbDanhSachCauHoi.getModel();
        model.setRowCount(0);  
        String query = """
            SELECT CH.ma_cau_hoi, CH.noi_dung_cau_hoi, CH.do_kho, DA.noi_dung_dap_an AS dap_an_dung
            FROM CauHoi CH
            JOIN DapAn DA ON CH.ma_cau_hoi = DA.ma_cau_hoi
            WHERE DA.dung_sai = 1
            ORDER BY CH.ma_cau_hoi
        """;

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int maCauHoi = rs.getInt("ma_cau_hoi");
                String noiDungCauHoi = rs.getString("noi_dung_cau_hoi");
                String doKho = rs.getString("do_kho");
                String dapAnDung = rs.getString("dap_an_dung");  
                                model.addRow(new Object[]{maCauHoi, noiDungCauHoi, doKho, dapAnDung});
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }






    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane CauHoi;
    private javax.swing.JLabel HinhNen;
    private javax.swing.JLabel HinhNen1;
    private javax.swing.JLabel IconVietnam;
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnChon;
    private javax.swing.JLabel btnSave;
    private javax.swing.JLabel btnSua;
    private javax.swing.JCheckBox cbA;
    private javax.swing.JCheckBox cbB;
    private javax.swing.JCheckBox cbC;
    private javax.swing.JCheckBox cbD;
    private javax.swing.JComboBox<String> cboDoKho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbThongBao;
    private javax.swing.JLabel lblMaCauHoi;
    private javax.swing.JPanel pnDanhSachCauHoi;
    private javax.swing.JPanel pnThemCauHoi;
    private javax.swing.JTable tbDanhSachCauHoi;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextArea txtCauHoi;
    private javax.swing.JTextField txtD;
    // End of variables declaration//GEN-END:variables
}
                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ