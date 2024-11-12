public class rgb_to_hex {
    //main function uses the written r,g,b values and converst them to hex
    public static void main(String[] args) {
        int r = 255;
        int g = 127;
        int b = 0;
        String hexColor = rgbToHex(r, g, b);
        //prints the color as r,g,b, vaulues and the equivalent hexidecimal value
        System.out.println("RGB color (" + r + ", " + g + ", " + b + ") = " + hexColor);
    }
// this is the function that actually converts the 3 ints to a string with hex format
    public static String rgbToHex(int r, int g, int b) {
        r = Math.min(255, Math.max(0, r));
        g = Math.min(255, Math.max(0, g));
        b = Math.min(255, Math.max(0, b));
        return String.format("%02X%02X%02X", r, g, b);
    }
}

//TODO: Test with RGB color (255, 127, 0) = FF7F00


