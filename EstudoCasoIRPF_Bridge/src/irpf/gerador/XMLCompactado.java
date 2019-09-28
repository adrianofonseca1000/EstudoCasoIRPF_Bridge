package irpf.gerador;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class XMLCompactado extends GeradorArquivo {
    @Override
    protected String gerarConteudo(Map<String, String> props) {
        StringBuilder str = new StringBuilder();
        str.append("<properties>");
        for (String key : props.keySet()) {
            str.append("\r\n\t<" + key + ">" +
                    props.get(key) + "</" + key + ">");

        }

        str.append("</properties>");
        return str.toString();
    }

}

