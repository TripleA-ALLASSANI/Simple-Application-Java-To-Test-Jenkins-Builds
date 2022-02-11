package ma.enset.myapp;

import ma.enset.myapp.service.*;

public class MyApp {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("You must provide 2 arguments");
			//Quitter l'appli(ici 0 i.e j quitte le processus principal de m'appli)
			System.exit(0);
		}
		MyService service= new MyService();
		//parse car args contient q des string
		double a= Double.parseDouble(args[0]);
		double b= Double.parseDouble(args[1]);
		double result = service.computer(a, b);
		System.out.println(String.format("Sum of %s and %s is %s", a,b,result));
	}
}