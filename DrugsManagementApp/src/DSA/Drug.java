package DSA;
import java.util.Date;
public class Drug {
    private int id;
    private String name;
    private Date expiry;
    private Category category;
    private Type type;

    public Drug(int id, String name, Date expiry, Category category, Type type){
        this.id = id;
        this.name = name;
        this.expiry = expiry;
        this.category = category;
        this.type = type;
    }
}
