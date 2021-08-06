import java.io.*;
import java.net.*;

public class udp_server
{
	public static void main(String args[])
	{
		DatagramSocket sock = null;
		
		try
		{
 main
			//1. creating a server socket, parameter is local port number
			sock = new DatagramSocket(7777);
			
			//buffer to receive incoming data
			byte[] buffer = new byte[65536];
			DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
			
			//2. Wait for an incoming data
			echo("Server socket created. Waiting for incoming data...");
			
			//communication loop

			sock = new DatagramSocket(7777);
			byte[] buffer = new byte[65536];
			DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
			echo("Server socket created. Waiting for incoming data...");
 main
			while(true)
			{
				sock.receive(incoming);
				byte[] data = incoming.getData();
				String s = new String(data, 0, incoming.getLength());
 main
				
				//echo the details of incoming data - client ip : client port - client message
 main
				echo(incoming.getAddress().getHostAddress() + " : " + incoming.getPort() + " - " + s);
				
				s = "OK : " + s;
				DatagramPacket dp = new DatagramPacket(s.getBytes() , s.getBytes().length , incoming.getAddress() , incoming.getPort());
				sock.send(dp);
			}
		}
		
		catch(IOException e)
		{
			System.err.println("IOException " + e);
		}
	}
 main
	
	//simple function to echo data to terminal
main
	public static void echo(String msg)
	{
		System.out.println(msg);
	}
}