package ru.bossones.creational.abstract_factory.factories;

import ru.bossones.creational.abstract_factory.Item;
import ru.bossones.creational.abstract_factory.PaintWorkspace;
import ru.bossones.creational.abstract_factory.items.windows.WindowsPictureItem;
import ru.bossones.creational.abstract_factory.items.windows.WindowsStringItem;
import ru.bossones.creational.abstract_factory.items.windows.WindowsSymbolItem;
import ru.bossones.creational.abstract_factory.workspaces.WindowPaintWorkspace;

import java.util.List;

public class WindowsPaintWorkSpaceFactory implements PaintWorkspaceFactory {

    @Override
    public PaintWorkspace createPaintWorkspace() {
        return new WindowPaintWorkspace();
    }

    @Override
    public List<Item> createItems() {
        final WindowsStringItem stringItem = new WindowsStringItem("string item by windows", 1);
        final WindowsSymbolItem symbolItem = new WindowsSymbolItem("symbol item by windows", 2);
        final WindowsPictureItem pictureItem = new WindowsPictureItem("picture item by windows", 3);
        return List.of(stringItem, symbolItem, pictureItem);
    }
}
