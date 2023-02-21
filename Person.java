public class Person {
    String fio;
    String work;
    String email;
    int phone;
    int many;
    int age;

    Person ( String fio, String work, String email, int phone, int many, int age) {
        this.fio=fio;
        this.work=work;
        this.email=email;
        this.phone=phone;
        this.many=many;
        this.age= age;
    }

    public  void show () {
        System.out.println( fio + " "+ work + " " + email+ " "+ phone + " " + many + " "+ age + " ");
    }
}
