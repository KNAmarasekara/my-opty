


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("CATEGORY")
public class Category {
    @Id
    private Integer categoryId;
    private String name;

    protected Category() {}  

    public Category(String name) { 
           this.name = name;
    }

    public Integer getCategoryId() { 
           return categoryId; 
    }

    public String getName() { 
           return name; 
    }
}
