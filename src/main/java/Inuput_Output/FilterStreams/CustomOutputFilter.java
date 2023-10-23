package Inuput_Output.FilterStreans;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CustomOutputFilter extends FilterOutputStream {

    public CustomOutputFilter(OutputStream out) {
        super(out);
    }

    @Override
    public void write(int b) throws IOException {
        if (b>=48 && b<= 57){
            super.write(b);
        }
        else {
            super.write(63);
        }
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {

        for (int i = off; i < off+len; i++) {
            this.write(b[i]);
        }

    }
}
