package com.Bridgelabs.BoosterBootCampProgram.Day3;

import java.util.Random;

public class DieRoll
{
    public static void main(String[] args)
    {
        Random rd = new Random(); 
        int freq[] = new int[6];
        int val;
        int chance = 1;
        while(chance <= 6000){
            val = 1 + rd.nextInt(6); 
            switch (val) {
                case 1:
                    ++freq[0];
                    break;
                case 2:
                    ++freq[1];
                    break;
                case 3:
                    ++freq[2];
                    break;
                case 4:
                    ++freq[3];
                    break;
                case 5:
                    ++freq[4];
                    break;
                case 6:
                    ++freq[5];
                    break;
            }
            chance++;
        }
        for(int i = 1; i <= 6; i++){
            System.out.println("Side: " + i + "-> Frequency : " + freq[i - 1]);
        }
    }
}
