package wlasne1;

import java.util.Comparator;

public class PriceComparator implements Comparator<Device> {

    @Override
    public int compare(Device dev1, Device dev2) {
        return Double.compare(dev1.price, dev2.price);
    }


}
