package StringMethods;
public class StringMethods {
	public static void main(String[] args) {
		String Thingy = "dfsjiomvuirnupiom,xoiautpobiureiopaejdjkfl;kasdjgoinevupoaijmciuop13214937509872319865984650918746501984,;/[,;'/p[,-=-=!)(*@&#)(^#$@567158√√®≈®¥∂√¥∫ø¨ˆπøˆµπøˆ¨∫¥†√Ç‰‰ÎÂˆ˜Ø∏ˆ¨ıˇÁÏÇ";
		System.out.println(Thingy.charAt(2));
		System.out.println(Thingy.length());
		for (int X = 0; X < Thingy.length(); X++) {
			System.out.println(Thingy.charAt(X));
		}
		for (int Y = 0; Y > -1; Y++) {
			if (Thingy.charAt(Y) == 'k') {
				System.out.println("It's At Index " + Y);
				break;
			}
		}
	}
}


