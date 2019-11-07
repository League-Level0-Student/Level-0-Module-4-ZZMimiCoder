PImage Donkey;
PImage Tail;
int X = 0;
int Y = 0;
int State = 0;
import ddf.minim.*;
AudioSample WoohooSound;
boolean PlaySound = true;
void setup() {
  Donkey = loadImage("Donkey.jpg");
  Tail = loadImage("Tail.png");
  Tail.resize(200, 100);
  size(800, 590);
  Minim MinimA = new Minim(this);
  WoohooSound = MinimA.loadSample("Woohoo.wav"); 
}
void draw() {
  rect(0, 0, 30, 30);
  rect(500, 575, 40, 40);
  if (dist(0, 0, mouseX, mouseY) < 30) {
    background(Donkey);
  } else {
    background(0);
  }
  if (mousePressed) {
    State = 1;
    if (dist(665, 205, mouseX, mouseY) < 30) {
      if (PlaySound == true) {
        WoohooSound.trigger();
        PlaySound = false;
      }
    }
  }
  if (State == 0) {
    X = mouseX;
    Y = mouseY;
    image(Tail, mouseX, mouseY);
  } else {
    image(Tail, X, Y);
  }
}
