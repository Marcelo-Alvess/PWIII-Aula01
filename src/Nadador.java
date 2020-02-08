
public class Nadador {
	public static void main(String[] args) {
		int idade = 16;
		
		boolean nenhum = idade < 5;
		boolean infantil = idade <= 7;
		boolean juvenil = idade <= 10;
		boolean adolescente = idade <= 15; 
		boolean adulto = idade <= 30;
		boolean senior = idade > 30;
		
		if(nenhum) {
			System.out.println("Não existe");
			
		}else if (infantil) {
			System.out.println("Infantil");
			
		}else if (juvenil){
			System.out.println("Juvenil");

		}else if (adolescente) {
			System.out.println("Adolescente");
			
		}else if (adulto) {
			System.out.println("Adulto");
			
		}else if (senior) {
			System.out.println("Sênior");
			
		}
		
		/*
			if (idade > 4 && idade <= 7) {
				System.out.println("Infantil");
				
			} else if (idade > 7 && idade <= 10){
				System.out.println("Juvenil");
	
			}else if (idade > 10 && idade <= 15) {
				System.out.println("Adolescente");
				
			}else if (idade > 15 && idade <= 30) {
				System.out.println("Adulto");
				
			}else if (idade > 30) {
				System.out.println("Sênior");
				
			}
		*/
		
		
	}
}
