package Logic.Cadastros;

import Logic.LoginLogic;
import Pages.Cadastros.CadastroCheckpointPage;
import Pages.Cadastros.CadastroEtiquetasPage;
import Utils.Utils;

public class CadastroCheckpointLogic {


    Utils utils = new Utils();
    LoginLogic loginLogic = new LoginLogic();
    CadastrosLogic cadastrosLogic = new CadastrosLogic();
    CadastroCheckpointPage cadastroCheckpointPage = new CadastroCheckpointPage();

    public void menuCadastros()throws InterruptedException {
        cadastrosLogic.cadastros();
    }


    public void subMenuCheckpoints()throws InterruptedException{
        utils.pausa(1000);
        utils.clicar(cadastroCheckpointPage.getSubMenuCheckpoints());

    }

    public void cadastrarNovoCheckpoint()throws InterruptedException{
        utils.pausa(1000);
        utils.clicar(cadastroCheckpointPage.getBtnNovoCheckpoint());
        utils.preencher(cadastroCheckpointPage.getCampoNomeCheckpoint(), "Teste Checkpoint 1");
        utils.pausa(500);
        utils.clicar(cadastroCheckpointPage.getCampoEscolhaLeitor());
        utils.clicar(cadastroCheckpointPage.getSelectNomeLeitor());
        utils.pausa(500);
        utils.preencher(cadastroCheckpointPage.getCampoDuracaoCheckpoint(), "2");
        utils.pausa(500);
        utils.clicar(cadastroCheckpointPage.getCampoIntegracao());
        utils.clicar(cadastroCheckpointPage.getSelectIntegracao());
        utils.pausa(500);
        utils.clicar(cadastroCheckpointPage.getCampoEvento());
        utils.clicar(cadastroCheckpointPage.getSelectEvento());
        utils.clicar(cadastroCheckpointPage.getBtnSalvarChekpoint());
    }

    public void validarCadatsroCheckpoint(){
        utils.validarTexto(cadastroCheckpointPage.getValidarNovoCheckpoint(), "O checkpoint foi cadastro com sucesso!");
    }
}
