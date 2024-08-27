package P3;

public abstract class Contact {
    String name;

    public Contact(String name) {
        this.name = name;
    }

    void sendMessage() {
    }

    void print() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
