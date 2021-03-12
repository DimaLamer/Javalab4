public class Lab4 {
    public static void main (String[] args) {
        Ukranian Ivan = new Ukranian("Іван", "Ukraine","українська");
        Ukranian Ivan2 = new Ukranian("Іван", "Ukraine","українська");
        Ukranian Igor = new Ukranian();
        Italian Louis = new Italian("Louis","Italia","italiano");
        Ivan.PrintCountryName();
        Ivan.Speak();
        Ivan.sayHello();
        Igor.sayHelloBack();
        Igor.PrintCountryName();
        Igor.Speak();
        Louis.PrintCountryName();
        Louis.Speak();
        Louis.sayHello();
        Louis.singSong();
        Ukranian.print();
        System.out.println(Ivan.compare(Igor));
        System.out.println(Ivan2.compare(Ivan));
    }
}
