public class Product {

    public Product(int id, String name, String description, double price, int stockAmount, String renk){
        System.out.println("Yapıcı Blok Çalıştı");
        this.id=id;
        this.renk=renk;
        this.name=name;
        this.price=price;
        this.description=description;
        this.stockAmount=stockAmount;
    }
    public Product(){

    }

    private int id;
    private String name;
    private String description;
      double price;
     private int stockAmount;
     private String renk;
     private String kod;

// getter bloğu
    public int getId(){
        return id;
    }
    //setter bloğu
    public void setId(int id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double get_price() {
        return price;
    }

    public void set_price(double _price) {
        this.price = _price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) +id;
    }

    }

