package src;
import javax.print.DocFlavor.STRING;

public class Finance {

    private String name;
    private String source;
    private Integer quantity;


    public Finance (String name, String source, Integer quantity){
        this.name = name;
        this.source = source;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSource(){
        return source;
    }
    public void setSource(String source){
        this.source = source;
    }

    public Integer getQuantity(){
        return quantity;
    }
    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    
}
