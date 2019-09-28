package irpf.gerador;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.util.Map;

public class PropriedadesCriptografado extends GeradorArquivo {
    @Override
    protected String gerarConteudo(Map<String, String> props) {
        StringBuilder retorno = new StringBuilder();

        for (String key : props.keySet()) {
            retorno.append(key + "=" + props.get(key) + '\n');
        }

        return retorno.toString();
    }


}

