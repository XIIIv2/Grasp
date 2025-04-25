package icu.xiii;

public class User {

    private Address address;

    /*
    я так и не смог понять чего хочет ДЗ :(
    public String getAddress() {
        return "Address{" +
                "country='" + address.getCountry() + '\'' +
                ", city='" + address.getCity() + '\'' +
                ", street='" + address.getStreet() + '\'' +
                ", building='" + address.getBuilding() + '\'' +
                ", apartment='" + address.getApartment() + '\'' +
                '}';
    }*/

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
