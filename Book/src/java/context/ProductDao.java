/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import entity.Account;
import entity.Category;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dinhg
 */
public class ProductDao extends DBContext {

    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select * from product";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7)));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public List<Category> getCategory() {
        List<Category> list = new ArrayList<>();
        String query = "select * from category";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public List<Product> getProductByCID(String cid) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product where cateID = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7)));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public Product getProductByID(String pid) {
        String query = "select * from product where id = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7));
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public List<Product> searchByByName(String txtSearch) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product where [name] like ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7)));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public Account login(String user, String pass) {
        String query = "select * from Account \n"
                + "where [user] = ? \n"
                + "and pass = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public Account checkAccountExit(String user) {
        String query = "select * from Account \n"
                + "where [user] = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public void signup(String user, String pass) {
        String query = "insert into Account values (?,?,0,0)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public List<Product> getProductBySellID(int id) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product where sell_ID = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7)));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public void deleteProduct(String pid) {
        String query = "delete from product where id = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insertProduct(String name, String author, String image, String price, String titlecategory, String description, String category, int sid) {
        String query = "INSERT [dbo].[product] ([name],[author] ,[image], [price], [category], [description], [cateID], [sell_ID]) \n"
                + "VALUES (?,?,?,?,?,?,?,?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, author);
            ps.setString(3, image);
            ps.setString(4, price);
            ps.setString(5, titlecategory);
            ps.setString(6, description);
            ps.setString(7, category);
            ps.setInt(8, sid);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public void edittProduct(String name, String author, String image, String price, String titlecategory, String description, String category, String pid) {
        String query = "update product set [name] = ?,\n"
                + "[author] = ?,\n"
                + "[image] = ?,\n"
                + "[price] = ?,\n"
                + "[category] = ?,\n"
                + "[description] = ?,\n"
                + "[cateID] = ?\n"
                + "where id = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, author);
            ps.setString(3, image);
            ps.setString(4, price);
            ps.setString(5, titlecategory);
            ps.setString(6, description);
            ps.setString(7, category);
            ps.setString(8, pid);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }

    //Phân trang 
    public int getCount() {
        List<Product> list = new ArrayList<>();
        String query = "select COUNT(id) From product";
        int count = 0;
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException e) {

        }
        return count;
    }

    public List<Product> getProduct(int index) {
        List<Product> list = new ArrayList<>();
        String query = "select * from (select ROW_NUMBER() over (order by id asc) as r,\n"
                + "* from product) as x where r between ?*4-3 and ?*4";
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, index);
            ps.setInt(2, index);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7)));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    //cart
    public void insertProductCart(String accountID, String productID, String name, String quantity, String price, String total) {
        String query = "INSERT [dbo].[cart] ([AccountID],[ProductID] ,[ProductName], [Quantity], [Amount], [Total]) \n"
                + "VALUES (?,?,?,?,?,?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, accountID);
            ps.setString(2, productID);
            ps.setString(3, name);
            ps.setString(4, quantity);
            ps.setString(5, price);
            ps.setString(6, total);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public void deleteProductCart(String sid) {
        String query = "delete from Cart where AccountID = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, sid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        ProductDao dao = new ProductDao();
        List<Product> list = dao.getAllProduct();
        List<Category> listC = dao.getCategory();
        List<Product> listPaging = dao.getProduct(1);
        for (Product o : listPaging) {
            System.out.println(o);
        }
    }
}
