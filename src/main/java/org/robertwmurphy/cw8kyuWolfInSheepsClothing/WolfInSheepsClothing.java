package org.robertwmurphy.cw8kyuWolfInSheepsClothing;

public class WolfInSheepsClothing {

    public static String warnTheSheep(String[] array) {
        int arraySize = array.length;
        if (array[arraySize-1].equals("wolf")) {
            return "Pls go away and stop eating my sheep";
        }

        for(int i = 0; i < arraySize; i++) {
            if(array[i].equals("wolf") && (i < (arraySize-1))) {
                return "Oi! Sheep number " + (arraySize - (i + 1)) + "! You are about to be eaten by a wolf!";
            }
        }

        return "";
    }
}
