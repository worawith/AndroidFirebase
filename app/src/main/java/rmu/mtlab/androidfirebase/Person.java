package rmu.mtlab.androidfirebase;

/**
 * Created by worawith on 7/14/2016.
 */
public class Person {
    //name and address string
    private String name;
    private String address;

    public Person() {
      /*Blank default constructor essential for Firebase*/
    }
    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}