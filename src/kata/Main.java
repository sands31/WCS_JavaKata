public class Main {

	public static int[] sortedArray(int[] array) {

			for (int i = 0; i < array.length - 1; i++) {
				int min;
				if (array[i] > array[i + 1]) {
					min = array[i];
					array[i] = array[i + 1];
					array[i + 1] = min;
				}
			}
//		}
		return array;
	}
}
