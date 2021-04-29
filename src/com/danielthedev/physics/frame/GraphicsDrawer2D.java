package com.danielthedev.physics.frame;

import java.awt.Color;

public interface GraphicsDrawer2D {

	void setColor(Color color);
	
	void drawLine(int x1, int y1, int x2, int y2);
	
	void drawPoint(int x, int y);
	
}
