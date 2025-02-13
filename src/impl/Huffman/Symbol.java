package impl.Huffman;

public class Symbol {
    private char character;
    private double probabilty;

    public Symbol(char character, double probability){
        this.character = character;
        this.probabilty = probability;
    }
    public Symbol(double probability){
        this.probabilty = probability;
    }

    public char getCharacter(){
        return this.character;
    }

    public double getProbability(){
        return probabilty;
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "character=" + this.character +
                ", probability=" + this.probabilty +
                '}';
    }

}
