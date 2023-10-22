package ar.edu.unq.po2.tp3;

public class Point {
	
	private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void mover(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void sumar(Point p) {
        x = this.x + p.x;
        y = this.y + p.y;
    }

	public int x() {
        return(x);
    }

    public int y() {
        return(y);
    }
}
