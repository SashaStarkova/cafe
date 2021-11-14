package com.hfad.cafe;

public class Food {
    private String name;
    private String description;
    private int imageResourceId;
    public static final Food[] food = {
            new Food("Croissant", "A French crescent-shaped roll made of sweet flaky yeast dough, eaten for breakfast",
                    R.drawable.croissant),
            new Food("Donut", "A small fried cake of sweetened dough, typically in the shape of a ball or ring",
                    R.drawable.donut),
            new Food("Waffles", "A small crisp batter cake, baked in a waffle iron and eaten hot with butter or syrup",
                    R.drawable.waffles)
    };
    //Each Drink has a name, description, and an image resource
    private Food(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public String toString() {
        return this.name;
    }
}