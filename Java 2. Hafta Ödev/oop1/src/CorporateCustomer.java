public class CorporateCustomer extends Customer{
    private String companyName;
    private String taxNumber;

    public String getCompanyName() {
        return companyName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLastName() {
        return taxNumber;
    }

    public void setLastName(String lastName) {
        this.taxNumber = lastName;
    }
}
