
import java.awt.*;
import java.applet.*;
import java.util.concurrent.TimeUnit;

public class automata extends Applet {

	int[] cells = new int[79];
	int generation = 0;
	int ruleNumber = 2;

   public void paint(Graphics g) {
	   
	   int[] rule = {0,1,0,1,1,0,1,0};

	   for (int k = 0; k < 17; k++) {
		   cells[cells.length/2] = 1;
		   for (int j = 0; j < 39; j++) {
			   for (int i = 0; i < cells.length; i++) {
				   if (cells[i] == 1)
					   g.setColor(Color.black);
				   else
					   g.setColor(Color.red);
				   g.fillRect(i*20, generation*20, 20, 20);
			   }
			   try {
					TimeUnit.MILLISECONDS.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			   int[] gen = new int[cells.length];
				
				for (int i = 1; i < cells.length - 1; i++) {
					int leftNeighbor = cells[i - 1];
					int current = cells[i];
					int rightNeighbor = cells[i + 1];
					String binary = "" + leftNeighbor + current + rightNeighbor;
					int base10 = Integer.parseInt(binary,2);
					gen[i] = rule[base10];
				}
				cells = gen;
				generation++; 
		   }
		   try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		   generation = 0;
		   if (ruleNumber == 2) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 0;
			   rule[6] = 0;
			   rule[7] = 0; 
		   } else if(ruleNumber == 3) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 0;
			   rule[4] = 1;
			   rule[5] = 1;
			   rule[6] = 0;
			   rule[7] = 0; 
		   } else if(ruleNumber == 4) {
			   rule[0] = 0;
			   rule[1] = 0;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 1;
			   rule[6] = 0;
			   rule[7] = 0; 
		   } else if(ruleNumber == 5) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 1;
			   rule[6] = 0;
			   rule[7] = 0; 
		   } else if(ruleNumber == 6) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 0;
			   rule[6] = 1;
			   rule[7] = 0; 
		   } else if(ruleNumber == 7) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 0;
			   rule[4] = 0;
			   rule[5] = 1;
			   rule[6] = 1;
			   rule[7] = 0; 
		   } else if(ruleNumber == 8) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 0;
			   rule[5] = 1;
			   rule[6] = 1;
			   rule[7] = 0; 
		   } else if(ruleNumber == 9) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 1;
			   rule[6] = 1;
			   rule[7] = 0; 
		   } else if(ruleNumber == 10) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 0;
			   rule[4] = 1;
			   rule[5] = 0;
			   rule[6] = 0;
			   rule[7] = 1; 
		   } else if(ruleNumber == 11) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 0;
			   rule[6] = 0;
			   rule[7] = 1; 
		   } else if(ruleNumber == 12) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 0;
			   rule[4] = 1;
			   rule[5] = 1;
			   rule[6] = 0;
			   rule[7] = 1; 
		   } else if(ruleNumber == 13) {
			   rule[0] = 0;
			   rule[1] = 0;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 1;
			   rule[6] = 0;
			   rule[7] = 1; 
		   } else if(ruleNumber == 14) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 1;
			   rule[6] = 0;
			   rule[7] = 1; 
		   } else if(ruleNumber == 15) {
			   rule[0] = 0;
			   rule[1] = 0;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 0;
			   rule[6] = 1;
			   rule[7] = 1; 
		   } else if(ruleNumber == 16) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 0;
			   rule[6] = 1;
			   rule[7] = 1; 
		   } else if(ruleNumber == 17) {
			   rule[0] = 1;
			   rule[1] = 0;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 0;
			   rule[5] = 1;
			   rule[6] = 0;
			   rule[7] = 0; 
		   }
		   
		   ruleNumber++;

		   for (int i = 0; i < 79; i++) {
			   cells[i] = 0;
		   }
		   
		   Dimension d = getSize();
		   g.setColor(Color.WHITE);
		   g.fillRect(0, 0, d.width, d.height);
	   }

	   ruleNumber = 2;
	   rule[0] = 0;
	   rule[1] = 1;
	   rule[2] = 0;
	   rule[3] = 1;
	   rule[4] = 1;
	   rule[5] = 0;
	   rule[6] = 1;
	   rule[7] = 0; 
	   
	   
		for (int k = 0; k < 17; k++) {
		   cells = new int[700];
		   cells[cells.length/2] = 1;
		   
		   for (int j = 0; j < 350; j++) {
			   for (int i = 0; i < cells.length; i++) {
				   if (cells[i] == 1)
					   g.setColor(Color.black);
				   else
					   g.setColor(Color.red);
				   g.fillRect(i*2, generation*2, 2, 2);
			   }
			   
			   try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			   int[] gen = new int[cells.length];

				for (int i = 1; i < cells.length - 1; i++) {
					int leftNeighbor = cells[i - 1];
					int current = cells[i];
					int rightNeighbor = cells[i + 1];
					String binary = "" + leftNeighbor + current + rightNeighbor;
					int base10 = Integer.parseInt(binary,2);
					gen[i] = rule[base10];
				}
				
				cells = gen;
				generation++;
		   }
		   
		   try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		   generation = 0;
		   if (ruleNumber == 2) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 0;
			   rule[6] = 0;
			   rule[7] = 0; 
		   } else if(ruleNumber == 3) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 0;
			   rule[4] = 1;
			   rule[5] = 1;
			   rule[6] = 0;
			   rule[7] = 0; 
		   } else if(ruleNumber == 4) {
			   rule[0] = 0;
			   rule[1] = 0;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 1;
			   rule[6] = 0;
			   rule[7] = 0; 
		   } else if(ruleNumber == 5) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 1;
			   rule[6] = 0;
			   rule[7] = 0; 
		   } else if(ruleNumber == 6) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 0;
			   rule[6] = 1;
			   rule[7] = 0; 
		   } else if(ruleNumber == 7) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 0;
			   rule[4] = 0;
			   rule[5] = 1;
			   rule[6] = 1;
			   rule[7] = 0; 
		   } else if(ruleNumber == 8) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 0;
			   rule[5] = 1;
			   rule[6] = 1;
			   rule[7] = 0; 
		   } else if(ruleNumber == 9) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 1;
			   rule[6] = 1;
			   rule[7] = 0; 
		   } else if(ruleNumber == 10) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 0;
			   rule[4] = 1;
			   rule[5] = 0;
			   rule[6] = 0;
			   rule[7] = 1; 
		   } else if(ruleNumber == 11) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 0;
			   rule[6] = 0;
			   rule[7] = 1; 
		   } else if(ruleNumber == 12) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 0;
			   rule[4] = 1;
			   rule[5] = 1;
			   rule[6] = 0;
			   rule[7] = 1; 
		   } else if(ruleNumber == 13) {
			   rule[0] = 0;
			   rule[1] = 0;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 1;
			   rule[6] = 0;
			   rule[7] = 1; 
		   } else if(ruleNumber == 14) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 1;
			   rule[6] = 0;
			   rule[7] = 1; 
		   } else if(ruleNumber == 15) {
			   rule[0] = 0;
			   rule[1] = 0;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 0;
			   rule[6] = 1;
			   rule[7] = 1; 
		   } else if(ruleNumber == 16) {
			   rule[0] = 0;
			   rule[1] = 1;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 1;
			   rule[5] = 0;
			   rule[6] = 1;
			   rule[7] = 1; 
		   } else if(ruleNumber == 17) {
			   rule[0] = 1;
			   rule[1] = 0;
			   rule[2] = 1;
			   rule[3] = 1;
			   rule[4] = 0;
			   rule[5] = 1;
			   rule[6] = 0;
			   rule[7] = 0; 
		   }
		   
		   ruleNumber++;

		   for (int i = 0; i < 79; i++) {
			   cells[i] = 0;
		   }
		   
		   Dimension d = getSize();
		   g.setColor(Color.WHITE);
		   g.fillRect(0, 0, d.width, d.height);
	   }

		try {
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
   }

}
