
public class Address {
    private String street;
    private String district;
    private String state;

    public Address(String street, String district, String state) {
        this.street = street;
        this.district = district;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String toString() {
        return street + " , " + district + " , " + state;
    }
}
