package entities;

public class EntitySuper {

    private int id;

    public EntitySuper(int id) {
        this.id = id;
    }

    public EntitySuper() {
        setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "EntitySuper{" +
                "id=" + id +
                '}';
    }
}

