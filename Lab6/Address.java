package Lab6;

/** Klasa reprezentująca adres zamieszkania */
public final class Address {
    /** Podstawowy konstruktor klasy Address
     * @param streetName nazwa ulicy
     * @param streetNumber numer budynku
     * @param code kod pocztowy
     * @param city miasto
     * @param country kraj
     */
    public Address(String streetName, int streetNumber, String code, String city, String country)
    {
        assert streetName != null: "null name";
        assert streetNumber > 0: "wrong street number";
        assert code != null: "null postal code";
        assert city != null: "null city";
        assert country != null: "null country";

        _streetName = streetName;
        _city = city;
        _streetNumber = streetNumber;
        _country = country;
        _code = code;
    }

    /** Getter for streetName variable
     * @return returns street name
     */
    public String getStreetName()
    {
        return _streetName;
    }

    /** Getter city variable
     * @return returns city
     */
    public String getCity()
    {
        return _city;
    }

    /** Getter for streetNumber variable
     * @return returns street number
     */
    public int getStreetNumber()
    {
        return _streetNumber;
    }

    /** Getter for country variable
     * @return returns country
     */
    public String getCountry()
    {
        return _country;
    }

    /** Getter for code variable
     * @return returns postal code
     */
    public String getCode()
    {
        return _code;
    }

    /** Returns String representing Address object */
    @Override public String toString()
    {
        return _streetName + "," + String.valueOf(_streetNumber) + "," + String.valueOf(_code) + "," + _city + "," + _country;
    }

    public int length(String fieldName)
    {
        assert fieldName == "city" || fieldName == "streetName" || fieldName == "streetNumber" || fieldName == "country" || fieldName == "code": "not a field";

        return switch(fieldName)
                {
                    case "city" -> _city.length();
                    case "streetName" -> _streetName.length();
                    case "streetNumber" -> Integer.toBinaryString(_streetNumber).length();
                    case "country" -> _country.length();
                    case "code" -> _code.length();
                    default -> -1;
                };
    }

    /** street name */
    private final String _streetName;
    /** city */
    private final String _city;
    /** street number */
    private final int _streetNumber;
    /** country */
    private final String _country;
    /** postal code*/
    private final String _code;

    public static void main(String[] args)
    {
        //Address testAddress = new Address("Morning", 8, "", "Tamra", "Israel");

        //Address testAddress = new Address(null, 8, "", "Tamra", "Israel");
        //Address testAddress = new Address("Morning", -8, "", "Tamra", "Israel");

        //testAddress.length("region");
    }
}