package chap_09.coffee;

public class Coffee <T>{
    public T name;

    public Coffee(T name) {
        this.name = name;
    }

    public void ready(){
        System.out.println("커피 준비완료 : "+name);
    }
}
