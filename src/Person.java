public class Person {
    public String name;
    public int age;

    public void setAge(int age) throws MyExeption {
        this.age = age;

    }

    public int getAge() throws MyExeption {
        if(age < 18){
            throw new MyExeption();
        }
        return age;
    }

    public Person(String name) {
        this.name = name;
    }
}
