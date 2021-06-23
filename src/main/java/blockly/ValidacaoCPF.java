package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ValidacaoCPF {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// ValidacaoCPF
public static Var ValidarCPF(@ParamMetaData(description = "cpf") Var cpf) throws Exception {
 return new Callable<Var>() {

   private Var validador = Var.VAR_NULL;

   public Var call() throws Exception {

    validador =
    cronapi.validation.Operations.validateCPF(cpf);

    if (
    validador.negate().getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("CPF Inválido!"));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

