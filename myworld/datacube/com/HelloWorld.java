/**
 * 
 */
package myworld.datacube.com;

/**
 * @author skondla
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while (i <= 100) {
			//if (i <=50) {
			if ((i % 2) == 0){
				System.out.println(i + ": Hello Dear");
			}
			else {
				System.out.println(i + ": No Dear");
			}
			i++;
		}
	}
}

