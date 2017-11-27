

	public class Queen extends boardPiece{

	    public Queen(boolean available, int x, int y) {
	        super();
	    }

	    @Override
	    public boolean isValid(Board board, int orginX, int orginY, int destX, int destY) { ///movement of the pieces
	        if(super.isValid(board, orginX, orginY, destX, destY) == false)
	            return false;
	        //diagonal
	        if(destX - orginX == destY - orginY)
	            return true;
	        if(destX == orginX)
	            return true;
	        if(destY == orginY)
	            return true;

	        return false;
	    }

	}

