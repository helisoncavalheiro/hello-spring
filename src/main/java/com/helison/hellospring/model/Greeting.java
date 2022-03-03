package com.helison.hellospring.model;

public class Greeting {
  //o final aqui significa que o atributo é imutável, é uma constante.
  private final long id;
  private final String content;

  public Greeting(long id, String content){
    this.id = id;
    this.content = content;
  }

  public long getId(){
    return this.id;
  }

  public String getContent(){
    return this.content;
  }
}
