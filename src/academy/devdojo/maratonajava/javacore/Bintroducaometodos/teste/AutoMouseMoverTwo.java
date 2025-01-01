package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import java.awt.*;
import java.util.Random;

public class AutoMouseMoverTwo {

    private static final int MOVE_RANGE = 15;  // Limite do movimento em pixels
    private static final int PAUSE_DURATION = 1000; // Pausa em milissegundos
    private static volatile boolean keepRunning = true; // Controle da execução
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        setupShutdownHook(); // Configura para capturar Ctrl + C e encerrar o programa

        try {
            Robot robot = new Robot();
            System.out.println("Movendo o mouse automaticamente... Pressione Ctrl + C para parar.");

            while (keepRunning) {
                moveMouseRandomly(robot);
                Thread.sleep(PAUSE_DURATION);
            }

            System.out.println("Programa encerrado!");
        } catch (AWTException e) {
            System.err.println("Erro ao inicializar o Robot: " + e.getMessage());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restaura o estado de interrupção da thread
            System.err.println("Execução interrompida: " + e.getMessage());
        }
    }

    // Configuração para capturar interrupção (Ctrl + C)
    private static void setupShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\nEncerrando o programa...");
            keepRunning = false;
        }));
    }

    // Move o mouse para uma posição aleatória dentro de um intervalo
    private static void moveMouseRandomly(Robot robot) {
        Point currentLocation = MouseInfo.getPointerInfo().getLocation();
        int newX = generateRandomPosition(currentLocation.x, MOVE_RANGE, getScreenWidth());
        int newY = generateRandomPosition(currentLocation.y, MOVE_RANGE, getScreenHeight());
        robot.mouseMove(newX, newY);
    }

    // Gera uma nova posição aleatória do mouse, validando os limites da tela
    private static int generateRandomPosition(int current, int range, int maxLimit) {
        int move = RANDOM.nextInt(range * 2 + 1) - range; // Aleatório entre -range e +range
        int newPosition = current + move;

        // Garante que a posição permaneça dentro dos limites da tela
        return Math.max(0, Math.min(newPosition, maxLimit));
    }

    // Obtém a largura da tela
    private static int getScreenWidth() {
        return (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    }

    // Obtém a altura da tela
    private static int getScreenHeight() {
        return (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    }
}