package DSA;
import java.util.Date;
public class Drug {
    private int id;
    private String name;
    private Date expiry;
    private Category category;
    private Type type;

    public Drug(int id, String name, Date expiry, Category category, Type type) {
        this.id = id;
        this.name = name;
        this.expiry = expiry;
        this.category = category;
        this.type = type;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Date getExpiry() {
        return expiry;
    }
    public Category getCategory() {
        return category;
    }
    public Type getType() {
        return type;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public void setType(Type type) {
        this.type = type;
    }
}
