package j0523;

public class C0523_01 {

	public static void main(String[] args) {
		Deck d = new Deck();
		
		//System.out.printf("%s, %d \n", d.c[0].kind , d.c[0].number);
		//System.out.printf("%s, %d \n", d.c[51].kind , d.c[0].number);
		d.shuffle();
		
			for(int i = 0 ; i < 52 ; i++) {
				System.out.println(d.c[i].kind + " "+Card.numbers[ d.c[i].number-1] );
			
		}
			
			
			
		}
	}

			//int[] arr = {1,2,3,4,5};
			
//			//for(int i = 0 ; i < 5 ; i++) {
//				//System.out.println(arr[i]);
//				
//			for(int i = 1 ; i < 10 ; i++) {
//				System.out.println("----------------------------------------");
//				for(int j = 1 ; j < 10 ; j++) {
//					System.out.printf("%d * %d = %d \t \n", i, j , i*j);
//				}
//			}
//				
//			}
		

	


