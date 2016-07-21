package JustTest.equals;

/**
 * Created by zjutK on 16/7/20.
 */
public class Employee extends Person {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(String name, int id) {
        super(name);
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Employee){
            Employee e = (Employee) object;
            return super.equals(object) && e.getId() ==id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        return result;
    }
}
