
	public class Rook extends boardPiece{

	    public Rook(boolean available, int x, int y) {
	        super();
	        // TODO Auto-generated constructor stub
	    }


	    public boolean isValid(Board board, int orginX, int orginY, int destX, int destY) {
	        if(super.isValid(board, orginX, orginY, destX, destY) == false)
	            return false;
	        if(destX == orginX)
	            return true;
	        if(destY == orginY)
	            return true;
	        return false;
	    }
	}
