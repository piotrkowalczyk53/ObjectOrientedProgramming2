package Lab5;

/** Klasa reprezentująca pacjenta */
public class Patient {
    /** Podstawowy konstruktor klasy Patient
     * @param pesel nr pesel
     * @param fullName imie i nazwisko pacjenta
     * @param phoneNumber nr telefonu
     * @param address adres pacjenta
     */
    public Patient(long pesel, String fullName, long phoneNumber, Address address)
    {
        _pesel = pesel;
        _address = address;
        _fullName = fullName;
        _phoneNumber = phoneNumber;
    }
    /** Getter for pesel variable
     * @return returns patient's pesel
     */
    public long GetPesel()
    {
        return _pesel;
    }

    /** Getter for address variable
     * @return returns patient's address
     */
    public Address GetAddress()
    {
        return _address;
    }

    /** Setter for address variable
     * @param address new adress
     */
    public void SetAddress(Address address)
    {
        _address = address;
    }

    /** Getter for fullName variable
     * @return returns patient's first and last names
     */
    public String GetFullName()
    {
        return _fullName;
    }

    /** Setter for fullName variable
     * @param fullName new first and last names
     */
    public void SetFullName(String fullName)
    {
        _fullName = fullName;
    }

    /** Getter for phoneNumber variable
     * @return returns patient's phone number
     */
    public long GetPhoneNumber()
    {
        return _phoneNumber;
    }

    /** Setter for phoneNumber variable
     * @param phoneNumber new phone number
     */
    public void SetPhoneNumber(long phoneNumber)
    {
        _phoneNumber = phoneNumber;
    }

    /** Returns String representing Patient object */
    @Override public String toString()
    {
        return String.valueOf(_pesel) + "," + _fullName+"," + String.valueOf(_phoneNumber) + "," + _address.toString();
    }

    /** patient's pesel number */
    private final long _pesel;
    /** patient's address */
    private Address _address;
    /** patient's first and last names */
    private String _fullName;
    /** patient's phone number */
    private long _phoneNumber;
}
