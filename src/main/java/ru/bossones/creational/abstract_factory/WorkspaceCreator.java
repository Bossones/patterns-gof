package ru.bossones.creational.abstract_factory;

import ru.bossones.creational.abstract_factory.factories.PaintWorkspaceFactory;

import java.util.List;

public class WorkspaceCreator {

    public PaintWorkspace createPaintWorkspace(PaintWorkspaceFactory paintWorkspaceFactory) {
        final PaintWorkspace paintWorkspace = paintWorkspaceFactory.createPaintWorkspace();
        final List<Item> predefinedItems = paintWorkspaceFactory.createItems();
        predefinedItems.forEach(paintWorkspace::addItem);
        return paintWorkspace;
    }

}
