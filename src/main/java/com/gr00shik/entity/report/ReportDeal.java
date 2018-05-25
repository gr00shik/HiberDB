package com.gr00shik.entity.report;

public class ReportDeal {

    private String productName;

    private Long price;

    private String firstName;

    private String secondName;


    public ReportDeal(String productName, Long price, String firstName, String secondName) {
        this.productName = productName;
        this.price = price;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "ReportDeal{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
