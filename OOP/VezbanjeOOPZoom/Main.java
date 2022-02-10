package VezbanjeOOPZoom;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*User milan = new User();
        milan.setFullName("Milan Jovanovic");
        milan.subscribe(150);

        User nikola = new User("Nikola Nikolic");

        ZoomCall call = new ZoomCall("http://zoom.us/239032-32", "129021", milan);
        call.setGuest(nikola);
        call.start();
        System.out.println("----------------");
        milan.unsubscribe();
        call.start();*/
        ArrayList<User>korisnici=new ArrayList<User>();//ovako se prave nizovi objekata
        User milan= new User("Milan Jovanovic");//Ovo su objekti
        User nikola= new User("Nikola Nikolic");
        User marko= new User("Marko Markovic");
        User stafan= new User("Stefan Stefanovic");
        korisnici.add(milan);// ovako se ti objekti dodaju u niz
        //korisnici.add(new User("Milan Jovanovic"); pisanje u jednoj liniji
        korisnici.add(nikola);
        korisnici.add(marko);
        korisnici.add(stafan);
        for (int i=0;i< korisnici.size(); i++){
            System.out.println(korisnici.get(i).getFullName());//za stampu niza
        }


    }
}

