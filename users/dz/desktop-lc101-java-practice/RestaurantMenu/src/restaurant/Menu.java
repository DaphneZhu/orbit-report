package restaurant;

import java.util.ArrayList;
import java.util.Calendar;

public class Menu {
    private String restaurantName;
    private Integer startHours;
    private Integer endHours;
    private ArrayList<MenuItem> newItems = new ArrayList<>();
    private Calendar lastUpdated;
    private ArrayList<MenuItem> items = new ArrayList<>();

    public Menu(String restaurantName, Integer startHours, Integer endHours, Calendar lastUpdated) {
        this.restaurantName = restaurantName;
        this.startHours = startHours;
        this.endHours = endHours;
        this.lastUpdated = Calendar.getInstance();
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setStartHours (Integer startHours) {
        this.startHours = startHours;
    }

    public Integer getStartHours () {
        return startHours;
    }

    public void setEndHours(Integer endHours) {
        this.endHours = endHours;
    }

    public Integer getEndHours() {
        return endHours;
    }

    public void setNewItems(ArrayList<MenuItem> newItems) {
        this.newItems = newItems;
    }

    public ArrayList<MenuItem> getNewItems() {
        return newItems;
    }

    public void setLastUpdated(Calendar lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Calendar getLastUpdated() {
        return lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem (MenuItem aItem) {
        if (this.getItems().contains(aItem)) {
            System.out.println("Menu contains this items");
        } else {
            items.add(aItem);
            }
    }
}


