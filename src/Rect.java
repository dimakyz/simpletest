class Rect {
    private int a;
    private int b;
    Rect(int a, int b){
        this.a=a;
        this.b=b;
    }

    double getArea(){
        return a*b;
    }

    double getPerim(){
        return 2*(a+b);
    }
}
