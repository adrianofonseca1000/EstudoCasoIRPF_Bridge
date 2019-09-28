package irpf.gerador;

import java.io.IOException;

public interface Processador {
    byte[] processador(byte[] b) throws IOException;
}
