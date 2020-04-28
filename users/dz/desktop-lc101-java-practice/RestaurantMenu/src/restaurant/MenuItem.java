package restaurant;

import java.util.Calendar;

public class MenuItem {
    private String name;
    private String description;
    private Double price;
    private boolean isNew;
    private Calendar timeCreated;
    private String category;

    public MenuItem(String name, String description, Double price, boolean isNew, Calendar timeCreated, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isNew = isNew;
        this.timeCreated = timeCreated;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setTimeCreated(Calendar timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Calendar getTimeCreated() {
        return timeCreated;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
