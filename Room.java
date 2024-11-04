package TextAdventure;
public class Room {
    Item[] items;
    String description;

    public Room(String description, Item[] items, boolean isTrapActive) {
        this.description = description;
        this.items = items;

    }

    @Override
    public String toString() {
        return description;
    }
}


