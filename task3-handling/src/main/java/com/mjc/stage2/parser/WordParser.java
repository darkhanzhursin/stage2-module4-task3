package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

public class WordParser extends AbstractTextParser {
  @Override public void parse(final AbstractTextComponent abstractTextComponent, final String string) {
    char[] arr = string.toCharArray();
    for (char c : arr) {
      abstractTextComponent.add(new SymbolLeaf(TextComponentType.WORD, c));
    }
  }

}
