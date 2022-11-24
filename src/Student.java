public class Student {
    private int id;
    private  String name;
    private  String surname;
    private  String family;
    private int baa;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", family='" + family + '\'' +
                ", baa=" + baa +
                '}';
    }

    public int getBaa() {
        return baa;
    }

    public void setBaa(int baa) {
        this.baa = baa;
    }

    public Student(int id, String name, String surname, String family, int baa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.family = family;
        this.baa = baa;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

}
