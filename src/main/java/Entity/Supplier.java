package Entity;

//Rename class to SupplierEntity or another name to avoid conflict
public class Supplier {
 private int maNcc;
 private String tenNcc;
 private String thongTinXuLySuVu;
 private String dieuKienDoiTra;

 // Constructor
 public Supplier(int maNcc, String tenNcc, String thongTinXuLySuVu, String dieuKienDoiTra) {
     this.maNcc = maNcc;
     this.tenNcc = tenNcc;
     this.thongTinXuLySuVu = thongTinXuLySuVu;
     this.dieuKienDoiTra = dieuKienDoiTra;
 }

 // Getter and Setter methods
 public int getMaNcc() { return maNcc; }
 public String getTenNcc() { return tenNcc; }
 public String getThongTinXuLySuVu() { return thongTinXuLySuVu; }
 public String getDieuKienDoiTra() { return dieuKienDoiTra; }
}
