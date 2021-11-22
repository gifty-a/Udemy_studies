package main.java.section_9.interfaces.chall;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> list);
}
