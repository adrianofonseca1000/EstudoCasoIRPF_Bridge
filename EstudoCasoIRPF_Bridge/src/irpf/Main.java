package irpf;

import irpf.gerador.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> props = new HashMap<>();
        props.put("nome", "Bruno Sales");
        props.put("dupla", "Adriano");
        props.put("cpf", "11770195661");
        props.put("uf", "MG");

        String arq = "c:/Tmp/irpf.zip";

        try {
            GeradorArquivo g = new PropriedadesCriptografado();
            Processador p = new ProcessadorZip();
            g.gerar(arq, props, p);

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
