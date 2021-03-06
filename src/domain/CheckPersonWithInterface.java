package domain;

public class CheckPersonWithInterface implements CheckPerson {

    public boolean test(Person p) {
        return p.gender == Person.Sex.MALE &&
                p.getAge() >= 18 &&
                p.getAge() <= 29;
    }

}
