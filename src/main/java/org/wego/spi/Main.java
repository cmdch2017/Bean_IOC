package org.wego.spi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IShout> shouters = new ArrayList<>();
        shouters.add(new Cat());
        shouters.add(new Dog());

        for (IShout s : shouters) {
            s.shout();
        }
    }
}
