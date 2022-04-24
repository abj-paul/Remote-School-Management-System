package networking;

public interface IServer extends INetwork{
	String DEFAULT_IP = "137.0.0.1";
	void receiveData();
}
