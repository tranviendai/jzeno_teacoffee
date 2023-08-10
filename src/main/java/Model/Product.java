
package Model;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    public String name;
    public double price;
    public String image;
    public String size;
    public Category category;

    public Product(){}

    public Product(String id, String name, double price, String image, String size, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.size = size;
        this.category = category;
    }
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }
 public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
  
    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    
}
