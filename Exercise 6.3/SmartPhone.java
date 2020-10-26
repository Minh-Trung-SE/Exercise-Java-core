public class SmartPhone {
   private String brand;
   private boolean hasBluetooth;
   private boolean has5G;
   private boolean hasWift;
   private String os;
   private int memory;
   private String color;
   private long price;
   private int totalSold;

    public SmartPhone(String brand, boolean hasBluetooth, boolean has5G, boolean hasWift, String os, int memory, String color, long price, int totalSold) {
        this.brand = brand;
        this.hasBluetooth = hasBluetooth;
        this.has5G = has5G;
        this.hasWift = hasWift;
        this.os = os;
        this.memory = memory;
        this.color = color;
        this.price = price;
        this.totalSold = totalSold;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    public boolean isHasWift() {
        return hasWift;
    }

    public void setHasWift(boolean hasWift) {
        this.hasWift = hasWift;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

    @Override
    public String toString() {
        return  "Brand of smartphone: " + brand +
                " - Bluetooth: " + hasBluetooth +
                " - 5G: " + has5G +
                " - Wift: " + hasWift +
                " - Os: " + os +
                " - Memory: " + memory +
                " - Color: " + color +
                " - Price: " + price +
                " - TotalSold: " + totalSold +"\n";
    }
}
