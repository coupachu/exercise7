public class BusinessContact extends Contact{
    private String phoneNumber;

    public BusinessContact(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void display() {
        System.out.println("Name: " + this.getName() + " Email: " + this.getEmail() + " Phone Number: " + this.getPhoneNumber());
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + this.getName() + '\'' +
                ", email='" + this.getEmail() + '\'' +"BusinessContact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
