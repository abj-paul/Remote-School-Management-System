package networking;

public interface IClient extends INetwork {
	String DEFAULT_IP="127.0.0.1";
    String filename = "input.txt";
    void sendData();
}
