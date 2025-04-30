package ch13.sec02.exam01;

//타입 파라미터를 두 개 사용할 경우 두 개의 알파벳 지정
public class Product <K, M>{
    private K kind;
    private M model;

    public K getKind() {
        return this.kind;
    }
    public M getModel() {
        return this.model;
    }
    public void setKind(K kind) {
        this.kind = kind;
    }
    public void setModel(M model) {
        this.model = model;
    }
}
