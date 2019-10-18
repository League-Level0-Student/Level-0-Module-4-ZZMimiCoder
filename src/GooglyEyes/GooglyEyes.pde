void setup() {
  size(600, 503);
}
int PupilX = 0;
int PupilY = 0;
void draw() {
  PImage Face = loadImage("UglyFace.jpg");
  Face.resize(width, height);
  background(Face);
  ellipse(205, 170, 100, 100);
  ellipse(370, 170, 100, 100);
  fill(0, 0, 0);
  if (mouseX < 165) {
    PupilX = 165;
  } else if (mouseX > 245) {
    PupilX = 245;
  } else {
    PupilX = mouseX;
  }
  if (mouseY < 130) {
    PupilY = 130;
  } else if (mouseY > 210) {
    PupilY = 210;
  } else {
    PupilY = mouseY;
  }
  ellipse(PupilX, PupilY, 25, 25);
  ellipse(PupilX + 165, PupilY, 25, 25);
  fill(255, 255, 255);
}
