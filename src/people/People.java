package people;

import room.Accommodation;

public interface People {
    void work(Accommodation accommodation);
    void chat(String message);
    String getname();
}
