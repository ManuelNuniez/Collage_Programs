import java.util.PriorityQueue;

import impl.Huffman.HuffmanAlgoritm;
import impl.Huffman.Symbol;
import impl.Huffman.SymbolProbabilityComparator;

public class PruebaHuffman {
    public static void main(String[] args) {
        Symbol a = new Symbol('a',45);
        Symbol b = new Symbol('b', 13);
        Symbol c = new Symbol('c', 12);
        Symbol d = new Symbol('d', 16);
        Symbol e = new Symbol('e', 9);
        Symbol f = new Symbol('f', 5);

        Symbol[] symbols = new Symbol[]{a, b, c, d, e, f};

        HuffmanAlgoritm huffman = new HuffmanAlgoritm(symbols);
        
    }
}
