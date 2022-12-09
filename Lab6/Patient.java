package Lab6;

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
        assert address != null: "null address";
        assert phoneNumber > 0: "wrong phone number";
        assert pesel > 0: "wrong pesel";
        assert fullName != null: "null name";

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
        assert address != null: "null address";

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
        assert fullName != null: "null name";

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
        assert phoneNumber > 0: "wrong phone number";

        _phoneNumber = phoneNumber;
    }

    public int length(String fieldName)
    {
        assert fieldName == "pesel" || fieldName == "fullName" || fieldName == "phoneNumber" || fieldName == "address": "not a field";

        return switch(fieldName)
                {
                    case "pesel" -> Long.toBinaryString(_pesel).length();
                    case "fullName" -> _fullName.length();
                    case "phoneNumber" -> Long.toBinaryString(_phoneNumber).length();
                    case "address" -> _address.length("city") +
                            _address.length("streetName") +
                            _address.length("streetNumber") +
                            _address.length("country") +
                            _address.length("code");
                    default -> -1;
                };
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

    public static void main(String[] args)
    {
        //Address testAddress = new Address("Morning", 8, "", "Tamra", "Israel");

        //Patient testPatient = new Patient(-4707654959L, "Kira Grishakin", 3955175306L, testAddress);
        //Patient testPatient = new Patient(4707654959L, "Kira Grishakin", 3955175306L, null);

        //Patient testPatient = new Patient(4707654959L, "Kira Grishakin", 3955175306L, testAddress);

        //testPatient.setAddress(null);
        //testPatient.setPhoneNumber(0);
        //testPatient.length("pesel");
        //testPatient.length("firstName");
    }
}
