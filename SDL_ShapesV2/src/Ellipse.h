/*
 * Ellipse.h
 *
 *  Created on: Mar 19, 2010
 *      Author: bryan
 */
#include "Shapes.h"

#ifndef ELLIPSE_H_
#define ELLIPSE_H_
class Ellipse : public Shapes
{
	int x1;
	int y1;

	//radius variables
	int rx;
	int ry;

	public:

		Ellipse()
		{
			x1 = 0;
			rx = 0;
			ry = 0;
		}

		Ellipse(int X1, int Y1, double RX, double RY)
		{
			x1 = X1;
			y1 = Y1;

			rx = RX;
			ry = RY;
		}

		 void moveUp()
		{
			y1--;
		}

		 void moveDown()
		{
			y1++;
		}

		 void moveLeft()
		{
			x1--;
		}

		 void moveRight()
		{
			x1++;
		}

		 void draw(SDL_Surface * dst)
		{
			filledEllipseRGBA(dst,
			x1,  y1,
			rx,  ry,
			255,  0, 0,  150);
		}

};

#endif /* ELLIPSE_H_ */
