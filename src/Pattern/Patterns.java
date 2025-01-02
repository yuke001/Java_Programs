	package Pattern;
	
	public class Patterns {
	
		public static void main(String[] args) {
	
			int no = 5;
	
	//-------------------------------------------------------------------	
			System.out.println(1);
	//-------------------------------------------------------------------	
	
			for (int row = 1; row <= no; row++) {
	
				for (int col = 1; col <= no; col++) {
	
					if (row >= col) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
	
	//		*
	//		**
	//		***
	//		****
	//		*****
	
	//-------------------------------------------------------------------	
			System.out.println(2);
	//-------------------------------------------------------------------
	
			for (int row = 1; row <= no; row++) {
	
				for (int col = 1; col <= no; col++) {
	
					if (row <= col) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
	
	//		*****
	//		 ****
	//		  ***
	//		   **
	//		    *		
	
	//-------------------------------------------------------------------	
			System.out.println(3);
	//-------------------------------------------------------------------	
			for (int row = 1; row <= no; row++) {
	
				for (int col = 1; col <= no; col++) {
	
					if (row <= col) {
						System.out.print("* ");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
	
	//				* * * * * 
	//				 * * * * 
	//				  * * * 
	//				   * * 
	//				    * 
	
	//-------------------------------------------------------------------	
			System.out.println(4);
	//-------------------------------------------------------------------	
	
			for (int row = 1; row <= no; row++) {
	
				for (int col = no; col >= 1; col--) {
	
					if (row >= col) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
	
	//			     *
	//			    **
	//			   ***
	//			  ****
	//			 *****
	//-------------------------------------------------------------------	
			System.out.println(5);
	//-------------------------------------------------------------------	
	
			for (int row = 1; row <= no; row++) {
	
				for (int col = 1; col <= no; col++) {
	
					if (row <= col) {
						System.out.print("*");
					} else {
						System.out.print("");
					}
				}
				System.out.println();
			}
	
	//				*****
	//				****
	//				***
	//				**
	//				*
	//-------------------------------------------------------------------	
			System.out.println(6);
	//-------------------------------------------------------------------	
	
			for (int row = 1; row <= no; row++) {
	
				for (int col = no; col >= 1; col--) {
	
					if (row >= col) {
						System.out.print("* ");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
	
	//			     * 
	//			    * * 
	//			   * * * 
	//			  * * * * 
	//			 * * * * * 
	
	//-------------------------------------------------------------------	
			System.out.println(7);
	//-------------------------------------------------------------------
	
			for (int row = 1; row <= no; row++) {
	
				for (int col = 1; col <= no; col++) {
	
					if (row >= col) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
	
				for (int col = no; col >= 1; col--) {
	
					if (row >= col) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			
	
		}
			
	//		*        *
	//		**      **
	//		***    ***
	//		****  ****
	//		**********
			
			
	//-------------------------------------------------------------------	
					System.out.println(8);
	//-------------------------------------------------------------------
	
					//5
					for (int row = 1; row <= no; row++) {
	
						for (int col = 1; col <= no; col++) {
	
							if (row <= col) {
								System.out.print("*");
							} else {
								System.out.print("");
							}
						}
						
						
					
					
					//2
	
						for (int col = 1; col <= no; col++) {
	
							if (row <= col) {
								System.out.print("*");
							} else {
								System.out.print("  ");
							}
						}
						System.out.println();
					}
					
					
	//				**********
	//				****  ****
	//				***    ***
	//				**      **
	//				*        *
					
	//-------------------------------------------------------------------	
					System.out.println(9);
	//-------------------------------------------------------------------
	// 5 , 1
					//5
					for (int row = 1; row <= no; row++) {
	
						for (int col = 1; col <= no; col++) {
	
							if (row <= col) {
								System.out.print("*");
							} else {
								System.out.print("");
							}
						}
						System.out.println();
					}
					//1
					for (int row = 1; row <= no; row++) {
	
						for (int col = 1; col <= no; col++) {
	
							if (row >= col) {
								System.out.print("*");
							} else {
								System.out.print(" ");
							}
						}
						System.out.println();
					}
					
					
	//				*****
	//				****
	//				***
	//				**
	//				*
	//				*    
	//				**   
	//				***  
	//				**** 
	//				*****
					
	
	//-------------------------------------------------------------------	
		System.out.println(10);
	//-------------------------------------------------------------------
	
		// 1
	
		for(
	
		int row = 1;row<=no;row++)
		{
	
						for (int col = 1; col <= no; col++) {
							
							if (row <= col) {
								System.out.print("*");
							}
							else {
								System.out.print(" ");
							}
						}
						System.out.println();
					}
	
		for(
		int row = 1;row<=no;row++)
		{
	
			for (int col = no; col >= 1; col--) {
	
				if (row >= col) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	//				*****
	//				 ****
	//				  ***
	//				   **
	//				    *
	//				    *
	//				   **
	//				  ***
	//				 ****
	//				*****
	
	//-------------------------------------------------------------------	
					System.out.println(11);
	//-------------------------------------------------------------------
	
			//3 , 6		
				    //3
					for (int row = 1; row <= no; row++) {
	
						for (int col = 1; col <= no; col++) {
	
							if (row <= col) {
								System.out.print("* ");
							} else {
								System.out.print(" ");
							}
						}
						System.out.println();
					}
					///6
					for (int row = 1; row <= no; row++) {
	
						for (int col = no; col >= 1; col--) {
	
							if (row >= col) {
								System.out.print("* ");
							} else {
								System.out.print(" ");
							}
						}
						System.out.println();
					}
	
	//				* * * * * 
	//				 * * * * 
	//				  * * * 
	//				   * * 
	//				    * 
	//				    * 
	//				   * * 
	//				  * * * 
	//				 * * * * 
	//				* * * * * 
					
					
	//-------------------------------------------------------------------	
					System.out.println(12);
	//-------------------------------------------------------------------
	// 3 , 6
					//6
					
					///6
					for (int row = 1; row <= no; row++) {
	
						for (int col = no; col >= 1; col--) {
	
							if (row >= col) {
								System.out.print("* ");
							} else {
								System.out.print(" ");
							}
						}
						System.out.println();
					}
					 //3
					for (int row = 1; row <= no; row++) {
	
						for (int col = 1; col <= no; col++) {
	
							if (row <= col) {
								System.out.print("* ");
							} else {
								System.out.print(" ");
							}
						}
						System.out.println();
					}
					
					
	//			     * 
	//			    * * 
	//			   * * * 
	//			  * * * * 
	//			 * * * * * 
	//			 * * * * * 
	//			  * * * * 
	//			   * * * 
	//			    * * 
	//			     * 
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
	}}
