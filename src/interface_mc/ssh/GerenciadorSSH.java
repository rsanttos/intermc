package interface_mc.ssh;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class GerenciadorSSH {
	private String username;
	private String host;
	private int port;
	private JSch jsch;
	private Session session;
	private Channel channel;

	public GerenciadorSSH(String host, String username, int port) {
		this.username = username;
		this.host = host;
		this.port = port;
		this.jsch = new JSch();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public JSch getJsch() {
		return jsch;
	}

	public void setJsch(JSch jsch) {
		this.jsch = jsch;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public void realizarConexao() {
		try {
			this.session = jsch.getSession(this.username, this.host, this.port);
			// session.connect();
			this.session.connect(30000); // making a connection with timeout.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
