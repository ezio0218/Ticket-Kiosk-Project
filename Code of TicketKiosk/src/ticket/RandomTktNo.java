 package ticket;

import java.util.Random;

/**
 * RandomTktNo
 * @author zyf
 * Use an array with preset elements but every time 
 * randomly pick up one from it to create "random" effect.
 */
public class RandomTktNo {

	public static String[] tktno = {"11234323","11312131","12431231","12124312","13211421","13122312","14313412","14231231","21234213","21312131","22431232","22141312","23211423","23122312","24313212","24231231","31244231","31322131","32431131","32124312","33212421","33122412","34313212","34232231","41234322","41322111","42431131","42121312","43212422","43122332","44312412","44211331"};//assign the entire set of the random numbers that will be used. 
	public String generateId() {
		int i;//string index
		int j;//loop sentinel variable
		int n=1;//number of ticket(s) you want
		Random rand = new Random();//create(instantialise) a random object for random number generation
			i=rand.nextInt(32);
            while (tktno[i]==null)
            {
            	i=rand.nextInt(32);
            }
           String tid=tktno[i];
			tktno[i]=null;
			return tid;
	}

}
