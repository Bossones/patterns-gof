package ru.bossones.creational.abstract_factory.items;

import ru.bossones.creational.abstract_factory.Item;

public abstract class StringItem implements Item {

    public StringItem(String description, int number) {
        this.description = description;
        this.number = number;
    }

    protected String description;
    protected int number;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void setNumber(int number) {
        this.number = number;
    }
}
