package word3;

public class word3_4 {
	  public static void main(String[] args) {
//		  正三角
	        for (int i = 0; i <= 5; i++) {
	            for (int j = 5; j >= i; j--) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j<= i ; j++){
	                System.out.print("*");
	            }
	            for (int j = 1 ; j< i ; j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
//	       倒三角
	        System.out.println();
	        for (int i = 5; i >= 0; i--) {
	            for (int j = 5; j >= i; j--) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j<= i ; j++){
	                System.out.print("*");
	            }
	            for (int j = 1 ; j< i ; j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
//	        菱形
	        System.out.println();
	        for (int i = 0; i <= 5; i++) {
	            for (int j = 5; j >= i; j--) {
	                System.out.print(" ");
	            }
	            System.out.print("*");
	            for (int j = 1; j<= i ; j++){
	                System.out.print(" ");
	            }
	            for (int j = 1 ; j< i ; j++){
	                System.out.print(" ");
	            }
	            if(i!=0) {
	            	System.out.print("*");
	            }
	            System.out.println();
	        }
	        for (int i = 5; i >= 0; i--) {
	        	for (int j = 5; j >= i; j--) {
	                System.out.print(" ");
	            }
	            System.out.print("*");
	            for (int j = 1; j<= i ; j++){
	                System.out.print(" ");
	            }
	            for (int j = 1 ; j< i ; j++){
	                System.out.print(" ");
	            }
	            if(i!=0) {
	            	System.out.print("*");
	            }
	            System.out.println();
	        }
	        
	    }

}
