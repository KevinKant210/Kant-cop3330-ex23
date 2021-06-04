package E_23;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Kant
 */

public class App 
{
    public static void main( String[] args )
    {
        DMaker decide = new DMaker();
        Scanner reader = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String holder = reader.next();
        if(decide.Decide(holder)){
            System.out.print("Are the battery terminals corroded? ");
            holder = reader.next();
            if(decide.Decide(holder)){
                System.out.println("Clean Terminals and try again");
            }else{
                System.out.println("Replace Cables and try again");
            }
        }else{
            System.out.print("Does the car make a slicking noise? ");
            holder = reader.next();
            if(decide.Decide(holder)){
                System.out.println("Replace the batteries");
            }else{
                System.out.print("Does the car crank up but fail to start? ");
                holder = reader.next();
                if(decide.Decide(holder)){
                    System.out.println("Check spark plug connection");

                }else{
                    System.out.print("Does the engine start and the die? ");
                    holder = reader.next();
                    if(decide.Decide(holder)){
                        System.out.print("Does your car have fuel injection? ");
                        holder = reader.next();
                        if(decide.Decide(holder)){
                            System.out.println("Get it in for service");
                        }else{
                            System.out.println("Check to ensure the choke is opening and closing");
                        }
                    }else{
                        System.out.println("This should not be possible");
                    }
                }
            }
        }


    }
}
