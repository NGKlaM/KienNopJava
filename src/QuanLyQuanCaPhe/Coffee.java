package QuanLyQuanCaPhe;

public class Coffee {
  private int maSanPham;
  private String tenSp;
  private double giaSanPham;
  private String loaiSanPham;
  private int soLuong;
  private int ngaySanXuat;

    public Coffee(int maSanPham, String tenSp, double giaSanPham, String loaiSanPham, int soLuong, int ngaySanXuat) {
        this.maSanPham = maSanPham;
        this.tenSp = tenSp;
        this.giaSanPham = giaSanPham;
        this.loaiSanPham = loaiSanPham;
        this.soLuong = soLuong;
        this.ngaySanXuat = ngaySanXuat;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(int ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public void inThongTinQuanCaPhe() {

        System.out.println("Thong tin quan ca phe: ");
        System.out.println("Mã sản phẩm là: " + maSanPham + "- Tên sản phẩm là: " + tenSp + "- Giá sản phẩm là: " + giaSanPham + "- Loại sản phẩm là: " + loaiSanPham + "- Số lượng sản phẩm là: " + soLuong+"-Ngày sản xuất là:"+ngaySanXuat);
    }
}
