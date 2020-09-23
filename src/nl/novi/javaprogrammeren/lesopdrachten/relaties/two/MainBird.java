package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

public class MainBird {

    /*
    Geef de klasse Bird de volgende instance variables: nickname, species, ringNumber
    De species en ringNumber variables mogen na instantiatie niet meer aangepast worden.

    Geef de klasse BirdOwner de volgende instance variables: name, sex.
    Er zijn geen restricties op getters en setters.

    Programmeer de volgende relatie.
    Een BirdOwner kan een oneindig aantal vogels hebben. Elke vogel mag echter maar 1 keer in de lijst voorkomen.
    Er mag geen List via de constructor gevuld worden. Dit moet via een methode.

    Maak een toString()-methode die het volgende afdrukt: Naam van eigenaar en van elke vogel de nickname en
    serienummer.

    Uitdagend:
    1. Zorg ervoor dat de BirdOwner minimaal 20 Bird-objecten heeft.
    2. De BirdOwner mag van de gemeente nog maar 10 Vogels houden. Hij wil random 5 vrouwtjes en vijf mannetjes kiezen.
    Schrijf een methode die dit doet en de vijf random gekozen mannetjes en de vijf random gekozen vrouwtjes uitprint.

     */

    public static void main(String[] args) {


        BirdOwner erwin = new BirdOwner("Erwin", "man");
        BirdOwner gerwin = new BirdOwner("Gerwin", "man");

        /*Bird willem0 = new Bird("piet20","Mus","100");
        Bird willem1 = new Bird("piet21","Mus","101");
        Bird willem2 = new Bird("piet22","Mus","102");
        Bird willem3 = new Bird("piet23","Mus","103");
        Bird willem4 = new Bird("piet24","Mus","104");
        Bird willem5 = new Bird("piet25","Mus","105");
        Bird willem6 = new Bird("piet26","Mus","106");
        Bird willem7 = new Bird("piet27","Mus","107");
        Bird willem8 = new Bird("piet28","Mus","108");
        Bird willem9 = new Bird("piet29","Mus","109");
        Bird willem10 = new Bird("piet30","Mus","110");
        Bird willem11 = new Bird("piet31","Mus","111");
        Bird willem12 = new Bird("piet32","Mus","112");
        Bird willem13 = new Bird("piet33","Mus","113");
        Bird willem14 = new Bird("piet34","Mus","114");
        Bird willem15 = new Bird("piet35","Mus","115");
        Bird willem16 = new Bird("piet36","Mus","116");
        Bird willem17 = new Bird("piet37","Mus","117");
        Bird willem18 = new Bird("piet38","Mus","118");
        Bird willem19 = new Bird("piet39","Mus","119");
        Bird willem20 = new Bird("piet40","Mus","120");
        Bird willem21 = new Bird("piet40","Mus","120");*/


        erwin.addBird("pietje", "Mus", "011");
        erwin.addBird("pietje", "Mus", "011");
        erwin.addBird("willem0","Mus","10");
        erwin.addBird("willem1","Mus","11");
        erwin.addBird("willem2","Mus","12");
        erwin.addBird("willem3","Mus","13");
        erwin.addBird("willem4","Mus","14");
        erwin.addBird("willem5","Mus","15");
        erwin.addBird("willem6","Mus","16");
        erwin.addBird("willem7","Mus","17");
        erwin.addBird("willem8","Mus","18");
        erwin.addBird("willem9","Mus","19");
        erwin.addBird("willem10","Mus","20");
        erwin.addBird("willem11","Mus","21");
        erwin.addBird("willem12","Mus","22");
        erwin.addBird("willem13","Mus","23");
        erwin.addBird("willem14","Mus","24");
        erwin.addBird("willem15","Mus","25");
        erwin.addBird("willem16","Mus","26");
        erwin.addBird("willem17","Mus","27");
        erwin.addBird("willem18","Mus","28");
        erwin.addBird("willem19","Mus","29");
        erwin.addBird("willem20","Mus","30");


        gerwin.addBird("willem0","Mus","10");
        gerwin.addBird("willem1","Mus","11");
        gerwin.addBird("willem2","Mus","12");
        gerwin.addBird("willem13","Mus","23");
        gerwin.addBird("willem14","Mus","24");
        gerwin.addBird("willem15","Mus","25");
        gerwin.addBird("willem16","Mus","26");
        gerwin.addBird("willem17","Mus","27");
        gerwin.addBird("willem18","Mus","28");
        gerwin.addBird("willem19","Mus","29");
        gerwin.addBird("willem20","Mus","30");
        gerwin.addBird("willem20","Mus","30");
        gerwin.addBird("willem20","Mus","30");
        gerwin.addBird("willem20","Mus","30");

        /*erwin.addBird(willem1);
        erwin.addBird(willem2);
        erwin.addBird(willem3);
        erwin.addBird(willem4);
        erwin.addBird(willem5);
        erwin.addBird(willem6);
        erwin.addBird(willem7);
        erwin.addBird(willem8);
        erwin.addBird(willem9);
        erwin.addBird(willem10);
        erwin.addBird(willem11);
        erwin.addBird(willem12);
        erwin.addBird(willem13);
        erwin.addBird(willem14);
        erwin.addBird(willem15);
        erwin.addBird(willem16);
        erwin.addBird(willem17);
        erwin.addBird(willem18);
        erwin.addBird(willem19);
        erwin.addBird(willem20);
        erwin.addBird(willem21);*/
       //for (int i = 0; i <= 20 ; i++ ){
       //     System.out.println( "Bird willem" + (i) + " = new Bird(\"piet" + (i+20) + "\",\"Mus\",\"" + (i+100) + "\");");
       //}
        /*for (int i = 0; i <= 20 ; i++ ){
            System.out.println( "gerwin.addBird(\"willem"+i+"\",\"Mus\",\""+(i+10)+"\");");
            }*/
        //System.out.println(erwin.toString());
        erwin.showInformation();
        gerwin.showInformation();

    }

}
