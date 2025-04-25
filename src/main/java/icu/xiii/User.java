package icu.xiii;

public class User {

    private Address address;

    public String getAddress() {
        return "Address{" +
                "country='" + address.getCountry() + '\'' +
                ", city='" + address.getCity() + '\'' +
                ", street='" + address.getStreet() + '\'' +
                ", building='" + address.getBuilding() + '\'' +
                ", apartment='" + address.getApartment() + '\'' +
                '}';
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
