package main;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String nama;
        float tinggi;
         
        Scanner SC=new Scanner(System.in);
         
        System.out.print("Nama : ");
        nama= SC.nextLine();

        System.out.print("Tinggi ÒBadan (CM) : ");
        tinggi=SC.nextInt();

        System.out.println("Nama: " + nama);
        System.out.println("Tinggi (M) : " + tinggi / 100);
                                  
    }
}

