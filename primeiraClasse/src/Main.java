

public class Main {
    public static void main(String[] args) {
        
        var male = new Person();

        male.setName("Kaue");

        male.setAge(18);

        var famele = new Person();

        famele.setName("Maria");

        famele.setAge(21);

        System.out.println("Male name: " + male.getName() + " Age: " + male.getAge());

        System.out.println("Female name: " + famele.getName() + " Age: " + famele.getAge());

    }
}
