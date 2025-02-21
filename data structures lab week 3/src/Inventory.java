import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    // Constructor
    public Inventory() {
        this.items = new ArrayList<>();
    }

    // Method to add an item to the inventory
    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " added to inventory.");
    }

    // Method to remove an item from the inventory
    public void removeItem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println(item.getName() + " removed from inventory.");
        } else {
            System.out.println("Error: " + item.getName() + " not found in inventory.");
        }
    }

    // Method to check if an item exists in the inventory
    public boolean hasItem(Item item) {
        return items.contains(item);
    }

    // Method to display all items in the inventory
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory Items:");
            for (Item item : items) {
                System.out.println("- " + item.getName());
            }
        }
    }

    // Method to get the total number of items
    public int getItemCount() {
        return items.size();
    }

    // Main class to test the inventory system
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Item sword = new Item("Sword");
        Item shield = new Item("Shield");
        Item potion = new Item("Health Potion");

        // Add items
        inventory.addItem(sword);
        inventory.addItem(shield);
        inventory.addItem(potion);

        // Display inventory
        inventory.displayItems();

        // Check if an item exists
        System.out.println("Has Sword? " + inventory.hasItem(sword));
        System.out.println("Has Bow? " + inventory.hasItem(new Item("Bow")));

        // Remove an item
        inventory.removeItem(shield);

        // Display inventory after removal
        inventory.displayItems();

        // Get total item count
        System.out.println("Total items: " + inventory.getItemCount());
    }
}