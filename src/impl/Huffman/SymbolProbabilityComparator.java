package impl.Huffman;

import java.util.Comparator;

public class SymbolProbabilityComparator implements Comparator<Symbol> {
    @Override
    public int compare(Symbol s1, Symbol s2) {
        // Ordenar de menor a mayor probabilidad
        return Double.compare(s1.getProbability(), s2.getProbability());
    }
}