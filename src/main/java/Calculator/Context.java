package Calculator;

public class Context {
    int x;
    int y;
    char o;
    State state;

    public void press (char key){

    }

    public int run (String keys) {
        for (char key : keys.toCharArray())
            press(key);
        return x;
    }
}
