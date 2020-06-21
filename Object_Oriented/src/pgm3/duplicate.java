package pgm3;

import java.util.Arrays;

class duplicate {

	public static void main(String[] args) {
//		System.out.println("1: " + getDurationString(0, 5234));
//		System.out.println("2: " + getDaysInMonth(11, 2018));
//		System.out.println("3: " + isPalindrome(786));
//		System.out.println("4: " + sumFirstAndLastDigit(455));
//		System.out.println("5: " + getEvenDigitSum(123456789));
//		System.out.println("6: " + hasSharedDigit(27, 33));
//		System.out.println("7: " + hasSameLastDigit(1, 23, 43));
//		System.out.println("8: " + isValid(456));
//		System.out.println("9: " + getGreatestCommonDivisor(30, 12));
//		System.out.print("10: ");
//		printFactors(12);
//		System.out.println();
//		System.out.println("11: " + isPerfectNumber(8));
//		System.out.print("12: ");
//		numberToWords(900);
////		String numberAsString = "2020.123";
////		double num=Double.parseDouble(numberAsString);
////	    numberAsString+=1;
////	    num+=1;
////	    System.out.println(numberAsString);
////	    System.out.println(num);
//		System.out.println("13: " + canPack(1, 0, 5));
//		System.out.println("14: " + getLargestPrime(68));
//		printSquareStar(51);
//		int m=3,n=3;
//		int a[][] = { { 1, 2, 3}, { 4, 5, 6 }, { 7, 8, 9 } };
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.print(a[i][j]+ "   ");
//			}
//			System.out.println();
//			System.out.println();
//		}

	}

	public static String getDurationString(int min, int sec) {
		return ((sec + min * 60) / 3600 + "hr " + ((sec + min * 60) % 3600) / 60 + "min "
				+ ((sec + min * 60) % 3600) % 60 + "sec");
	}

	public static boolean isLeapYear(int year) {
		int test4 = (year % 4);
		int test100 = (year % 100);
		int test400 = (year % 400);
		if (year < 1 || year > 9999) // || means or
			return false;
		else if (test4 == 0 && test100 != 0 || test400 == 0)
			return true;
		else
			return false;
	}

	public static int getDaysInMonth(int month, int year) {
		if (month > 0 && month < 13 && year < 10000 && year > 0) {
			boolean leapyear = isLeapYear(year);
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			default:
				if (leapyear) {
					return 29;
				} else {
					return 28;
				}
			}

		} else {
			return -1;
		}
	}

	public static boolean isPalindrome(int number) {
		if (number < 0) {
			number = number * -1;
		}
		int fNum = 0;
		fNum += number;
		int bNum = 0;
		bNum += number % 10;
		number /= 10;
		while (number > 0) {
			bNum *= 10;
			bNum += number % 10;
			number /= 10;
		}
		return fNum == bNum;
	}

	public static int sumFirstAndLastDigit(int number) {
		int num = number;
		if (num < 0) {
			return -1;
		}
		int lastDigit = num % 10;

		while (num >= 10) {
			num = num / 10;
		}
		int firstDigit = num;
		return (firstDigit + lastDigit);
	}

	public static int getEvenDigitSum(int number) {
		if (number < 0) {
			return -1;
		}
		int Sum = 0;
		while (number > 0) {
			if (((number % 10) % 2) == 0) {
				Sum += number % 10;
			}
			number /= 10;
		}
		return Sum;
	}

	public static boolean hasSharedDigit(int Num1, int Num2) {
		if (Num1 < 10 || Num2 < 10 || Num1 > 99 || Num2 > 99) {
			return false;
		} else {
			int x = Num1 % 10;
			int y = Num2 % 10;
			Num1 /= 10;
			Num2 /= 10;
			if (Num1 == Num2 || Num1 == y || x == Num2 || x == y) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static boolean hasSameLastDigit(int Num1, int Num2, int Num3) {
		if (Num1 < 10 || Num2 < 10 || Num3 < 10 || Num1 > 1000 || Num2 > 1000 || Num3 > 1000) {
			return false;
		} else {
			int x = Num1 % 10;
			int y = Num2 % 10;
			int z = Num3 % 10;
			if (x == y || x == z || y == z) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static boolean isValid(int Num) {
		if (Num < 10 || Num > 1000) {
			return false;
		} else {
			return true;
		}
	}

	public static int getGreatestCommonDivisor(int first, int second) {
		if (first < 10 || second < 10) {
			return -1;
		} else {
			int r;
			while (second != 0) {
				r = first % second;
				first = second;
				pi second = r;
			}
			return first;
		}
	}

	public static void printFactors(int Num) {
		if (Num < 1) {
			System.out.println("Invalid Value");
		} else {
			for (int i = 1; i <= Num; i++) {
				if (Num % i == 0) {
					System.out.print(i + " ");
				}
			}
		}
	}

	public static boolean isPerfectNumber(int Num) {
		if (Num >= 1) {
			int sum = 0;
			for (int i = 1; i <= Num / 2; i++) {
				if (Num % i == 0)
					sum = sum + i;
			}
			if (sum == Num)
				return true;
			else
				return false;
		} else {
			return false;
		}
	}

	public static void numberToWords(int number) {
		String numString = "";
		if (number < 0) {
			System.out.println("Invalid Value");
		}
		int numDigits = getDigitCount(number);
		int reverseNum = reverse(number);
		int testNum = 0;
		while (numDigits > 0) {
			testNum = reverseNum % 10;
			reverseNum /= 10;
			numDigits--;
			if (testNum == 0) {
				numString += "Zero ";
			} else {
				switch (testNum) {
				case 1:
					numString += "One ";
					break;
				case 2:
					numString += "Two ";
					break;
				case 3:
					numString += "Three ";
					break;
				case 4:
					numString += "Four ";
					break;
				case 5:
					numString += "Five ";
					break;
				case 6:
					numString += "Six ";
					break;
				case 7:
					numString += "Seven ";
					break;
				case 8:
					numString += "Eight ";
					break;
				case 9:
					numString += "Nine ";
					break;
				}
			}
		}
		System.out.println(numString);

	}

	public static int reverse(int number) {
		int rev = 0;
		while (number != 0) {
			rev = rev * 10;
			rev = rev + number % 10;
			number = number / 10;
		}
		return rev;
	}

	public static int getDigitCount(int number) {
		int digit = 0;
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			digit = 1;
		}
		while (number > 0) {
			number /= 10;
			digit++;
		}
		return digit;
	}

	public static boolean canPack(int bigCount, int smallCount, int goal) {
		int sum = 0;
		int temp = 0;

		if (bigCount < 0 || smallCount < 0)
			return (false);

		while (bigCount > 0) {

			if (sum + bigCount > goal)
				break;
			sum += bigCount;
			bigCount--;
			if (sum == goal)
				return (true);
		}

		while (smallCount > 0) {

			if (sum + smallCount > goal)
				break;
			sum += smallCount;
			smallCount--;
			if (sum == goal)
				return (true);
		}
		return (false);
	}

	public static int getLargestPrime(int n) {
		int count = 0, primeFactor = 0;
		if (n <= 1) {
			return -1;
		} else {
			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					for (int j = 2; j <= i; j++) {
						if (i % j == 0) {
							count++;
						}
					}
					if (count == 1) {
						if (primeFactor < i) {
							primeFactor = i;
						}
					}
					count = 0;
				}
			}
		}
		return (primeFactor);

	}

	public static void printSquareStar(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1 || i == j || j == n - 1 - i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
