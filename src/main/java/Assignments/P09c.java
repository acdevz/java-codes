package Assignments;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.ToDoubleFunction;

public class P09c {
    public static void main(String[] args) {
        int capacity = 50;
        Item[] items = {
                new Item(10, 60),
                new Item(20, 100),
                new Item(30, 120)
        };

        FractionalKnapsack f = new FractionalKnapsack();
        double maxValue = f.fractionalKnapsack(capacity, items);
        System.out.println("Maximum value that can be obtained = " + maxValue);
    }
}

class Item {
    int weight;
    int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

class FractionalKnapsack {
    static class knapsackComparator implements Comparator<Item> {
        @Override
        public int compare(Item item1, Item item2) {
            if (item1 == item2)
                return 0;
            return (double) item2.value / item2.weight > (double) item1.value / item1.weight ? 1 : -1;
        }
    }
    double fractionalKnapsack(int capacity, Item[] items) {
        // Sort items by value-to-weight ratio in descending order
        Arrays.sort(items, new knapsackComparator());

        double totalValue = 0;
        int currentWeight = 0;

        // Iterate through items and fill the knapsack
        for (Item item : items) {
            if (currentWeight + item.weight <= capacity) {
                // If the item can be taken completely, take it
                totalValue += item.value;
                currentWeight += item.weight;
            } else {
                // Otherwise, take a fractional part of the item
                double remainingCapacity = capacity - currentWeight;
                totalValue += (double) item.value * (remainingCapacity / item.weight);
                break;
            }
        }

        return totalValue;
    }
}
