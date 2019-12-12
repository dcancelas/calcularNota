package calcularnota;

public class Metodos {

    public float tantoPorCento(float cantidad, float porcentaxe) {
        return (cantidad*porcentaxe)/100;
    }
    public float calcularTeorico(float teorico1, float teorico2) {
        float notaTeorico = (teorico1 + teorico2) / 2;
        return tantoPorCento(notaTeorico,40f);
    }
    public float calcularBoletins(float porcentEntrega) {
        if(porcentEntrega >= 90f) {
            return 2f;
        }
        else {
            if((porcentEntrega >= 70f) && (porcentEntrega < 90f)) {
                return 1f;
            }
            else {
                return 0f;
            }
        }
    }
}
