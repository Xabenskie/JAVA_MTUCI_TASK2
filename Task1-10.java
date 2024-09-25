import java.util.HashSet;

class Task1_10 {
	static public void main(String[] args) {
		int[] numbers = {3, 12, 7, 81, 52};
		System.out.println(getInitials("simonov sergei evgenievich"));
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
		for (int i = 0; i < names.length; i++) {
			if (i == 0) {
					result.append(names[i]).append(" ");
			} else {
					result.append(Character.toUpperCase(names[i].charAt(0))).append(". ");
			}
	}
	return result.toString().trim();
}
}