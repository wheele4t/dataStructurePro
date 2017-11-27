
	public class Knight extends boardPiece{

	   
	
	   public boolean isValid(Board board, int orginX, int orginY, int destX, int destY) {   //is the pieces movement valid
	        if(super.isValid(board, orginX, orginY, destX, destY) == false)
	            return false;

	        if(destX != orginX - 1 && destX != orginX + 1 && destX != orginX + 2 && destX != orginX - 2)   // goes from left to right
	            return false;
	        if(destY != orginY - 2 && destY != orginY + 2 && destY != orginY - 1 && destY != orginY + 1)
	            return false;

	        return true;
	    }

	}
	

