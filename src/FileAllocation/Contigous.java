/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileAllocation;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class Contigous {
    
   
void contigousAllocation(){
   Scanner y = new Scanner(System.in);
         
        System.out.println("Enter the number of blocks in your memory");
       int  MemoryNumberOfBlocks = y.nextInt();
        int MNBstore = MemoryNumberOfBlocks;
      
        
        System.out.println("Enter no. of files: ");
        int NumberOfFiles = y.nextInt();
      
        int FileNumberOfBlocks[] = new int[MemoryNumberOfBlocks];
       
        boolean BlockStatus[] = new boolean[MemoryNumberOfBlocks];
         for (int i = 0; i < MemoryNumberOfBlocks; i++) 
            BlockStatus[i] = false;
        
       
        
        ArrayList<String> File = new ArrayList<>();

        for (int i = 0; i < NumberOfFiles; i++) 
        {
            int FileNumber = i + 1;
            System.out.println("Enter file name number " + FileNumber);
            
            String FileInput;
            FileInput = y.next();
            File.add(FileInput);
            
            System.out.println("Enter no. of blocks occupied by the file named -> " + File.get(i));
            FileNumberOfBlocks[i] = y.nextInt();
             Random rand = new Random();
        int randd[]=new int[NumberOfFiles];
       /*
        while(){
        
        */   while (true) 
            {
                 if (FileNumberOfBlocks[i] > MemoryNumberOfBlocks) 
                {
                    System.err.println("invalid,please enter a valid number");
                    FileNumberOfBlocks[i] = y.nextInt();
                }
                
                 else 
                {
                    break;
                }
            }  
        for (int i2 = 0; i2 < NumberOfFiles; i2++) 
        {
            
        randd[i2] = rand.nextInt(MNBstore);
     
int x=0;
            while (x!=i2 ) 
            {
                
              if (randd[i2]<randd[x]&&  FileNumberOfBlocks[i2]+randd[i2]<randd[x]) {
                    x++;
                    }
                else  if (randd[i2]>randd[x]+FileNumberOfBlocks[x]&&randd[i2]+FileNumberOfBlocks[i2]<MNBstore) {
                    x++;
                }
                else {
                    randd[i2]=rand.nextInt(MNBstore);
                    x=0;
               
                }                }            }


                   
            


            MemoryNumberOfBlocks -= FileNumberOfBlocks[i];
        }
        
        System.out.println("Filename\tStart block\tEnding Block\tlength\n");
        Random rand = new Random();
        int randd[]=new int[NumberOfFiles];
       /*
        while(){
        
        */
        for (int i = 0; i < NumberOfFiles; i++) 
        {
            
        randd[i] = rand.nextInt(MNBstore);
     
int x=0;
            while (x!=i ) 
            {
                
              if (randd[i]<randd[x]&&  FileNumberOfBlocks[i]+randd[i]<randd[x]) {
                    x++;
                    }
                else  if (randd[i]>randd[x]+FileNumberOfBlocks[x]&&randd[i]+FileNumberOfBlocks[i]<MNBstore) {
                    x++;
                }
                else {
                    randd[i]=rand.nextInt(MNBstore);
                    x=0;
               
                } }
                    System.out.println(File.get(i) + "\t\t" + randd[i] + "\t\t" + (randd[i] + FileNumberOfBlocks[i]) + "\t\t" + FileNumberOfBlocks[i]);
        }

        System.out.print("\n" + "blocks occupiedate:\n" + "\n");
        int o = 0;
        for (int i = 0; i < NumberOfFiles; i++) 
        {

            System.out.print("file name-> " + File.get(i));
            for (int j = 0; j <= FileNumberOfBlocks[i]; j++)
            {
                System.out.print("\t" + randd[i]);
                randd[i]++;
            }
            System.out.print("\n");
        }



}
}

