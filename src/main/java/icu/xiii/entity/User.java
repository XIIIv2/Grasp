package icu.xiii.entity;

public class User {

    private Address address;

    //я так и не смог понять чего хочет ДЗ :(, сделал два варианта
    public String getAddressString() {
        return "Address{" +
                "country='" + address.getCountry() + '\'' +
                ", city='" + address.getCity() + '\'' +
                ", street='" + address.getStreet() + '\'' +
                ", building='" + address.getBuilding() + '\'' +
                ", apartment='" + address.getApartment() + '\'' +
                '}';
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
