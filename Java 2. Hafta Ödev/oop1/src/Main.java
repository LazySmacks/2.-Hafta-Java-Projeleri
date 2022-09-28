public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade oranı";

        Product product1 = new Product();
// set value = değer atamak
        product1.setName("Delonghi kahve makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");
        //yazmak içn set okumak için get yapıyoruz
        // get ise ekrana getirmek anlamında
        //System.out.println(product1.name);

        Product product2 = new Product();

        product2.setName("Semg kahve makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image1.jpg");

        Product product3 = new Product();

        product3.setName("Kitchen kahve makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image1.jpg");

        Product[] products = {product1, product2, product3};
        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");
        IndividualCustomer individualCustomer1 = new IndividualCustomer();
        individualCustomer1.setId(1);
        individualCustomer1.setPhone("564456456456");
        individualCustomer1.setCustomerNumber("12315");
        individualCustomer1.setFirstName("Çağatay");
        individualCustomer1.setLastName("Özdemir");
        System.out.println(individualCustomer1.getCustomerNumber());

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("13456545654");
        corporateCustomer.setCustomerNumber("6564564");
        corporateCustomer.setTaxNumber("556456546");

        Customer [] customers = {individualCustomer1, corporateCustomer};
    }
}