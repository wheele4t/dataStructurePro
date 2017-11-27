
public class Bishop extends boardPiece{

	    public Bishop(boolean available, int x, int y) {
	        super();
	        // TODO Auto-generated constructor stub
	    }

	    @Override
	    public boolean isValid(Board board, int orginX, int orginY, int destX, int destY) {
	        if(super.isValid(board, orginX, orginY, destX, destY) == false)
	            return false;

	        if(destX - orginX == destY - orginY)
	            return true;

	        return false;
	    }

	}