package ru.bossones.creational.abstract_factory.factories;

import ru.bossones.creational.abstract_factory.Item;
import ru.bossones.creational.abstract_factory.PaintWorkspace;

import java.util.List;

public interface PaintWorkspaceFactory {

    PaintWorkspace createPaintWorkspace();

    List<Item> createItems();
}
