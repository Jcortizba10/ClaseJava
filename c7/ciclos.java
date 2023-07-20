package co.com.ps.c7;

import java.util.ArrayList;
import java.util.List;

public class ciclos {
    public static void main(String[] args){

        List<String>milista= new ArrayList<>();
        milista.add("Mauricio");
        milista.add("Camilo");
        milista.add("Tommy");

        for (int i = 0; i < milista.size(); i++) {
            System.out.println(milista.get(i));

        }
    }
}
