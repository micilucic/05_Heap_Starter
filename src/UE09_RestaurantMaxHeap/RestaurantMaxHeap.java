package UE09_RestaurantMaxHeap;

public class RestaurantMaxHeap
{
    private Restaurant[] restaurants;
    private int count = 0;

    public int getCount()
    {
        return count;
    }

    public RestaurantMaxHeap(int size)
    {
        restaurants = new Restaurant[size];
    }

    // Hilfsfunktionen
    private int parent(int pos)
    {
        // rundet automatisch ab, weil Integer-Division
        return (pos-1) / 2;
    }

    private int left(int pos)
    {
        return pos * 2 + 1;
    }

    private int right(int pos)
    {
        return (left(pos)) + 1;
    }

    private boolean exists(int pos)
    {
        return (pos >= 0 && pos < count);
    }

    private int getPrio(int pos)
    {
        return restaurants[pos].getWaitingOrders();
    }

    // Hilfsfunktion, die bei swim() und sink() verwendet wird
    private void exchange(int pos1, int pos2)
    {
        Restaurant temp;

        temp = restaurants[pos1];
        restaurants[pos1] = restaurants[pos2];
        restaurants[pos2] = temp;
    }

    private void swim(int pos)
    {
        // TODO: Implementieren
    }

    private void sink(int pos)
    {
        // TODO: Implementieren
    }

    // Hilfsfunktion, um Kind mit größerer Anzahl an wartenden Bestellungen zu finden
    private int maxChild(int pos)
    {
        int max, l, r;
        l = left(pos);
        r = right(pos);

        max = l;
        if (exists(r) && getPrio(r) > getPrio(l))
        {
            max = r;
        }
        return max;
    }

    // Hilfsfunktion, um zu prüfen, ob ein Knoten überhaupt Kinder hat
    private boolean hasChildren(int pos)
    {
        int l;
        // man muss nur "links" prüfen, da ein Heap immer von links nach rechts aufgebaut wird
        l = left(pos);

        return exists(l);
    }

    // Hilfsfunktion, um zu prüfen, ob Array voll ist
    public boolean isFull()
    {
        return (count >= restaurants.length);
    }

    public boolean insert(Restaurant newRestaurant)
    {
        if (isFull())
        {
            System.err.println("Heap ist voll!");
            return false;
        }

        int newPos = count;
        restaurants[count] = newRestaurant;
        count++;
        // Tipp: swim() benötigt einen korrekt gesetzten count-Wert
        swim(newPos);
        return true;
    }

    public Restaurant remove()
    {
        Restaurant resultRestaurant;
        if (count == 0)
        {
            System.err.println("Heap ist leer!");
            return null;
        }

        resultRestaurant = restaurants[0];
        restaurants[0] = restaurants[count-1];
        restaurants[count-1] = null;
        count--;
        // Tipp: sink() benötigt einen korrekt gesetzten count-Wert
        sink(0);
        return resultRestaurant;
    }

    // Ausgabe des Heaps auf der Konsole
    public void printHeap()
    {
        if (!exists(0))
        {
            return;
        }
        printHeap(0, "");
    }

    private void printHeap(int node, String indent)
    {
        if (!exists(node))
        {
            return;
        }
        Restaurant t = restaurants[node];
        System.out.println(indent + t.toString());
        printHeap(left(node), indent + "  ");
        printHeap(right(node), indent + "  ");
    }
}
