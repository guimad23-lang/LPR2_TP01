public class Person {
    private String name;
    private String address;

    public Person(String n, String a){
        this.name = n;
        this.address = a;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String a){
        this.address = a;
    }

    public String toString(){
        return "Person[name = " + this.name + ", address = " + this.address + "]";
    }
}
