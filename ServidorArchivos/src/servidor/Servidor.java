package servidor;

import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import threadManager.ThreadManager;

public class Servidor {

    public static void main(String[] args) throws IOException {
        int port = 7171;
        ExecutorService executor = Executors.newFixedThreadPool(10);
        DatagramSocket socket = new DatagramSocket(port);
        executor.execute(new ThreadManager(executor, socket));
    }

}
