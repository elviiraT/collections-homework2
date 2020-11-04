package com.company;
import ibadts.IBCollection;
import static ibio.Helpers.*;

public class Main
{

    public static void main(String[] args)
    {
        boolean flag = true;
        int t = 0;
        IBCollection <Integer> numbers = new IBCollection<>();
        while (flag)
        {
            int number =  inputInt ("enter number: ");
            if (number <= 0)
                flag = false;
            else
            {
                numbers.addItem(number);
                t = number;
            }
        }
        while (numbers.hasNext())
        {
         int number = numbers.getNext();
         if (number > t)
             System.out.print (number);
        }
    }
}
