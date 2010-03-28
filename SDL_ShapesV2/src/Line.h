/*
 * Line.h
 *
 *  Created on: Mar 20, 2010
 *      Author: bryan
 */

#ifndef LINE_H_
#define LINE_H_
#include "Shapes.h"

class Line : public Shapes
{
	int x1;
	int x2;

	int y1;
	int y2;

	public:
		Line()
		{
			x1 = 0;
			x2 = 0;
			y1 = 0;
			y2 = 0;
		}
		Line(int X1, int Y1, int X2, int Y2)
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
			 aalineRGBA(dst,
					  x1,  y1,
					  x2,  y2,
					  255,  0,  0, 150);
		}

};
#endif /* LINE_H_ */
