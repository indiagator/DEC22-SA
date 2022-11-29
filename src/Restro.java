import java.util.Arrays;
import java.util.List;

public class Restro
{
    String id;
    String name;
    Location location;
   List<Dish> menu;
    Review[] reviews;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setMenu(List<Dish> menu) {
        this.menu = menu;
    }

    public void setReviews(Review[] reviews) {
        this.reviews = reviews;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public List<Dish> getMenu() {
        return menu;
    }

    public Review[] getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Restro{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location=" + location +
                ", menu=" + menu +
                ", reviews=" + Arrays.toString(reviews) +
                '}';
    }
}
