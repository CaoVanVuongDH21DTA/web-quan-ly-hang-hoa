package Entity;

public class Stock {
    private int maProduct;
    private String productName;
    private String donViProduct;
    private int quantity;
    private double cost;

    // Constructor
    public Stock(int maProduct, String productName, String donViProduct, int quantity, double cost) {
        this.maProduct = maProduct;
        this.productName = productName;
        this.donViProduct = donViProduct;
        this.quantity = quantity;
        this.cost = cost;
    }
    
    public Stock() {
    	
    }

    // Getters and Setters
    public int getMaProduct() { return maProduct; }
    public void setMaProduct(int maProduct) { this.maProduct = maProduct; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public String getDonViProduct() { return donViProduct; }
    public void setDonViProduct(String donViProduct) { this.donViProduct = donViProduct; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    @Override
    public String toString() {
        return "Stock{" +
                "maProduct=" + maProduct +
                ", productName='" + productName + '\'' +
                ", donViProduct='" + donViProduct + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                '}';
    }
}
