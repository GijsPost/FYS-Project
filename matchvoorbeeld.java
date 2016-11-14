package test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Voorbeeld voor matchen met behulp door gegenereerde arrays
 * @author Gijs Post
 */
public class FYStest {
    public static void main(String[] args) {
        //Maken van variabelen, Arrays, en List
        int id = 0;
        int kofferstats[] = {1,0,0,1,1};      
        int koffercheck[];
        ArrayList matches = new ArrayList();

        do {
            int kans = 0;
            //Genereerd een random array van vijf 1'tjes en 0'tjes
            Random r = new Random();
            int[] values = new int[5];
            for(int i=0;i<values.length;i++){
            values[i] = r.nextInt(2);}
            
            //Zet de gegenereerde array in koffercheck
            koffercheck = values;
            
            System.out.println();
            System.out.println("ID: "+id);
            System.out.println("Originele waardes: [1, 0, 0, 1, 1]");
            System.out.println("Gegenereerde waardes: "+Arrays.toString(koffercheck));
            //Bekijkt voor elke waarde van kofferstats of ze overeen komen
            for (int i = 0; i <= 4; i++){
            if (kofferstats[i] == koffercheck[i]) {               
                    if (koffercheck[i] == 0) {}
                    else{
                        kans++;
                        System.out.println("Rij "+(i+1)+" is gelijk.");
                    }
            }        
            }
            //Als er meer dan 2 van de 5 overeenkomsten zijn, rekent hij het als een mogelijke match
            if (kans > 2) {
               matches.add(id);
            }
            id++;
        } while (id <= 10);
        System.out.println();
        System.out.print("De ID's met een mogelijke match zijn: ");
        System.out.print(matches);
        System.out.println();
    }
}
    
