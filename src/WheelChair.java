import java.util.Objects;

public class WheelChair {
    private int id;
    private String nameWheelChair;
    private int price;
    private String group;

    public WheelChair(int id, String nameWheelChair, int price, String group) {
        this.id = id;
        this.nameWheelChair = nameWheelChair;
        this.price = price;
        this.group = group;
    }

    public WheelChair() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameWheelChair() {
        return nameWheelChair;
    }

    public void setNameWheelChair(String nameWheelChair) {
        this.nameWheelChair = nameWheelChair;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WheelChair that = (WheelChair) o;
        return id == that.id && Double.compare(that.price, price) == 0 && Objects.equals(nameWheelChair, that.nameWheelChair) && Objects.equals(group, that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameWheelChair, price, group);
    }

    @Override
    public String toString() {
        return "Инвалидная коляска - " +
                "id = " + id +
                ", Название = " + nameWheelChair +
                ", Цена = " + price +
                ", Группа = " + group ;
    }
}
