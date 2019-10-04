import java.util.*;

public class VaultDoor3 {
    public static void main(String args[]) {
        String password = "picoCTF{jU5t_a_s1mpl3_an4rm4u4b2021___4g}";
        String finalStr = "jU5t_a_sna_3lpm12gb44_u_4_m1r240";
        char[] buffer = new char[32];
        int i;
        for (i=0; i<8; i++) {
            buffer[i] = password.charAt(i);	//0 1 2 3 4 5 6 7
            System.out.println(i);
        }
        for (; i<16; i++) {
            buffer[i] = password.charAt(23 - i);	//15 14 13 12 11 10 9 8
             System.out.println(23-i);
        }
        for (; i<32; i+=2) {
            buffer[i] = password.charAt(46-i); 	//30 28 26 24 22 20 18 16
             System.out.println(46-i);
        }
        for (i=31; i>=17; i-=2) {
            buffer[i] = password.charAt(i);	//31 29 27 25 23 21 19 17
             System.out.println(i);
        }
        String s = new String(buffer);
        
        VaultDoor3 vaultDoor = new VaultDoor3();
        System.out.print("Enter vault password: ");
	String input = "picoCTF{jU5t_a_sna_3lpm12b4u4mr4021___4g}";
	if (vaultDoor.checkPassword(input)) {
	    System.out.println("Access granted.");
	} else {
	    System.out.println("Access denied!");
        }
    }

    // Our security monitoring team has noticed some intrusions on some of the
    // less secure doors. Dr. Evil has asked me specifically to build a stronger
    // vault door to protect his Doomsday plans. I just *know* this door will
    // keep all of those nosy agents out of our business. Mwa ha!
    //
    // -Minion #2671
    public boolean checkPassword(String password) {
        String finalStr = "jU5t_a_sna_3lpm12gb44_u_4_m1r240";
        if (password.length() != 32) {
            return false;
        }
        char[] buffer = new char[32];
        int i;
        for (i=0; i<8; i++) {
            buffer[i] = password.charAt(i);	//0 1 2 3 4 5 6 7
            System.out.print(finalStr.charAt(i));
        }
        for (; i<16; i++) {
            buffer[i] = password.charAt(23-i);	//15 14 13 12 11 10 9 8
            System.out.print(finalStr.charAt(i));
        }
        for (; i<32; i+=2) {
            buffer[i] = password.charAt(46-i); 	//30 28 26 24 22 20 18 16
            System.out.print(finalStr.charAt(i));
        }
        for (i=31; i>=17; i-=2) {
            buffer[i] = password.charAt(i);	//31 29 27 25 23 21 19 17
            System.out.print(finalStr.charAt(i));
        }
        String s = new String(buffer);
        return s.equals("jU5t_a_sna_3lpm12gb44_u_4_m1r240"); //
	// j U 5 t _ a _ s n a  _  3   l    p   m 1    2   g   b   4  4   _   u  _   4   _   m  1   r   2   4  0
	//0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31

	//jU5t_a_s1mpl3_an4rm4u4b2021___4g
    }
}
