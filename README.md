# ENGCHECK - Website Luyện Thi Tiếng Anh Trực Tuyến

## Mô Tả Dự Án
**ENGCHECK** là một website luyện thi tiếng Anh trực tuyến được phát triển bởi nhóm **Chill Group**, nhằm cung cấp cho người dùng một nền tảng học tập an toàn, tiện lợi và hiệu quả. Dự án tập trung vào việc hỗ trợ người dùng luyện thi tiếng Anh với các bài thi trực tuyến, tích hợp các tính năng bảo mật cao cấp như đăng nhập OTP, CAPTCHA, và quản lý tài khoản người dùng.

Ứng dụng này sử dụng Java (phát triển trên NetBeans IDE) kết hợp với cơ sở dữ liệu SQL Server để lưu trữ và quản lý thông tin tài khoản, hồ sơ học sinh/thí sinh, và bài thi.

## Tính Năng Chính
1. **Đăng nhập an toàn**:
   - **Mã hóa mật khẩu**: Sử dụng thuật toán RSA kết hợp AES để mã hóa mật khẩu trước khi lưu trữ.
   - **Xác thực OTP qua email**: Sau khi nhập tài khoản và mật khẩu, hệ thống gửi mã OTP qua email để xác thực người dùng.
   - **Đăng nhập nhanh qua OTP Authenticator**: Sử dụng Google Authenticator để đăng nhập nhanh qua QR Code và secret key.
   - **Xác thực CAPTCHA**: Ngăn chặn truy cập tự động từ bot bằng cách yêu cầu người dùng giải CAPTCHA.

2. **Quản lý tài khoản người dùng**:
   - Lưu trữ thông tin tài khoản, bao gồm tên đăng nhập, mật khẩu (mã hóa), họ tên, ngày sinh, và số CCCD.
   - Chỉ cho phép người dùng đã đăng ký và có tài khoản hợp lệ mới có thể đăng nhập.

3. **Quản lý bài thi**:
   - Lưu trữ thông tin bài thi, câu hỏi, câu trả lời, điểm số và thời gian làm bài.
   - Người dùng có thể bắt đầu bài thi và hệ thống tự động tính thời gian.
   - Hệ thống sẽ kết thúc bài thi khi hết giờ hoặc khi người dùng nhấn "Nộp bài".
   - Tính năng giám sát hành vi gian lận trong quá trình làm bài.

4. **Giám sát hành vi người dùng**:
   - Phát hiện và cảnh báo khi người dùng rời khỏi cửa sổ bài thi để tìm kiếm thông tin bên ngoài.
   - Sau 5 lần chuyển cửa sổ, hệ thống sẽ hiển thị cảnh báo. Nếu vi phạm lặp lại, bài thi sẽ bị hủy tự động.

## Cách Thức Thực Hiện
1. **Quản lý tài khoản và đăng nhập**:
   - **Mã hóa mật khẩu**: Sử dụng RSA kết hợp với AES để bảo mật mật khẩu.
   - **Xác thực OTP**: Gửi mã OTP qua email và sử dụng Google Authenticator để đăng nhập nhanh.
   - **Xác thực CAPTCHA**: Đảm bảo chỉ người dùng thật truy cập hệ thống.

2. **Quản lý bài thi và lịch sử**:
   - **Bài thi**: Hệ thống lưu trữ câu hỏi, đáp án và tính điểm tự động.
   - **Giám sát**: Theo dõi hoạt động của người dùng trong suốt quá trình thi.

## Công Nghệ Sử Dụng
- **Ngôn ngữ lập trình**: Java (phát triển trên NetBeans IDE).
- **Cơ sở dữ liệu**: SQL Server.
- **Mã hóa**: Thuật toán RSA kết hợp AES.
- **Xác thực OTP**: JavaMail API để gửi mã OTP qua email.
- **Đăng nhập OTP Authenticator**: Google Authenticator.
- **CAPTCHA**: Google reCAPTCHA hoặc CAPTCHA tự xây dựng bằng Java.

## Các Kết Quả Chính Dự Kiến
- Cung cấp môi trường thi trực tuyến an toàn và bảo mật cho người dùng.
- Đảm bảo tính chính xác và công bằng trong quá trình chấm điểm bài thi.
- Giúp người dùng luyện thi tiếng Anh một cách tiện lợi, dễ dàng và hiệu quả.
  
## Lý Thuyết Liên Quan
1. **Mã hóa mật khẩu**:
   - **RSA và AES**: RSA là thuật toán mã hóa công khai, còn AES là thuật toán mã hóa đối xứng hiện đại. Sử dụng kết hợp để đảm bảo bảo mật cho mật khẩu người dùng.
   
2. **OTP (One-Time Password)**:
   - Là mật khẩu chỉ sử dụng một lần để bảo vệ tài khoản người dùng, tăng cường bảo mật hệ thống.

3. **QR Code**:
   - QR Code giúp người dùng đăng ký secret key cho OTP Authenticator, hỗ trợ việc đăng nhập nhanh chóng.

4. **CAPTCHA**:
   - CAPTCHA phân biệt người dùng thật và bot tự động bằng cách yêu cầu giải các câu hỏi đơn giản hoặc nhập chuỗi ký tự.

## Các Tình Huống Thực Nghiệm
1. **Đăng nhập và bảo mật**:
   - Người dùng nhập tài khoản và mật khẩu, sau đó hệ thống gửi mã OTP qua email để xác thực.

2. **Thực hiện bài thi**:
   - Người dùng nhấn "Bắt đầu" để làm bài thi. Hệ thống sẽ theo dõi thời gian và tính điểm tự động.

3. **Đăng nhập qua QR Code**:
   - Người dùng đăng ký secret key bằng cách quét QR Code trên OTP Authenticator để đăng nhập nhanh.

4. **Xác thực CAPTCHA**:
   - Trước khi đăng nhập, hệ thống yêu cầu người dùng giải CAPTCHA để xác nhận họ là người thật.

## Cài Đặt và Sử Dụng
### Yêu Cầu Hệ Thống
- **Hệ điều hành**: Windows.
- **Phần mềm phát triển**: NetBeans IDE.
- **Cơ sở dữ liệu**: SQL Server.
- **Java**: JDK 8 hoặc phiên bản cao hơn.
