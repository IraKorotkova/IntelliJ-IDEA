public class Main5 {
    public static void main (String[] args){
        Person[] pers = new Person[5];
        pers[0] = new Person( "Кожекина Ирина денисовна", "тестировщик", "irakorotkova@mail.ru", 798192735, 1000000, 28);
        pers[1] = new Person ( "Кожекин Кирилл Сергеевич", "hasd", "kosdffe@mail.ru", 12347124, 234234232, 27);
        pers[2] = new Person ( "Примаяния Александра васильеван", "hasd", "kosdffe@mail.ru", 12347124, 234234232, 80);
        pers[3] = new Person ( "акробатка Василиса", "hasd", "kosdffe@mail.ru", 12347124, 234234232, 40);
        pers[4] = new Person ( "я нимапгу удже придумать", "hasd", "kosdffe@mail.ru", 12347124, 234234232, 12);

        for ( Person Person : pers) {
                  if ( Person.age >= 40) {
                      Person.show();
                      System.out.println();
                  }
            }
        }
    }




