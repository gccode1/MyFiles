import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
 
class Main
{
    public static void main(String[]args)throws Exception
    {
    	try{
    		Input sc= new Input(System.in);
    		Output out= new Output(System.out);
    		Solve sol =new Solve(sc,out);
    		sol.solve();
    	}catch(Exception e){
    		return;
    	}
    }
}
 
class Pair implements Comparable<Pair>{
	int F;
	int S;
	Pair(int F,int S){
		this.F=F;
		this.S=S;
	}
	@Override
	public int compareTo(Pair v) {
		if(F==v.F){
			if(S==v.S)
				return 0;
			else if(S>v.S)
				return 1;
			else
				return -1;
		}
		else if(F>v.F)
			return 1;
		else
			return -1;
	}
	
}
 
class Solve{
    private Input sc;
    private Output out;
    Solve(Input sc,Output out){
        this.sc=sc;
        this.out=out;
    }
    void solve()throws Exception,IOException{
		
    	out.close();
    }
    
   
}
  
 
class Input
{
 
    private InputStream stream;
    private byte[] buf = new byte[10000000];
    private int curChar;
    private int numChars;
 
    public Input(InputStream stream) {
        this.stream = stream;
    }
 
    public int read() {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }
 
    public int nextInt() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            if (c < 48 || c > 57)
                throw new InputMismatchException();
            res =(res<<3)+(res<<1) + (c & 15);
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }
 
    public long nextLong() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            if (c < 48 || c > 57)
                throw new InputMismatchException();
            res =(res<<3)+(res<<1) + (c & 15);
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }
    public char nextChar() {
        int c = read();
        return (char) c;
    }
    public String next() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }
 
    public String nextLine() {
        int c = read();
        //while (c != '\n' && c != '\r' && c != '\t' && c != -1)
        //c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (c != '\n' && c != '\r' && c != '\t' && c != -1);
        return res.toString();
    }
 
    public static boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }    
}  
 
 
class Output{
    public PrintWriter out;
    Output(OutputStream outStream){
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outStream)));
    }
    public void flush() {
		 out.flush();
	}
    public void close() throws Exception {
        out.flush();
        out.close();
    }
    public void println(String i) throws Exception {
        out.println(i);
    }
 
    public void print(String i) throws Exception {
        out.print(i+" ");
    }
    public void println(char[] i) throws Exception {
        out.println(i);
    }
 
    public void print(char[] i) throws Exception {
        out.print(i);
    }
 
    public void println() throws Exception {
        out.print("\n");
    }
 
    public void print(int i) throws Exception {
        out.print(i+" ");
    }
 
    public void println(int i) throws Exception {
        out.println(i);
    }
 
    public void print(long i) throws Exception {
        out.print(i+" ");
    }
 
    public void println(long i) throws Exception {
        out.println(i);
    }
    public void print(double i) throws Exception {
        out.print(i+" ");
    }
 
    public void println(double i) throws Exception {
        out.println(i);
    }
    public void print(char i) throws Exception {
        out.print(i+" ");
    }
 
    public void println(char i) throws Exception {
        out.println(i);
    }
    public void print(Object i) throws Exception {
        out.print(i+" ");
    }
 
    public void println(Object i) throws Exception {
        out.println(i);
    }
}  
