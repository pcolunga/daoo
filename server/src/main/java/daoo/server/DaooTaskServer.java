package daoo.server;

import com.sun.istack.internal.NotNull;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static daoo.server.Task.*;

public class DaooTaskServer implements TaskServer {

    @Override public void start(@NotNull TaskExecutor executor, int port) {

        try {
            final ServerSocket server = new ServerSocket(port);
            System.out.println("Listening on port: " + port);

            //noinspection InfiniteLoopStatement
            for (;;) {
                executor.execute(sleepy(server.accept(), 5000));
//                executor.execute(infinite(server.accept()));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
