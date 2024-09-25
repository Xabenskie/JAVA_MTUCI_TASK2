import java.util.Arrays;
import java.util.HashSet;

class Task1_10 {
	static public void main(String[] args) {
		int[] numbers = {3, 5, 8, 1, 2, 4};
		System.out.println(isAnagram("LISTEN", "silent"));
	}

	public static String duplicateChars(String str1, String str2) {
		HashSet<String> uniqStr1 = new HashSet<>();
		HashSet<String> uniqStr2 = new HashSet<>();

    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

		for (char c : str1.toCharArray()) {
      uniqStr1.add(String.valueOf(c));
    }
		for (char c : str2.toCharArray()) {
      uniqStr2.add(String.valueOf(c));
    }

		uniqStr1.removeAll(uniqStr2);

    StringBuilder result = new StringBuilder();
    for (String s : uniqStr1) {
        result.append(s);
    }

    return result.toString();
	}

	public static int dividedByThree(int[] args) {
		int res = 0;
		for (int num : args) {
      if (num % 3 == 0 && num % 2 != 0) {
        res += 1;
      }
    }
		return res;
	}

	public static String getInitials(String fullName) {
		String[] names = fullName.split(" ");

    StringBuilder result = new StringBuilder();
		for (int i = 1; i < names.length; i++) {
			result.append(Character.toUpperCase(names[i].charAt(0))).append(". ");
		}
		result.append(Character.toUpperCase(names[0].charAt(0)) + names[0].substring(1)).append(" ");
		return result.toString().trim();
	}

	public static double[] normalizator(double[] array) {
    double min = Arrays.stream(array).min().getAsDouble();
    double max = Arrays.stream(array).max().getAsDouble();

    double[] normalizedArray = new double[array.length];

    for (int i = 0; i < array.length; i++) {
        normalizedArray[i] = (array[i] - min) / (max - min);
    }

    return normalizedArray;
  } 

  public static int[] compressedNums(double[] array) {
    int[] result = new int[array.length];
    int index = 0;

    for (int i = 0; i < array.length; i++) {
        if (array[i] < 1.0) {
            continue;
        }
        result[index++] = (int) Math.floor(array[i]);
    }

    result = Arrays.copyOf(result, index);

    Arrays.sort(result);

    return result;
  }

  public static String camelToSnake(String camelCase) {
    String snakeCase = camelCase.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase();

    return snakeCase;
  }

  public static int secondBiggest(int[] array) {
    Arrays.sort(array);
    return array[array.length - 2];
  }

  public static String localReverse(String input, char marker) {
    StringBuilder result = new StringBuilder();
    StringBuilder temp = new StringBuilder();
    boolean insideMarkers = false;

    for (char c : input.toCharArray()) {
        if (c == marker) {
            if (insideMarkers) {
                // Если мы внутри маркерных символов, то развернем temp и добавим к результату
                result.append(temp.reverse());
                temp.setLength(0);
            }
            insideMarkers = !insideMarkers; 
            result.append(marker);
        } else if (insideMarkers) {
            temp.append(c);
        } else {
            result.append(c);
        }
    }

    return result.toString();
  }

  public static int equals(int num1, int num2, int num3) {
    int count = 0;
    if (num1 == num2) {
      count++;
    }
    if (num1 == num3) {
      count++;
    }
    if (num2 == num3) {
      count++;
    }
    return count == 1 ? 2 : count;
  }

  public static boolean isAnagram(String str1, String str2) {
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);
    return Arrays.equals(charArray1, charArray2);
  }
}