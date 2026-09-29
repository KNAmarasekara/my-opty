

import java.math.BigDecimal;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("FRAME")
public class Frame {
       @Id
       private Integer frameId;
       private String model;
       private String color;
       private BigDecimal price;
       private Int stockQty;
       private Int categoryId;
 
       protected Frame() {}   //for spring data to create empty Frame object

       public Frame(String model, String color, String material, BigDecimal price) {
              this.model = model;
              this.color = color;
              this.material = material;
              this.price = price;
              this.stockQty = 0;    //real quantity come through stock service
       }

       //doesn't actual change the stock values here. it's implementeed here only for the code to  run as a saftey prcaution
       public void updateStock(int delta) {                 //delta is the change. ex:- sale is -1, new stock is +10
              if (stockQty + delta < 0) {
                  throw new IllegalArgument ("Stock cannot be negative value...");
              }
              stockQty += delta;
       }

       public Integer getFrameId() {
              return frameID;
       }

       public String getModel() {
              return model;
       }
  
       public String getColor() {
              return color;
       }

       public BigDecimal getPrice() {
              return price;
       }

       public int getStockQty() {
              return stockQty;
       }

       public int getCategoryId() {
              return categoryId;
       }
}

