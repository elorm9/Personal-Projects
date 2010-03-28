
using namespace std;

#ifndef SHAPES_H_
#define SHAPES_H_

class Shapes
{
	public:
		 virtual void moveUp()	=0;
		 virtual void moveDown() =0;
		 virtual void moveLeft() =0;
		 virtual void moveRight() =0;

		 virtual void draw(SDL_Surface* screen) = 0;
};





#endif
