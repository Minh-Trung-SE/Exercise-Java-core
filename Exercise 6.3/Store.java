import java.util.Arrays;

public class Store {
    private String nameStore;
    private String addressStore;
    private SmartPhone[] phones;

    public String getNameStore() {
        return nameStore;
    }

    public Store(String nameStore, String addressStore, SmartPhone[] phones) {
        this.nameStore = nameStore;
        this.addressStore = addressStore;
        this.phones = phones;
    }

    public Store(String nameStore, String addressStore) {
        this.nameStore = nameStore;
        this.addressStore = addressStore;
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public String getAddressStore() {
        return addressStore;
    }

    public void setAddressStore(String addressStore) {
        this.addressStore = addressStore;
    }

    public SmartPhone[] getPhones() {
        return phones;
    }

    public void setPhones(SmartPhone[] phones) {
        this.phones = phones;
    }

    public int getSold(){
        int count = 0;
        for (SmartPhone element: phones) {
            count += element.getTotalSold();
        }
        return count;
    }

    public long getTotalRevenue(){
        int price = 0;
        for (SmartPhone element: phones) {
            price += (element.getPrice() * element.getTotalSold())  ;
        }
        return price;
    }

    @Override
    public String toString() {
        return "\nNameStore: " + nameStore +
                "\nAddressStore: " + addressStore +
                "\nList phone:\n" + Arrays.toString(phones);
    }
}
