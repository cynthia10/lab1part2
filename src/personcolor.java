public class personcolor {
    private person[] color;


    public personcolor(person firstperson) {

        this.color = new person[1];

        this.color[0] = firstperson;
    }

    public void print() {

        for (person Person : this.color) {

            System.out.println(Person.getname());

        }

    }

    public void insert(person Person, int position) {

        if (this.color.length == 0 && position == 0) {

            this.color = new person[1];

            this.color[0] = Person;

            return;

        }
        if (position < 0 || position > this.color.length)
        {

            return;

        }
       person[] newpersoncolor = new person [this.color.length + 1];


        for (int i=0; i<this.color.length+1; i++) {

            if (i < position) {

                newpersoncolor[i] = this.color[i];

            }

            else if (i > position) {

                newpersoncolor[i] = this.color[i-1];

            }

            else {

                newpersoncolor[i] = Person;

            }

        }



        this.color = newpersoncolor;
    }


}