package org.example;

public class Item implements Comparable<Item> {
    private String name;
    private String category;
    private float price;
    private int stocks;

    public Item(String name, String category, float price, int stocks) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stocks = stocks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStocks() {
        return stocks;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }

    @Override
    public int compareTo(Item o) {
        // เรียงตามชนิดสินค้าก่อนแล้วค่อยเรียงด้วยชื่อ
        if(this.getCategory().equalsIgnoreCase(o.getCategory())){
            return this.getName().compareToIgnoreCase(o.getName());
        } else {
            return this.getCategory().compareToIgnoreCase(o.getCategory());
        }
    }
}
