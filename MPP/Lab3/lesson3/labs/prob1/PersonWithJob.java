package lesson3.labs.prob1;

public class PersonWithJob {

    private Person person;

    private double salary;

    PersonWithJob(String n, double s) {
        //super(n);
        salary = s;
    }

    public static void main(String[] args) {

        PersonWithJob p1 = new PersonWithJob("Joe", 30000);
        Person p2 = new Person("Joe");
        //As PersonsWithJobs, p1 should be equal to p2
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("p2.equals(p1)? " + p2.equals(p1));
    }

    @Override
    public boolean equals(Object aPerson) {

        System.out.println("Subclass called!!!");

        if (aPerson == null) {
            return false;
        }

        if (!(aPerson instanceof PersonWithJob)) {

            return false;
        }

        PersonWithJob p = (PersonWithJob) aPerson;

        boolean isEqual = person.getName().equals(p.person.getName()) &&
                this.getSalary() == p.getSalary();
        return isEqual;
    }

    public double getSalary() {

        return salary;
    }

    public Person getPerson() {
        return person;
    }


}
