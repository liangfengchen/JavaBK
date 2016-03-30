import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class Test {
	public void pupAge() {
		int age = 0;
		age = age + 7;
		System.out.println( "Puppy age is : " + age );
	}
	
	public static void printArray( int[] array ) {
		for( int i=0; i<array.length; i++ ) {
			System.out.print( array[i] + " " );
		}
	}
	
	public static void main(String args[]) {
		Test test = new Test();
		test.pupAge( );
		
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;
		System.out.println( "a + b = " + ( a + b ) );
		System.out.println( "a - b = " + ( a - b ) );
		System.out.println( "a * b = " + ( a * b ) );
		System.out.println( "b / a = " + ( b / a ) );
		System.out.println( "b % a = " + ( b % a ) );
		System.out.println( "c % a = " + ( c % a ) );
		System.out.println( "a++   = " + ( a++ ) );
		System.out.println( "a--   = " + ( a-- ) );
		// 鏌ョ湅 d++ 涓� ++d 鐨勪笉鍚屼箣澶�
		System.out.println( "d++   = " + ( d++ ) );
		System.out.println( "++d   = " + ( ++d ) );
		
		String name = "James";
		boolean result = name instanceof String;
		System.out.println( "name is a string ? " + result );
		
		for( ; a<20; a++)/*do*/ {
			System.out.println( "value of a : " + a );
			//a++;
		}//while( a < 20 );
		
		int[] numbers = {10, 20, 30, 40, 50};
		for( int i : numbers ) {
			if( 30 == i ) {
				//break;
				continue;
			}
			System.out.print( i );
			System.out.print( ", " );
		}
		System.out.print( "\n" );
		
		String[] names = { "James", "Larry", "Tom", "Lacy" };
		for( String namee : names ) {
			System.out.print( namee );
			System.out.print( ", " );
		}
		
		Integer x = 5;
		x = x + 10001;
		System.out.println( x );
		//System.out.println( Integer.parseInt( name ));

		System.out.println( );
		char[] charArray = { 'a', 'b', 'c', 'd' };
		for( char ci : charArray ) {
			System.out.print( ci );
			System.out.print( "\n" );
		}
		
		Character xxx = new Character( 't' );
		System.out.print( xxx );
		System.out.println( );
		System.out.print( Character.isLetter(xxx ));

		System.out.print( '\n' );
		String aword = new String( charArray );
		System.out.println( aword );
		
		String fS;
		fS = String.format( "The value of the float variable is " +
								  "%f, while the value of the integer " +
								  "variable is %d, and the string " +
								  "is %s", 10.5, 20, "bye hhh" );
		System.out.println( fS );
		System.out.println( fS.hashCode() );
		
		StringBuffer sBuf = new StringBuffer( "test" );
		sBuf.append( "StringBuffer" );
		System.out.println( sBuf );
		
		printArray( new int[] {3, 1, 2, 6, 2, 8 } );
		
		Date date = new Date();
		System.out.println( "\n" + date.toString() );
		SimpleDateFormat format = new SimpleDateFormat( 
				"E yyyy.MM.dd 'at' hh:mm:ss a zzz" );
		System.out.println( "Format Date: " + 
				format.format( date ) );
		String strDate = String.format( "PRINTF DATE: %tc", 
				date );
		System.out.println( strDate );
		
		format = new SimpleDateFormat( "yyyy-MM-dd" );
		String inp = args.length == 0 ? "1983-07-05" : args[0];
		System.out.print( inp + " Parses as ");
		Date inpDate;
		try {
			inpDate = format.parse( inp );
			System.out.println( inpDate );
		}
		catch( ParseException exception ) {
			System.out.println( "Unparseable using " + format );;
		}
		
		try {
			System.out.println( new Date() + "\n" );
			Thread.sleep( 1000 * 5 );
			System.out.println( new Date() + "\n" );
		}
		catch( Exception exception ) {
			System.out.println( "Got an exception! ");
		}
		
		try {
			long start = System.currentTimeMillis();
			System.out.println( new Date() + "\n" );
			Thread.sleep( 5 * 60 * 10 );
			System.out.println( new Date() + "\n" );
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println( "Difference is : " + diff );
		}
		catch( Exception exception ) {
			System.out.println( "Got an exception!");
		}
		
		Calendar calendar = Calendar.getInstance();
		//calendar.set( 2013, 1, 25 );
		int year = calendar.get( Calendar.YEAR );
		int month = calendar.get(Calendar.MONTH ) + 1;
		int datenew = calendar.get( Calendar.DATE );
		int hour = calendar.get(Calendar.HOUR_OF_DAY );
		int minute = calendar.get(Calendar.MINUTE );
		int second = calendar.get( Calendar.SECOND );
		int daynew = calendar.get(Calendar.DAY_OF_WEEK );
		System.out.println( "Today current time: " + 
								  year + "-" + month + "-" + datenew +
								   " " + hour + ":" + minute + ":" + second +
								   " " + daynew );
		
		String months[] = { "Jan", "Feb", "Mar", "Apr",
								  "May", "Jun", "Jul", "Aug",
								  "Sep", "Oct", "Nov", "Dec" };
		GregorianCalendar ggcCal = new GregorianCalendar();
		System.out.print( "Date: " );
		System.out.print( months[ ggcCal.get( Calendar.MONTH ) ]);
		System.out.print( " " + ggcCal.get( Calendar.DATE ) + " " );
		System.out.println( year = ggcCal.get( Calendar.YEAR ) );
		System.out.print( "Time: " );
		System.out.print( ggcCal.get( Calendar.HOUR_OF_DAY ) );
		System.out.print( ":" + ggcCal.get(Calendar.MINUTE ) );
		System.out.println( ":" + ggcCal.get( Calendar.SECOND ) );
		if( ggcCal.isLeapYear( year ) ) {
			System.out.println( "This year is a leap year." );
		}
		else {
			System.out.println( "This year is not a leap year." );
		}
		
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(.*)(\\d+)(.*)";
		Pattern rPattern = Pattern.compile( pattern );
		Matcher mMatcher = rPattern.matcher( line );
		if( mMatcher.find() ) {
			System.out.println( "Found value: " + 
					mMatcher.group( 0 ) );
			System.out.println( "Found value: " +
					mMatcher.group( 1 ) );
			System.out.println( "Found value: " +
					mMatcher.group( 2 ) );
		}
		else {
			System.out.println( "No match.");
		}
		
		String REGEX = "\\bcat\\b";
		String INPUT = "cat cat cat cattie cat";
		Pattern patP = Pattern.compile( REGEX );
		Matcher matM = patP.matcher( INPUT );
		int count = 0;
		while( matM.find() ) {
			count++;
			System.out.println( "Match number: " + count );
			System.out.println( "Start(): " + matM.start() );
			System.out.println( "End(): " + matM.end() );
		}
		
		char aChar = 'q';
		BufferedReader bReader = new BufferedReader( 
				new InputStreamReader( System.in ) );
		System.out.println( "Enter characters, 'q' or 'Q' to quit. ");
		do {
			try {
				aChar = ( char )bReader.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println( aChar );
		} while( aChar != 'q' && 'Q' != aChar );
	}
}
