package com.softserve.edu08.pt;

public class Departament {

    public static void main(String[] args) {
        var address = new Address();
        var departament = new Departament();
        String x = address.setCity("City -> Vyshgorod");
        int as = address.setBf(4);
        String ad = address.setStreet("Street -> Kiyvka");
        String sn = departament.setName("Home -> Stars");
        System.out.println(departament.setAdress("Full adress: " + x + " " + ad + " " + as + " " + sn));
        String xx = address.setCity("City -> Kyiv");
        int ass = address.setBf(2);
        String add = address.setStreet("Street -> Vyshgorodska");
        String snn = departament.setName("Home -> Independence");
        System.out.println(departament.setAdress("Full adress: " + xx + " " + add + " " + ass + " " + snn));

    }

    private String name;
    private String adress;


    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String setAdress(String adress) {
        this.adress = adress;
        return adress;
    }

    static class Address {
        String city;
        String street;
        int bf;

        public String setCity(String city) {
            this.city = city;
            return city;
        }

        public String setStreet(String street) {
            this.street = street;
            return street;
        }


        public int setBf(int bf) {
            this.bf = bf;
            return bf;
        }
    }
}
