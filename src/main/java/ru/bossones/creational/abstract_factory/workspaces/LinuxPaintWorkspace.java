package ru.bossones.creational.abstract_factory.workspaces;

import ru.bossones.creational.abstract_factory.Item;
import ru.bossones.creational.abstract_factory.PaintWorkspace;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LinuxPaintWorkspace implements PaintWorkspace {

    private final List<Item> items = new ArrayList<>();

    @Override
    public void visualize() {
        System.out.println("Linux Paint Workspace");
    }

    @Override
    public List<Item> getItems() {
        return List.copyOf(items);
    }

    @Override
    public void addItem(Item item) {
        Objects.requireNonNull(item);
        items.add(item);
    }
}
