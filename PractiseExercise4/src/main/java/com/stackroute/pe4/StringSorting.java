package com.stackroute.pe4;

import java.util.*;

public class StringSorting {
    public static void main(String[] srgs) {

        Scanner input = new Scanner(System.in);

        String str = "Hey there!!! We were both young when I first saw you." +
                " I closed my eyes and the flashback starts am " +
                "standing there. On a balcony in summer air. See" +
                " the light see the party the ball gowns. See you" +
                " make your way through the crowd and say hello! " +
                "Little did I know. He knelt to the ground and pulled " +
                "out a ring and said, Marry me Juliet you will never " +
                "have to be alone. I love you and that is all I really " +
                "know. I talked to your dad go pick out a white dress." +
                " It is a love story baby just say... YES";


        System.out.println(str);



        StringTokenizer t = new StringTokenizer(str);
        String word ="";

        ArrayList<String> listString= new ArrayList<String>();

        while(t.hasMoreTokens())
        {
            word = t.nextToken();
            listString.add(word);
        }
        System.out.println("List before Sorting.....");
        System.out.println(listString);

        Collections.sort(listString);
        System.out.println("List after Sorting.....(Ascending order)");
        System.out.println(listString);

        Collections.sort(listString, Collections.reverseOrder());
        System.out.println("List after Sorting.....(Descending order)");
        System.out.println(listString);



    }
}
