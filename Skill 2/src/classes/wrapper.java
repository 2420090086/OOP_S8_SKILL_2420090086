package classes;

public class wrapper {

	public static void main(String[] args) {
		
		String numberStr = "123";
        int num = Integer.parseInt(numberStr); // parseInt is a static method of Integer
        System.out.println("Converted int value: " + num);

        // Autoboxing: converting primitive to wrapper
        Integer myInteger = num;
        System.out.println("Autoboxed Integer object: " + myInteger);

        // Unboxing: converting wrapper to primitive
        int unboxed = myInteger.intValue();
        System.out.println("Unboxed primitive int: " + unboxed);

        // Another example with Double
        String priceStr = "99.99";
        double price = Double.parseDouble(priceStr); // using Double wrapper class
        System.out.println("Converted double value: " + price);

        // Autoboxing and unboxing with Double
        Double priceObj = price; // autoboxing
        double priceUnboxed = priceObj; // unboxing
        System.out.println("Autoboxed Double: " + priceObj);
        System.out.println("Unboxed double: " + priceUnboxed);
		// TODO Auto-generated method stub

	}

}
