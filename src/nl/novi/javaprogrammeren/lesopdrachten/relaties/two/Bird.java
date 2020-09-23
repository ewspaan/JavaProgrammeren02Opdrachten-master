package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

public class Bird {

    private String nickName;
    private String species;
    private String ringNumber;


    public Bird(String nickName, String species, String ringNumber) {
        this.nickName = nickName;
        this.species = species;
        this.ringNumber = ringNumber;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSpecies() {
        return species;
    }

    public String getRingNumber() {
        return ringNumber;
    }

    public String toString(){
       String s = "Nickname vogel: " + nickName + " met ringnummer: " + ringNumber;
       return s;
    }

}
