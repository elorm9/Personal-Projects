/*
 * Trigon.h
 *
 *  Created on: Mar 20, 2010
 *      Author: bryan
 */

#include "Shapes.h"
#ifndef TRIGON_H_
#define TRIGON_H_

class Trigon : public Shapes
{
	int x1;
	int x2;
	int x3;

	int y1;
	int y2;
	int y3;

	public:
		Trigon()
		{
			x1 = 0;
			x2 = 0;
			x3 = 0;
			y1 = 0;
			y2 = 0;
			y3 = 0;
		}
		Trigon(int X1, int Y1, int X2, int Y2, int X3, int Y3)
		{
			x1 = X1;
			x2 = X2;
			x3 = X3;

			y1 = Y1;
			y2 = Y2;
			y3 = Y3;
		}

		 void moveUp()
		{
			y1--;
			y2--;
			y3--;
		}

		 void moveDown()
		{
			y1++;
			y2++;
			y3++;
		}

		 void moveLeft()
		{
			x1--;
			x2--;
			x3--;
		}

		void moveRight()
		{
			x1++;
			x2++;
			x3++;
		}

		 void draw(SDL_Surface * dst)
		{
			 filledTrigonRGBA(dst,
					  x1,  y1,
					  x2, y2,
					  x3,  y3,
					  0,  255, 0, 150);
		}

};
#endif /* TRIGON_H_ */
