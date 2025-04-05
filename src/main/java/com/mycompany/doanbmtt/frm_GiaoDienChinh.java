                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ
package com.mycompany.doanbmtt;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**@author
 * Nhóm ChillGroup
 * Nguyễn Hải Đăng - 2280600668
 * Bùi Bảo Hân - 2280600871
 * Trương Minh Nhiều - 2280602242
 * Nguyễn Xuân Minh - 2280601952
 * Nguyễn Thành Phúc - 2280602462
 */
public class frm_GiaoDienChinh extends javax.swing.JFrame 
{
    private static final String url = "jdbc:sqlserver://FAROLPC\\SQLEXPRESS:1433;databaseName=ENGCHECK;encrypt=true;trustServerCertificate=true;";
    private static final String username = "sa"; 
    private static final String password = "123456789"; 
    private boolean isLoggedIn; 
    private int maNguoiDung; 
    private boolean isAdmin; 
    private boolean isDetailView = false; 
    private boolean isUpdating = false;

        

    public frm_GiaoDienChinh(String tenNguoiDung,boolean isAdmin,int maNguoiDung)  {       
        initComponents();
        lblThongTinKH.setVisible(false);
        btnVaoThiNgay.setVisible(false);
        lblSoanCauHoi.setVisible(false);
        ThongTinBaiThi.setVisible(false);
        NhatKyHoatDong.setVisible(false);       
        pnChiTiet.setVisible(false);
        btnNhatKy.setVisible(false);
        btnChiTiet.setVisible(false);
        btnTimKiem.setVisible(false);
        txtTimKiem.setVisible(false);
        tableNhatKyHoatDong.setVisible(false);
        pnlNhatKyHoatDong.setVisible(false);
        spNhatKyHoatDong.setVisible(false);
        btnAuthenticator.setVisible(false);
        btnThayDoiMK.setVisible(false);
        btnUpdate.setVisible(false);
        this.isLoggedIn = maNguoiDung != -1; 
        this.isAdmin = isAdmin;
        this.maNguoiDung = maNguoiDung;  
        loadNhatKyHoatDong(); 
        loadBaiThiNguoiDung();
        loadCauTraLoiNguoiDung(); 
        configureUI(tenNguoiDung);
        loadUserInfo();
        hideTextFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        lblTrangChu = new javax.swing.JLabel();
        lblTaiKhoan = new javax.swing.JLabel();
        lblDangXuat = new javax.swing.JLabel();
        lblBaiThi = new javax.swing.JLabel();
        lblThongTinKH = new javax.swing.JLabel();
        lblLichSu = new javax.swing.JLabel();
        lblSoanCauHoi = new javax.swing.JLabel();
        HinhnenMenu = new javax.swing.JLabel();
        btnMenu = new javax.swing.JLabel();
        pnlTrangChu = new javax.swing.JPanel();
        btnDangNhap = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        HinhNenTrangChu = new javax.swing.JLabel();
        pnlBaiThi = new javax.swing.JPanel();
        btnVaoThiNgay = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        HinhNenBaiThi = new javax.swing.JLabel();
        pnlLichSu = new javax.swing.JPanel();
        ThongTinBaiThi = new javax.swing.JScrollPane();
        tbThongTinBaiThi = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblSoLanThi = new javax.swing.JLabel();
        lblTenNguoiDung = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnChiTiet = new javax.swing.JButton();
        NhatKyHoatDong = new javax.swing.JScrollPane();
        tbNhatKyHoatDong = new javax.swing.JTable();
        pnChiTiet = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaChiTiet = new javax.swing.JTextArea();
        btnNhatKy = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        HinhNenLichSu = new javax.swing.JLabel();
        pnlTaiKhoan = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lblSDT = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblSDT1 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtCC = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnAuthenticator = new javax.swing.JButton();
        btnThayDoiMK = new javax.swing.JButton();
        txtNgaySinh = new com.toedter.calendar.JCalendar();
        lbThongBao = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JLabel();
        lbSDT = new javax.swing.JLabel();
        lbCC = new javax.swing.JLabel();
        lbNgaySinh = new javax.swing.JLabel();
        lbHoTen = new javax.swing.JLabel();
        lblUsername1 = new javax.swing.JLabel();
        txtTDN = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        HinhNenTaiKhoan = new javax.swing.JLabel();
        pnlThonhTinKH = new javax.swing.JTabbedPane();
        pnlNhatKyHoatDong = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        spNhatKyHoatDong = new javax.swing.JScrollPane();
        tableNhatKyHoatDong = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        HinhnenNK = new javax.swing.JLabel();
        pnlBaiThiNguoiDung = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableBaiThiNguoiDung = new javax.swing.JTable();
        txtTimKiemBaiThi = new javax.swing.JTextField();
        btnTimKiemBaiThi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        HinhNenBT = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnlCauTraLoiNguoiDung = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableCauTraLoi = new javax.swing.JTable();
        txtTimKiemCauTraLoi = new javax.swing.JTextField();
        btnTimKiemCauTraLoi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        HinhNenCTL = new javax.swing.JLabel();
        lbXinChao = new javax.swing.JLabel();
        IconVietnam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        pnlMain.setBackground(new java.awt.Color(255, 204, 204));
        pnlMain.setPreferredSize(new java.awt.Dimension(1200, 600));
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setBackground(new java.awt.Color(255, 195, 225));
        pnlMenu.setMaximumSize(new java.awt.Dimension(250, 600));
        pnlMenu.setPreferredSize(new java.awt.Dimension(250, 600));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose.setFont(new java.awt.Font("Segoe UI Emoji", 1, 25)); // NOI18N
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\btnbackinmenu.png")); // NOI18N
        lblClose.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.setMaximumSize(new java.awt.Dimension(50, 50));
        lblClose.setMinimumSize(new java.awt.Dimension(50, 50));
        lblClose.setName("x"); // NOI18N
        lblClose.setPreferredSize(new java.awt.Dimension(12, 25));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        pnlMenu.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 24, -1));

        lblTrangChu.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        lblTrangChu.setForeground(new java.awt.Color(153, 0, 153));
        lblTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrangChu.setText("Trang chủ");
        lblTrangChu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 50, 205), 3, true));
        lblTrangChu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTrangChuMouseClicked(evt);
            }
        });
        pnlMenu.add(lblTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 190, 40));

        lblTaiKhoan.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        lblTaiKhoan.setForeground(new java.awt.Color(0, 153, 255));
        lblTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaiKhoan.setText("Tài khoản");
        lblTaiKhoan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 150, 255), 3, true));
        lblTaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTaiKhoanMouseClicked(evt);
            }
        });
        pnlMenu.add(lblTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 190, 40));

        lblDangXuat.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        lblDangXuat.setForeground(new java.awt.Color(0, 153, 255));
        lblDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDangXuat.setText("Đăng nhập");
        lblDangXuat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 150, 255), 3, true));
        lblDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseClicked(evt);
            }
        });
        pnlMenu.add(lblDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 190, 40));

        lblBaiThi.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        lblBaiThi.setForeground(new java.awt.Color(153, 0, 153));
        lblBaiThi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBaiThi.setText("Bài Thi");
        lblBaiThi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 50, 200), 3, true));
        lblBaiThi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBaiThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBaiThiMouseClicked(evt);
            }
        });
        pnlMenu.add(lblBaiThi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 190, 40));

        lblThongTinKH.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        lblThongTinKH.setForeground(new java.awt.Color(153, 0, 153));
        lblThongTinKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongTinKH.setText("Thông tin KH");
        lblThongTinKH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 50, 205), 3, true));
        lblThongTinKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblThongTinKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongTinKHMouseClicked(evt);
            }
        });
        pnlMenu.add(lblThongTinKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 190, 40));

        lblLichSu.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        lblLichSu.setForeground(new java.awt.Color(153, 0, 153));
        lblLichSu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLichSu.setText("Lịch sử");
        lblLichSu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 50, 200), 3, true));
        lblLichSu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLichSu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLichSuMouseClicked(evt);
            }
        });
        pnlMenu.add(lblLichSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 40));

        lblSoanCauHoi.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        lblSoanCauHoi.setForeground(new java.awt.Color(153, 0, 153));
        lblSoanCauHoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoanCauHoi.setText("Soạn câu hỏi");
        lblSoanCauHoi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 50, 205), 3, true));
        lblSoanCauHoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSoanCauHoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSoanCauHoiMouseClicked(evt);
            }
        });
        pnlMenu.add(lblSoanCauHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 190, 40));

        HinhnenMenu.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\HinhNenMenu.png")); // NOI18N
        pnlMenu.add(HinhnenMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlMain.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, -1));

        btnMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnMenu.setForeground(new java.awt.Color(0, 0, 0));
        btnMenu.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\btnmenu.png")); // NOI18N
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });
        pnlMain.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        pnlTrangChu.setBackground(new java.awt.Color(175, 195, 255));
        pnlTrangChu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDangNhap.setBackground(new java.awt.Color(249, 231, 204));
        btnDangNhap.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        btnDangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        pnlTrangChu.add(btnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 260, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Made by ChillGroup");
        pnlTrangChu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, -1, -1));

        HinhNenTrangChu.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\HinhNenGiaoDien.png")); // NOI18N
        pnlTrangChu.add(HinhNenTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, -1, -1));

        pnlMain.add(pnlTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1200, 550));

        pnlBaiThi.setBackground(new java.awt.Color(255, 204, 204));
        pnlBaiThi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVaoThiNgay.setBackground(new java.awt.Color(204, 255, 255));
        btnVaoThiNgay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVaoThiNgay.setText("VÀO THI NGAY");
        btnVaoThiNgay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        btnVaoThiNgay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVaoThiNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaoThiNgayActionPerformed(evt);
            }
        });
        pnlBaiThi.add(btnVaoThiNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 260, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Made by ChillGroup");
        pnlBaiThi.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        HinhNenBaiThi.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\HinhThiTracNghiem.png")); // NOI18N
        pnlBaiThi.add(HinhNenBaiThi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlMain.add(pnlBaiThi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1200, 550));

        pnlLichSu.setBackground(new java.awt.Color(255, 204, 0));
        pnlLichSu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ThongTinBaiThi.setBackground(new java.awt.Color(255, 255, 204));
        ThongTinBaiThi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DANH SÁCH BÀI THI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        ThongTinBaiThi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tbThongTinBaiThi.setBackground(new java.awt.Color(255, 255, 204));
        tbThongTinBaiThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã bài thi", "Điểm số", "Thời gian bắt đầu", "Thời gian kết thúc", "Thời gian làm bài"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbThongTinBaiThi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ThongTinBaiThi.setViewportView(tbThongTinBaiThi);

        pnlLichSu.add(ThongTinBaiThi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 670, 400));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("LỊCH SỬ");
        pnlLichSu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        lblSoLanThi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSoLanThi.setForeground(new java.awt.Color(51, 51, 51));
        lblSoLanThi.setText("Số lần thi ");
        pnlLichSu.add(lblSoLanThi, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, -1, -1));

        lblTenNguoiDung.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTenNguoiDung.setForeground(new java.awt.Color(51, 51, 51));
        lblTenNguoiDung.setText("Tên người dùng");
        pnlLichSu.add(lblTenNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(51, 51, 51));
        lblEmail.setText("Email");
        pnlLichSu.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, -1, -1));

        btnChiTiet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnChiTiet.setText("Chi tiết");
        btnChiTiet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietActionPerformed(evt);
            }
        });
        pnlLichSu.add(btnChiTiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, -1, -1));

        NhatKyHoatDong.setBackground(new java.awt.Color(204, 255, 204));
        NhatKyHoatDong.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NHẬT KÝ HOẠT ĐỘNG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        tbNhatKyHoatDong.setBackground(new java.awt.Color(204, 255, 204));
        tbNhatKyHoatDong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Hành động", "Thời gian"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        NhatKyHoatDong.setViewportView(tbNhatKyHoatDong);

        pnlLichSu.add(NhatKyHoatDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 670, 400));

        pnChiTiet.setBackground(new java.awt.Color(255, 255, 204));
        pnChiTiet.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHI TIẾT BÀI THI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        pnChiTiet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 204));

        txtAreaChiTiet.setEditable(false);
        txtAreaChiTiet.setBackground(new java.awt.Color(255, 255, 204));
        txtAreaChiTiet.setColumns(20);
        txtAreaChiTiet.setRows(5);
        jScrollPane2.setViewportView(txtAreaChiTiet);

        pnChiTiet.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 630, 340));

        pnlLichSu.add(pnChiTiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 670, 400));

        btnNhatKy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNhatKy.setText("Hiển thị nhật ký hoạt động");
        btnNhatKy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNhatKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhatKyActionPerformed(evt);
            }
        });
        pnlLichSu.add(btnNhatKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("Made by ChillGroup");
        pnlLichSu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, -1, -1));

        HinhNenLichSu.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\HinhNen6.jpg")); // NOI18N
        pnlLichSu.add(HinhNenLichSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 113, -1, -1));

        pnlMain.add(pnlLichSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1200, 550));

        pnlTaiKhoan.setBackground(new java.awt.Color(204, 255, 255));
        pnlTaiKhoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(0, 0, 102));
        lblUsername.setText("Ngày tạo tài khoản:");
        pnlTaiKhoan.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        lbEmail.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(51, 102, 255));
        lbEmail.setText("Email:");
        pnlTaiKhoan.add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        lblSDT.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblSDT.setForeground(new java.awt.Color(204, 0, 255));
        lblSDT.setText("Căn cước:");
        pnlTaiKhoan.add(lblSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, -1, -1));

        lblNgaySinh.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblNgaySinh.setForeground(new java.awt.Color(51, 0, 255));
        lblNgaySinh.setText("Ngày sinh:");
        pnlTaiKhoan.add(lblNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, -1, -1));

        lblHoTen.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblHoTen.setForeground(new java.awt.Color(0, 0, 255));
        lblHoTen.setText("Họ Tên:");
        pnlTaiKhoan.add(lblHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 110, -1));

        lblSDT1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblSDT1.setForeground(new java.awt.Color(102, 0, 255));
        lblSDT1.setText("Số điện thoại:");
        pnlTaiKhoan.add(lblSDT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, -1, -1));

        txtHoTen.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pnlTaiKhoan.add(txtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 340, 40));

        txtCC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pnlTaiKhoan.add(txtCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, 340, 40));

        txtSoDienThoai.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pnlTaiKhoan.add(txtSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 340, 40));

        btnUpdate.setBackground(new java.awt.Color(204, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnUpdate.setText("Thay đổi thông tin");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        pnlTaiKhoan.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("THÔNG TIN CÁ NHÂN");
        pnlTaiKhoan.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        btnAuthenticator.setBackground(new java.awt.Color(102, 255, 255));
        btnAuthenticator.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAuthenticator.setText("Authenticator");
        btnAuthenticator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAuthenticator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuthenticatorActionPerformed(evt);
            }
        });
        pnlTaiKhoan.add(btnAuthenticator, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 240, -1));

        btnThayDoiMK.setBackground(new java.awt.Color(0, 255, 255));
        btnThayDoiMK.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnThayDoiMK.setText("Thay đổi mật khẩu");
        btnThayDoiMK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThayDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThayDoiMKActionPerformed(evt);
            }
        });
        pnlTaiKhoan.add(btnThayDoiMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, -1, -1));
        pnlTaiKhoan.add(txtNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 310, 330, 160));

        lbThongBao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbThongBao.setForeground(new java.awt.Color(0, 0, 0));
        pnlTaiKhoan.add(lbThongBao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 750, 40));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        pnlTaiKhoan.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 460, 40));

        txtNgayTao.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        txtNgayTao.setForeground(new java.awt.Color(255, 255, 255));
        pnlTaiKhoan.add(txtNgayTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 380, 40));

        lbSDT.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbSDT.setForeground(new java.awt.Color(255, 255, 255));
        pnlTaiKhoan.add(lbSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 340, 40));

        lbCC.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbCC.setForeground(new java.awt.Color(255, 255, 255));
        pnlTaiKhoan.add(lbCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, 340, 40));

        lbNgaySinh.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbNgaySinh.setForeground(new java.awt.Color(255, 255, 255));
        pnlTaiKhoan.add(lbNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 310, 340, 40));

        lbHoTen.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbHoTen.setForeground(new java.awt.Color(255, 255, 255));
        pnlTaiKhoan.add(lbHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 340, 40));

        lblUsername1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblUsername1.setForeground(new java.awt.Color(0, 51, 255));
        lblUsername1.setText("Tên đăng nhập:");
        pnlTaiKhoan.add(lblUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        txtTDN.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtTDN.setForeground(new java.awt.Color(255, 255, 255));
        pnlTaiKhoan.add(txtTDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 280, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 255));
        jLabel9.setText("Made by ChillGroup");
        pnlTaiKhoan.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        HinhNenTaiKhoan.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\HinhNen4.jpg")); // NOI18N
        pnlTaiKhoan.add(HinhNenTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlMain.add(pnlTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1200, 550));

        pnlThonhTinKH.setBackground(new java.awt.Color(248, 219, 248));
        pnlThonhTinKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pnlNhatKyHoatDong.setBackground(new java.awt.Color(204, 255, 255));
        pnlNhatKyHoatDong.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pnlNhatKyHoatDong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlNhatKyHoatDong.add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, 262, -1));

        btnTimKiem.setBackground(new java.awt.Color(204, 255, 255));
        btnTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        pnlNhatKyHoatDong.add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 180, -1, 30));

        spNhatKyHoatDong.setBackground(new java.awt.Color(204, 255, 255));
        spNhatKyHoatDong.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NHẬT KÝ HOẠT ĐỘNG CỦA TẤT CẢ TÀI KHOẢN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        tableNhatKyHoatDong.setBackground(new java.awt.Color(204, 255, 255));
        tableNhatKyHoatDong.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tableNhatKyHoatDong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã nhật ký", "Tên người dùng", "Hành động", "Thời gian"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableNhatKyHoatDong.setGridColor(new java.awt.Color(224, 224, 224));
        tableNhatKyHoatDong.setRowHeight(30);
        spNhatKyHoatDong.setViewportView(tableNhatKyHoatDong);

        pnlNhatKyHoatDong.add(spNhatKyHoatDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 680, 400));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("NHẬT KÝ HOẠT ĐỘNG");
        pnlNhatKyHoatDong.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Made by ChillGroup");
        pnlNhatKyHoatDong.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, -1, -1));

        HinhnenNK.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\HinhNen5.jpg")); // NOI18N
        pnlNhatKyHoatDong.add(HinhnenNK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        pnlThonhTinKH.addTab("NHẬT KÝ HOẠT ĐỘNG", pnlNhatKyHoatDong);

        pnlBaiThiNguoiDung.setBackground(new java.awt.Color(204, 255, 204));
        pnlBaiThiNguoiDung.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pnlBaiThiNguoiDung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBackground(new java.awt.Color(204, 255, 204));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN BÀI THI CỦA TẤT CẢ TÀI KHOẢN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        tableBaiThiNguoiDung.setBackground(new java.awt.Color(204, 255, 204));
        tableBaiThiNguoiDung.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tableBaiThiNguoiDung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã bài thi", "Tên người dùng", "Thời gian bắt đầu", "Thời gian kết thúc", "Điểm số", "Tổng thời gian"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBaiThiNguoiDung.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableBaiThiNguoiDung.setRowHeight(30);
        jScrollPane3.setViewportView(tableBaiThiNguoiDung);

        pnlBaiThiNguoiDung.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 950, 390));

        txtTimKiemBaiThi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlBaiThiNguoiDung.add(txtTimKiemBaiThi, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 253, -1));

        btnTimKiemBaiThi.setBackground(new java.awt.Color(204, 255, 204));
        btnTimKiemBaiThi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTimKiemBaiThi.setText("Tìm kiếm");
        btnTimKiemBaiThi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimKiemBaiThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemBaiThiActionPerformed(evt);
            }
        });
        pnlBaiThiNguoiDung.add(btnTimKiemBaiThi, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("THÔNG TIN BÀI THI");
        pnlBaiThiNguoiDung.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        HinhNenBT.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\HinhNen1.jpg")); // NOI18N
        pnlBaiThiNguoiDung.add(HinhNenBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 500));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 153, 0));
        jLabel12.setText("Made by ChillGroup");
        pnlBaiThiNguoiDung.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, -1, -1));

        pnlThonhTinKH.addTab("BÀI THI NGƯỜI DÙNG", pnlBaiThiNguoiDung);

        pnlCauTraLoiNguoiDung.setBackground(new java.awt.Color(255, 204, 0));
        pnlCauTraLoiNguoiDung.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pnlCauTraLoiNguoiDung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 204));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHI TIẾT CÂU TRẢ LỜI CỦA TẤT CẢ TÀI KHOẢN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        tableCauTraLoi.setBackground(new java.awt.Color(255, 255, 204));
        tableCauTraLoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableCauTraLoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã câu trả lời", "Mã bài thi", "Nội dung câu hỏi", "Nội dung đáp án", "Đúng / Sai"
            }
        ));
        tableCauTraLoi.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableCauTraLoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableCauTraLoi.setRowHeight(30);
        jScrollPane4.setViewportView(tableCauTraLoi);

        pnlCauTraLoiNguoiDung.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 710, 390));

        txtTimKiemCauTraLoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlCauTraLoiNguoiDung.add(txtTimKiemCauTraLoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 235, -1));

        btnTimKiemCauTraLoi.setBackground(new java.awt.Color(255, 255, 204));
        btnTimKiemCauTraLoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTimKiemCauTraLoi.setText("Tìm Kiếm");
        btnTimKiemCauTraLoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemCauTraLoiActionPerformed(evt);
            }
        });
        pnlCauTraLoiNguoiDung.add(btnTimKiemCauTraLoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 51));
        jLabel7.setText("CHI TIẾT CÂU TRẢ LỜI");
        pnlCauTraLoiNguoiDung.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Made by ChillGroup");
        pnlCauTraLoiNguoiDung.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, -1, -1));

        HinhNenCTL.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\HinhNen6.jpg")); // NOI18N
        pnlCauTraLoiNguoiDung.add(HinhNenCTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        pnlThonhTinKH.addTab("CÂU TRẢ LỜI NGƯỜI DÙNG", pnlCauTraLoiNguoiDung);

        pnlMain.add(pnlThonhTinKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1200, 550));

        lbXinChao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbXinChao.setForeground(new java.awt.Color(102, 102, 255));
        lbXinChao.setText("Xin chào!");
        pnlMain.add(lbXinChao, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        IconVietnam.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\iconVietNam.png")); // NOI18N
        pnlMain.add(IconVietnam, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void configureUI(String tenNguoiDung) {
       
        if (maNguoiDung == -1) {
            lbXinChao.setText("Xin chào, Khách!");
            btnDangNhap.setText("Đăng nhập");
            lblThongTinKH.setVisible(false);
            lblSoanCauHoi.setVisible(false);
            lblLichSu.setVisible(false);
            lblTaiKhoan.setVisible(false);
        } else {
            lbXinChao.setText("Xin chào, " + (isAdmin ? "ADMIN " : "") + tenNguoiDung + "!");
            btnDangNhap.setText(isAdmin ? "Thêm câu hỏi ngay" : "Vào thi ngay");
            lblThongTinKH.setVisible(isAdmin);
            lblSoanCauHoi.setVisible(isAdmin);
        }
        
        
        lblDangXuat.setText(maNguoiDung != -1 ? "Đăng xuất" : "Đăng nhập");
    }





    int chieuRong = 250, chieuCao = 600;
    
    
    void openMenu() 
    {
        
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for(int i = 0; i < chieuRong; i++)
                {
                    pnlMenu.setSize(i, chieuCao);
                    try
                    {
                       
                        Thread.sleep(2);
                    }
                    catch(InterruptedException ex)
                    {
                        Logger.getLogger(frm_GiaoDienChinh.class.getName()).log(Level.SEVERE,null,ex);
                    }
                }
            }
        }).start();
    }
    
    void closeMenu()
    {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for(int i = chieuRong; i > 0; i--)
                {
                    pnlMenu.setSize(i, chieuCao);
                    try
                    {
                       
                        Thread.sleep(2);
                    }
                    catch(InterruptedException ex)
                    {
                        Logger.getLogger(frm_GiaoDienChinh.class.getName()).log(Level.SEVERE,null,ex);
                    }
                }
            }
        }).start();
    }

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        openMenu();
    }//GEN-LAST:event_btnMenuMouseClicked

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        closeMenu();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrangChuMouseClicked
        pnlTrangChu.setVisible(true);
        pnlThonhTinKH.setVisible(false);
        pnlBaiThi.setVisible(false);
        pnlTaiKhoan.setVisible(false);
        pnlLichSu.setVisible(false);
        btnVaoThiNgay.setVisible(false);
    }//GEN-LAST:event_lblTrangChuMouseClicked

    private void lblBaiThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBaiThiMouseClicked
        pnlBaiThi.setVisible(true);
        pnlTrangChu.setVisible(false);
        pnlThonhTinKH.setVisible(false);
        pnlTaiKhoan.setVisible(false);
        pnlLichSu.setVisible(false);
        btnVaoThiNgay.setVisible(true);
    }//GEN-LAST:event_lblBaiThiMouseClicked

    private void lblTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTaiKhoanMouseClicked
        pnlTaiKhoan.setVisible(true);
        pnlTrangChu.setVisible(false);
        pnlThonhTinKH.setVisible(false);
        pnlBaiThi.setVisible(false);
        pnlLichSu.setVisible(false);
        btnVaoThiNgay.setVisible(false);
        btnAuthenticator.setVisible(true);
        btnThayDoiMK.setVisible(true);
        btnUpdate.setVisible(true);
    }//GEN-LAST:event_lblTaiKhoanMouseClicked

    private void lblThongTinKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongTinKHMouseClicked
        pnlThonhTinKH.setVisible(true);
        pnlTrangChu.setVisible(false);
        pnlBaiThi.setVisible(false);
        pnlTaiKhoan.setVisible(false);
        pnlLichSu.setVisible(false);
        btnVaoThiNgay.setVisible(false);       
        btnTimKiem.setVisible(true);
        txtTimKiem.setVisible(true);
        tableNhatKyHoatDong.setVisible(true);
        pnlNhatKyHoatDong.setVisible(true);
        spNhatKyHoatDong.setVisible(true);
    }//GEN-LAST:event_lblThongTinKHMouseClicked

    private void lblDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseClicked
        if (maNguoiDung != -1) { 
            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất?", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                this.maNguoiDung = -1;
                this.isAdmin = false;
                configureUI("Khách");
                frmDangNhap frmDangNhap = new frmDangNhap();
                frmDangNhap.setLocationRelativeTo(null);
                frmDangNhap.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(this, "Bạn đã đăng xuất thành công!");
            }
        } else { 
            frmDangNhap frmDangNhap = new frmDangNhap();
            frmDangNhap.setLocationRelativeTo(null);
            frmDangNhap.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lblDangXuatMouseClicked

    private void lblLichSuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLichSuMouseClicked
        pnlBaiThi.setVisible(false);
        pnlTrangChu.setVisible(false);
        pnlThonhTinKH.setVisible(false);
        pnlTaiKhoan.setVisible(false);
        pnlLichSu.setVisible(true);
        btnVaoThiNgay.setVisible(false);
        ThongTinBaiThi.setVisible(true);
        NhatKyHoatDong.setVisible(true);
        pnChiTiet.setVisible(true);
        btnNhatKy.setVisible(true);
        btnChiTiet.setVisible(true);
        try {
        hienThiThongTinNguoiDung(maNguoiDung);
        hienThiDanhSachBaiThi(maNguoiDung);
        hienThiNhatKyHoatDong(maNguoiDung);
    } catch (SQLException ex) {
         ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu lịch sử.");
    }
    }//GEN-LAST:event_lblLichSuMouseClicked
    public List<Question> getRandomQuestions() throws SQLException {
    String query = """
        SELECT * FROM (
            SELECT TOP 25 * FROM CauHoi WHERE do_kho = 'easy' ORDER BY NEWID()
            UNION ALL
            SELECT TOP 15 * FROM CauHoi WHERE do_kho = 'medium' ORDER BY NEWID()
            UNION ALL
            SELECT TOP 10 * FROM CauHoi WHERE do_kho = 'hard' ORDER BY NEWID()
        ) AS RandomCauHoi;
        """;

    List<Question> questionList = new ArrayList<>();

    try (Connection conn = DriverManager.getConnection(url, username, password);
         PreparedStatement stmt = conn.prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            int maCauHoi = rs.getInt("ma_cau_hoi");
            String noiDungCauHoi = rs.getString("noi_dung_cau_hoi");
            String doKho = rs.getString("do_kho");

            Question question = new Question(maCauHoi, noiDungCauHoi, doKho);
            question.addAnswers(getAnswersByQuestionId(maCauHoi));
            questionList.add(question);
        }
    }
    return questionList;
}

private List<Answer> getAnswersByQuestionId(int questionId) throws SQLException {
    String query = "SELECT * FROM DapAn WHERE ma_cau_hoi = ?";
    List<Answer> answerList = new ArrayList<>();

    try (Connection conn = DriverManager.getConnection(url, username, password);
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setInt(1, questionId);

        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int maDapAn = rs.getInt("ma_dap_an");
                String noiDung = rs.getString("noi_dung_dap_an");
                boolean dungSai = rs.getBoolean("dung_sai");

                Answer answer = new Answer(maDapAn, noiDung, dungSai);
                answerList.add(answer);
            }
        }
    }
    return answerList;
}

    private void btnVaoThiNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaoThiNgayActionPerformed
        if (maNguoiDung == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng đăng nhập để bắt đầu thi!");
        } else {
            try {
                List<Question> randomQuestions = getRandomQuestions(); 
                
                frmLamBaiThi frm = new frmLamBaiThi(randomQuestions, maNguoiDung,this);
                frm.setVisible(true);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Lỗi khi lấy câu hỏi: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnVaoThiNgayActionPerformed
    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        if (maNguoiDung > 0) { 
            if (isAdmin) { 
              
                frmThemCauHoi frmThemCauHoi = new frmThemCauHoi(maNguoiDung);
                frmThemCauHoi.setLocationRelativeTo(null);
                frmThemCauHoi.setVisible(true);
            } else {
                
                List<Question> randomQuestions;
                try {
                    randomQuestions = getRandomQuestions();
                    
                    frmLamBaiThi lamBaiThiForm = new frmLamBaiThi(randomQuestions, maNguoiDung, this);
                    lamBaiThiForm.setVisible(true);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Lỗi khi lấy danh sách câu hỏi: " + e.getMessage());
                }
            }
        } else {
            frmDangNhap frmDangNhap = new frmDangNhap();
            frmDangNhap.setLocationRelativeTo(null);
            frmDangNhap.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void lblSoanCauHoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSoanCauHoiMouseClicked
        frmThemCauHoi formThemCauHoi = new frmThemCauHoi(maNguoiDung);
        formThemCauHoi.setLocationRelativeTo(null);
        formThemCauHoi.setVisible(true);
    }//GEN-LAST:event_lblSoanCauHoiMouseClicked

    private void btnChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietActionPerformed
        if (btnChiTiet.getText().equals("Chi tiết")) {
        int selectedRow = tbThongTinBaiThi.getSelectedRow();
        if (selectedRow != -1) {
            int maBaiThi = (int) tbThongTinBaiThi.getValueAt(selectedRow, 0);
            hienThiChiTietBaiThi(maBaiThi); 
            NhatKyHoatDong.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một bài thi!");
        }
    } else {
        pnChiTiet.setVisible(false); 
        ThongTinBaiThi.setVisible(true); 
        btnChiTiet.setText("Chi tiết"); 
    }
    }//GEN-LAST:event_btnChiTietActionPerformed

    private void btnNhatKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhatKyActionPerformed
        if (NhatKyHoatDong.isVisible()) {
            NhatKyHoatDong.setVisible(false); 
            ThongTinBaiThi.setVisible(true);
            btnChiTiet.setText("Chi tiết");
            btnChiTiet.setVisible(true);           
            btnNhatKy.setText("Hiển thị nhật ký hoạt động");
        } else {
            ThongTinBaiThi.setVisible(false); 
            pnChiTiet.setVisible(false);
            NhatKyHoatDong.setVisible(true); 
            btnNhatKy.setText("Ẩn nhật ký hoạt động");           
            btnChiTiet.setVisible(false);
            hienThiNhatKyHoatDong(maNguoiDung); 
        }
    }//GEN-LAST:event_btnNhatKyActionPerformed
   private void loadNhatKyHoatDong() 
    {
        String sql = """
            SELECT NK.ma_nhat_ky, ND.ho_ten, NK.hanh_dong, NK.thoi_gian
            FROM NhatKyHoatDong NK
            JOIN NguoiDung ND ON NK.ma_nguoi_dung = ND.ma_nguoi_dung
        """;

        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) 
        {

            DefaultTableModel model = (DefaultTableModel) tableNhatKyHoatDong.getModel();
            model.setRowCount(0);  

            while (rs.next()) 
            {
                model.addRow(new Object[]
                {
                    rs.getInt("ma_nhat_ky"),       
                    rs.getString("ho_ten"), 
                    rs.getString("hanh_dong"),     
                    rs.getTimestamp("thoi_gian")    
                });
            }

        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }


    private void loadCauTraLoiNguoiDung() 
    {
     
        String sql = """
            SELECT CT.ma_cau_tra_loi, CT.ma_bai_thi, C.noi_dung_cau_hoi, D.noi_dung_dap_an, CT.dung_sai
            FROM CauTraLoiNguoiDung CT
            JOIN CauHoi C ON CT.ma_cau_hoi = C.ma_cau_hoi
            JOIN DapAn D ON CT.ma_dap_an = D.ma_dap_an
        """;

        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) 
        {
           
            DefaultTableModel model = (DefaultTableModel) tableCauTraLoi.getModel();
            model.setRowCount(0); 
            while (rs.next()) 
            {
                model.addRow(new Object[]
                {
                    rs.getInt("ma_cau_tra_loi"),            
                    rs.getInt("ma_bai_thi"),                 
                    rs.getString("noi_dung_cau_hoi"),         
                    rs.getString("noi_dung_dap_an"),         
                    rs.getBoolean("dung_sai") ? "Đúng" : "Sai"  
                });
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }

    private void loadBaiThiNguoiDung() 
    {
        
        String sql = """
            SELECT B.ma_bai_thi, N.ho_ten, B.thoi_gian_bat_dau, B.thoi_gian_ket_thuc, B.diem_so, B.tong_thoi_gian
            FROM BaiThiNguoiDung B
            JOIN NguoiDung N ON B.ma_nguoi_dung = N.ma_nguoi_dung
        """;

        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) 
        {
            
            DefaultTableModel model = (DefaultTableModel) tableBaiThiNguoiDung.getModel();
            model.setRowCount(0); 
            while (rs.next()) 
            {
                model.addRow(new Object[]
                {
                    rs.getInt("ma_bai_thi"),              
                    rs.getString("ho_ten"),        
                    rs.getTimestamp("thoi_gian_bat_dau"),   
                    rs.getTimestamp("thoi_gian_ket_thuc"), 
                    rs.getBigDecimal("diem_so"),            
                    rs.getInt("tong_thoi_gian")             
                });
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace(); 
        }
    }
    private void searchTable(JTable table, String searchText) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);
        if (searchText.trim().isEmpty()) {
            sorter.setRowFilter(null);  
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText));  
        }
    }
    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
         String searchText = txtTimKiem.getText();  
        searchTable(tableNhatKyHoatDong, searchText);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnTimKiemBaiThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemBaiThiActionPerformed
        String searchText = txtTimKiemBaiThi.getText(); 
        searchTable(tableBaiThiNguoiDung, searchText); 
    }//GEN-LAST:event_btnTimKiemBaiThiActionPerformed

    private void btnTimKiemCauTraLoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemCauTraLoiActionPerformed
        String searchText = txtTimKiemCauTraLoi.getText(); 
        searchTable(tableCauTraLoi, searchText);
    }//GEN-LAST:event_btnTimKiemCauTraLoiActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (!isUpdating) {
        fillTextFields(); 
        showTextFields();  
        btnUpdate.setText("Xác nhận");
        isUpdating = true;
    } else  {  
        String hoTen = txtHoTen.getText().trim();
        String soDienThoai = txtSoDienThoai.getText().trim();
        String canCuoc = txtCC.getText().trim();
        java.util.Date utilNgaySinh = txtNgaySinh.getDate(); 
        java.sql.Date sqlNgaySinh = utilNgaySinh == null ? null : new java.sql.Date(utilNgaySinh.getTime());
        
        if (hoTen.isEmpty()) {
            lbThongBao.setText("Vui lòng nhập Họ Tên!");
            return;
        }
        if (utilNgaySinh != null) {
            if (sqlNgaySinh.toLocalDate().isAfter(LocalDate.now())) {
                lbThongBao.setText("Ngày sinh không được trong tương lai!");
                return;
            }
        }
        if (!soDienThoai.isEmpty()&&!soDienThoai.matches("^\\d{10,11}$")) {
            lbThongBao.setText("Số điện thoại không hợp lệ! Chỉ gồm 10-11 chữ số.");
            return;
        }
        if (!canCuoc.isEmpty() && !canCuoc.matches("^\\d{12}$")) {
            lbThongBao.setText("CCCD không hợp lệ! Phải gồm 12 chữ số.");
            return;
        }
        String query = "UPDATE NguoiDung SET ho_ten = ?, ngay_sinh = ?, so_dien_thoai = ?, cccd= ? WHERE ma_nguoi_dung = ?";
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, hoTen);
            stmt.setDate(2, sqlNgaySinh);
            stmt.setString(3, soDienThoai);
            stmt.setString(4, canCuoc);
            stmt.setInt(5, maNguoiDung);

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                
                JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công!");
                updateLabels(); 
                hideTextFields(); 
                ghiNhatKyHoatDong(maNguoiDung,"Thay đổi thông tin cá nhân");
                lbThongBao.setText("");
                btnUpdate.setText("Thay đổi thông tin");  
                isUpdating = false;  
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật thông tin: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAuthenticatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuthenticatorActionPerformed
        frmAuthenticator frmAu = new frmAuthenticator();
        frmAu.setLocationRelativeTo(null);
        frmAu.setVisible(true);
    }//GEN-LAST:event_btnAuthenticatorActionPerformed

    private void btnThayDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThayDoiMKActionPerformed
        frmKhoiPhucMK frmMK = new frmKhoiPhucMK();
        frmMK.setLocationRelativeTo(null);
        frmMK.setVisible(true);
    }//GEN-LAST:event_btnThayDoiMKActionPerformed
    private void hienThiThongTinNguoiDung(int maNguoiDung) throws SQLException {
        String query = "SELECT ho_ten, email, COUNT(ma_bai_thi) AS so_lan_thi " +
                       "FROM NguoiDung LEFT JOIN BaiThiNguoiDung ON NguoiDung.ma_nguoi_dung = BaiThiNguoiDung.ma_nguoi_dung " +
                       "WHERE NguoiDung.ma_nguoi_dung = ? GROUP BY ho_ten, email";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, maNguoiDung);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    lblTenNguoiDung.setText("Họ và tên: " + rs.getString("ho_ten"));
                    lblEmail.setText("Email: " + rs.getString("email"));
                    lblSoLanThi.setText(String.valueOf("Số lần thi: " + rs.getInt("so_lan_thi")));
                }
            }
        }
    }
    private void hienThiDanhSachBaiThi(int maNguoiDung) throws SQLException {
        String query = "SELECT ma_bai_thi, diem_so, thoi_gian_bat_dau, thoi_gian_ket_thuc, tong_thoi_gian " +
                       "FROM BaiThiNguoiDung WHERE ma_nguoi_dung = ?";
        DefaultTableModel model = (DefaultTableModel) tbThongTinBaiThi.getModel();
        model.setRowCount(0); 

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, maNguoiDung);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getInt("ma_bai_thi"),
                        rs.getDouble("diem_so"),
                        rs.getTimestamp("thoi_gian_bat_dau"),
                        rs.getTimestamp("thoi_gian_ket_thuc"),
                        rs.getInt("tong_thoi_gian") + " phút"
                    });
                }
            }
        }
        ThongTinBaiThi.setVisible(true);
        pnChiTiet.setVisible(false);
        NhatKyHoatDong.setVisible(false);
    }
    private void hienThiChiTietBaiThi(int maBaiThi) {
        String query = """
            SELECT CH.noi_dung_cau_hoi, DA.noi_dung_dap_an, CT.dung_sai
            FROM CauTraLoiNguoiDung CT
            JOIN CauHoi CH ON CT.ma_cau_hoi = CH.ma_cau_hoi
            JOIN DapAn DA ON CT.ma_dap_an = DA.ma_dap_an
            WHERE CT.ma_bai_thi = ?
        """;

        StringBuilder chiTiet = new StringBuilder();

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, maBaiThi);
            try (ResultSet rs = stmt.executeQuery()) {
                int index = 1;
                while (rs.next()) {
                    chiTiet.append("Câu ")
                            .append(index++)
                            .append(": ")
                            .append(rs.getString("noi_dung_cau_hoi"))
                            .append("\nĐáp án đã chọn: ")
                            .append(rs.getString("noi_dung_dap_an"))
                            .append(rs.getBoolean("dung_sai") ? " (Đúng)" : " (Sai)")
                            .append("\n\n");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tải chi tiết bài thi: " + e.getMessage());
            return;
        }

        pnChiTiet.setVisible(true); 
        ThongTinBaiThi.setVisible(false); 
        txtAreaChiTiet.setText(chiTiet.toString()); 
        btnChiTiet.setText("Quay lại"); 
    }

    private void hienThiNhatKyHoatDong(int maNguoiDung) {
    String query = "SELECT hanh_dong, thoi_gian FROM NhatKyHoatDong WHERE ma_nguoi_dung = ?";
    DefaultTableModel model = (DefaultTableModel) tbNhatKyHoatDong.getModel();
    model.setRowCount(0); 

    try (Connection conn = DriverManager.getConnection(url, username, password);
         PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setInt(1, maNguoiDung);
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("hanh_dong"), rs.getTimestamp("thoi_gian")});
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Lỗi khi tải nhật ký hoạt động: " + e.getMessage());
    }
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
    private void loadUserInfo() {
        String sql = "SELECT email, ten_dang_nhap, ho_ten, ngay_tao, ngay_sinh, so_dien_thoai, cccd FROM NguoiDung WHERE ma_nguoi_dung = ?";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, maNguoiDung); 
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    txtEmail.setText(rs.getString("email"));
                    txtTDN.setText(rs.getString("ten_dang_nhap"));
                    txtNgayTao.setText(rs.getString("ngay_tao"));
                    lbHoTen.setText(rs.getString("ho_ten"));
                    java.sql.Date ngaySinh = rs.getDate("ngay_sinh");
                    if (ngaySinh != null) {
                        lbNgaySinh.setText(new SimpleDateFormat("yyyy-MM-dd").format(ngaySinh));
                    } else {
                        lbNgaySinh.setText("Chưa cập nhật");
                    }

                    lbSDT.setText(rs.getString("so_dien_thoai"));
                    lbCC.setText(rs.getString("cccd"));
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tải thông tin người dùng: " + e.getMessage());
        }
    }

    private void showTextFields() {
    txtHoTen.setVisible(true);
    txtNgaySinh.setVisible(true);  
    txtSoDienThoai.setVisible(true);
    txtCC.setVisible(true);

    lbHoTen.setVisible(false);
    lbNgaySinh.setVisible(false);
    lbSDT.setVisible(false);
    lbCC.setVisible(false);
}
private void hideTextFields() {
    txtHoTen.setVisible(false);
    txtNgaySinh.setVisible(false);
    txtSoDienThoai.setVisible(false);
    txtCC.setVisible(false);

    lbHoTen.setVisible(true);
    lbNgaySinh.setVisible(true);
    lbSDT.setVisible(true);
    lbCC.setVisible(true);
}
private void fillTextFields() {
    txtHoTen.setText(lbHoTen.getText()); 
    txtSoDienThoai.setText(lbSDT.getText()); 
    txtCC.setText(lbCC.getText());  

    String ngaySinh = lbNgaySinh.getText().trim();
    if (!ngaySinh.equalsIgnoreCase("Chưa cập nhật") && !ngaySinh.isEmpty()) {
        try {
            java.sql.Date date = java.sql.Date.valueOf(ngaySinh);  
            txtNgaySinh.setDate(date);  
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Ngày sinh không hợp lệ. Sẽ dùng ngày hiện tại làm mặc định.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            txtNgaySinh.setDate(new java.util.Date());  
        }
    } else {
        txtNgaySinh.setDate(new java.util.Date());  
    }
}



private void updateLabels() {
    lbHoTen.setText(txtHoTen.getText());
    lbNgaySinh.setText(new SimpleDateFormat("yyyy-MM-dd").format(txtNgaySinh.getDate()));
    lbSDT.setText(txtSoDienThoai.getText());
    lbCC.setText(txtCC.getText());
}






    
    public static void main(String args[]) 
    {
        String tenNguoiDung = "Khách";
        boolean isAdmin = false;
        int maNguoiDung=-1;
        java.awt.EventQueue.invokeLater(() -> {
            new frm_GiaoDienChinh(tenNguoiDung, isAdmin,maNguoiDung).setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HinhNenBT;
    private javax.swing.JLabel HinhNenBaiThi;
    private javax.swing.JLabel HinhNenCTL;
    private javax.swing.JLabel HinhNenLichSu;
    private javax.swing.JLabel HinhNenTaiKhoan;
    private javax.swing.JLabel HinhNenTrangChu;
    private javax.swing.JLabel HinhnenMenu;
    private javax.swing.JLabel HinhnenNK;
    private javax.swing.JLabel IconVietnam;
    private javax.swing.JScrollPane NhatKyHoatDong;
    private javax.swing.JScrollPane ThongTinBaiThi;
    private javax.swing.JButton btnAuthenticator;
    private javax.swing.JButton btnChiTiet;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel btnMenu;
    private javax.swing.JButton btnNhatKy;
    private javax.swing.JButton btnThayDoiMK;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTimKiemBaiThi;
    private javax.swing.JButton btnTimKiemCauTraLoi;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnVaoThiNgay;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbCC;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbNgaySinh;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbThongBao;
    private javax.swing.JLabel lbXinChao;
    private javax.swing.JLabel lblBaiThi;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblLichSu;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblSDT1;
    private javax.swing.JLabel lblSoLanThi;
    private javax.swing.JLabel lblSoanCauHoi;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JLabel lblTenNguoiDung;
    private javax.swing.JLabel lblThongTinKH;
    private javax.swing.JLabel lblTrangChu;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JPanel pnChiTiet;
    private javax.swing.JPanel pnlBaiThi;
    private javax.swing.JPanel pnlBaiThiNguoiDung;
    private javax.swing.JPanel pnlCauTraLoiNguoiDung;
    private javax.swing.JPanel pnlLichSu;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlNhatKyHoatDong;
    private javax.swing.JPanel pnlTaiKhoan;
    private javax.swing.JTabbedPane pnlThonhTinKH;
    private javax.swing.JPanel pnlTrangChu;
    private javax.swing.JScrollPane spNhatKyHoatDong;
    private javax.swing.JTable tableBaiThiNguoiDung;
    private javax.swing.JTable tableCauTraLoi;
    private javax.swing.JTable tableNhatKyHoatDong;
    private javax.swing.JTable tbNhatKyHoatDong;
    private javax.swing.JTable tbThongTinBaiThi;
    private javax.swing.JTextArea txtAreaChiTiet;
    private javax.swing.JTextField txtCC;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JTextField txtHoTen;
    private com.toedter.calendar.JCalendar txtNgaySinh;
    private javax.swing.JLabel txtNgayTao;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JLabel txtTDN;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTimKiemBaiThi;
    private javax.swing.JTextField txtTimKiemCauTraLoi;
    // End of variables declaration//GEN-END:variables
}
                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ