package ru.bossones.creational.abstract_factory.factories;

import ru.bossones.creational.abstract_factory.Item;
import ru.bossones.creational.abstract_factory.PaintWorkspace;
import ru.bossones.creational.abstract_factory.items.linux.LinuxPictureItem;
import ru.bossones.creational.abstract_factory.items.linux.LinuxStringItem;
import ru.bossones.creational.abstract_factory.items.linux.LinuxSymbolItem;
import ru.bossones.creational.abstract_factory.workspaces.LinuxPaintWorkspace;

import java.util.List;

public class LinuxPaintWorkSpaceFactory implements PaintWorkspaceFactory {

    @Override
    public PaintWorkspace createPaintWorkspace() {
        return new LinuxPaintWorkspace();
    }

    @Override
    public List<Item> createItems() {
        final LinuxStringItem stringItem = new LinuxStringItem("string item by linux", 1);
        final LinuxSymbolItem symbolItem = new LinuxSymbolItem("symbol item by linux", 1);
        final LinuxPictureItem pictureItem = new LinuxPictureItem("picture item by linux", 1);
        return List.of(stringItem, symbolItem, pictureItem);
    }
}
