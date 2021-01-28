package Twentyoneth;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ThreadChatClient {
    final static int SERVPORT = 7777;

    public static void main(String[] args)
            throws UnknownHostException, IOException {
        Scanner scan = new Scanner(System.in);

        InetAddress ip = InetAddress.getByName("localhost");

        // 특정 ip를 가지고 서비스(포트 번호)에 접속 요청
        Socket sock = new Socket(ip, SERVPORT); //서버에 접속 요청

        DataInputStream in = new DataInputStream(sock.getInputStream());
        DataOutputStream out = new DataOutputStream(sock.getOutputStream());

        // transfer(송신)
        // 익명 객체 생성 형식으로
        // 일회성의 목적을 가지고 만드는 것
        // tx 쓰레드가 하는 일은 run()메소드 구동
        // 객체 안에다가 runnable을 함
        // 그냥 쉽게 말해 이 쓰레드가 하는 일은 run() 메소드
        // 부가적인 생성자를 만들 필요 없고 객체 만들 필요 없으면 아래 형식처럼 사용 가능
        Thread tx = new Thread(new Runnable() { // 송신
            @Override
            public void run() {
                for(;;) {
                    String msg = scan.nextLine();

                    try {
                        out.writeUTF(msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // receive(수신)
        Thread rx = new Thread(new Runnable() { // 수신
            @Override
            public void run() {
                for(;;) {
                    try { // q를 누를때까지
                        String msg = in.readUTF();
                        System.out.println("rx : " + msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        tx.start();
        rx.start();
    }
}
