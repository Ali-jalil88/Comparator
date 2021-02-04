
class Person implements java.lang.Comparable<Person>
{
    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "PersonI{" +
                "name:  '"  +name+ "'  " +
                ", lastName: '"  +lastName+ "'  " +
                '}';
    }
    public int compareTo(Person person){
        return this.name.compareTo(person.name);
    }
}
