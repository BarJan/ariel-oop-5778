package composite;

import java.util.List;

public class InternalNode extends Node {
	List<Node> children;
	int sum() {
		return this.getWeight() + 
			children.stream().mapToInt(n -> n.getWeight()).sum();
	}
}