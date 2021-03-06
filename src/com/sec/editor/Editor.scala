package com.sec.editor

import color.ColorAdapter

object Editor {
  //TODO use these attributes.
  val MAX_COL: Int = 55;
  val MAX_ROW: Int = 3;

  def showText(text: String) {
    //TODO optimize.
    var word :String = "";
    val length = 0 until text.length();
    for (i <- length) {
      val char:Char = text.charAt(i);
      if (isSymbol(char)) {
        output(word);
        output("" + char);
        word = "";
      } else {
        word += char;
      }
    }
    output(word);
  }

  def isSymbol(char : Char) : Boolean = {
    if (char == ' ' || char == '.' || char == ',') {
       return true;
    }
    return false;
  }

  def output(word:String) {
    val decoratedWord = ColorAdapter.decorate(word);
    print(decoratedWord);
  }
}
