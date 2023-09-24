public class Employee{
    private String number,name,surname;

    Employee(String number, String name, String surname){
        this.number=number;
        this.name=name;
        this.surname=surname;
    }

    // Setting variables
    void setNumber(String s){
        number=s;
    }
    void setName(String s){
        name=s;
    }
    void setSurname(String s){
        surname=s;
    }

    String createShortName(){
        return name.charAt(0)+". "+surname;
    }


    // Getting variables
    String getNumber(){
        return number;
    }
    String getName(){
        return name;
    }
    String getSurname(){
        return surname;
    }
    
}