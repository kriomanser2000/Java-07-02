import java.util.*;
import java.util.stream.Collectors;

class Device
{
    private String name;
    private int year;
    private double price;
    private String color;
    private String type;
    public Device(String name, int year, double price, String color, String type)
    {
        this.name = name;
        this.year = year;
        this.price = price;
        this.color = color;
        this.type = type;
    }
    public String getName()
    {
        return name;
    }
    public int getYear()
    {
        return year;
    }
    public double getPrice()
    {
        return price;
    }
    public String getColor()
    {
        return color;
    }
    public String getType()
    {
        return type;
    }
    @Override
    public String toString()
    {
        return "Device{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
