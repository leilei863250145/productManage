package Vo;

/**
 * created by leinan
 */
public class Product {
    int ProductId;
    String ProductName;
    int CatagoryId;
    int amount;
    String deatils;


    public Product(int productId, String productName, int catagoryId, int amount,String deatils) {
        ProductId = productId;
        ProductName = productName;
        CatagoryId = catagoryId;
        this.amount = amount;
        this.deatils=deatils;
    }
}
