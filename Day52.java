import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Day52{
    public static long pow(long a, long n, long mod) {
        //		a %= mod;
        long ret = 1;
        int x = 63 - Long.numberOfLeadingZeros(n);
        for (; x >= 0; x--) {
            ret = ret * ret % mod;
            if (n << 63 - x < 0)
                ret = ret * a % mod;
        }
        return ret;
    }
    static class InputReader {

        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
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
        public double rd() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E') {
                    return res * Math.pow(10, ri());
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E') {
                        return res * Math.pow(10,ri());
                    }
                    if (c < '0' || c > '9') {
                        throw new InputMismatchException();
                    }
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }
        public int[] ra(int n)
        {
            int[] a = new int[n];
            for(int i = 0;i < n;i++)a[i] = ri();
            return a;
        }
        public long rl() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
        public int ri() {
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
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public String rs() {
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

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return rs();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object...objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0)
                    writer.print(' ');
                writer.print(objects[i]);
            }
        }
        public void println(Object...objects)
        {
            print(objects);
            writer.println();
        }
        public void close()
        {
            writer.close();
        }
        public void flush()
        {
            writer.flush();
        }
    }
    static class IOUtils
    {
        public static int[] readIntArray(InputReader in, int size)
        {
            int[] array = new int[size];
            for (int i = 0; i < size; i++)
                array[i] = in.ri();
            return array;
        }
    }
    static InputReader in ;
    static OutputWriter out ;
    public static void main(String [] args)
    {
        in = new InputReader(System.in);
        out = new OutputWriter(System.out);
//        int t = in.ri() ;
//        for (int i = 0; i <t ; i++)
        output();
        out.flush();
        out.close() ;
    }
    // subtree range - iord[i],right[iord[i]]+1
    // vertex - iord[i]
    static long [] x ;
    static long [] p ;
    static long [] pper ;
    static int size ;
    static int [] curr ;
    static void output()
    {
        int n = in.ri() ;
        int m = in.ri() ;
        long [] a  = new long[n] ;
        long [][] cb = new long[n][2] ;
        for (int i = 0; i <n ; i++)
        {
            a[i] = in.rl() ;
            cb[i][1] = in.rl() ;
            cb[i][0] = in.rl() ;
            cb[i][1] -=a[i] ;
        }
        long tot = n*m ;
        for (int i = 0; i <n ; i++)
        {
            tot-=a[i] ;
        }
        java.util.Arrays.sort(cb, new java.util.Comparator<long[]>() {
            public int compare(long[] a, long[] b) {
                return (a[0] < b[0] ? 1 : (a[0] == b[0] ? 0 : -1));
            }
        });
        int cnt = 0 ;
        for (int i = 0; i <n ; i++)
        {
            if(tot<=(cb[i][1]))
            {
                for (int j = 0; ; j++)
                {
                    if(tot<=0)
                    {
                        break ;
                    }
                    else
                    {
                        tot-= cb[i][0] ;
                        cnt++ ;
                    }
                }
                break ;
            }
            else
            {
                cnt+= (cb[i][1]/cb[i][0]) ;
                tot-= (cb[i][1]) ;
            }
        }
        if(tot<=0)
        {
            out.println(cnt);
        }
        else
        {
            out.println(-1);
        }
    }
}