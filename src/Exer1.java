import java.util.*;
public class Exer1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dime un dia la semana: ");
		String monday=sc.nextLine();
		System.out.println(monday.matches("Lunes"));
		
		System.out.println("Introduce un texto cortito");
		String text1=sc.nextLine();
		System.out.println(text1.matches("[a-zñA-ZÑ]{3})"));
		
		System.out.println("Intruce una linea de 5 o mas caracteres.");
		String text2=sc.nextLine();
		System.out.println(text2.matches("[^ñzxÑZX]{5,}"));
		
		System.out.println("Introduce un texto que no empice con un numero");
		String text3=sc.nextLine();
		System.out.println(text3.matches("[//D.*]"));
		
		System.out.println("Introduce un texto que no empiece por b");
		String text4=sc.nextLine();
		System.out.println(text4.matches("[^bB]{2,}"));
		
		System.out.println("Dime tu numero de telefono guapo");
		String numero=sc.next();
		System.out.println(numero.matches("[0-9]{9]"));
		
		System.out.println("Dame tu DNI, necesito comprobar antecedentes");
		String dni=sc.nextLine();
		System.out.println(dni.matches("\\d{8}[A-Zñ]"));
		
		System.out.println("Dime tu nombre");
		String nombre=sc.nextLine();
		System.out.println(nombre.matches("[A-Zñ][-z]{1,}"));
		
		System.out.println("Dime una cadena que empiece por vocal");
		String text5=sc.nextLine();
		System.out.println(text5.matches("[aeiouAEIOU][a-zA-Z && [^aeiouAEIOU]]*"));
		
		System.err.println("Introduce un nunero menor a 300");
		String numero2=sc.nextLine();
		System.out.println(numero2.matches("[21]?\\d?\\d"));
		
		
				
		
		
		

	}

}
