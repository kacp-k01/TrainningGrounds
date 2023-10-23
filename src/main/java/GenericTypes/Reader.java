package GenericTypes;

public class Reader<T extends Readable> {
    private T t;

    public T read() { return t; }

    public void add() { this.t=t;  }

    }



