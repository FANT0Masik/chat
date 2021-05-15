package ua.kiev.prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JsonAnswer {
    private final List<Message> list;

    public JsonAnswer() {
        list = new ArrayList<>();
    }

    public List<Message> getList() {

        return Collections.unmodifiableList(list);
    }
}
