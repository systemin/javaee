package com.hello;

public class Hello {
  //中文分词
    public static void main(String[] args) {
      String input = "太好了，今天是星期六啊";
      new Split(input).start();
    }
  }

  class Split {
    private String[] dictionary = {"今天", "是", "星期", "星期六"};
    private String input = null;

    public Split(String input) {
      this.input = input;
    }

    public void start() {
      String temp = null;
      System.out.println(this.input.length());
      for(int i = 0; i < this.input.length(); i++) {
        temp = this.input.substring(i);
        if(this.isInDictionay(temp)) {
          System.out.println(temp);
          this.input = this.input.replace(temp, "");
          i = - 1;
        }
      }

      if(null != this.input && !"".equals(this.input)) {
        this.input = this.input.substring(0, this.input.length() - 1);
        this.start();
      }
    }

    public boolean isInDictionay(String temp) {
      for(int i = 0; i < this.dictionary.length; i++) {
        if(temp.equals(this.dictionary[i])) {
          return true;
        }
      }

      return false;
    }
  }
