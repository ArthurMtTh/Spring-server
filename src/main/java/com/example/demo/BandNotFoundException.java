package com.example.demo;

class BandNotFoundException extends RuntimeException {

  BandNotFoundException(Long id) {
    super("Could not find Band " + id);
  }
}
