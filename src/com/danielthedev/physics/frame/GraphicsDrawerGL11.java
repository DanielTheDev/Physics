package com.danielthedev.physics.frame;

import java.awt.Color;

import static org.lwjgl.opengl.GL11.*;

public class GraphicsDrawerGL11 implements GraphicsDrawer2D {

	@Override
	public void setColor(Color color) {
		glColor3i(color.getRed(), color.getBlue(), color.getGreen());
	}

	@Override
	public void drawLine(int x1, int y1, int x2, int y2) {
		glBegin(GL_LINES);
		glVertex2i(x1, y1);
		glVertex2i(x2, y2);
		glEnd();
	}

	@Override
	public void drawPoint(int x, int y) {
		glBegin(GL_POINTS);
		glVertex2i(x, y);
		glEnd();
	}
}
