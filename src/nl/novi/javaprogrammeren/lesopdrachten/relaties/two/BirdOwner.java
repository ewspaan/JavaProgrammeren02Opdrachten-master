package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

import java.util.ArrayList;
import java.util.List;

public class BirdOwner {

    private String name;
    private String sex;
    private List <Bird> birds;
    private List <String> nickName;

    public BirdOwner(String name, String sex, List<Bird> birds) {
        this.name = name;
        this.sex = sex;
        this.birds = birds;
    }
    public BirdOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
        birds = new ArrayList<>();
        nickName = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<Bird> getBirds() {
        return birds;
    }

    public void setBirds(List<Bird> birds) {
        this.birds = birds;
    }

    public void addBird ( String name, String species, String ringNumber) {

        boolean x = false;
        int i = 0;
        //System.out.println();
        Bird bird = new Bird(name, species, ringNumber);
        //System.out.println("birds--> " + birds);
        String checkName = bird.getNickName();
        if (birds != null) {
                i = birds.size();
                nickName.add(i, name);
                //System.out.println("nickName--> " + nickName.get(i));
        }
        i=0;
        //System.out.println(bird.getNickName());
        //System.out.println("checkName --> " + checkName);
        //birds.add(bird);
        while (i < birds.size()) {
            //System.out.println("----> " + birds.contains(checkName));

            //System.out.println("--> " + birdFromList);
            if (checkName == nickName.get(i)) {
                System.out.println("Vogel is al in je bezit");
                x = true;
                }
            i++;
        }
            if (x == false) {
                birds.add(bird);
            }
        //System.out.println("-->" + birds);
    }

    public void showInformation() {
        System.out.println( name + " Heeft " + birds.size() + " vogels in zijn bezit.");
    }

    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vogeleigenaar ").append(name).append(" heeft ").append(birds.size()).append(" vogels");
        stringBuilder.append("\n\r");
        stringBuilder.append("Dat zijn de volgende:");
        for(Bird teller : birds) {
            stringBuilder.append("\n\r").append(teller.toString()).append(".");
        }
        stringBuilder.append("\n\r");
        return stringBuilder.toString();
    }

    //public String toString (){
    //  String s = " De volgende eigenaar genaamd: " + name + " heeft de volgende vogels";
   //   return s;
    //}

   // public static boolean useList(String[] arr, String targetValue) {
  //      return Arrays.asList(arr).contains(targetValue);
  //  }
}
