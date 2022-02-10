package VezbanjeOOPArreysObjekataSastojci;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SastojakMain {
    public static void main(String[] args) {
        ArrayList<Sastojak> sastojci =new ArrayList<Sastojak>();

        Scanner sc=new Scanner(System.in);
        System.out.println(" Unesite broj sastojaka: ");
        int n= sc.nextInt();

        for( int i=0; i<n; i++){
            System.out.println("Unesite naziv sastojka: ");
            String nazivSastojka=sc.next();
            System.out.println("Unesite cenu sastojka: ");
            double cenaSastojka=sc.nextDouble();
            Sastojak sastojak=new Sastojak(nazivSastojka, cenaSastojka);
            sastojci.add(sastojak);
        }
        for(int i=0; i< sastojci.size(); i++){
            Sastojak k=sastojci.get(i);
            System.out.println(k.getNaziv()+", "+k.getCena());
        }
    }
}
