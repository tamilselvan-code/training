package com.coding.interview.graph;

import java.util.Objects;

class Vertex {
	
	String label;

	Vertex(String label) {
		this.label = label;
	}

	@Override
	public int hashCode() {
		return Objects.hash(label);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		return Objects.equals(label, other.label);
	}

}