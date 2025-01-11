package Question2;

public class main {
    public static void main(String[] args) {
        playable[] arr = new playable[2];
        arr[0] = new Guitar();
        arr[1] = new Piano();
        for (int i = 0; i < arr.length; i++) {
            arr[i].play();
        }

    }
}
