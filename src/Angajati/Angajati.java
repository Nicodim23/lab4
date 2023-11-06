package Angajati;

/* nume, email, timpMuncit, capacitatea, zileLibere, DailyIncome, MonthlyIncome */

import java.util.Scanner;
import java.util.ArrayList;

public class Angajati {
    public char nume;
    public char email;
    public double timpMuncit;
    public double capacitatea;
    public double zileLibere;
    public double DailyIncome;
    public double MonthlyIncome(double DailyIncome * 30);


    public Angajati(string nume, string email, double timpMuncit, double capacitatea, double zileLibere, double DailyIncome, double MonthlyIncome);
    this.nume=nume;
    this.email=email;
    this.timpMuncit=timpMuncit;
    this.capacitatea=capacitatea;
    this.zileLibere=zileLibere;

    public static void main(String[] args)
        {
            ArrayList<String> Angajati = new ArrayList<String>();

        }
    }

    public static void main(String[] args)
    {

        Scanner Angajati = new Scanner(System.in);
        String numar = Angajati.nextInt();
        System.out.println("Numarul de angajati este: " + numar);
    }

