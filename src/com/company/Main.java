package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
            Scanner infoMan = new Scanner(new File("scores.txt"));
            int maxIndx = -1;
            String storage[]=new String[1000];
        String scores[]= new String[1000];
        String storage2[]=new String[1000];
        String split[];


            while(infoMan.hasNext())
            {
                maxIndx++;
                scores[maxIndx]=infoMan.nextLine();
                storage[maxIndx]=infoMan.nextLine();
            }
        for(int i = 0;i<storage.length;i++){

            if(storage[i] == null)
                break;


            split=storage[i].split("\t");
            if(split.length > 18) {
                if (split[18].equals("") || split[19].equals("") || split[20].equals("")) {
                    System.out.println("N/A");
                }
                else{

                }
            }
            }

        }

    }

