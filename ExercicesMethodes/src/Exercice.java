import java.util.Random;

public class Exercice {

	
	public static int add (int i, int j ){
		return i +j;
	}
	
	public static void display(int[] tab ){
		for( int i = 0; i < tab.length; i++){
			System.out.print(tab[i]+ " ");
		}
		System.out.println();
		}
		
	public static int sum(int[] tab){
		int sum = 0;
		for( int i = 0; i < tab.length; i++){
			sum +=tab[i];
		}
		return sum;
	}
	
	public static int max(int[] tab){
		int max = tab[0];
		for( int i = 0; i < tab.length; i++){
			if (max < tab[i]){
				max = tab[i];
			}
		}
		return max;
	}

	public static double average(int[] tab){
		return (double) sum(tab)/tab.length;
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
		permut(tab,index - 1, index);
	}	
	
	public static void remove(int[] tab, int index){
		for( int i = index; i < tab.length - 1; i++){
			tab[i] = tab[i+1];
		}
	}
	
	public static void insert(int[] tab, int index, int value){
		for( int i = tab.length - 1; i > index; i--){
			tab[i] = tab[i-1];
		}
		put(tab,index,value);
	}
	
	
	public static int[] clone(int[] tab){
		int[] tab2 = new int[tab.length];
		for( int i = 0; i < tab.length; i++){
			tab2[i] = tab[i];
		}		
		return tab2;
	}
	
	public static int[] even(int[] tab){
		int[] tab2 = new int[tab.length];
		int j = 0;
		for( int i = 0; i < tab.length; i++){
			if (tab[i]%2 == 0){
				tab2[j] = tab[i];
				j++;
			}
		}		
		return tab2;
	}	

	public static int[] inverse(int[] tab){
		int[] tab2 = new int[tab.length];
		for( int i = 0; i < tab.length; i++){
			tab2[tab.length - 1- i] = tab[i];
		}		
		return tab2;	
	}	
	
	public static int[] remove2(int[] tab, int index){
		int[] tab2 = new int[tab.length -1];
		for( int i = 0; i < index ; i++){
			tab2[i] = tab[i];
			}			
		for( int i = index + 1 ; i < tab.length; i++){
			tab2[i-1] = tab[i];
			}
		return tab2;
	}		

	
	public static int[] insert2(int[] tab, int index, int value){
		int[] tab2 = new int[tab.length +1];
		for( int i = 0; i < index ; i++){
			tab2[i] = tab[i];
			}
		tab2[index] = value;
		for( int i = index ; i < tab.length; i++){
			tab2[i+1] = tab[i];
			}
		return tab2;		
	}	

	public static void triBulle(int[] tab){		
		for( int j =  tab.length; j > 1; j--){
			for( int i = 1; i < j; i++){
				if (tab[i] < tab[i-1]){
					permut2(tab,i);
					}
				}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2,5));
		int[] tab = {9,5,7,3,4,2};
		display(tab); 
		System.out.println(sum(tab));
		System.out.println(max(tab));
		System.out.println(average(tab));
		triBulle(tab);
		display(tab); 
	}

}
