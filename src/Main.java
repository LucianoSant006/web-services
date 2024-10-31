import model.entites.Address;
import model.services.AddressQuery;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite com O Cep");
        String json = sc.nextLine();
        Address ad = null;
        AddressQuery aq = new AddressQuery();
        Object x = aq.conver(ad,json);
        System.out.println(x);
        System.out.println(ad.bairro());
    }
}