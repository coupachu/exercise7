import java.util.ArrayList;

public class ContactBook {
    private ArrayList<Contact> contactList = new ArrayList<>();

    public ContactBook(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }

    public void display() {
        for (Contact i : this.contactList){
            i.display();
        }
}
    public void addContact(Contact a){
        this.contactList.add(a);
    }
}
