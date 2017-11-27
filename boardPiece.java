public class boardPiece {
    private boolean available;
    private int x;
    private int y;

    public void Piece(boolean available, int x, int y) {
      Super();
        this.available = available;
        this.x = x;
        this.y = y;
    }


    private void Super() {
		// TODO Auto-generated method stub
		
	}


	public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public boolean isValid(Board board, int orginX, int orginY, int destX, int destY){
        if(destX == orginX && destY == orginY)
            return false; 
        if(destX < 0 || destX > 7 || orginX < 0 || orginX > 7 || destY < 0 || destY > 7 || orginY <0 || orginY > 7)
            return false;
        return true;
    }

}