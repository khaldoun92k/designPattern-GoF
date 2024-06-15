package gof.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

// Caretaker
public class History {
    private final List<DocumentMemento> mementos;

    public History() {
        this.mementos = new ArrayList<>();
    }

    public void addMemento(DocumentMemento memento) {
        this.mementos.add(memento);
    }

    public DocumentMemento getMemento(int index) {
        return this.mementos.get(index);
    }
}
