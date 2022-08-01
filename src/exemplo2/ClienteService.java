package exemplo2;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    private static List<Cliente> database = new ArrayList<>();

    public void salvar(Cliente cliente) {
        ValidatorUtil.validarCPF(cliente.getCpf());
        ValidatorUtil.validarNascimento(cliente.getNascimento());
        ValidatorUtil.validarNome(cliente.getNome());
        database.add(cliente);
    }

}
