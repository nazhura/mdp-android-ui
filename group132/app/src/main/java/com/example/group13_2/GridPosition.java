package com.example.group13_2;

public class GridPosition {
	int posX;
	int posY;
	
	public GridPosition(int posX, int posY){
		this.posX=posX;
		this.posY=posY;
	}
	
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	public int[][] getEdges(){
		int[][] edges = {{posX,posY},{posX+1,posY},{posX,posY+1},{posX+1,posY+1}};
		return edges;
	}

	
	public boolean equals(GridPosition arg0) {
		if(posX==arg0.getPosX() && posY==arg0.getPosY()){
			return true;
		}
		return false;
	}
}
