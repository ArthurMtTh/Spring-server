package com.example.demo;


import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Band {

  private @Id @GeneratedValue Long id;
  private String name;
  private String genre;

  Band() {}

  Band(String name, String genre) {

    this.name = name;
    this.genre = genre;
  }

  public Long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getGenre() {
    return this.genre;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Band))
      return false;
    Band band = (Band) o;
    return Objects.equals(this.id, band.id) && Objects.equals(this.name, band.name)
        && Objects.equals(this.genre, band.genre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.name, this.genre);
  }

  @Override
  public String toString() {
    return "Band{" + "id=" + this.id + ", name='" + this.name + '\'' + ", genre='" + this.genre + '\'' + '}';
  }
}