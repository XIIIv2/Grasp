package icu.xiii;

import icu.xiii.entity.Address;
import icu.xiii.entity.User;

public class Main {

    public static void main(String[] args) {
        Address address = new Address("Ukraine",
                "Chernomorsk",
                "Parkovaya", "44", "41");

        User user = new User();
        user.setAddress(address);

        System.out.println(user.getAddress());
        System.out.println(user.getAddressString());
    }
}
