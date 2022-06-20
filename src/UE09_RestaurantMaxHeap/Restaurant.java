package UE09_RestaurantMaxHeap;

public class Restaurant
{
    private int id;
    private String restaurantName;
    private int waitingOrders;

    public Restaurant(int id, String restaurantName, int waitingOrders)
    {
        this.id = id;
        this.restaurantName = restaurantName;
        this.waitingOrders = waitingOrders;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getRestaurantName()
    {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName)
    {
        this.restaurantName = restaurantName;
    }

    public int getWaitingOrders()
    {
        return waitingOrders;
    }

    public void setWaitingOrders(int waitingOrders)
    {
        this.waitingOrders = waitingOrders;
    }

    @Override
    public String toString()
    {
        return "Restaurant{" +
                "id=" + id +
                ", restaurantName='" + restaurantName + '\'' +
                ", waitingOrders=" + waitingOrders +
                '}';
    }
}
