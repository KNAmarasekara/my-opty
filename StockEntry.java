

import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("STOCK_ENTRY")
public class StockEntry {
    @Id
    private Integer entryId;
    private int quantityChange;
    private LocalDate entryDate;
    private Integer frameId;
    private Integer lensId;

    protected StockEntry() {}

    public Integer getEntryId() {
           return entryId;
    }

    public int getQuantityChange() {
            return quantityChange;
    }

    public LocalDate getEntryDate() {
            return entryDate;
    }

    public Integer getFrameId() {
           return frameId;
    }

    public Integer getLensId() {
           return lensId;
     }
}
