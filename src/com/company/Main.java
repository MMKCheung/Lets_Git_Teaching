package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.print("LETS DO THIS");

	    //lets create some instances shall we?
        Maths Quickmaths  = new Maths(17, 20);
        Maths MoreStuff = new Maths(23,45,67);
        Maths HowMuchMathsCanYouDo  = new Maths(768,454,23,43);

        //so no logic in this class at all right? all this does is take in variables and assigns them
        // TODO  make it do stuff!!!
        // TODO example below(which wont compile, only examples you can change the logic in whatever class you make )

        Quickmaths.add();
        MoreStuff.multiply();
        HowMuchMathsCanYouDo.subtract();
    }


    public static class Maths
    // this is a good example of how most base classes should look, you can then inherit this class and write logic
    // writing logic inside this class may get long and messy

    {   // init variables
        public int first_number, second_number, third_number, fourth_number;

        //Constructor set up, exposing the variables
        // see how there are 3 here, means you can init a class with any amount of numbers you want up to 3
        // TODO Can someone change this to take ANY amount of arguments??
        public Maths(int first,int second)
        {
            first_number = first;
            second_number = second;
        }

        public Maths(int first, int second, int third)
        {
            first_number = first;
            second_number = second;
            third_number = third;
        }

        public Maths(int first, int second, int third, int fourth)
        {
            first_number = first;
            second_number = second;
            third_number = third;
            fourth_number = fourth;
        }

        //getters and setters A.K.A mutator and accessor pattern <--- computer science term
        public int getFirst_number() { return this.first_number; }
        public void setFirst_number(int value) { this.first_number = value; }

        public int getSecond_number() { return this.second_number; }
        public void setSecond_number(int value) { this.second_number = value; }

        public int getThird_number() { return this.third_number; }
        public void setThird_number(int value) { this.third_number = value; }

        public int getFourth_number() { return this.fourth_number; }
        public void setFourth_number(int value) { this.first_number = value; }

    }

}
