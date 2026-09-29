


import java.math.BigDecimal;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("LENS")
public class Lens{
       @Id
       private integer lensId;
       private String type;
       private String coating;
       private BigDecimal price;
       private int stockQty;
       private int categoryId;

       protected Lens() {}    ////for spring data to create empty Lens object

       public Lens(String type, String coating, BigDecimal price, int categoryId) {
              this.type = type;
              this.coating = coating;
              this.price = price;
              this.categoryId = categoryId;
              this.stockQty = 0;
       }

       //doesn't actual make changes to the stock. written here so the  code get updated with the data
       public void updateStock(int delta){            //delta is the changes
              if(stockQty + delta < 0) {
                throw new IllegalArgument("Stock cannot be negative value....");
              }
              stockQty += delta;
       }

       public Integer getLensId() {
              return lensId;
       }

       public String getType() {
              return type;
       }

       public String getCoating() {
              return coating;
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
