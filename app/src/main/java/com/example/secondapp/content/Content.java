package com.example.secondapp.content;

public class Content {
    private String name; // название
    private String description;  // описание
    private int iconResource; // ресурс иконки

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIconResource() {
        return iconResource;
    }

    public void setIconResource(int iconResource) {
        this.iconResource = iconResource;
    }

    public Content(String name, String description, int iconResource) {
        this.name = name;
        this.description = description;
        this.iconResource = iconResource;
    }
}
