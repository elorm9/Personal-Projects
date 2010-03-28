/*
 * Rectangle.h
 *
 *  Created on: Mar 19, 2010
 *      Author: bryan
 */
#include "Shapes.h"
#ifndef RECTANGLE_H_
#define RECTANGLE_H_
class Rectangle : public Shapes
{
	int x1;
	int x2;

	int y1;
	int y2;

	public:
		Rectangle()
		{
			x1 = 0;
			x2 = 0;
			y1 = 0;
			y2 = 0;
		}
		Rectangle(int X1, int Y1, int X2, int Y2)
		{
			x1 = X1;
			x2 = X2;

			y1 = Y1;
			y2 = Y2;
		}

		 void moveUp()
		{
			y1--;
			y2--;
		}

		 void moveDown()
		{
			y1++;
			y2++;
		}

		 void moveLeft()
		{
			x1--;
			x2--;
		}

		void moveRight()
		{
			x1++;
			x2++;
		}

		 void draw(SDL_Surface * dst)
		{
			boxRGBA(dst,
				x1,  y1,
				x2, y2,
				255, 0, 0, 150);
		}

};

#endif /* RECTANGLE_H_ */
