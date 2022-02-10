package VezbanjeOOPAreeysObjekataZeleniKarton;

import java.util.ArrayList;

public class MainZeleniKarton {
    /*Kreirati niz od 10ak zelenih kartona za ispite i ostampati podatke za sve ispite
    -za vezbanje:
     Pronaci i ispisati prosecnu ocenu za sve ispite
     i Poinaci i ispisati prosecnu ocenu za sve polozene ispite
     */
    public static void main(String[] args) {

        ArrayList<ZeleniKarton> kartoni= new ArrayList<ZeleniKarton>();
        ZeleniKarton karton1= new ZeleniKarton("Milan Jovanovic",1234,"Energetika","Zdravko Zdravkovic",7);
        ZeleniKarton karton2= new ZeleniKarton("Nikola Nikolic",1235,"Matematika","Petar Petrovic",9);
        ZeleniKarton karton3= new ZeleniKarton("Stefan Stefanovic",1236,"Fizika","Zarko Milanovic",5);
        kartoni.add(karton1);
        kartoni.add(karton2);
        kartoni.add(karton3);
        for (int i = 0; i <kartoni.size(); i++){
            ZeleniKarton k= kartoni.get(i);
            k.stampaj();
            System.out.println();
        }
      /*  for (int i=0; i<kartoni.size(); i++){
            int ocena=kartoni.get(i).getOcena();
            System.out.println(ocena);
            //System.out.println("Prosecna ocena iz svih predmeta je: "+prosecnaOcena);
        }*/
       int counter=0;
        int sumaPolozenihIspita=0;
        for(int i=0;i<kartoni.size();i++){
            // ispiti.get(i).setOcena();
            if(kartoni.get(i).getOcena()>5){
                sumaPolozenihIspita=sumaPolozenihIspita+kartoni.get(i).getOcena();
                counter++;

            }}
        System.out.println(sumaPolozenihIspita);
        double prosekPolozenih=(double)sumaPolozenihIspita/counter;
        System.out.println(prosekPolozenih);



    }
}
