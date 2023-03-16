package com;

import java.util.List;

import lombok.var;

class Application {
  void main() {
    List<Foo> qux = List.of();
		for (var node : qux) {
			node.bat();
		}
  }
}
