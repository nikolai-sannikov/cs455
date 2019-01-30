package cs455.overlay.transport;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPSender{

	private Socket socket;
	private DataOutputStream sendingStream;
	
	public TCPSender(Socket socket) {
		this.socket = socket;
		try {
			this.sendingStream = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	public TCPSender(String host, int port) throws UnknownHostException, IOException {				
		this(new Socket(host,port));
	}

	public void sendData(byte[] dataToSend) {
		int dataLength = dataToSend.length;
		try {
			sendingStream.writeInt(dataLength);
			sendingStream.write(dataToSend,0,dataLength);
			sendingStream.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//sendingStream.write_string();
	}
}
