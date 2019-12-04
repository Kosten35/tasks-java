package budzko.JFundament;

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
                        System.out.println(" 1 this is - January");
                        break;
                    case 2:
                        System.out.println(" 2 this is - February");
                        break;
                    case 3:
                        System.out.println(" 3 this is - March");
                        break;
                    case 4:
                        System.out.println(" 4 this is - April");
                        break;
                    case 5:
                        System.out.println(" 5 this is - May");
                        break;
                    case 6:
                        System.out.println(" 6 this is - June");
                        break;
                    case 7:
                        System.out.println(" 7 this is - July");
                        break;
                    case 8:
                        System.out.println(" 8 this is - August");
                        break;
                    case 9:
                        System.out.println(" 9 this is - September");
                        break;
                    case 10:
                        System.out.println(" 10 this is - October");
                        break;
                    case 11:
                        System.out.println("11 this is - November");
                        break;
                    case 12:
                        System.out.println("12 this is - December");
                        break;
                    default:
                        System.err.println("You input invalid number. Need enter number from 1 to 12.");
                        break;
                }
                in.close();
            }   catch (FormatterClosedException exp) {
                 System.out.println(exp);
            }
            catch (NoSuchElementException exp) {
                System.err.println("Invalid input! Need enter number from 1 to 12.");
                in.nextLine();
            }
        }
    }


