package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Mike on 07.06.2017.
 */

public class Server
{
    private static Map<String, Connection> connectionMap= new ConcurrentHashMap<>();


    private static class Handler extends Thread{
        private Socket socket;

        Handler (Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {

            while (true) {
                // Сформировать и отправить команду запроса имени пользователя
                connection.send(new Message(MessageType.NAME_REQUEST));
                // Получить ответ клиента
                Message message = connection.receive();

                // Проверить, что получена команда с именем пользователя
                if (message.getType() == MessageType.USER_NAME) {

                    //Достать из ответа имя, проверить, что оно не пустое
                    if (message.getData() != null && !message.getData().isEmpty()) {

                        // и пользователь с таким именем еще не подключен (используй connectionMap)
                        if (connectionMap.get(message.getData()) == null) {

                            // Добавить нового пользователя и соединение с ним в connectionMap
                            connectionMap.put(message.getData(), connection);
                            // Отправить клиенту команду информирующую, что его имя принято
                            connection.send(new Message(MessageType.NAME_ACCEPTED));

                            // Вернуть принятое имя в качестве возвращаемого значения
                            return message.getData();
                        }
                    }
                }
            }
        }


    }

    public static void main(String[] args) throws IOException {
    ConsoleHelper.writeMessage("Введите порт сервера: ");
    int serverPort = ConsoleHelper.readInt();

        try (ServerSocket socketServer = new ServerSocket(serverPort)){
            ConsoleHelper.writeMessage("Сервер запущен");
            while (true){
                Socket socket = socketServer.accept();
                Handler handler = new Handler(socket);
                handler.start();
            }
        } catch (IOException e){
            ConsoleHelper.writeMessage("Ошибка сокета");
        }
    }

    public static void sendBroadcastMessage(Message message) {

        try {

            for (Connection connection : connectionMap.values()) {
                connection.send(message);
            }

        } catch (Exception e){
            e.printStackTrace();
            ConsoleHelper.writeMessage("Сообщение не отправлено");
        }

    }





}