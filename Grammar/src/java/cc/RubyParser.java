package java.cc;
public class RubyParser {

	private class Metrics {
		private final static int AMOUNT_OF_METRICS = 23;
		public long metrics[] = new long[AMOUNT_OF_METRICS];
	}

	/*  
	 * A String based constructor for ease of use
	 */
    public RubyParser(String s) {
        //this((Reader)(new StringReader(s))); 
    }
       
    public static void main(String args[]) {
        try {
              String inputProgram = args[0];
              RubyParser parser = new RubyParser(inputProgram);
              //parser.program();
        }
        catch(Exception e) {
              e.printStackTrace();
        }
    }
}
