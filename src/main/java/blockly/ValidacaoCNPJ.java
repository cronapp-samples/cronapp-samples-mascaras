package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ValidacaoCNPJ {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// ValidacaoCNPJ
public static Var ValidarCNPJ(@ParamMetaData(description = "cnpj") Var cnpj) throws Exception {
 return new Callable<Var>() {

   private Var validador = Var.VAR_NULL;

   public Var call() throws Exception {

    validador =
    cronapi.validation.Operations.validateCNPJ(cnpj);

    if (
    validador.negate().getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("CNPJ Inválido!"));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

