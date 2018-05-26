package by.epampretraining.kleshchenko.task01;

/**
 * This class tests all possible operations on primitive data types (byte,
 * short, char, int, long, float, double) and some reference data types:
 * standard - String and user - Student.
 * 
 * @author Vladislav Kleshchenko
 */
public class DataTypesTester {
	
	/*
	 * Method wich tests data type byte. 
	 * All of certain operations is defined for byte.
	 */
	public static void testByte() {

		byte a = 5;
		byte b = 2;
		byte c;

		System.out.println("\n***** TYPE: Byte *****");

		System.out.println("\n***** Arithmetical Operators *****");

		c = (byte) (a + b); // addition
		System.out.printf("(byte) (%d + %d) = %d\n", a, b, c);

		c = (byte) (a - b); // subtraction
		System.out.printf("(byte) (%d - %d) = %d\n", a, b, c);

		c = (byte) (a * b); // multiplication
		System.out.printf("(byte) (%d * %d) = %d\n", a, b, c);

		c = (byte) (a / b); // division
		System.out.printf("(byte) (%d / %d) = %d\n", a, b, c);

		c = (byte) (a % b); // modulus
		System.out.printf("(byte) (%d %% %d) = %d\n", a, b, c);

		// c = (byte) (a / 0); --> Arithmetical Exception
		// c = (byte) (a % 0); --> Arithmetical Exception

		a = 5;
		// unary minus
		c = (byte) -a;
		System.out.printf("(byte) -%d = %d\n", a, c);

		// unary plus
		c = (byte) +a;
		System.out.printf("(byte) +%d = %d\n", a, c);

		a = 5;
		// prefix increment
		System.out.printf("++%d = %d\n", a, ++a);
		a = 5;
		// postfix increment
		System.out.printf("%d++ = %d\n", a, a++);
		a = 5;
		// prefix decrement
		System.out.printf("--%d = %d\n", a, --a);
		a = 5;
		// postfix decrement
		System.out.printf("%d-- = %d\n", a, a--);

		System.out.println("\n***** Bitwise Operators *****");

		c = (byte) (a & b); // bitwise AND
		System.out.printf("(byte) (%d & %d) = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(c));

		c = (byte) (a | b); // bitwise OR
		System.out.printf("(byte) (%d | %d) = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(c));

		c = (byte) (a ^ b); // bitwise XOR
		System.out.printf("(byte) (%d ^ %d) = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(c));

		c = (byte) ~a; // bitwise unary compliment
		System.out.printf("(byte) ~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = (byte) (a << 1); // left shift
		System.out.printf("(byte) (%d << 1) = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = (byte) (a >> 1); // right shift
		System.out.printf("(byte) (%d >> 1) = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = (byte) (a >> 1); // right shift
		System.out.printf("(byte) (%d >> 1) = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = 5;
		c = (byte) (a >>> 1); // zero fill right shift
		System.out.printf("(byte) (%d >>> 1) = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = (byte) (a >>> 1); // zero fill right shift
		System.out.printf("(byte) (%d >>> 1) = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		System.out.println("\n***** Assignment Operators *****");

		c = 7;
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception

		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);

		c = 4;
		System.out.printf("%d >>= %d --> c = %d\n", c, 1, c >>= 1);
		System.out.printf("%d <<= %d --> c = %d\n", c, 1, c <<= 1);
		System.out.printf("%d >>>= %d --> c = %d\n", c, 1, c >>>= 1);

		System.out.println("\n***** Relational Operators *****");

		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%d != %d --> %b\n", a, b, a != b);

		System.out.println("\n***** Logical Operations *****");

		// logical AND
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

		// bitwise logical AND
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

		// logical OR
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

		// logical XOR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

		// logical NOT
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** Misc Operators *****");

		System.out.println("\nCondition Operator:");

		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast Operator:");

		short sh = -3200;
		char ch = '\u0002';
		int it = 384000065;
		long l = 100000000000000111L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;

		c = (byte) sh;
		System.out.printf("byte = short: c = (byte) %d --> c = %d\n", sh, c);

		c = (byte) ch;
		System.out.printf("byte = char: c = (byte) '%c' --> c = %d\n", ch, c);

		c = (byte) it;
		System.out.printf("byte = int: c = (byte) %d --> c = %d\n", it, c);

		c = (byte) l;
		System.out.printf("byte = long: c = (byte) %d --> c = %d\n", l, c);

		c = (byte) f;
		System.out.printf("byte = float: c = (byte) %f --> c = %d\n", f, c);

		c = (byte) d;
		System.out.printf("byte = double: c = (byte) %f --> c = %d\n", d, c);

		// c = (int)bool;
		System.out.printf("byte = boolean: c = (byte) %b --> Compile Error\n", bool);

	}

	/*
	 * Method wich tests data type short. 
	 * All of certain operations is defined for short.
	 */
	public static void testShort() {

		short a = 5;
		short b = 2;
		short c;

		System.out.println("\n***** TYPE: Short *****");

		System.out.println("\n***** Arithmetical Operators *****");

		c = (short) (a + b); // addition
		System.out.printf("(short) (%d + %d) = %d\n", a, b, c);

		c = (short) (a - b); // subtraction
		System.out.printf("(short) (%d - %d) = %d\n", a, b, c);

		c = (short) (a * b); // multiplication
		System.out.printf("(short) (%d * %d) = %d\n", a, b, c);

		c = (short) (a / b); // division
		System.out.printf("(short) (%d / %d) = %d\n", a, b, c);

		c = (short) (a % b); // modulus
		System.out.printf("(short) (%d %% %d) = %d\n", a, b, c);

		// c = (byte) (a / 0); --> Arithmetical Exception
		// c = (byte) (a % 0); --> Arithmetical Exception

		a = 5;
		// unary minus
		c = (short) -a;
		System.out.printf("(short) -%d = %d\n", a, c);

		// unary plus
		c = (short) +a;
		System.out.printf("(short) +%d = %d\n", a, c);

		a = 5;
		// prefix increment
		System.out.printf("++%d = %d\n", a, ++a);
		a = 5;
		// postfix increment
		System.out.printf("%d++ = %d\n", a, a++);
		a = 5;
		// prefix decrement
		System.out.printf("--%d = %d\n", a, --a);
		a = 5;
		// postfix decrement
		System.out.printf("%d-- = %d\n", a, a--);

		System.out.println("\n***** Bitwise Operators *****");

		c = (short) (a & b); // bitwise AND
		System.out.printf("(short) (%d & %d) = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(c));

		c = (short) (a | b); // bitwise OR
		System.out.printf("(short) (%d | %d) = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(c));

		c = (short) (a ^ b); // bitwise XOR
		System.out.printf("(short) (%d ^ %d) = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(c));

		c = (short) ~a; // bitwise unary compliment
		System.out.printf("(short) ~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = (short) (a << 1); // left shift
		System.out.printf("(short) (%d << 1) = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = (short) (a >> 1); // right shift
		System.out.printf("(short) (%d >> 1) = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = (short) (a >> 1); // right shift
		System.out.printf("(short) (%d >> 1) = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = 5;
		c = (short) (a >>> 1); // zero fill right shift
		System.out.printf("(short) (%d >>> 1) = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = (short) (a >>> 1); // zero fill right shift
		System.out.printf("(short) (%d >>> 1) = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		System.out.println("\n***** Assignment Operators *****");

		c = 7;
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception

		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);

		c = 4;
		System.out.printf("%d >>= %d --> c = %d\n", c, 1, c >>= 1);
		System.out.printf("%d <<= %d --> c = %d\n", c, 1, c <<= 1);
		System.out.printf("%d >>>= %d --> c = %d\n", c, 1, c >>>= 1);

		System.out.println("\n***** Relational Operators *****");

		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%d != %d --> %b\n", a, b, a != b);

		System.out.println("\n***** Logical Operations *****");

		// logical AND
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

		// bitwise logical AND
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

		// logical OR
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

		// logical XOR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

		// logical NOT
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** Misc Operators *****");

		System.out.println("\nCondition Operator:");

		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast Operator:");

		byte bt = 1;
		char ch = '\u0002';
		int it = 245;
		long l = 100000000000131845L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;

		c = bt;
		System.out.printf("short = byte: c = %d --> c = %d\n", bt, c);

		c = (short) ch;
		System.out.printf("short = char: c = (short) '%c' --> c = %d\n", ch, c);

		c = (short) it;
		System.out.printf("short = int: c = (short) %d --> c = %d\n", it, c);

		c = (short) l;
		System.out.printf("short = long: c = (short) %d --> c = %d\n", l, c);

		c = (short) f;
		System.out.printf("short = float: c = (short) %f --> c = %d\n", f, c);

		c = (short) d;
		System.out.printf("short = double: c = (short) %f --> c = %d\n", d, c);

		// c = (int)bool;
		System.out.printf("short = boolean: c = (short) %b --> Compile Error\n", bool);

	}

	/*
	 * Method wich tests data type char. 
	 * All of certain operations is defined for char.
	 */
	public static void testChar() {

		char a = 'a';
		char b = 'b';
		char c;

		System.out.println("\n***** TYPE: Char *****");

		System.out.println("\n***** Arithmetical Operators *****");

		c = (char) (a + b); // addition
		System.out.printf("(char) ('%c' + '%c') = '%c'\n", a, b, c);

		c = (char) (a - b); // subtraction
		System.out.printf("(char) ('%c' - '%c') = '%c'\n", a, b, c);

		c = (char) (a * b); // multiplication
		System.out.printf("(char) ('%c' * '%c') = '%c'\n", a, b, c);

		c = (char) (a / b); // division
		System.out.printf("(char) ('%c' / '%c') = '%c'\n", a, b, c);

		c = (char) (a % b); // modulus
		System.out.printf("(char) ('%c' %% '%c') = '%c'\n", a, b, c);

		// c = (byte) (a / 0); --> Arithmetical Exception
		// c = (byte) (a % 0); --> Arithmetical Exception

		a = 'a';
		// unary minus
		c = (char) -a;
		System.out.printf("(char) -'%c' = '%c'\n", a, c);

		// unary plus
		c = (char) +a;
		System.out.printf("(char) +'%c' = '%c'\n", a, c);

		a = 'a';
		// prefix increment
		System.out.printf("++'%c' = '%c'\n", a, ++a);
		a = 'a';
		// postfix increment
		System.out.printf("'%c'++ = '%c'\n", a, a++);
		a = 'a';
		// prefix decrement
		System.out.printf("--'%c' = '%c'\n", a, --a);
		a = 'a';
		// postfix decrement
		System.out.printf("'%c'-- = '%c'\n", a, a--);

		System.out.println("\n***** Bitwise Operators *****");

		c = (char) (a & b); // bitwise AND
		System.out.printf("(char) ('%c' & '%c') = '%c'\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(c));

		c = (char) (a | b); // bitwise OR
		System.out.printf("(char) ('%c' | '%c') = '%c'\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(c));

		c = (char) (a ^ b); // bitwise XOR
		System.out.printf("(char) ('%c' ^ '%c') = '%c'\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(c));

		c = (char) ~a; // bitwise unary compliment
		System.out.printf("(char) ~'%c' = '%c'\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = (char) (a << 1); // left shift
		System.out.printf("(char) ('%c' << 1) = '%c'\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = (char) (a >> 1); // right shift
		System.out.printf("(char) ('%c' >> 1) = '%c'\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = (char) (a >>> 1); // zero fill right shift
		System.out.printf("(char) ('%c' >>> 1) = '%c'\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		System.out.println("\n***** Assignment Operators *****");

		c = 'c';
		System.out.printf("'%c' += '%c' --> c = '%c'\n", c, a, c += a);
		System.out.printf("'%c' -= '%c' --> c = '%c'\n", c, a, c -= a);
		System.out.printf("'%c' *= '%c' --> c = '%c'\n", c, a, c *= a);
		System.out.printf("'%c' /= '%c' --> c = '%c'\n", c, a, c /= a);
		System.out.printf("'%c' %%= '%c' --> c = '%c'\n", c, a, c %= a);

		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception

		System.out.printf("'%c' |= '%c' --> c = '%c'\n", c, a, c |= a);
		System.out.printf("'%c' &= '%c' --> c = '%c'\n", c, a, c &= a);
		c = 'c';
		System.out.printf("'%c' ^= '%c' --> c = '%c'\n", c, a, c ^= a);

		System.out.printf("'%c' >>= 1 --> c = '%c'\n", c, c >>= 1);
		System.out.printf("'%c' <<= 1 --> c = '%c'\n", c, c <<= 1);
		System.out.printf("'%c' >>>= 1 --> c = '%c'\n", c, c >>>= 1);

		System.out.println("\n***** Relational Operators *****");

		a = 'a';
		// greater than
		System.out.printf("'%c' > '%c' --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("'%c' >= '%c' --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("'%c' < '%c' --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("'%c' <= '%c' --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("'%c' == '%c' --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("'%c' != '%c' --> %b\n", a, b, a != b);

		System.out.println("\n***** Logical Operations *****");

		// logical AND
		System.out.printf("('%c' > '%c') && ('%c' > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

		// bitwise logical AND
		System.out.printf("('%c' > '%c') & ('%c' > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

		// logical OR
		System.out.printf("('%c' >= '%c') || ('%c' != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

		// bitwise logical OR
		System.out.printf("('%c' >= '%c') | ('%c' != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

		// logical XOR
		System.out.printf("('%c' >= '%c') | ('%c' != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

		// logical NOT
		System.out.printf("!('%c' >= '%c') --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** Misc Operators *****");

		System.out.println("\nCondition Operator:");

		System.out.printf("'%c' > '%c' ? '%c' : '%c' --> '%c'\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast Operator:");

		byte bt = 1;
		short st = 245;
		int it = 7543;
		long l = 2000000000000000001L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;

		c = (char) bt;
		System.out.printf("char = byte: c = %d --> c = '%c'\n", bt, c);

		c = (char) st;
		System.out.printf("char =  short: c = (char) %d --> c = '%c'\n", st, c);

		c = (char) it;
		System.out.printf("char = int: c = (char) %d --> c = '%c'\n", it, c);

		c = (char) l;
		System.out.printf("char = long: c = (char) %d --> c = '%c'\n", l, c);

		c = (char) f;
		System.out.printf("char = float: c = (char) %f --> c = '%c'\n", f, c);

		c = (char) d;
		System.out.printf("char = double: c = (char) %f --> c = '%c'\n", d, c);

		// c = (int)bool;
		System.out.printf("char = boolean: c = (char) %b --> Compile Error\n", bool);

	}

	/*
	 * Method wich tests data type int. 
	 * All of certain operations is defined for int.
	 */
	public static void testInt() {

		int a = 5;
		int b = 2;
		int c;

		System.out.println("\n***** TYPE: Integer *****");

		System.out.println("\n***** Arithmetical Operators *****");

		c = a + b; // addition
		System.out.printf("%d + %d = %d\n", a, b, c);

		c = a - b; // subtraction
		System.out.printf("%d - %d = %d\n", a, b, c);

		c = a * b; // multiplication
		System.out.printf("%d * %d = %d\n", a, b, c);

		c = a / b; // division
		System.out.printf("%d / %d = %d\n", a, b, c);

		c = a % b; // modulus
		System.out.printf("%d %% %d = %d\n", a, b, c);

		// c = a / 0; --> Arithmetical Exception
		// c = a % 0; --> Arithmetical Exception

		a = 5;
		// unary minus
		c = -a;
		System.out.printf("-%d = %d\n", a, c);

		// unary plus
		c = +a;
		System.out.printf("+%d = %d\n", a, c);

		a = 5;
		// prefix increment
		System.out.printf("++%d = %d\n", a, ++a);
		a = 5;
		// postfix increment
		System.out.printf("%d++ = %d\n", a, a++);
		a = 5;
		// prefix decrement
		System.out.printf("--%d = %d\n", a, --a);
		a = 5;
		// postfix decrement
		System.out.printf("%d-- = %d\n", a, a--);

		System.out.println("\n***** Bitwise Operators *****");

		c = a & b; // bitwise AND
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(c));

		c = a | b; // bitwise OR
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(c));

		c = a ^ b; // bitwise XOR
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(c));

		c = ~a; // bitwise unary compliment
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = a << 1; // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		c = a >> 1; // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = a >> 1; // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = 5;
		c = a >>> 1; // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		a = -5;
		c = a >>> 1; // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		System.out.println("\n***** Assignment Operators *****");

		c = 7;
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception

		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);

		c = 4;
		System.out.printf("%d >>= %d --> c = %d\n", c, 1, c >>= 1);
		System.out.printf("%d <<= %d --> c = %d\n", c, 1, c <<= 1);
		System.out.printf("%d >>>= %d --> c = %d\n", c, 1, c >>>= 1);

		System.out.println("\n***** Relational Operators *****");

		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%d != %d --> %b\n", a, b, a != b);

		System.out.println("\n***** Logical Operations *****");

		// logical AND
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

		// bitwise logical AND
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

		// logical OR
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

		// logical XOR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

		// logical NOT
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** Misc Operators *****");

		System.out.println("\nCondition Operator:");

		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast Operator:");

		byte bt = 1;
		short sh = -32000;
		char ch = '\u0002';
		long l = 100000000000000000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;

		c = bt;
		System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);

		c = sh;
		System.out.printf("int = short: c = %d --> c = %d\n", sh, c);

		c = ch;
		System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);

		c = (int) l;
		System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);

		c = (int) f;
		System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);

		c = (int) d;
		System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);

		// c = (int)bool;
		System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);

	}

	/*
	 * Method wich tests data type long. 
	 * All of certain operations is defined for long.
	 */
	public static void testLong() {

		long a = 345000000L;
		long b = 67800000L;
		long c;

		System.out.println("\n***** TYPE: Long *****");

		System.out.println("\n***** Arithmetical Operators *****");

		c = a + b; // addition
		System.out.printf("%d + %d = %d\n", a, b, c);

		c = a - b; // subtraction
		System.out.printf("%d - %d = %d\n", a, b, c);

		c = a * b; // multiplication
		System.out.printf("%d * %d = %d\n", a, b, c);

		c = a / b; // division
		System.out.printf("%d / %d = %d\n", a, b, c);

		c = a % b; // modulus
		System.out.printf("%d %% %d = %d\n", a, b, c);

		// c = a / 0; --> Arithmetical Exception
		// c = a % 0; --> Arithmetical Exception

		a = 345000000L;
		// unary minus
		c = -a;
		System.out.printf("-%d = %d\n", a, c);

		// unary plus
		c = +a;
		System.out.printf("+%d = %d\n", a, c);

		a = 345000000L;
		// prefix increment
		System.out.printf("++%d = %d\n", a, ++a);
		a = 345000000L;
		// postfix increment
		System.out.printf("%d++ = %d\n", a, a++);
		a = 345000000L;
		// prefix decrement
		System.out.printf("--%d = %d\n", a, --a);
		a = 345000000L;
		// postfix decrement
		System.out.printf("%d-- = %d\n", a, a--);

		System.out.println("\n***** Bitwise Operators *****");

		c = a & b; // bitwise AND
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

		c = a | b; // bitwise OR
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

		c = a ^ b; // bitwise XOR
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

		c = ~a; // bitwise unary compliment
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

		c = a << 1; // left shift
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

		c = a >> 1; // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

		a = -345000000L;
		c = a >> 1; // right shift
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

		a = 345000000L;
		c = a >>> 1; // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

		a = -345000000L;
		c = a >>> 1; // zero fill right shift
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

		System.out.println("\n***** Assignment Operators *****");

		c = 45320000L;
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception

		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);

		c = 45320000L;
		System.out.printf("%d >>= %d --> c = %d\n", c, 1, c >>= 1);
		System.out.printf("%d <<= %d --> c = %d\n", c, 1, c <<= 1);
		System.out.printf("%d >>>= %d --> c = %d\n", c, 1, c >>>= 1);

		System.out.println("\n***** Relational Operators *****");

		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%d != %d --> %b\n", a, b, a != b);

		System.out.println("\n***** Logical Operations *****");

		// logical AND
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

		// bitwise logical AND
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

		// logical OR
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

		// logical XOR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

		// logical NOT
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** Misc Operators *****");

		System.out.println("\nCondition Operator:");

		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast Operator:");

		byte bt = 1;
		short sh = -32000;
		char ch = '\u0002';
		int it = 240000;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;

		c = bt;
		System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);

		c = sh;
		System.out.printf("long = short: c = %d --> c = %d\n", sh, c);

		c = ch;
		System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);

		c = it;
		System.out.printf("long = int: c = %d --> c = %d\n", it, c);

		c = (int) f;
		System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);

		c = (int) d;
		System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);

		// c = (int)bool;
		System.out.printf("long = boolean: c = (long)%b --> Compile Error\n", bool);

	}

	/*
	 * Method wich tests data type float. 
	 * Bitwise operators is undefind for float.
	 */
	public static void testFloat() {

		float a = 4.2E-4f;
		float b = 8.4E-5f;
		float c;

		System.out.println("\n***** TYPE: Float *****");

		System.out.println("\n***** Arithmetical Operators *****");

		c = a + b; // addition
		System.out.printf("%f + %f = %f\n", a, b, c);

		c = a - b; // subtraction
		System.out.printf("%f - %f = %f\n", a, b, c);

		c = a * b; // multiplication
		System.out.printf("%f * %f = %f\n", a, b, c);

		c = a / b; // division
		System.out.printf("%f / %f = %f\n", a, b, c);

		c = a % b; // modulus
		System.out.printf("%f %% %f = %f\n", a, b, c);

		// c = a / 0; --> Arithmetical Exception
		// c = a % 0; --> Arithmetical Exception

		a = 4.2E-4f;
		// unary minus
		c = -a;
		System.out.printf("-%f = %f\n", a, c);

		// unary plus
		c = +a;
		System.out.printf("+%f = %f\n", a, c);

		a = 4.2E-4f;
		// prefix increment
		System.out.printf("++%f = %f\n", a, ++a);
		a = 4.2E-4f;
		// postfix increment
		System.out.printf("%f++ = %f\n", a, a++);
		a = 4.2E-4f;
		// prefix decrement
		System.out.printf("--%f = %f\n", a, --a);
		a = 4.2E-4f;
		// postfix decrement
		System.out.printf("%f-- = %f\n", a, a--);

		System.out.println("\n***** Bitwise Operators *****");

		System.out.println("Bitwise operators is undefind");

		System.out.println("\n***** Assignment Operators *****");

		c = 8.353E2f;
		System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
		System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
		System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
		System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
		System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);

		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception

		System.out.println("\n***** Relational Operators *****");

		a = 4.2E-4f;
		// greater than
		System.out.printf("%f > %f --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%f < %f --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
		b = 4.2E-4f;
		// equal to
		System.out.printf("%f == %f --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%f != %f --> %b\n", a, b, a != b);

		System.out.println("\n***** Logical Operations *****");

		b = 8.4E-5f;

		// logical AND
		System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

		// bitwise logical AND
		System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

		// logical OR
		System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

		// bitwise logical OR
		System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

		// logical XOR
		System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

		// logical NOT
		System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** Misc Operators *****");

		System.out.println("\nCondition Operator:");

		System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast Operator:");

		byte bt = 1;
		short sh = -32000;
		char ch = '\u0002';
		int it = 4500000;
		long l1 = 10000L;
		long l2 = 100000000000000000L;
		double d = 123456789625532623E-9;
		boolean bool = true;

		c = bt;
		System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);

		c = sh;
		System.out.printf("float = short: c = %d --> c = %f\n", sh, c);

		c = ch;
		System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);

		c = it;
		System.out.printf("float = int: c = %d --> c = %f\n", it, c);

		c = l1;
		System.out.printf("float = long: c = %d --> c = %f\n", l1, c);

		c = l2;
		System.out.printf("???!!!! float = long: c = %d --> c = %f ???!!!!\n", l2, c);

		c = (float) d;
		System.out.printf("???!!!! float = double: c = (float)%f --> c = %f ???!!!!\n", d, c);

		// c = (float)bool;
		System.out.printf("float = boolean: c = (float)%b --> Compile Error\n", bool);

	}

	/*
	 * Method wich tests data type double. 
	 * Bitwise operators is undefind for double.
	 */
	public static void testDouble() {

		double a = 4.234E-5;
		double b = 8.4563E-5;
		double c;

		System.out.println("\n***** TYPE: Double *****");

		System.out.println("\n***** Arithmetical Operators *****");

		c = a + b; // addition
		System.out.printf("%f + %f = %f\n", a, b, c);

		c = a - b; // subtraction
		System.out.printf("%f - %f = %f\n", a, b, c);

		c = a * b; // multiplication
		System.out.printf("%f * %f = %f\n", a, b, c);

		c = a / b; // division
		System.out.printf("%f / %f = %f\n", a, b, c);

		c = a % b; // modulus
		System.out.printf("%f %% %f = %f\n", a, b, c);

		// c = a / 0; --> Arithmetical Exception
		// c = a % 0; --> Arithmetical Exception

		a = 4.234E-5;
		// unary minus
		c = -a;
		System.out.printf("-%f = %f\n", a, c);

		// unary plus
		c = +a;
		System.out.printf("+%f = %f\n", a, c);

		a = 4.234E-5;
		// prefix increment
		System.out.printf("++%f = %f\n", a, ++a);
		a = 4.234E-5;
		// postfix increment
		System.out.printf("%f++ = %f\n", a, a++);
		a = 4.234E-5;
		// prefix decrement
		System.out.printf("--%f = %f\n", a, --a);
		a = 4.234E-5;
		// postfix decrement
		System.out.printf("%f-- = %f\n", a, a--);

		System.out.println("\n***** Bitwise Operators *****");

		System.out.println("Bitwise operators is undefind");

		System.out.println("\n***** Assignment Operators *****");

		c = 8.353E1;
		System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
		System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
		System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
		System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
		System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);

		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception

		System.out.println("\n***** Relational Operators *****");

		a = 4.234E-5;
		// greater than
		System.out.printf("%f > %f --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%f < %f --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%f == %f --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%f != %f --> %b\n", a, b, a != b);

		System.out.println("\n***** Logical Operations *****");

		// logical AND
		System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

		// bitwise logical AND
		System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

		// logical OR
		System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

		// bitwise logical OR
		System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

		// logical XOR
		System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

		// logical NOT
		System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** Misc Operators *****");

		System.out.println("\nCondition Operator:");

		System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));

		System.out.println("\nType Cast Operator:");

		byte bt = 1;
		short sh = -32000;
		char ch = '\u0002';
		int it = 4500000;
		long l = 100000000000000000L;
		float f1 = 12344362953259E-8f;
		float f2 = 12344362853259E-8f;
		boolean bool = true;

		c = bt;
		System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);

		c = sh;
		System.out.printf("double = short: c = %d --> c = %f\n", sh, c);

		c = ch;
		System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c);

		c = it;
		System.out.printf("double = int: c = %d --> c = %f\n", it, c);

		c = l;
		System.out.printf("double = long: c = %d --> c = %f\n", l, c);

		c = f1;
		System.out.printf("???!!!! double = float: c = %f --> c = %f ???!!!!\n", f1, c);

		c = f2;
		System.out.printf("???!!!! double = float: c = %f --> c = %f ???!!!!\n", f2, c);

		// c = (double)bool;
		System.out.printf("double = boolean: c = (double)%b --> Compile Error\n", bool);

	}

	/*
	 * Method wich tests data type boolean. 
	 * Arithematical operators is undefind for boolean.
	 * Only two relational operators (==, !=) is defind for boolean.
	 * Boolean don't cast to other type. 
	 */
	public static void testBoolean() {

		boolean a = true;
		boolean b = false;
		boolean c;

		System.out.println("\n***** TYPE: Boolean *****");

		System.out.println("\n***** Arithmetical Operators *****");
		System.out.println("No mathematical operator is defined");

		System.out.println("\n***** Bitwise Operators *****");

		c = a & b; // bitwise AND
		System.out.printf("%b & %b = %b\n", a, b, c);

		c = a | b; // bitwise OR
		System.out.printf("%b | %b = %b\n", a, b, c);

		c = a ^ b; // bitwise XOR
		System.out.printf("%b ^ %b = %b\n", a, b, c);

		System.out.println("\n***** Assignment Operators *****");

		System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
		System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
		System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);

		System.out.println("\n***** Relational Operators *****");

		// equal to
		System.out.printf("%b == %b --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%b != %b --> %b\n", a, b, a != b);

		System.out.println("\n***** Logical Operations *****");

		c = a && b; // logical AND
		System.out.printf("%b && %b --> %b\n", a, b, c);

		c = a || b; // logical OR
		System.out.printf("%b || %b --> %b\n", a, b, c);

		c = a ^ b;// logical XOR
		System.out.printf("%b ^ %b --> %b\n", a, b, c);

		// logical NOT
		System.out.printf("!%b --> %b\n", a, !a);

		System.out.println("\n***** Misc Operators *****");

		System.out.println("\nCondition Operator:");

		System.out.printf("%b ? %b : %b --> %b\n", c, a, b, (c ? a : b));

		System.out.println("\nType Cast Operator:");

		System.out.println("There is no type cast operator");
	}

	/*
	 * Method wich tests data type String. 
	 * Arithematical operators is undefind for String.
	 * One overloaded operator (+).
	 * Bitwise operators is undefind for String.
	 * One assigment operator (+=) is defind.
	 * Only three relational operators (==, !=, instanceof) is defind for String.
	 * String cast to Object. 
	 */
	public static void testString() {

		String a = "abc";
		String b = "def";
		String c;

		System.out.println("\n***** TYPE: String *****");

		System.out.println("\n***** Arithmetical Operators *****");

		System.out.println("Arithmetical operators is undefind");

		System.out.println("\n***** Bitwise Operators *****");

		System.out.println("Bitwise operators is undefind");

		System.out.println("\n***** Assignment Operators *****");

		System.out.printf("%s += %s --> c = %s\n", a, b, a += b);

		System.out.println("\n***** Relational Operators *****");

		// equal to
		System.out.printf("%s == %s --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%s != %s --> %b\n", a, b, a != b);

		// instanceOf
		System.out.printf("a instanceof Object -> %b\n", a instanceof Object);
		System.out.printf("a instanceof String -> %b\n", a instanceof String);
		a = null;
		System.out.printf("a instanceof String -> %b\n", a instanceof String);

		System.out.println("\n***** Logical Operations *****");

		System.out.println("Logical operations is undefind");

		System.out.println("\n***** Misc Operators *****");

		a = "abc";
		System.out.println("\nString concatenation operator:");
		// concatenation
		c = a + b;
		System.out.printf("%s + %s = %s\n", a, b, c);

		System.out.println("\nCondition Operator:");

		System.out.printf("%s == %s ? %s : %s --> %s\n", a, b, a, b, (a == b ? a : b));
		System.out.printf("%s != %s ? %s : %s --> %s\n", a, b, a, b, (a != b ? a : b));

		System.out.println("\nType Cast Operator:");

		Object obj = (Object) a;
		System.out.printf("(Object) %s -> %s\n", a, obj);
	}

	/*
	 * Method wich tests data type Student.
	 * Arithematical operators is undefind for Student. 
	 * Bitwise operators is undefind for Student.
	 * Only three relational operators (==, !=, instanceof) is defind for Student.
	 * Student cast to Object. 
	 */
	public static void testStudent() {

		Student student1 = new Student("Vladislav", 9);
		Student student2 = new Student("Dmitry", 8);
		Student student3 = new Student("Vladislav", 9);
		Student student4 = student1;

		System.out.println("\n***** Relational Operators *****");

		// equal to
		System.out.printf("%s == %s --> %b\n", student1, student2, student1 == student2);

		System.out.println("Different parts of memory");
		System.out.printf("%s == %s --> %b\n", student1, student3, student1 == student3);

		System.out.println("One parts of memory");
		System.out.printf("%s == %s --> %b\n", student1, student4, student1 == student4);

		// not equal to
		System.out.printf("%s != %s --> %b\n", student1, student2, student1 != student2);

		System.out.println("Different parts of memory");
		System.out.printf("%s != %s --> %b\n", student1, student3, student1 != student3);

		System.out.println("One parts of memory");
		System.out.printf("%s != %s --> %b\n", student1, student4, student1 != student4);

		// instanceOf
		System.out.printf("a instanceof Object -> %b\n", student1 instanceof Object);
		System.out.printf("a instanceof Student -> %b\n", student1 instanceof Student);

		System.out.println("\n***** Misc Operators *****");

		System.out.println("\nCondition Operator:");

		System.out.printf("%s == %s ? %s : %s --> %s\n", student1, student2, student1, student2,
				(student1 == student2 ? student1 : student2));
		System.out.printf("%s != %s ? %s : %s --> %s\n", student1, student2, student1, student2,
				(student1 != student2 ? student1 : student2));

		System.out.println("\nType Cast Operator:");

		Object obj = (Object) student1;
		System.out.printf("(Object) %s -> %s\n", student1, obj);

	}

}
