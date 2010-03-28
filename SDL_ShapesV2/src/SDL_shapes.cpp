
/*
 ============================================================================
 Name        : SDL_shapes.c
 Author      : NiteStriker
 Version     : 2.00
 ============================================================================
 */

#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

#include <SDL/SDL.h>
#include <SDL/SDL_gfxPrimitives.h>

#include <iostream>
#include <string>

#include "Shapes.h"
#include "Ellipse.h"
#include "Rectangle.h"
#include "Trigon.h"
#include "Line.h"
#include "Pie.h"
using namespace std;


const int WINDOW_WIDTH = 640;
const int WINDOW_HEIGHT = 480;
const char* WINDOW_TITLE = "NiteStriker Shapes v2.2";

SDL_Surface* screen = SDL_SetVideoMode( WINDOW_WIDTH, WINDOW_HEIGHT, 0,
		SDL_HWSURFACE | SDL_DOUBLEBUF );



int main(int argc, char **argv)
{
	int numShapes = 1;
	string input;

	int x1;
	int x2;
	int x3;

	int y1;
	int y2;
	int y3;

	double rx;
	double ry;

	int start;
	int end;
	int rad;

	cout << "NiteStriker's mini Shape Drawer v2";

	cout << "\nHow many shapes do you want to draw?";
	cin >> numShapes;

	Rectangle r[numShapes];
	Ellipse e[numShapes];
	Trigon t[numShapes];
	Line l[numShapes];
	Pie p[numShapes];

	for(int i = 0; i < numShapes; i++)
	{
		cout << "\nWhat should shape #" << i+1 << " be? \nHere are your options: \n -rectangle\n -ellipse: \n -triangle \n -line \n -pie \n";
		cin >> input;

		if(input.compare("line") == 0)
		{
			cout <<"First Coordinate: Enter the x coordinate followed by the y coordinate: \n";
			cin >> x1 >> y1;

			cout <<"Second Coordinate: Enter the x coordinate followed by the y coordinate: \n";
			cin >> x2 >> y2;

			//construct this shape
			Line la = Line(x1, y1, x2, y2);
			l[i] = la;
		}

		if(input.compare("rectangle") == 0)
		{
			cout <<"First Coordinate: Enter the x coordinate followed by the y coordinate: \n";
			cin >> x1 >> y1;

			cout <<"Second Coordinate: Enter the x coordinate followed by the y coordinate: \n";
			cin >> x2 >> y2;

			//construct this shape
			Rectangle ra = Rectangle(x1, y1, x2, y2);
			r[i] = ra;
		}

		if(input.compare("ellipse") == 0)
		{

			cout <<"Center Coordinate: Enter the x coordinate followed by the y coordinate: \n";
			cin >> x1 >> y1;

			cout <<"Enter the height of the ellipse followed by its width coordinate: \n";
			cin >> ry >> rx;

			//construct this shape
			Ellipse ea = Ellipse(x1, y1, ry, rx);
			e[i] = ea;
		}

		if(input.compare("triangle") == 0)
		{

			cout <<"First Coordinate: Enter the x coordinate followed by the y coordinate: \n";
			cin >> x1 >> y1;

			cout <<"Second Coordinate: Enter the x coordinate followed by the y coordinate: \n";
			cin >> x2 >> y2;

			cout <<"Third Coordinate: Enter the x coordinate followed by the y coordinate: \n";
			cin >> x3 >> y3;

			Trigon tr = Trigon(x1, y1, x2, y2, x3, y3);
			t[i] = tr;
		}

		if(input.compare("pie") == 0)
		{

			cout <<"First Coordinate: Enter the x coordinate followed by the y coordinate: \n";
			cin >> x1 >> y1;

			cout <<"Enter the start position: \n";
			cin >> start;

			cout <<"Enter the end position: \n";
			cin >> end;

			cout <<"Enter the radius: \n";
			cin >> rad;

			Pie pr = Pie(x1, y1, start, end, rad);
			p[i] = pr;
		}

	}

	//start SDL
	SDL_Init( SDL_INIT_VIDEO );

	//set the Window caption
	SDL_WM_SetCaption( WINDOW_TITLE, 0 );

	bool programRunning = true;
	SDL_Event keyevent;
	while (programRunning)
	{
		//make the whole screen black
        SDL_FillRect(screen, NULL, SDL_MapRGB(screen->format, 0, 0, 0));

        //draw shapes
        for(int i = 0 ; i < numShapes; i++)
        {
        	e[i].draw(screen);
        	r[i].draw(screen);
        	p[i].draw(screen);
        	t[i].draw(screen);
        	l[i].draw(screen);
        }

        //update the screen
        SDL_Flip(screen);

        while (SDL_PollEvent(&keyevent))   //Poll our SDL key event for any keystrokes.
        {
          switch(keyevent.type)
          {
            case SDL_KEYDOWN:
              switch(keyevent.key.keysym.sym)
              {
                case SDLK_ESCAPE:
                  programRunning = false;
                  break;
                default:
                  break;
              }
          }
        }
	}
	SDL_Quit();
	return 0;
}
