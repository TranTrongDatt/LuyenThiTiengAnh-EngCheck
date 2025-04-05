                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ
package com.mycompany.doanbmtt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.Timer;
/**@author
 * Nhóm ChillGroup
 * Nguyễn Hải Đăng - 2280600668
 * Bùi Bảo Hân - 2280600871
 * Trương Minh Nhiều - 2280602242
 * Nguyễn Xuân Minh - 2280601952
 * Nguyễn Thành Phúc - 2280602462
 */
public class frmLamBaiThi extends javax.swing.JFrame {
    private static final String url = "jdbc:sqlserver://FAROLPC\\SQLEXPRESS:1433;databaseName=ENGCHECK;encrypt=true;trustServerCertificate=true;";
    private static final String username = "sa"; 
    private static final String password = "123456789"; 
    private List<Question> questionList;     private int currentQuestionIndex = 0;     private List<UserAnswer> userAnswers = new ArrayList<>();     private int maNguoiDung;     private int totalQuestions;     private Timer timer;     private int remainingTime = 60 * 60;     private int focusLostCount = 0;     public frmLamBaiThi(List<Question> questions, int maNguoiDung, JFrame parentForm) {
        this.setUndecorated(true);
        int confirm = JOptionPane.showConfirmDialog(null, 
        "Bạn đã sẵn sàng bắt đầu bài thi chưa?", 
        "Xác nhận", 
        JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        initComponents();
        ghiNhatKyHoatDong(maNguoiDung, "Bắt đầu thi");    
        this.questionList = questions;
        this.maNguoiDung = maNguoiDung;
        this.totalQuestions = questions.size();   
        initializeQuestionStatusPanel();   
        hienThiCauHoi(questionList.get(currentQuestionIndex));
        startTimer();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(false);
        this.addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {}

            @Override
            public void windowLostFocus(WindowEvent e) {
                focusLostCount++;
                if (focusLostCount == 5) {
                    JOptionPane.showMessageDialog(null, "Cảnh báo: Bạn đã chuyển sang cửa sổ khác 5 lần. Nếu tiếp tục, bài thi sẽ bị hủy.");
                } else if (focusLostCount == 10) {
                    JOptionPane.showMessageDialog(null, "Bạn đã vi phạm quy định quá nhiều lần. Bài thi sẽ tự nộp!.");
                    ghiNhatKyHoatDong(maNguoiDung,"Vi phạm quy định thi!");
                    nopBai();
                }
            }
        });
    } else {
        if (parentForm != null) {           
            parentForm.setVisible(true);         }
        dispose();     }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblThoiGian = new javax.swing.JLabel();
        lblCauHoi = new javax.swing.JLabel();
        rdoA = new javax.swing.JRadioButton();
        rdoB = new javax.swing.JRadioButton();
        rdoC = new javax.swing.JRadioButton();
        rdoD = new javax.swing.JRadioButton();
        btnCauSau = new javax.swing.JLabel();
        btnNopBai = new javax.swing.JLabel();
        btnCauTruoc = new javax.swing.JLabel();
        questionStatusPanel = new javax.swing.JPanel();
        lblSoCauTraLoi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HinhNen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblThoiGian.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblThoiGian.setForeground(new java.awt.Color(255, 0, 51));
        lblThoiGian.setToolTipText("");
        lblThoiGian.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thời gian", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 36), new java.awt.Color(255, 102, 102))); // NOI18N
        lblThoiGian.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblThoiGian, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 30, 490, 220));

        lblCauHoi.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lblCauHoi.setText("Câu hỏi ");
        jPanel1.add(lblCauHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 1150, 300));

        rdoA.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        rdoA.setText("Câu A");
        rdoA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(rdoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 1220, -1));

        rdoB.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        rdoB.setText("Câu B");
        rdoB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(rdoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 1220, -1));

        rdoC.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        rdoC.setText("Câu C");
        rdoC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(rdoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 610, 1220, -1));

        rdoD.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        rdoD.setText("Câu D");
        rdoD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(rdoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 750, 1220, -1));

        btnCauSau.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCauSau.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\nextNew.png")); // NOI18N
        btnCauSau.setText("Next");
        btnCauSau.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCauSau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCauSau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCauSauMouseClicked(evt);
            }
        });
        jPanel1.add(btnCauSau, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 1000, -1, -1));

        btnNopBai.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnNopBai.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\btnKetQua.png")); // NOI18N
        btnNopBai.setText("NỘP BÀI");
        btnNopBai.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnNopBai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNopBai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNopBaiMouseClicked(evt);
            }
        });
        jPanel1.add(btnNopBai, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 1000, -1, -1));

        btnCauTruoc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCauTruoc.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\backNew.png")); // NOI18N
        btnCauTruoc.setText("Back");
        btnCauTruoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCauTruoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCauTruoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCauTruocMouseClicked(evt);
            }
        });
        jPanel1.add(btnCauTruoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1000, -1, -1));

        questionStatusPanel.setBackground(new java.awt.Color(204, 255, 255));
        questionStatusPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Số câu đã làm", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 36), new java.awt.Color(0, 204, 102))); // NOI18N
        questionStatusPanel.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(questionStatusPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 320, 490, 570));

        lblSoCauTraLoi.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblSoCauTraLoi.setText("Số câu");
        jPanel1.add(lblSoCauTraLoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 890, 110, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Made by ChillGroup");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 1060, -1, -1));

        HinhNen.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\HinhNen1920x1080.jpg")); // NOI18N
        jPanel1.add(HinhNen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void initializeQuestionStatusPanel() {
        questionStatusPanel.removeAll();         questionStatusPanel.setLayout(new GridLayout(10, 5, 5, 5)); 
        for (int i = 0; i < totalQuestions; i++) {
            JButton btn = new JButton(String.valueOf(i + 1));
            btn.setPreferredSize(new Dimension(50, 50));             btn.setBackground(Color.LIGHT_GRAY);             btn.setFont(new Font("Arial", Font.BOLD, 14));             btn.addActionListener(e -> {
                int questionIndex = Integer.parseInt(btn.getText()) - 1;
                currentQuestionIndex = questionIndex;
                hienThiCauHoi(questionList.get(currentQuestionIndex));
            });
            questionStatusPanel.add(btn);
        }

        questionStatusPanel.revalidate();         questionStatusPanel.repaint();       }



    private void updateQuestionStatusPanel() {
        Component[] components = questionStatusPanel.getComponents();
        for (int i = 0; i < components.length; i++) {
            if (components[i] instanceof JButton btn) {
                int questionIndex = i;                 boolean isAnswered = userAnswers.stream()
                                                .anyMatch(ans -> ans.getMaCauHoi() == questionList.get(questionIndex).getMaCauHoi());
                btn.setBackground(isAnswered ? Color.PINK : Color.LIGHT_GRAY);
            }
        }
    }



    private void hienThiCauHoi(Question question) {
        resetRadioButtonSelection();         lblCauHoi.setText("<html><div style='width:900px;'>" + question.getNoiDung() + "</div></html>");
        
        List<Answer> answers = question.getAnswers();
        JRadioButton[] answerButtons = {rdoA, rdoB, rdoC, rdoD};
        for (JRadioButton button : answerButtons) {
            for (ActionListener al : button.getActionListeners()) {
                button.removeActionListener(al);
            }
        }
        for (int i = 0; i < answers.size(); i++) {
        Answer answer = answers.get(i);
        String formattedText = "<html><div style='width:700px;'>" + answers.get(i).getNoiDung() + "</div></html>";
        final Answer selectedAnswer = answer;
        answerButtons[i].setText(formattedText);
        answerButtons[i].setActionCommand(String.valueOf(answer.getMaDapAn()));
        answerButtons[i].setVisible(true);

                    answerButtons[i].addActionListener(e -> {
            int maDapAn = Integer.parseInt(selectedAnswer.getMaDapAn() + "");
            boolean isCorrect = selectedAnswer.isDungSai();

                        Optional<UserAnswer> existingAnswer = userAnswers.stream()
                    .filter(ans -> ans.getMaCauHoi() == question.getMaCauHoi())
                    .findFirst();
            if (existingAnswer.isPresent()) {
                existingAnswer.get().setMaDapAn(maDapAn);
                existingAnswer.get().setDungSai(isCorrect);
            } else {
                userAnswers.add(new UserAnswer(question.getMaCauHoi(), maDapAn, isCorrect));
            }

                        updateQuestionStatusPanel();
        });
        }

                for (int i = answers.size(); i < answerButtons.length; i++) {
            answerButtons[i].setVisible(false);
        }

                Optional<UserAnswer> existingAnswer = userAnswers.stream()
                .filter(ans -> ans.getMaCauHoi() == question.getMaCauHoi())
                .findFirst();
        existingAnswer.ifPresent(answer -> {
            int maDapAn = answer.getMaDapAn();
            for (JRadioButton btn : answerButtons) {
                if (Integer.parseInt(btn.getActionCommand()) == maDapAn) {
                    btn.setSelected(true);
                    break;
                }
            }
        });

        updateQuestionProgress();         updateQuestionStatusPanel();     }
    private void saveAnswerForCurrentQuestion() {
        ButtonGroup group = new ButtonGroup();
        group.add(rdoA);
        group.add(rdoB);
        group.add(rdoC);
        group.add(rdoD);

        if (group.getSelection() != null) {
            int maDapAn = Integer.parseInt(group.getSelection().getActionCommand());
            Answer selectedAnswer = questionList.get(currentQuestionIndex)
                                                 .getAnswers()
                                                 .stream()
                                                 .filter(a -> a.getMaDapAn() == maDapAn)
                                                 .findFirst()
                                                 .orElse(null);

            boolean isCorrect = selectedAnswer != null && selectedAnswer.isDungSai();

            Optional<UserAnswer> existingAnswer = userAnswers.stream()
                                                             .filter(ans -> ans.getMaCauHoi() == questionList.get(currentQuestionIndex).getMaCauHoi())
                                                             .findFirst();

            if (existingAnswer.isPresent()) {
                existingAnswer.get().setMaDapAn(maDapAn);
                existingAnswer.get().setDungSai(isCorrect);
            } else {
                userAnswers.add(new UserAnswer(
                    questionList.get(currentQuestionIndex).getMaCauHoi(),
                    maDapAn,
                    isCorrect
                ));
            }
        }

        updateQuestionStatusPanel();     }

    private void btnCauSauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCauSauMouseClicked
            ButtonGroup group = new ButtonGroup();
    group.add(rdoA);
    group.add(rdoB);
    group.add(rdoC);
    group.add(rdoD);

    if (group.getSelection() != null) {
        int maDapAn = Integer.parseInt(group.getSelection().getActionCommand());
        Answer selectedAnswer = questionList.get(currentQuestionIndex)
                                             .getAnswers()
                                             .stream()
                                             .filter(a -> a.getMaDapAn() == maDapAn)
                                             .findFirst()
                                             .orElse(null);

        boolean isCorrect = selectedAnswer != null && selectedAnswer.isDungSai();
        userAnswers.add(new UserAnswer(
                questionList.get(currentQuestionIndex).getMaCauHoi(),
                maDapAn,
                isCorrect
        ));
    }
    saveAnswerForCurrentQuestion();
    
    if (currentQuestionIndex < totalQuestions - 1) {       
        currentQuestionIndex++;
        hienThiCauHoi(questionList.get(currentQuestionIndex));
    } else {
        JOptionPane.showMessageDialog(this, "Bạn đã xem xong câu cuối cùng, hãy kiểm tra lại bài rồi nộp bài nhé!");      
    }
    updateQuestionProgress();
    updateQuestionStatusPanel();
    }//GEN-LAST:event_btnCauSauMouseClicked

    private void btnCauTruocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCauTruocMouseClicked
        saveAnswerForCurrentQuestion();
        if (currentQuestionIndex > 0) {           
        currentQuestionIndex--;
        hienThiCauHoi(questionList.get(currentQuestionIndex));
    }
    updateQuestionProgress();
    updateQuestionStatusPanel();
    }//GEN-LAST:event_btnCauTruocMouseClicked
    private void resetRadioButtonSelection() {
    ButtonGroup group = new ButtonGroup();
    group.add(rdoA);
    group.add(rdoB);
    group.add(rdoC);
    group.add(rdoD);
    group.clearSelection();
}
    private void btnNopBaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNopBaiMouseClicked
        List<Question> unansweredQuestions = questionList.stream()
        .filter(q -> userAnswers.stream().noneMatch(a -> a.getMaCauHoi() == q.getMaCauHoi()))
        .toList();

        if (!unansweredQuestions.isEmpty()) {
        int confirm = JOptionPane.showConfirmDialog(
            this,
            "Bạn vẫn còn " + unansweredQuestions.size() + " câu chưa trả lời. Bạn có chắc chắn muốn nộp bài không?",
            "Xác nhận nộp bài",
            JOptionPane.YES_NO_OPTION
        );

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }else{
            nopBai();
        }
    }else{
        int confirm = JOptionPane.showConfirmDialog(
            this,
            "Hãy kiểm tra lại bài của mình trước khi nộp nhé! "
                    + "Bạn có chắc chắn muốn nộp bài không?",
            "Xác nhận nộp bài",
            JOptionPane.YES_NO_OPTION
        );

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }else{
            nopBai();
        }        
    }
    }//GEN-LAST:event_btnNopBaiMouseClicked
    private void nopBai() {
        if (timer != null) {
            timer.stop();         }
        int timeSpent = 60 * 60 - remainingTime; 
        try {
            double diem = calculateScore(userAnswers);
            luuBaiThi(maNguoiDung, diem, userAnswers,timeSpent);
            ghiNhatKyHoatDong(maNguoiDung, "Nộp bài thi. Điểm: " + diem);
            JOptionPane.showMessageDialog(this, "Đã nộp bài! Điểm của bạn: " + String.format("%.2f", diem));
            dispose();          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi nộp bài: " + e.getMessage());
        }
    }


    private double calculateScore(List<UserAnswer> userAnswers) {
        int correctAnswers = (int) userAnswers.stream()
                                              .filter(UserAnswer::isDungSai)
                                              .count();
        return correctAnswers * 0.2;     }
    private void startTimer() {
        timer = new Timer(1000, e -> {
            remainingTime--;
            int minutes = remainingTime / 60;
            int seconds = remainingTime % 60;
            lblThoiGian.setText(String.format("%02d:%02d", minutes, seconds));

            if (remainingTime <= 0) {
                timer.stop();
                JOptionPane.showMessageDialog(this, "Hết giờ! Bài thi sẽ được tự động nộp.");
                nopBai();
            }
        });
        timer.start();
    }
    private void updateQuestionProgress() {
        int answeredCount = (int) userAnswers.stream()
                                             .map(UserAnswer::getMaCauHoi)
                                             .distinct()
                                             .count();         lblSoCauTraLoi.setText(answeredCount + "/" + totalQuestions);
    }



    private void luuBaiThi(int maNguoiDung, double tongDiem, List<UserAnswer> userAnswers, int timeSpent) throws SQLException {
        String insertTestQuery = """
            INSERT INTO BaiThiNguoiDung (ma_nguoi_dung, thoi_gian_bat_dau, thoi_gian_ket_thuc, diem_so, tong_thoi_gian)
            VALUES (?, ?, ?, ?, ?)
            """;

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(insertTestQuery, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setInt(1, maNguoiDung);
            stmt.setTimestamp(2, new Timestamp(System.currentTimeMillis() - timeSpent * 1000));             stmt.setTimestamp(3, new Timestamp(System.currentTimeMillis()));             stmt.setDouble(4, tongDiem);
            stmt.setInt(5, timeSpent / 60); 
            stmt.executeUpdate();

                        try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    int maBaiThi = rs.getInt(1);
                    luuCauTraLoi(maBaiThi, userAnswers);
                }
            }
        }
    }

        private void luuCauTraLoi(int maBaiThi, List<UserAnswer> userAnswers) throws SQLException {
        String insertAnswerQuery = """
            INSERT INTO CauTraLoiNguoiDung (ma_bai_thi, ma_cau_hoi, ma_dap_an, dung_sai)
            VALUES (?, ?, ?, ?)
            """;

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(insertAnswerQuery)) {

            for (UserAnswer userAnswer : userAnswers) {
                stmt.setInt(1, maBaiThi);
                stmt.setInt(2, userAnswer.getMaCauHoi());
                stmt.setInt(3, userAnswer.getMaDapAn());
                stmt.setBoolean(4, userAnswer.isDungSai());
                

                stmt.addBatch();             }
            stmt.executeBatch();         }
    }

private void ghiNhatKyHoatDong(int maNguoiDung, String hanhDong) {
    String query = "INSERT INTO NhatKyHoatDong (ma_nguoi_dung, hanh_dong) VALUES (?, ?)";
    try (Connection conn = DriverManager.getConnection(url, username, password);
         PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setInt(1, maNguoiDung);
        stmt.setString(2, hanhDong);
        stmt.executeUpdate();
    } catch (SQLException e) {
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HinhNen;
    private javax.swing.JLabel btnCauSau;
    private javax.swing.JLabel btnCauTruoc;
    private javax.swing.JLabel btnNopBai;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCauHoi;
    private javax.swing.JLabel lblSoCauTraLoi;
    private javax.swing.JLabel lblThoiGian;
    private javax.swing.JPanel questionStatusPanel;
    private javax.swing.JRadioButton rdoA;
    private javax.swing.JRadioButton rdoB;
    private javax.swing.JRadioButton rdoC;
    private javax.swing.JRadioButton rdoD;
    // End of variables declaration//GEN-END:variables
}
                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ