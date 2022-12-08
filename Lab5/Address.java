package Lab5;

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
}