import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Employees
 */
public class Employees {

    ArrayList<Person> persons;

    public Employees() {
        this.persons = new ArrayList<Person>();
    }

    public void add(Person personToAdd) {
        persons.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for (Person person : peopleToAdd) {
            persons.add(person);
        }
    }

    public void print() {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            System.out.println(nextPerson);
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation() == education) {
                System.out.println(nextPerson);
            }
        }
    }
    public void fire(Education education){
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
                if (iterator.next().getEducation() == education){
                iterator.remove();
            }

        }
    }
}
