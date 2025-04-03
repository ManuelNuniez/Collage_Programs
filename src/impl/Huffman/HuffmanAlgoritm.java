package impl.Huffman;

import java.util.PriorityQueue;

import api.ArbolBBTDA;
import impl.ArbolBB;

public class HuffmanAlgoritm {

    PriorityQueue<Symbol> huffmanQueue;
    ArbolBBTDA huffmanTree;

    //Constructor
    public HuffmanAlgoritm(Symbol[] alphabet){
        huffmanTree = new ArbolBB();
        huffmanQueue = new PriorityQueue<>( new SymbolProbabilityComparator());
        for (Symbol symbol : alphabet) {
            huffmanQueue.add(symbol);
        }
        
        for(int i = 1; i< alphabet.length; i++){
            Symbol x = huffmanQueue.remove();
            Symbol y = huffmanQueue.remove();
            huffmanTree.AgregarElem(x.getProbability() + y.getProbability());
            huffmanTree.AgregarElem(x.getProbability());
            huffmanTree.AgregarElem(y.getProbability());
            huffmanQueue.add(new Symbol(x.getProbability() + y.getProbability()));
        }

    }

    public String GetCode(char character){
        //necesito recorrer el heap y devolver en codigo binario
        //Una forma de obtener los hijos del heap

        String code = "00";

        return code;
    }



}
