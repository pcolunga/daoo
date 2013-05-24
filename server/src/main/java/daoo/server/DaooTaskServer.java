package daoo.server;

import com.sun.istack.internal.NotNull;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static daoo.server.Task.*;

public class DaooTaskServer implements TaskServer {
    @Override public void start(@NotNull TaskExecutor executor, int port) {
        throw new IllegalStateException("To be implemented!");
    }
}
