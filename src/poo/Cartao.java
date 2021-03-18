package poo;
/**
 * A classe Cartao serve para gerir e dar cargos aos funcion�rios. Com os seguintes acessores:
 * 
 * <ul>
 * 	<li> Nome do Funcionario </li>
 * 	<li> Tipo de servi�o </li>
 * 	<li> Tipo de cargo </li>
 * </ul>
 * 
 * @author Ivo Camacho
 *
 */
public class Cartao {
	
	private String nomeFuncionario;
	private String servico;
	private String cargo;
	
	// Construtores 
	/**
	 * 
	 * @param nomeFuncionario - Construtor para o nome do funcion�rio
	 * 
	 */
	public Cartao(String nomeFuncionario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
	}
	/**
	 * 
	 * @param nomeFuncionario, servico, cargo - Construtor para o nome do funcion�rio, servi�o e do cargo de cada respetivo.
	 * 
	 */
	public Cartao(String nomeFuncionario, String servico, String cargo) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.servico = servico;
		this.cargo = cargo;
	}

	// Acessores
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	// M�todos
	/**
	 * 
	 * @param retirarServico - Retira o servi�o de respetivo funcion�rio
	 * 
	 */
	public void retirarServico() {
		// servico = "";
		setServico("");
	}
	/**
	 * 
	 * @param novoServico -	Atribui um servi�o para o respetivo funcion�rio
	 * 
	 */
	public void atribuirNovoServico( String novoServico ) {
		//servico = novoServico;
		setServico( novoServico );
	}
	/**
	 * 
	 * @param novoCargo - Atribui um novo cargo para o respetivo funcion�rio
	 * 
	 */
	public void promoverNovoCargo( String novoCargo ) {
		//cargo = novoCargo;
		setCargo(novoCargo);
	}
	/**
	 * 
	 * @param null - N�o tem nada
	 * 
	 */
	public void despedirFuncionario() {
		retirarServico();
		setCargo("");
	}
	
}
