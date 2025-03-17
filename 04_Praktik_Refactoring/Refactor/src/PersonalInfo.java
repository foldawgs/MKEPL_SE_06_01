import java.util.Date;

public class PersonalInfo extends ContactInfo {
    private String birthCity;
    private Date birthDate;

    public PersonalInfo(String name, String address, String phone, String birthCity, Date birthDate) {
        super(name, address, phone);
        this.birthCity = birthCity;
        this.birthDate = birthDate;
    }

    public String getBirthCity() { return birthCity; }
    public void setBirthCity(String birthCity) { this.birthCity = birthCity; }

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }
}
