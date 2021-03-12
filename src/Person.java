abstract class Person {
    private String name;
    private String country;
    private String language;


    public String getName() { return name; }
    public String getCountry() { return country; }
    protected String getLanguage() { return language; }
    {
        this.name="Немає інформації";
        this.country="Немає інформації";
        this.language="Немає інформації";
    }
    public Person(){
    }

    public Person(String name,String country,String language){
        this.name=name;
        this.country=country;
        this.language=language;
    }
    public abstract void PrintCountryName();
    public abstract void Speak();
    public abstract void sayHello();
}
