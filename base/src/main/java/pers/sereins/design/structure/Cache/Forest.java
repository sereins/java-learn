package pers.sereins.design.structure.Cache;

import javax.swing.*;
import java.awt.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {

    private final List<Tree> trees = new ArrayList<>();

    public void planTree(int x, int y, String name, Color color ,String otherTreeData){
        TreeType  treeType = TreeFactory.TreeType(name,color,otherTreeData);

        Tree tree = new Tree(x,y,treeType);
        trees.add(tree);
    }

    public void paint(Graphics g){
        for (Tree tree:trees){
            tree.draw(getGraphics());
        }
    }
}
