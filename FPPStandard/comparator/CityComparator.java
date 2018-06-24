package comparator;

import java.util.Comparator;

/**
 * Created by fissehaye on 6/19/18.
 */
public class CityComparator implements Comparator<TopCity> {

    Type type;

    public CityComparator(Type type) {
        this.type = type;
    }

    @Override
    public int compare(TopCity o1, TopCity o2) {

        if (type.equals(Type.BYNAME)) {

            return o1.getName().compareTo(o2.getName());

        } else {

            return Double.compare(o1.getPopulation(), o2.getPopulation());
        }
    }
}
