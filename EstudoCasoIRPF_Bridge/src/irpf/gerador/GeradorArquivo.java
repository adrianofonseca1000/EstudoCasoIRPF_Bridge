package irpf.gerador;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public abstract class GeradorArquivo {
    public final void gerar(String nomeArq, Map<String, String> props,
                            Processador proc) throws IOException {
        String conteudo = gerarConteudo(props);
        byte[] b = conteudo.getBytes();

        b = proc.processador(b);

        FileOutputStream out = new FileOutputStream(nomeArq);
        out.write(b);
        out.close();
    }

    protected abstract String gerarConteudo(Map<String, String> props);

}
