class NumberDeconstruction {
public static void main (String args[])
throws java.io.IOException {	

//Here I define my variables		
char ch;
int mynum = 0;
int myreal;

//Read the first number
System.out.println("Enter a number.");
ch = (char) System.in.read();

//End when user inputs carriage return
while (ch != 13) {
  if (ch < 48 || ch > 57) { //Make sure user inputs number
    System.out.println("Please enter a number.");
    mynum = 0; //Reset the mynum and start over
    System.in.skip(System.in.available());
    ch = (char) System.in.read();
    continue;
  }
  mynum = (mynum * 10) + (ch - 48); //Calculate the actual number
  ch = (char) System.in.read();
}
System.out.println("My number is " + mynum); //State the number entered

System.out.println("Your number deconstructed is:");

//Get the digits of the number
while (mynum != 0) {
  myreal = mynum % 10;
  mynum = mynum / 10;
  System.out.println(myreal);
}
}
}
