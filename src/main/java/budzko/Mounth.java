package com.budzko;

import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Mounth {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number from 1 to 12: ");
        int number;
         try {
                number = in.nextInt();

                switch (number) {
                    case 1:
                        System.out.println(" 1 correspond - January");
                        break;
                    case 2:
                        System.out.println(" 2 correspond - February");
                        break;
                    case 3:
                        System.out.println(" 3 correspond - March");
                        break;
                    case 4:
                        System.out.println(" 4 correspond - April");
                        break;
                    case 5:
                        System.out.println(" 5 correspond - May");
                        break;
                    case 6:
                        System.out.println(" 6 correspond - June");
                        break;
                    case 7:
                        System.out.println(" 7 correspond - July");
                        break;
                    case 8:
                        System.out.println(" 8 correspond - August");
                        break;
                    case 9:
                        System.out.println(" 9 correspond - September");
                        break;
                    case 10:
                        System.out.println(" 10 correspond - October");
                        break;
                    case 11:
                        System.out.println("11 correspond - November");
                        break;
                    case 12:
                        System.out.println("12 correspond - December");
                        break;
                    default:
                        System.err.println("You input invalid number. Need enter number from 1 to 12.");
                        break;
                }
            }   catch (FormatterClosedException exp) {
                 System.out.println(exp);
            }
            catch (NoSuchElementException exp) {
                System.err.println("Invalid input! Need enter number from 1 to 12.");
                in.nextLine();
            }
        }
    }


