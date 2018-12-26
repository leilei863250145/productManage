package service;

import DAO.ProductDao;
import Vo.Product;

import java.util.List;

/**
 * created by leinan
 */
public class ProductService {
    ProductDao productDao=new ProductDao();
    public List<Product> getProductList(int ProductId,String ProductName,int CatagoryId,int amount){
        if(ProductId!=-1&ProductName!=null&CatagoryId!=-1&amount!=-1){
            productDao.getProductList(ProductId,ProductName,CatagoryId,amount);
        }
        return null;
    }
}
