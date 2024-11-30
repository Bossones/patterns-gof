package ru.bossones.creational.abstract_factory.items.linux;

import ru.bossones.creational.abstract_factory.items.SymbolItem;

public class LinuxSymbolItem extends SymbolItem {
    public LinuxSymbolItem(String description, int number) {
        super(description, number);
    }

    // some linux logic to realize that.
}
