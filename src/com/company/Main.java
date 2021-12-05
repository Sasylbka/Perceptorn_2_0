package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static void Decrease(String number, List<Integer> weights){
        for(int i =0;i<15;i++){
            if(Integer.parseInt(Character.toString(number.charAt(i)))==1){
                weights.set(i,weights.get(i)-1);
            }
        }
    }
    static void Increase(String number,List<Integer> weights){
        for(int i=0;i<15;i++){
            if(Integer.parseInt(Character.toString(number.charAt(i)))==1){
                weights.set(i,weights.get(i)+1);
            }
        }
    }
    static Boolean Proceed(String number,List<Integer> weights,int bias){
        int net = 0;
        for(int i = 0;i<15;i++){
            net+=Integer.parseInt(Character.toString(number.charAt(i)))*weights.get(i);
        }
        if(net>=bias){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int biasS=10;
        int biasD=12;
        String alphabet="АБВГДЕЖЗИКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        List<String> chars= new ArrayList<>();
        chars.add(
                "011100" +
                "010100" +
                "011100" +
                "010100" +
                "010100");
        chars.add(
                "011100" +
                "010000" +
                "011110" +
                "010010" +
                "011110");
        chars.add(
                "011100" +
                "010100" +
                "011110" +
                "010010" +
                "011110");
        chars.add("011100" +
                "010000" +
                "010000" +
                "010000" +
                "010000");
        chars.add("001100" +
                "010100" +
                "010100" +
                "010100" +
                "111110");
        chars.add("011100" +
                "010000" +
                "011100" +
                "010000" +
                "011100");
        chars.add("101010" +
                "101010" +
                "011100" +
                "101010" +
                "101010");
        chars.add("111000" +
                "001000" +
                "111000" +
                "001000" +
                "111000");
        chars.add("100100" +
                "100100" +
                "101100" +
                "110100" +
                "100100");
        chars.add("101000" +
                "101000" +
                "110000" +
                "101000" +
                "101000");
        chars.add("011000" +
                "101000" +
                "101000" +
                "101000" +
                "101000");
        chars.add("100010" +
                "110110" +
                "101010" +
                "100010" +
                "100010");
        chars.add("010010" +
                "010010" +
                "011110" +
                "010010" +
                "010010");
        chars.add("111000" +
                "101000" +
                "101000" +
                "101000" +
                "111000");
        chars.add("111100" +
                "100100" +
                "100100" +
                "100100" +
                "100100");
        chars.add("111000" +
                "101000" +
                "111000" +
                "100000" +
                "100000");
        chars.add("111100" +
                "100000" +
                "100000" +
                "100000" +
                "111100");
        chars.add("011100" +
                "001000" +
                "001000" +
                "001000" +
                "001000");
        chars.add("101000" +
                "101000" +
                "111000" +
                "001000" +
                "110000");
        chars.add("001000" +
                "111110" +
                "101010" +
                "111110" +
                "001000");
        chars.add("101000" +
                "101000" +
                "010000" +
                "101000" +
                "101000");
        chars.add("001010" +
                "001010" +
                "001010" +
                "001010" +
                "001111");
        chars.add("001010" +
                "001010" +
                "001110" +
                "000010" +
                "000010");
        chars.add("101010" +
                "101010" +
                "101010" +
                "101010" +
                "111110");
        chars.add("101010" +
                "101010" +
                "101010" +
                "101010" +
                "111111");
        chars.add("011000" +
                "001000" +
                "001110" +
                "001010" +
                "001110");
        chars.add("010001" +
                "010001" +
                "011101" +
                "010101" +
                "011101");
        chars.add("001000" +
                "001000" +
                "001110" +
                "001010" +
                "001110");
        chars.add("110000" +
                "001000" +
                "011000" +
                "001000" +
                "110000");
        chars.add("010111" +
                "010101" +
                "011101" +
                "010101" +
                "010111");
        chars.add("000111" +
                "000101" +
                "000011" +
                "000101" +
                "000101");

        List<String> imagesOfNumbersD = new ArrayList<>();
        imagesOfNumbersD.add("001100" +
                "010100" +
                "010000" +
                "010100" +
                "111110");
        imagesOfNumbersD.add("001000" +
                "010100" +
                "010100" +
                "010100" +
                "110110");
        imagesOfNumbersD.add("000100" +
                "010100" +
                "010100" +
                "010100" +
                "011110");
        imagesOfNumbersD.add("001100" +
                "010100" +
                "000100" +
                "010100" +
                "110110");
        imagesOfNumbersD.add("001000" +
                "010100" +
                "010100" +
                "010100" +
                "111110");
        List<String> imagesOfNumbersS = new ArrayList<>();
        imagesOfNumbersS.add("111100" +
                "100000" +
                "000000" +
                "100000" +
                "111100");
        imagesOfNumbersS.add("111000" +
                "100000" +
                "100000" +
                "100000" +
                "111000");
        imagesOfNumbersS.add("111100" +
                "000000" +
                "100000" +
                "000000" +
                "111100");
        imagesOfNumbersS.add("011100" +
                "100000" +
                "100000" +
                "100000" +
                "011100");
        imagesOfNumbersS.add("101100" +
                "100000" +
                "100000" +
                "100000" +
                "101100");

        List<Integer> weightsD=new ArrayList<>();
        for(int i =0;i<30;i++){
            weightsD.add(0);
        }
        List<Integer> weightsS=new ArrayList<>();
        for(int i =0;i<30;i++){
            weightsS.add(0);
        }

        Random random = new Random();
        for(int i =0;i<10000;i++){
            int rand=random.nextInt(31);
            if(rand!=4 ){
                if(Proceed(chars.get(rand),weightsD,biasD)) {
                    Decrease(chars.get(rand), weightsD);
                }
            }
            else{
                if(!Proceed(chars.get(rand),weightsD,biasD)){
                    Increase(chars.get(rand),weightsD);
                }
            }
            if(rand!=16){
                if(Proceed(chars.get(rand),weightsS,biasS)) {
                    Decrease(chars.get(rand), weightsS);
                }
            }
            else{
                if(!Proceed(chars.get(rand),weightsS,biasS)){
                    Increase(chars.get(rand),weightsS);
                }
            }
        }
        for(int i=0;i<chars.size();i++){
            System.out.println(alphabet.charAt(i)+" это Д или С? |Д:"+Proceed(chars.get(i),weightsD,biasD)+"|С:"+Proceed(chars.get(i),weightsS,biasS)+"|");
            System.out.println("-----------------------------------------------------------------------");
        }
        for(int i=0;i<imagesOfNumbersD.size();i++){
            System.out.println(" Узнал "+i+" образ для Д и С |Д:"+Proceed(imagesOfNumbersD.get(i),weightsD,biasD)+"|С:"+Proceed(imagesOfNumbersS.get(i),weightsS,biasS)+"|");
            System.out.println("-----------------------------------------------------------------------");
        }

    }
}
