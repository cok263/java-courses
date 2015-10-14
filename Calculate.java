public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		float first = Float.valueOf(arg[0]);
		float second = Float.valueOf(arg[1]);
		float opf = sum(first, second);
		System.out.println("Summ   " + opf);
		opf = dif(first, second);
		System.out.println("Dif   " + opf);
		opf = multiple(first, second);
		System.out.println("Multiple   " + opf);
		double opd = div(first, second);
		System.out.println("Div   " + opd);
		opd = pow(first, second);
		System.out.println("Pow   " + opd);
	}

	public static float sum(float a, float b) {
		return a + b;
	}

	public static float dif(float a, float b) {
		return a - b;
	}

	public static float multiple(float a, float b) {
		return a * b;
	}

	public static double div(float a, float b) {
		return a / b;
	}

	public static double pow(float a, float b) {
		double po=1;
		for (int i=0; i < b; i++)
			po *= a;
		return po;
	}
}