package Entity;

import java.util.Date;

public class Product {
    private int maProduct; // mã sản phẩm
    private String productName; // tên sản phẩm
    private String donViProduct; // đơn vị tính
    private int quantity; // số lượng
    private Date expiryDate; // hạn sử dụng
    private int remainingDays; // số ngày còn lại
    private int returnPolicy; // điều kiện đổi trả

    // Constructor
    public Product(int maProduct, String productName, String donViProduct, int quantity, Date expiryDate, int remainingDays, int returnPolicy) {
        this.maProduct = maProduct;
        this.productName = productName;
        this.donViProduct = donViProduct;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.remainingDays = remainingDays;
        this.returnPolicy = returnPolicy;
    }

    // Getters and Setters
    public int getMaProduct() {
        return maProduct;
    }

    public void setMaProduct(int maProduct) {
        this.maProduct = maProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDonViProduct() {
        return donViProduct;
    }

    public void setDonViProduct(String donViProduct) {
        this.donViProduct = donViProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getRemainingDays() {
        return remainingDays;
    }

    public void setRemainingDays(int remainingDays) {
        this.remainingDays = remainingDays;
    }

    public int getReturnPolicy() {
        return returnPolicy;
    }

    public void setReturnPolicy(int returnPolicy) {
        this.returnPolicy = returnPolicy;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Product{" +
                "maProduct=" + maProduct +
                ", productName='" + productName + '\'' +
                ", donViProduct='" + donViProduct + '\'' +
                ", quantity=" + quantity +
                ", expiryDate=" + expiryDate +
                ", remainingDays=" + remainingDays +
                ", returnPolicy=" + returnPolicy +
                '}';
    }
}
