package Entity;

import java.util.Date;

public class Bill_sale {

    private int mabill;

    private Date date;

    private String time;

    private String barcode;

    private int maProduct;

    private String productName;

    private String donViProduct;

    private int quantity;

    private double price;

    private double discount;

    private double priceTruocThue;

    private double thueSuatGTGT;

    private double tienThueGTGT;

    private double totalAmount;
    
    private double thu2;
    private double thu3;
    private double thu4;
    private double thu5;
    private double thu6;
    private double thu7;
    private double cn;
    private double tongCong;
    private double tuanTruoc;

    private double totalValue;
    
    private String formattedTotalValue;
    
    private String thu2Formatted, thu3Formatted, thu4Formatted, thu5Formatted, thu6Formatted, thu7Formatted, cnFormatted, tongCongFormatted, tuanTruocFormatted;
    
    // Getter and Setter methods
    
    public int getMabill() {
        return mabill;
    }

    public void setMabill(int mabill) {
        this.mabill = mabill;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPriceTruocThue() {
        return priceTruocThue;
    }

    public void setPriceTruocThue(double priceTruocThue) {
        this.priceTruocThue = priceTruocThue;
    }

    public double getThueSuatGTGT() {
        return thueSuatGTGT;
    }

    public void setThueSuatGTGT(double thueSuatGTGT) {
        this.thueSuatGTGT = thueSuatGTGT;
    }

    public double getTienThueGTGT() {
        return tienThueGTGT;
    }

    public void setTienThueGTGT(double tienThueGTGT) {
        this.tienThueGTGT = tienThueGTGT;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    public double getThu2() {
        return thu2;
    }

    public void setThu2(double thu2) {
        this.thu2 = thu2;
    }

    public double getThu3() {
        return thu3;
    }

    public void setThu3(double thu3) {
        this.thu3 = thu3;
    }

    public double getThu4() {
        return thu4;
    }

    public void setThu4(double thu4) {
        this.thu4 = thu4;
    }

    public double getThu5() {
        return thu5;
    }

    public void setThu5(double thu5) {
        this.thu5 = thu5;
    }

    public double getThu6() {
        return thu6;
    }

    public void setThu6(double thu6) {
        this.thu6 = thu6;
    }

    public double getThu7() {
        return thu7;
    }

    public void setThu7(double thu7) {
        this.thu7 = thu7;
    }

    public double getCn() {
        return cn;
    }

    public void setCn(double cn) {
        this.cn = cn;
    }

    public double getTongCong() {
        return tongCong;
    }

    public void setTongCong(double tongCong) {
        this.tongCong = tongCong;
    }

    public double getTuanTruoc() {
        return tuanTruoc;
    }

    public void setTuanTruoc(double tuanTruoc) {
        this.tuanTruoc = tuanTruoc;
    }
    
    public String getThu2Formatted() {
        return thu2Formatted;
    }

    public void setThu2Formatted(String thu2Formatted) {
        this.thu2Formatted = thu2Formatted;
    }

    public String getThu3Formatted() {
        return thu3Formatted;
    }

    public void setThu3Formatted(String thu3Formatted) {
        this.thu3Formatted = thu3Formatted;
    }

    public String getThu4Formatted() {
        return thu4Formatted;
    }

    public void setThu4Formatted(String thu4Formatted) {
        this.thu4Formatted = thu4Formatted;
    }

    public String getThu5Formatted() {
        return thu5Formatted;
    }

    public void setThu5Formatted(String thu5Formatted) {
        this.thu5Formatted = thu5Formatted;
    }

    public String getThu6Formatted() {
        return thu6Formatted;
    }

    public void setThu6Formatted(String thu6Formatted) {
        this.thu6Formatted = thu6Formatted;
    }

    public String getThu7Formatted() {
        return thu7Formatted;
    }

    public void setThu7Formatted(String thu7Formatted) {
        this.thu7Formatted = thu7Formatted;
    }

    public String getCnFormatted() {
        return cnFormatted;
    }

    public void setCnFormatted(String cnFormatted) {
        this.cnFormatted = cnFormatted;
    }

    public String getTongCongFormatted() {
        return tongCongFormatted;
    }

    public void setTongCongFormatted(String tongCongFormatted) {
        this.tongCongFormatted = tongCongFormatted;
    }

    public String getTuanTruocFormatted() {
        return tuanTruocFormatted;
    }

    public void setTuanTruocFormatted(String tuanTruocFormatted) {
        this.tuanTruocFormatted = tuanTruocFormatted;
    }
    
    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
    
 // Getter and setter for formattedTotalValue
    public String getFormattedTotalValue() {
        return formattedTotalValue;
    }

    public void setFormattedTotalValue(String formattedTotalValue) {
        this.formattedTotalValue = formattedTotalValue;
    }

	@Override
	public String toString() {
		return "Bill_sale [mabill=" + mabill + ", date=" + date + ", time=" + time + ", barcode=" + barcode
				+ ", maProduct=" + maProduct + ", productName=" + productName + ", donViProduct=" + donViProduct
				+ ", quantity=" + quantity + ", price=" + price + ", discount=" + discount + ", priceTruocThue="
				+ priceTruocThue + ", thueSuatGTGT=" + thueSuatGTGT + ", tienThueGTGT=" + tienThueGTGT
				+ ", totalAmount=" + totalAmount + ", thu2=" + thu2 + ", thu3=" + thu3 + ", thu4=" + thu4 + ", thu5="
				+ thu5 + ", thu6=" + thu6 + ", thu7=" + thu7 + ", cn=" + cn + ", tongCong=" + tongCong + ", tuanTruoc="
				+ tuanTruoc + ", totalValue=" + totalValue + "]";
	}
    
}

