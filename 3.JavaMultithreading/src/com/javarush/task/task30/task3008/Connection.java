package com.javarush.task.task30.task3008;

import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * Created by Mike on 07.06.2017.
 */
public class Connection implements Closeable {
    private final Socket socket;
    private final ObjectOutputStream out;
    private final ObjectInputStream in;

    public Connection(Socket socket) throws IOException {
        this.socket = socket;
        this.out = new ObjectOutputStream(socket.getOutputStream());
        this.in = new ObjectInputStream(socket.getInputStream());

    }

    @Override
    public void close() throws IOException {

        socket.close();
        out.close();
        in.close();

    }

    void send(Message message) throws IOException {

        synchronized (out) {
            out.writeObject(message);
        }
    }

    public Message receive() throws IOException, ClassNotFoundException {
        synchronized (in) {
            Message message;
            message = (Message) in.readObject();
            return message;
        }
    }

    SocketAddress getRemoteSocketAddress() {
        return socket.getRemoteSocketAddress();
    }


}
