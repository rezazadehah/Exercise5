public class Student {
    String name = "";
    int itValue = 0;

    public Student(String name, int itValue) {
        this.name = name;
        this.itValue = itValue;
    }

    @Override
    public String toString() {
        return getName() + " " + " nomre darse it : "+getItValue();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItValue() {
        return itValue;
    }

    public void setItValue(int itValue) {
        this.itValue = itValue;
    }
}
