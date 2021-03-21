package Calculator;

public class StateX extends State {

    @Override
    void clear(Context context) {
        context.x = 0;
        context.y =0;
        context.o = '+';
    }

    @Override
    void digit(Context context, char key) {
        context.x = context.x * 10 + Character.getNumericValue(key);
    }

    @Override
    void arifm(Context context, char key) {
        context.state = new StateAction();
        context.state.arifm(context, key);
    }

    @Override
    void equal(Context context) {
        context.state = new StateAnswer();
        context.state.equal(context);
    }
}
