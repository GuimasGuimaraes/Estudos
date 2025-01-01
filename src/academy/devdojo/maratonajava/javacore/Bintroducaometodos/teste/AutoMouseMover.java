package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import java.awt.*;
import java.util.Random;

public class AutoMouseMover {

    private static volatile boolean keepRunning = true; // Controle da execução

    public static void main(String[] args) {
        try {
            // Captura o sinal Ctrl + C (SIGINT) e ajusta a flag keepRunning
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.out.println("\nEncerrando o programa...");
                keepRunning = false; // Altera a flag para encerrar a aplicação
            }));

            // Cria uma instância da classe Robot
            Robot robot = new Robot();

            // Objeto para gerar movimentos aleatórios
            Random random = new Random();

            while (keepRunning) {
                // Obtém a posição atual do mouse
                Point currentLocation = MouseInfo.getPointerInfo().getLocation();
                int currentX = (int) currentLocation.getX();
                int currentY = (int) currentLocation.getY();

                // Calcula uma nova posição aleatória
                int newX = currentX + random.nextInt(50) - 25; // Movimento horizontal entre -25 e +25
                int newY = currentY + random.nextInt(50) - 25; // Movimento vertical entre -25 e +25

                // Move o mouse para a nova posição
                robot.mouseMove(newX, newY);

                // Pausa antes de mover novamente (1 segundo)
                Thread.sleep(1000);
            }

            System.out.println("Programa encerrado!");
        } catch (AWTException | InterruptedException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}