package Homework;

public class Complex {
    private Double real;
    private Double image;

    public Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public String toString() {
        if (real == 0 && image == 0)
            return "0";
        if (real != 0 && image == 0)
            return real.toString();
        if (real == 0 && image != 0)
            return image.toString() + "i";
        return real.toString() + (image < 0 ? image.toString() + "i" : "+" + image.toString() + "i");
    }

    public Double getReal() {
        return real;
    }

    public Double getImage() {
        return image;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.toString().equals(obj.toString()))
            return true;
        return false;
    }

}
