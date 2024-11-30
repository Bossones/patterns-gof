package ru.bossones.creational.abstract_factory;

import java.util.List;

public interface PaintWorkspace {

    void visualize();

    List<Item> getItems();

    void addItem(Item item);
}
