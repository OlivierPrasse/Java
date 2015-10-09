import java.util.Random;

import com.m2i.formation.geometry.*;
import com.m2i.formation.media.*;

public class Hello {
	
	/**
	 * 
	 * Fonction add
	 * @param i Premier parametre
	 * @param j deuxieme parametre
	 * @return ajout des deux opérandes
	 */
	public static int add (int i, int j ){
		return i + j;	
	}
	
	public static void display(int[] tab ){
		for (int i = 0; i < tab.length; i++){
			System.out.print(tab[i] + " ");
		}
			System.out.println();
		}
		
	public static int sum(int[] tab){
		int somme =0;
		for (int i = 0; i < tab.length; i++){
				//somme = somme +tab[i]; synonime de ce qu'il ya en dessous
			somme += tab[i];
		}
		return somme;
	}
	
	public static int max(int[] tab){
		int max = tab[0];
		for (int i = 1; i < tab.length; i++){
			if (max < tab[i]) {
				max = tab[i];
			}
		}	
		return max;
	}

	public static double average(int[] tab){
		// il faut caster par exemple la sum pour ne pas arrondir la moyenne
		// l'opérarteur de caste est plus prioritaire que la division.
		// je manipule des entiers, java va sortir un entier.
		return (double)sum(tab)/tab.length;
	}
	
	public static void createRandomlyTab(int length){
		int[] tab = new int[length];
		Random rnd = new Random();
		 
		for (int i = 0; i < tab.length; i++){
			tab[i] = rnd.nextInt(100);
			}
		display(tab);
	}
		
	public static void put(int[] tab, int index, int value){
		tab[index] = value;
	}

	public static void permut(int[] tab, int index1, int index2){
		int tampon = tab[index1];
		tab[index1] = tab[index2];
		tab[index2] = tampon;
	}
	public static void permut2(int[] tab, int index){
		permut(tab, index, index-1);
	}	
	
	public static void remove(int[] tab, int index){
		for (int i = index; i < tab.length-1; i++){
			tab[i] = tab[i+1];
		}	
	}
	
	public static void insert(int[] tab, int index, int value){
		for (int i = (tab.length-1); i > index; i--){
			tab[i] = tab[i-1];
			}
		put(tab,index,value);
	}	
	
	public static int[] clone(int[] tab){
		int[] tab2 = new int[tab.length];
		for (int i = 0; i < tab.length; i++){
			tab2[i] = tab[i];
		}
		return tab2;
	}
	
	public static int[] even(int[] tab){
		int[] tab2 = new int[tab.length];
		int i2 = 0;
			for (int i = 0; i < tab.length; i++){
				if (tab[i] % 2 == 0){
					tab2 [i2] = tab[i];
					i2++;
			}
		}
		return tab2;
	}	

	public static int[] inverse(int[] tab){
		int[] tab2 = new int[tab.length];
		int j = tab.length -1;
			for (int i = 0; i < tab.length; i++){
					tab2 [tab.length -1 -i] = tab[i];
		}
		return tab2;
	}	
	
	public static int[] remove2(int[] tab, int index){
		remove(tab,index);
		int[] tab2 = new int[tab.length-1];
		for (int i = 0; i < tab.length -1 ; i++){
			tab2 [i] = tab[i];
			}
		return tab2;
	}		

	
	public static int[] insert2(int[] tab, int index, int value){
		int[] tab2 = new int[tab.length+1];
		for (int i = 0; i < index; i++){
			tab2[i] = tab[i];
			}
		tab2[index] = value;
		for (int i = index; i < tab.length; i++){
			tab2[i+1] = tab[i];
			}		
		return tab2;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* System.out.println("Hello World");
		int i = 3;
		int j = 5;
		System.out.println("i= " + i);
		System.out.println("j= " + j);
		int n = j;
		j = i;
		i = n;
		System.out.println("i= " + i);
		System.out.println("j= " + j);
		
		// boucle jusqu'a 100
		for ( i = 0 ; i <100; i++ ){
			System.out.print(i+ " ");
		}
		System.out.println();	
		
		// compte à rebour
		for ( i = 10 ; i >0; i-- ){
			System.out.print(i+ " ");
		}
			System.out.println("BOOM");
		
		// puissance de 2
		j = 1;	
		for ( i=0 ; i <10; i++ ){
			j *=2;
			System.out.print(j+ " ");
		}
	
		// afficher les 50 nombres premiers
		int toTest = 2;
		for(i=0;i<50;i++){
			boolean isPrime = true;
			j=2;
			while(isPrime && j<toTest){
				if (toTest % j == 0){
					isPrime = false;
				}
				j++;
			}
			if (isPrime) {
				System.out.println(toTest);
			}
			toTest++;
		}
		*/
		// appel de add
		System.out.println(add(2,3));
		
		// Tableaux en Lecture
		int[] tab = {1,2,3,4,5};
		display(tab); 
		System.out.println(sum(tab));
		System.out.println(max(tab));
		System.out.println(average(tab));
		createRandomlyTab(10);
		put(tab,2,99);
		permut(tab,1,3);
		permut2(tab,2);
		remove(tab,1);
		insert(tab,2,99);
		display(tab); 
		display(clone(tab));
		display(even(tab));
		display(inverse(tab));
		display(remove2(tab, 2));
		display(insert2(tab, 2,99));
		
		
		Book b = new Book();
		Publisher editeur =  new Publisher();
		Author auteur1 = new Author();
		Author auteur2 = new Author();
		
		try{
		IMedia b2 = new Book(); // compile car book est un media
		Book b3 = (Book) b2; // on catse b2
		int nbPage = ((Book)b2).getNbPage();
		
		b.setTitle("Java");
		b.setId(12345);
		b.setIsbn("ZOR123");
		b.setLang("fr-FR");
		b.setNbPage(125);
		b.setPrice(12.6);
		
		editeur.setName("Nathan");
		editeur.setSiret("ddd222");
		
		b.setPublisher(editeur);
		
		auteur1.setFirstName("Roger");
		auteur1.setLastName("Hanin");
		
		auteur2.setFirstName("Toto");
		auteur2.setLastName("Lehero");
		
		b.addAuthor(auteur1);
		b.addAuthor(auteur2);
		
		Media m = new Book();
		m.setPrice(10);
		System.out.println(m.getVATPrice());
		}catch (MediaException e){
			e.printStackTrace();
		}
		
		/* System.out.println(b.getTitle());
		System.out.println(b.getId());
		System.out.println(b.getIsbn());
		System.out.println(b.getLang());
		System.out.println(b.getNbPage());
		System.out.println(b.getPrice());
		System.out.println(b.getPublisher().getName());
		System.out.println(b.getPublisher().getSiret());
		*/
		
		Counter c1 = new Counter();
		System.out.println(c1.increment());
		System.out.println(c1.increment());
		System.out.println(c1.increment());
		
		Counter c2 = new Counter();
		System.out.println(c2.increment());
		System.out.println(c2.increment());
		System.out.println(c2.increment());
		
		b.setBookCategory(BookCategory.Computer);
		
	}

}
