package irpf.gerador;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ProcessadorCriptografia implements Processador {
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




