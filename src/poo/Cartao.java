package poo;
/**
 * A classe Cartao serve para gerir e dar cargos aos funcionários. Com os seguintes acessores:
 * 
 * <ul>
 * 	<li> Nome do Funcionario </li>
 * 	<li> Tipo de serviço </li>
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
	 * @param nomeFuncionario - Construtor para o nome do funcionário
	 * 
	 */
	public Cartao(String nomeFuncionario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
	}
	/**
	 * 
	 * @param nomeFuncionario, servico, cargo - Construtor para o nome do funcionário, serviço e do cargo de cada respetivo.
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
	
	// Métodos
	/**
	 * 
	 * @param retirarServico - Retira o serviço de respetivo funcionário
	 * 
	 */
	public void retirarServico() {
		// servico = "";
		setServico("");
	}
	/**
	 * 
	 * @param novoServico -	Atribui um serviço para o respetivo funcionário
	 * 
	 */
	public void atribuirNovoServico( String novoServico ) {
		//servico = novoServico;
		setServico( novoServico );
	}
	/**
	 * 
	 * @param novoCargo - Atribui um novo cargo para o respetivo funcionário
	 * 
	 */
	public void promoverNovoCargo( String novoCargo ) {
		//cargo = novoCargo;
		setCargo(novoCargo);
	}
	/**
	 * 
	 * @param null - Não tem nada
	 * 
	 */
	public void despedirFuncionario() {
		retirarServico();
		setCargo("");
	}
	
}
