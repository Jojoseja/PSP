package Repaso.Comparator;

import java.util.Comparator;

public class CustomFutOrder implements Comparator<Futbolista> {
    @Override
    public int compare(Futbolista o1, Futbolista o2) {
        return o1.getTeam().compareTo(o2.getTeam());
    }
}
