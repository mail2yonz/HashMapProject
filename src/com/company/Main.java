/*
      Yonatan Mengesha

      Java BootCamp


 */


package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

         Scanner keyboard= new Scanner (System.in);
         String answer;
        int num;

        String value;
        HashMap< Integer ,String >  myMap= new HashMap<Integer, String> (  );

         myMap.put(10,"ten");
         myMap.put(11,"Eleven");
         myMap.put(12,"Twelve");
        // myMap.put(100,"hundred");

        do{
             System.out.println ("Enter a number: " );
              num= keyboard.nextInt ();
              keyboard.nextLine ();

//             System.out.println ("Enter the number in value: " );
//
//              value= keyboard.nextLine ();

//
//            if(num==10)
//            {
//                value="Ten";
//                myMap.put ( num,value );
//            }
//            if(num==11)
//            {
//                value="Eleven";
//                myMap.put ( num,value );
//            }
//            if(num==12)
//            {
//                value="Twelve";
//                myMap.put ( num,value );
//            }

            if(!myMap.containsKey (num ))
            {
                System.out.println ("Add " + num+ " value  to the map" );
                 value=keyboard.nextLine ();
                 myMap.put ( num,value );
            }

           //  hashMapArrayList.add ( myMap );
             //myMap.put ( num,value );

             System.out.println ("Do you want to inter another key value pair ?" );
             answer=keyboard.nextLine ();
         }while(answer.equalsIgnoreCase ( "Yes" ));

        for(int key: myMap.keySet ())
        {
            System.out.print (key );
            System.out.print (" " );
            System.out.println (myMap.get ( key ) );
        }

//        for(String values :myMap.values ())
//        {
//            System.out.println (values );
//        }




    }
}
