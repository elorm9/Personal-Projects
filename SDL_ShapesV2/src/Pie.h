/*
 * Pie.h
 *
 *  Created on: Mar 20, 2010
 *      Author: bryan
 */

#ifndef PIE_H_
#define PIE_H_

class Pie : public Shapes
{
	int x;
	int y;
	int start;
	int end;
	int rad;


	public:
		Pie()
		{
			 x = 0;
			 y = 0;
			 start = 0;
			 end = 0;
			 rad = 0;
		}

		Pie(int X, int Y, int START, int END, int R)
		{
			 x = X;
			 y = Y;
			 start = START;
			 end = END;
			 rad = R;
		}

		 void moveUp()
		{
			y--;
		}

		 void moveDown()
		{
			y++;

		}

		 void moveLeft()
		{
			x--;
		}

		void moveRight()
		{
			x++;
		}

		 void draw(SDL_Surface * dst)
		{
			 filledPieRGBA(dst,
					  x,  y,
					  rad,  start,
					  end,  200, 100, 50, 150);
		}

};
#endif /* PIE_H_ */
