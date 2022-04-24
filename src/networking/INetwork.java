package networking;

public interface INetwork {
	int DEFAULT_PORT = 23012;
	
	void startConnection();
	void closeConnection();
}
