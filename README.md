# BCGK_LTTBDD

# Lập trình Ứng dụng với Kotlin và JavaFX

Dự án này là tập hợp các bài thực hành xây dựng ứng dụng Desktop GUI sử dụng ngôn ngữ **Kotlin** và thư viện **JavaFX**, được quản lý và build bằng **Maven**.

## 👨‍🎓 Thông tin sinh viên
* **Họ và tên:** [Hoàng Nguyễn Viết Quốc]
* **Mã số sinh viên:** [045205000541]
* **Lớp/Học phần:** [LTTBDD-316]
* **Ngày nộp:** [Ngày/Tháng/Năm]

## 📋 Yêu cầu hệ thống (Prerequisites)
Dựa trên cấu hình `pom.xml` của dự án:
* **OS:** Linux (Cấu hình mặc định trong pom.xml là `<javafx.platform>linux</javafx.platform>`).
* **JDK:** Java 17 (Target JVM 17).
* **Kotlin:** Version 2.2.20.
* **Maven:** Version 3.6.0 trở lên.

## 📂 Danh sách các bài thực hành

Dự án bao gồm các module minh họa các kỹ thuật sau:

### 1. Cơ bản (Basics)
* **HelloWorld.kt**: Ứng dụng Hello World cơ bản sử dụng `VBox` và `Text`.
* **Main.kt**: Minh họa vẽ hình học cơ bản (hình chữ nhật) trên `Canvas`.

### 2. Biểu đồ (Charts)
* **BarChart.kt**: Vẽ biểu đồ cột (Bar Chart) hiển thị doanh số bán hàng theo tháng.
* **LineChart.kt**: Vẽ biểu đồ đường (Line Chart) so sánh dữ liệu đa chuỗi (Nam/Nữ).

### 3. Đồ họa nâng cao (Graphics)
* **MultiTurnSpiral.kt**: Vẽ hình xoắn ốc phức tạp bằng thuật toán toán học trên `GraphicsContext`.

### 4. Hoạt ảnh (Animation)
* **Transition.kt**: Sử dụng `TranslateTransition` để di chuyển đối tượng hình học.
* **KeyFrame.kt**: Tạo hiệu ứng "Growing/Shrinking Circle" sử dụng `Timeline` và `KeyFrame`.

---

## 🚀 Hướng dẫn cài đặt và chạy (Build & Run)

### Bước 1: Cài đặt thư viện
Tại thư mục gốc của dự án, chạy lệnh sau để tải các dependencies (Kotlin 2.2.20, JavaFX 17):

mvn clean install

### Bước 2: Chạy từng bài tập

1. Chạy bài Hello World
2. Chạy bài Biểu đồ cột (Bar Chart)
3. Chạy bài Biểu đồ đường (Line Chart)
4. Chạy bài Vẽ hình xoắn ốc (Spiral)
5. Chạy bài Animation (KeyFrame)
6. Chạy bài Transition
7. Chạy bài Vẽ Canvas cơ bản
