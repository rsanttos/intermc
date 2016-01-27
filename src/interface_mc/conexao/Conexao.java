package interface_mc.conexao;

import interface_mc.ssh.GerenciadorSSH;

public class Conexao {
	private String host;
	private String username;
	private int port;
	private GerenciadorSSH gerenciadorssh;
	
	public Conexao(String host, String username, int port){
		this.host = host;
		this.username = username;
		this.port = port;
		this.gerenciadorssh = new GerenciadorSSH(this.host, this.username, this.port);
	}

	public GerenciadorSSH getGerenciadorssh() {
		return gerenciadorssh;
	}

	public void setGerenciadorssh(GerenciadorSSH gerenciadorssh) {
		this.gerenciadorssh = gerenciadorssh;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	public void conecta(){
		this.gerenciadorssh.realizarConexao();
	}
	
	public void desconecta(){
		this.gerenciadorssh.desfazConexao();
	}
	
}
