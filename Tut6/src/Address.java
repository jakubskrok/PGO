public class Address {

    public String country;
    public String city;
    public int postalCode;
    public String streetName;
    public int houseNumber;

    public String createAddress (String country){
        return String.format(country);
    }

    public String createAddress (String city, String country){
        return String.format(city, country);
    }

    public String createAddress (String city, String country, int postalCode){
        return String.format(city, country, postalCode);
    }

    public String createAddress (String streetName, String city, String country, int postalCode) {
        return String.format(streetName, city, country, postalCode);
    }

    public String createAddress (String country, String city,int postalCode, String streetName,int houseNumber){
            return String.format(country, city, postalCode, streetName, houseNumber);
    }
}

