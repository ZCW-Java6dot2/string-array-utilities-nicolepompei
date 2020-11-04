package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
String lastElement = array[array.length-1];
        return lastElement;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String secondToLastElement = array[array.length-2];
        return secondToLastElement;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
    boolean elementExists = true;
        for(int i = 0; i< array.length; i++){
            String arrayElement =  array[i];
            if(arrayElement.equals(value)){
                elementExists = true;
                break;
            }
            else elementExists = false;
        }
        return elementExists;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        for(int i =0; i < array.length/2; i++){
            String strTemp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length -i-1] = strTemp;
        }
        for(int i =0; i < array.length; i++);

        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean isPal = true;
        if(reverse(array).equals(array)){
            isPal = true;
        } else isPal = false;
        return isPal;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean answer = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (String x : array){
            stringBuilder.append(x);
        }
        String s = "";
        s = stringBuilder.toString();
        for(char i = 'A'; i <= 'Z'; i++){
            if ((s.indexOf(i) < 0) && (s.indexOf((char)i+32)< 0)){
                answer = false;
            }else{
                answer = true;
            }
        }
        return answer;

      /*  String strArray = array.toString();

        boolean[] mark = new boolean[26];
        int index = 0;

        for (int i = 0; i < array.length; i++) {

            if('A' <= strArray.charAt(i) && strArray.charAt(i) <= 'Z')
                index = strArray.charAt(i) - 'A';
            else if('a' <= strArray.charAt(i) && strArray.charAt(i) <= 'z')
                index = strArray.charAt(i) - 'a';
            else
                continue;
            mark[index] = true;
        }

        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);
            return (true);*/
            }



        /**
         * @param array array of String objects
         * @param value value to check array for
         * @return number of occurrences the specified `value` has occurred
         */ // TODO
        public static int getNumberOfOccurrences (String[]array, String value){

            int counter = 0;
            for(int i = 0; i< array.length; i++){
                String arrayElement =  array[i];
                if(arrayElement.equals(value)){
                    counter++;
                }
            }

            return counter;
        }

        /**
         * @param array         array of String objects
         * @param valueToRemove value to remove from array
         * @return array with identical contents excluding values of `value`
         */ // TODO
        public static String[] removeValue (String[]array, String valueToRemove){
            int count = 0;
            for(String arrayElement : array){
                if(arrayElement == valueToRemove){
                    count++;
                }
            }

            if(count == 0){
                return array;
            }

            String[] result = new String[array.length - count];
            int index = 0;
            for(String value : array){
                if(value != valueToRemove){
                    result[index] = value;
                    index++;
                }
            }
            array = null;
            return result;

        }

        /**
         * @param array array of chars
         * @return array of Strings with consecutive duplicates removes
         */ // TODO
        public static String[] removeConsecutiveDuplicates (String[]array){
            ArrayList<String> newArray = new ArrayList<String>();
            for(int i=0; i<(array.length-1);i++){
                if(!array[i].equals(array[i+1])){
                    newArray.add(array[i]);
                }
            }
            newArray.add(array[array.length-1]);
            String[] strArr = newArray.toArray(new String[0]);
            return strArr;
        }


        /**
         * @param array array of chars
         * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
         */ // TODO
        public static String[] packConsecutiveDuplicates (String[]array){
            ArrayList<String> newArray = new ArrayList<String>();
            StringBuilder word = new StringBuilder();
            int i=1;
            word.append(array[0]);
            while (i<(array.length)){
                if (array[i].equals(array[i-1])){
                    word.append(array[i]);
                } else {
                    newArray.add(word.toString());
                    word.setLength(0);
                    word.append(array[i]);
                }
                i++;
            }
            newArray.add(word.toString());
            String[] strArr = newArray.toArray(new String[0]);
            return strArr;
        }

    }

