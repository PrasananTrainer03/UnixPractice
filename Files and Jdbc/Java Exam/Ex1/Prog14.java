public class Prog14 {
    
    public static void main(String[] args) {
    Integer iv1 = new Integer(25);
    Integer iv2 = new Integer(25);
    Integer iv6 = iv1;
    System.out.println("iv1 == iv3: " +
         (iv1 == iv6));
    System.out.println("iv1 = " + iv1 + ", iv2 = " + iv2);
    // Compare iv1 and iv2 references
    System.out.println("iv1 == iv2: " +
         (iv1 == iv2));

    // Let's see if they are equal in values
    System.out.println("iv1.equals(iv2): "
     + iv1.equals(iv2));

    System.out.println("\nUsing the valueOf() method:");

    // Create two Integer objects using the valueOf()
    Integer iv3 = Integer.valueOf(25);
    Integer iv4 = Integer.valueOf(25);
    System.out.println("iv3 = " + iv3 + ", iv4 = " + iv4);

    // Compare iv3 and iv4 references
    System.out.println("iv3 == iv4: " + (iv3 == iv4));

    // Let's see if they are equal in values
    System.out.println("iv3.equals(iv4): " + iv3.equals(iv4));
    }
}