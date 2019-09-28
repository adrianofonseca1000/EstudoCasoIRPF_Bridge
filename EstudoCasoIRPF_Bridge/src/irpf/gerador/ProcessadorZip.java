package irpf.gerador;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ProcessadorZip implements Processador {
    @Override
    public byte[] processador(byte[] b) throws IOException {
        try (ByteArrayOutputStream byteOut =
                     new ByteArrayOutputStream();
             ZipOutputStream out =
                     new ZipOutputStream(byteOut)) {

            out.putNextEntry(new ZipEntry("internal"));
            out.write(b);

            return byteOut.toByteArray();
        }
    }
}